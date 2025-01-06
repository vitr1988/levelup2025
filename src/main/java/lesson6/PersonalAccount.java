package lesson6;

import java.math.BigDecimal;

public class PersonalAccount extends Account {

    public PersonalAccount(int month, BigDecimal balance) {
        super(balance);
        System.out.println("Лицевой счет открываем"); // 2
        int threshold = 100;
    }

    public PersonalAccount() {
        this(3, BigDecimal.ZERO);
    }

    @Override
    public void withdraw(long money) {
//        if
        super.withdraw(money);
//
    }

    @Override
    public void deposit(long money) {

    }

    @Override
    public int hashCode() {
        int koeff = 7;
        return koeff * balance.hashCode();// + field.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (this.getClass() != obj.getClass()) {
            return false;
        }
        PersonalAccount personalAccount = (PersonalAccount) obj;
        return personalAccount.balance.equals(this.balance);
//        return true;
    }
}
