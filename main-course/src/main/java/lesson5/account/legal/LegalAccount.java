package lesson5.account.legal;

import lesson5.account.Account;

import java.math.BigDecimal;

public class LegalAccount extends Account {

    private String organization;

    public LegalAccount(String organization) {
        this.organization = organization;
        setCommission(new BigDecimal("0.05")); // 5 процентов
        setThreshold(new BigDecimal("300000")); // 1 миллион
    }

    public String getOrganization() {
        return organization;
    }

    public void setOrganization(String organization) {
        this.organization = organization;
    }

    @Override
    public void withdraw(BigDecimal money) {
        if (organization.equals("SuperPuper")) {
//            this.setBalance(this.getBalance().subtract(money));
            this.balance = this.balance.subtract(money);
        } else {
            super.withdraw(money);
        }
    }

    @Override
    public String toString() {
        return "LegalAccount{" +
                "organization='" + organization + '\'' +
                '}';
    }
}
