package lesson13;

import java.math.BigDecimal;

public abstract class Account implements Withdrawable {

    @NotNull
    protected BigDecimal balance;

    public Account(BigDecimal balance) {
        this.balance = balance;
    }

    public BigDecimal getBalance() {
        return balance;
    }

    public abstract void withdraw(BigDecimal bigDecimal);
}
