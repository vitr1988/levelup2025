package lesson10;

import java.util.function.Consumer;

public class LambdaRunner {

    public static void main(String[] args) {
//        Moveable moveable = new Moveable() {
//            @Override
//            public void move(int distance) {
//
//            }
//        };
        Moveable moveable = distance -> System.out.println("Мы проехали %d киллометров".formatted(distance));
        Consumer<Integer> alternativeMoveable = distance -> System.out.println("Мы проехали %d киллометров".formatted(distance));

        moveable.move(100);
        moveable.move(1000);
        moveable.move(100500);

        alternativeMoveable.accept(100);
        alternativeMoveable.accept(1000);
        alternativeMoveable.accept(100500);

        Converter converter = (value, coeff) -> 5;
//                it -> {
//            System.out.println("Мы сконвертивали значение %d".formatted(it));
//            return it;
//        };

        System.out.println(converter.convert(100L, 5));
        System.out.println(converter.convert(1000L, 50));
        System.out.println(converter.convert(100500L, -5));
//        converter.convert(100);
//        converter.convert(1000);
//        converter.convert(100500);
    }
}
