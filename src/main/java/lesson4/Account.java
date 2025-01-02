package lesson4;

import java.math.BigDecimal;
import java.time.LocalDateTime;

public class Account {
    static int counter = 0;

    static {
    }

    private String accountNumber;
    private String currency;
    private LocalDateTime openedAt;
//    LocalDateTime openedAt = LocalDateTime.now();
    // здесь мог быть null
    private LocalDateTime closedAt;
    private String state;
//    String state = "OPEN";
    private BigDecimal value;
//    BigDecimal value = BigDecimal.ZERO; // альтернативный способ наполнения объекта первоначальным состоянием
    private Client client;

    public Account() {
        this.openedAt = LocalDateTime.now();
        this.state = "OPEN";
        this.value = BigDecimal.ZERO;
        counter++;
    }

    public Account(String accountNumber, String currency, Client client) {
        this();
        this.accountNumber = accountNumber;
        this.currency = currency;
        this.client = client;
    }

    public BigDecimal deposit(BigDecimal money) {
        this.value = this.value.add(money);
        return this.value;
//        this.value += money;
    }

    private BigDecimal getCommission(BigDecimal money) {
        if ("RUR".equals(currency) && money.compareTo(new BigDecimal("100000")) > 0) {
            return money.multiply(new BigDecimal("0.01"));
        }
        return BigDecimal.ZERO;
    }

    public BigDecimal withdraw(BigDecimal money) {
        money = money.add(getCommission(money));
        if (this.value.compareTo(money) >= 0) {
            this.value = this.value.subtract(money);
        } else {
            System.out.println("Сумма снятия " + money + " превышает текущий баланс");
        }
        return this.value;
//        deposit(money.multiply(new BigDecimal("-1")));
//        this.value -= money;
    }

    public BigDecimal getValue() {
        return this.value;
    }

    public String getAccountNumber() {
        return this.accountNumber;
    }

    public String getCurrency() {
        return currency;
    }

    public LocalDateTime getOpenedAt() {
        return openedAt;
    }

    public LocalDateTime getClosedAt() {
        return closedAt;
    }

    public String getState() {
        return state;
    }

    public Client getClient() {
        return client;
    }

    public String toString() {
        return "Account{" +
                "accountNumber='" + accountNumber + '\'' +
                ", currency='" + currency + '\'' +
                ", openedAt=" + openedAt +
                ", closedAt=" + closedAt +
                ", state='" + state + '\'' +
                ", value=" + value +
                ", client=" + client +
                '}';
    }
}

