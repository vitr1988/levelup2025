package lesson6;

import java.math.BigDecimal;

public abstract class Account /*extends Object*/ implements Withdrawable, HasDeposit, Printable {

    protected BigDecimal balance;

    public Account(BigDecimal balance) {
        System.out.println("Счет открываем"); // 1
        this.balance = balance;
    }

    public void withdraw(long money) {

    }

//    public abstract void deposit(long money);
}
