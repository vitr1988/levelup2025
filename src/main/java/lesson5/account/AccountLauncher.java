package lesson5.account;

import lesson5.account.legal.LegalAccount;

import java.math.BigDecimal;

public class AccountLauncher {

    public static void main(String[] args) {
//        Account account = new Account();
//        account.balance = new BigDecimal("100");
        PersonalAccount personalAccount = new PersonalAccount("Ivanov Vitalii");
        LegalAccount legalAccount = new LegalAccount("SuperPuper");
//        legalAccount.setOrganization("LevelUp");

        Account personalAccountForClient = new PersonalAccount("Ivanov Vitalii");
        Account legalAccountForOrganization = new LegalAccount("RogaAndKopyta");

        ((PersonalAccount) personalAccountForClient).setFullName("Ivanov Vitalii");
        ((LegalAccount) legalAccountForOrganization).setOrganization("IP Ivanov Vitalii");

        Account[] accounts = {personalAccount, legalAccount};
        for (Account acc: accounts) {
            System.out.println(acc);
            acc.deposit(new BigDecimal("1000000"));
            System.out.println(acc.getBalance());

            acc.withdraw(new BigDecimal("500000"));
            System.out.println(acc.getBalance());
        }
    }
}
