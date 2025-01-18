package lesson9;

import lesson9.dto.Account;
import lesson9.dto.CorporateAccount;
import lesson9.dto.PersonalAccount;

import java.math.BigDecimal;
import java.util.LinkedList;
import java.util.List;

public class GenericCollectionRunner {

    public static void main(String[] args) {
        List<? super Account> accountList = new LinkedList<>();
        add(accountList);

        List<? extends Account> accounts = (List<? extends Account>) accountList;
        print(accounts);

        System.out.println(accountList);

        CorporateAccount x = (CorporateAccount) accountList.get(0);
        System.out.println(x);
        // PECS
    }

    public static void print(List<? extends Account> accounts) {
        Account account = accounts.get(0);
        System.out.println(account);
    }

    public static void add(List<? super Account> accounts) {
        accounts.add(new CorporateAccount(BigDecimal.ZERO, "321411341"));
        accounts.add(new CorporateAccount(BigDecimal.ZERO, "321411341"));
        accounts.add(new Account(BigDecimal.TEN, "4314914"));
        accounts.add(new Account(BigDecimal.ONE, "FT-123244"));
        accounts.add(new PersonalAccount(new BigDecimal("3234413"), "431423§"));
        accounts.add(new Account(new BigDecimal("1000"), "32141134112"));
    }
}
