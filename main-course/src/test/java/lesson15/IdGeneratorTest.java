package lesson15;

import lesson15.unit.Generator;
import lesson15.unit.IdGenerator;
import lombok.SneakyThrows;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.time.Duration;
import java.time.temporal.ChronoUnit;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTimeoutPreemptively;

public class IdGeneratorTest {

    private static Generator generator;// = new IdGenerator();

    @BeforeAll
    public static void createGenerator() {
        generator = new IdGenerator();
        System.out.println("111");
    }

    @Test
    @SneakyThrows
    @DisplayName("Данный тестовый метод проверяет не налловость сгенерированного идентификатора")
    public void testGenerateUuidIsNotNull() {
        System.out.println("222");
        assertNotNull(generator.generate());
    }

    @Test
    @SneakyThrows
    @DisplayName("Данный тестовый метод проверяет не выбрасывание исключения")
    public void testGenerateUuidDoesntThrowException() {
        System.out.println("333");
//            assertThrows(Exception.class, () -> generator.generate());
        assertDoesNotThrow(() -> generator.generate());
    }

    @Test
    @SneakyThrows
    @DisplayName("Данный тестовый метод проверяет не выбрасывание исключения")
    public void testDurationTimeout() {
        Duration duration = Duration.of(1, ChronoUnit.SECONDS);
//        Duration duration2 = Duration.ofSeconds(1);
        assertTimeoutPreemptively(duration, () -> generator.generate());
    }
}
