package lesson14.tdd;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TaxServiceTest {

    @Test
    public void testTaxes() {
        TaxService taxService = new TaxService();
        Assertions.assertEquals(13, taxService.calculateValue(1_000_000));
        Assertions.assertEquals(13, taxService.calculateValue(500_000));
        Assertions.assertEquals(13, taxService.calculateValue(100_000));
        Assertions.assertEquals(13, taxService.calculateValue(0));

        Assertions.assertEquals(15, taxService.calculateValue(1_100_000));
        Assertions.assertEquals(15, taxService.calculateValue(5_000_000));

        Assertions.assertEquals(18, taxService.calculateValue(5_100_000));
        Assertions.assertEquals(18, taxService.calculateValue(10_000_000));
    }
}
