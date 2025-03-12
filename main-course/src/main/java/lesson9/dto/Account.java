package lesson9.dto;

import java.math.BigDecimal;

public class Account /*implements Comparable<Account>*/ {

    private String accountNumber;
    private BigDecimal balance;

    public Account(BigDecimal balance, String accountNumber) {
        this.balance = balance;
        this.accountNumber = accountNumber;
    }

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

    @Override
    public int hashCode() {
        return accountNumber.hashCode();
//        return 1;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Account account) {
            return account.accountNumber.equals(this.accountNumber);
        }
        return false;
//        return true;
    }

    @Override
    public String toString() {
        return "Account{" +
                "accountNumber='" + accountNumber + '\'' +
                ", balance=" + balance +
                '}';
    }

//    @Override
//    public int compareTo(Account o) {
//        return this.balance.compareTo(o.balance);
//    }
}
