package lesson14;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;

import static lesson14.ConverterUtil.THRESHOLD;

@DisplayName("Данный тест проверяет корректность ")
public class ConverterUtilTest {

    @Test
//    @Order(10)
    @DisplayName("логики конвертирования")
    public void testConvert() {
        Assertions.assertEquals(100, ConverterUtil.convert(100));
        Assertions.assertEquals(200, ConverterUtil.convert(200));
        Assertions.assertEquals(-200, ConverterUtil.convert(-200));
        Assertions.assertEquals(0, ConverterUtil.convert(0));
//        Assertions.assertEquals(0, ConverterUtil.convert(-1));
    }

    @Test
//    @Order(1)
    @DisplayName("генерации идентификаторов")
    public void shouldGenerateValueWithinRange() {
        Assertions.assertTrue(ConverterUtil.generateValue() < THRESHOLD);
    }

}
