package lesson10;

import lesson4.Account;

import java.math.BigDecimal;
import java.util.Random;
import java.util.function.BiFunction;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class InnerFunctionInterfaceRunner {

    public static void main(String[] args) {
        Predicate<String> wordsMore2Symbols = word -> word.length() > 2;
        Predicate<Integer> oddPredicate = number -> number % 2 == 1;
        Predicate<Account> openPredicate = account -> account.getValue().compareTo(BigDecimal.ZERO) >= 0;
        Predicate<Account> unclosedPredicate = account -> account.getClosedAt() == null;
        Predicate<Account> validPredicate = openPredicate.and(unclosedPredicate);
        Predicate<Account> closedPredicate = Predicate.not(unclosedPredicate);//unclosedPredicate.negate();

//        Consumer<String> stringPrinter = str -> System.out.println(str);
        Consumer<String> stringPrinter = System.out::println;
//        Consumer<Integer> numberPrinter = it -> System.out.println(it);
        Consumer<Integer> numberPrinter = System.out::println;

        Supplier<Integer> intGenerator = () -> new Random().nextInt();
        Supplier<Boolean> booleanSupplier = () -> new Random().nextBoolean();

        Function<String, Integer> sizeFunction = word -> word.length();
        Function<Integer, Integer> converterFunction = value -> value * 100;

        BiFunction<Long, Integer, Long> anotherConverterFunction = (value, coeff) -> value * coeff;

        System.out.println(anotherConverterFunction.apply(100L, 3));
    }
}
