package lesson4;

import java.math.BigDecimal;
import java.time.LocalDate;

public class AccountRunner {

    public static void main(String[] args) {
        Client ivanov = new Client();
        ivanov.setFio("Ivanov Vitaliy Andreevich");
        ivanov.setBirthdate(LocalDate.of(1988, 3, 10));
        Account ivanovVAAccount = new Account("32341431431", "RUR", ivanov);
        System.out.println("Текущий остаток " + ivanovVAAccount.getAccountNumber() + " на счете " + ivanovVAAccount.getValue());
        ivanovVAAccount.deposit(BigDecimal.valueOf(1000));
        ivanovVAAccount.deposit(BigDecimal.valueOf(110000));
        System.out.println("Текущий остаток " + ivanovVAAccount.getAccountNumber() + " на счете " + ivanovVAAccount.getValue());
        ivanovVAAccount.withdraw(BigDecimal.valueOf(500));
        System.out.println(ivanovVAAccount);
        ivanovVAAccount.withdraw(BigDecimal.valueOf(100001));
        System.out.println(ivanovVAAccount);
//        System.out.println(ivanovVAAccount.getCommission());


        System.out.println("Текущий остаток " + ivanovVAAccount.getAccountNumber() + " на счете " + ivanovVAAccount.getValue());
        System.out.println("Текущий остаток " + ivanovVAAccount.getAccountNumber() + " на счете " + ivanovVAAccount.withdraw(BigDecimal.valueOf(700)));
        System.out.println(ivanovVAAccount);

        Client petrov = new Client();
        petrov.setFio("Petrov Petr Petrovich");
        petrov.setBirthdate(LocalDate.of(2000, 1, 1));
        Account petrovPetrAccount = new Account("355254562454", "EUR", petrov);
        System.out.println("Текущий остаток " + petrovPetrAccount.getAccountNumber() + " на счете " + petrovPetrAccount.getValue());
        System.out.println(petrovPetrAccount);

        Account petrovPetrAccount2 = new Account("e452542524", "RUR", petrov);
        System.out.println("Текущий остаток " + petrovPetrAccount2.getAccountNumber() + " на счете " + petrovPetrAccount2.getValue());
        System.out.println(petrovPetrAccount2);

        Account newAccount = new Account("123456789", null, null);

        System.out.println(newAccount);
        System.out.println(ivanovVAAccount);
        System.out.println(petrovPetrAccount);
        System.out.println(petrovPetrAccount2);


        System.out.println("Текущее количество открытых счетов клиентов - " + Account.counter);

        System.out.println(ivanovVAAccount == petrovPetrAccount);
    }
}
