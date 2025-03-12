package lesson5.account;

import lesson5.util.ComissionUtils;

import java.math.BigDecimal;
import java.time.ZonedDateTime;

public abstract class Account {

    private String accountNumber;
    protected BigDecimal balance = BigDecimal.ZERO;
    private ZonedDateTime openedAt;
    private BigDecimal commission;
    private BigDecimal threshold;
//    private String type;


    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public BigDecimal getBalance() {
        return balance;
    }

    public void setBalance(BigDecimal balance) {
        this.balance = balance;
    }

    public ZonedDateTime getOpenedAt() {
        return openedAt;
    }

    public void setOpenedAt(ZonedDateTime openedAt) {
        this.openedAt = openedAt;
    }

    public void deposit(BigDecimal money) {
        this.balance = this.balance.add(money);
    }

    public void withdraw(BigDecimal money) {
        this.balance = ComissionUtils.getSummaWithCommission(this.balance, threshold, commission);
    }

    public BigDecimal getThreshold() {
        return threshold;
    }

    public void setThreshold(BigDecimal threshold) {
        this.threshold = threshold;
    }

    public BigDecimal getCommission() {
        return commission;
    }

    public void setCommission(BigDecimal commission) {
        this.commission = commission;
    }
}
