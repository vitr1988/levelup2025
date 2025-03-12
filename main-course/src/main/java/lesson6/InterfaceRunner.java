package lesson6;

import java.math.BigDecimal;

public class InterfaceRunner {

    public static void main(String[] args) {
        RussianPersonalAccount russianPersonalAccount = new RussianPersonalAccount(BigDecimal.TEN);
        Withdrawable withdrawableAccount = russianPersonalAccount;
        withdrawableAccount.withdraw(9);

        HasDeposit hasDepositAccount = russianPersonalAccount;
        hasDepositAccount.deposit(1000);

        Printable printable = russianPersonalAccount;
        printable.print();

        Object convert = convert(russianPersonalAccount);
        Withdrawable withdrawableConverter = convert(russianPersonalAccount);
        HasDeposit hasDepositConverter = convert(russianPersonalAccount);
        convert(russianPersonalAccount).print();

    }

    public static <T extends Withdrawable&HasDeposit&Printable> T convert(RussianPersonalAccount account) {
        return (T) account;
    }

}
