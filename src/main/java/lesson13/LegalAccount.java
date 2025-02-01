package lesson13;

import java.math.BigDecimal;

public class LegalAccount extends Account {

    @NotNull
    private String organization;

    public LegalAccount(BigDecimal balance, String organization) {
        super(balance);
        this.organization = organization;
    }

    public String getOrganization() {
        return organization;
    }

    public void withdraw(BigDecimal bigDecimal) {
        this.balance = balance.subtract(bigDecimal);
    }
}
