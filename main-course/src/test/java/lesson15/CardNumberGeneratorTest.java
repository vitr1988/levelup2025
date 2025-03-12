package lesson15;

import lesson15.unit.CardService;
import lesson15.unit.Generator;
import lombok.SneakyThrows;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;

import static org.junit.jupiter.api.Assertions.assertNotNull;

public class CardNumberGeneratorTest {

    @Mock
    Generator mock;

    @BeforeEach
    public void setup() {
        MockitoAnnotations.initMocks(this);
    }

    @Test
    @SneakyThrows
    public void testCardNumber() {

//        Generator generator = new Generator() {
//            @Override
//            public String generate() throws Exception {
//                return "";
//            }
//        };

//        Generator mock = Mockito.mock(Generator.class);
        Mockito.when(mock.generate()).thenReturn("1111-2222-3333-4444");
        assertNotNull(mock.generate());
    }

    @Test
    @SneakyThrows
    public void testCardService() {
//        Generator mock = Mockito.mock(Generator.class);
        CardService cardService = new CardService(mock);
        Mockito.when(mock.generate()).thenReturn("1111-2222-3333-4444");
        cardService.printId("");
//        Mockito.verify(mock, Mockito.atLeastOnce()).generate();
//        Mockito.verify(mock, Mockito.times(2)).generate();
    }

    @Test
    @SneakyThrows
    public void testPrintId() {
//        Generator mock = Mockito.mock(Generator.class);
        Mockito.doNothing().when(mock).printId(Mockito.anyString());
        mock.printId("");
//        mock.printId("123");
//        mock.printId("1234");
//        mock.printId("12345");
//        mock.printId("123456");

        CardService cardService = new CardService(mock);
        final String id = "123";
        cardService.printId(id);
        Mockito.verify(mock).printId(id);
        Mockito.verify(mock, Mockito.never()).generate();
    }
}
