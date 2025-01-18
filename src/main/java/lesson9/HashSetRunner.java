package lesson9;

import lesson9.dto.Account;

import java.math.BigDecimal;
import java.util.LinkedHashSet;
import java.util.Set;

public class HashSetRunner {

    public static void main(String[] args) {
        Set<Account> accounts = new LinkedHashSet<>(5);
        accounts.add(new Account(BigDecimal.ZERO, "321411341"));
        accounts.add(new Account(BigDecimal.TEN, "4314914"));
        accounts.add(new Account(BigDecimal.ONE, "FT-123244"));
        accounts.add(new Account(new BigDecimal("3234413"), "431423§"));
        accounts.add(new Account(new BigDecimal("1000"), "32141134112"));

        System.out.println(accounts);
        System.out.println(accounts.size());

        accounts.clear();
    }
}
