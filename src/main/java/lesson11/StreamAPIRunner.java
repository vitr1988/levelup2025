package lesson11;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Set;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamAPIRunner {

    public static void main(String[] args) {
        List<String> surnames = Stream.of("Ivanov", "Ivanov", "Petrov", "Sidorov", "Gusev").collect(Collectors.toList());
//        surnames.removeIf(it -> it.length() <= 5);
//        surnames.removeIf(it -> surnames.indexOf(it) % 2 == 0);
        IntHolder value = new IntHolder();
        surnames.forEach(it -> {
            value.increment();
        });
        System.out.println(surnames);

        Stream<String> stringStream = surnames.stream().filter(it -> it.length() <= 5);
//        if (stringStream.count() == 0) {
//            System.out.println("Поток пустой");
//        }

//        Optional<String> first = stringStream.findFirst();
        Optional<String> any = stringStream.findAny();
        Optional<String> max = surnames.stream().max(Comparator.comparingInt(String::length));

        Stream<String> stream = any.stream();


        List<List<Integer>> numberList = List.of(List.of(1, 2), List.of(100, 200), List.of(1000, 2000));
        List<Integer> result = new ArrayList<>();
        for (List<Integer> innerList: numberList) {
            result.addAll(innerList);
        }
        System.out.println(result);
        List<Integer> list = numberList.stream().flatMap(List::stream).toList();
        System.out.println(list);

        Optional<Integer> reduce = list.stream().reduce(Integer::sum);
        reduce.ifPresent(System.out::println);

        Set<String> collect = list.stream().map(Object::toString).collect(Collectors.toSet());
        System.out.println(collect);

        Map<String, Integer> collect1 = surnames.stream()
                .collect(Collectors.toMap(it -> it, String::length, (a, b) -> b));
        System.out.println(collect1);

        Function<String, Integer> function = getStringIntegerFunction("");

        Map<String, Long> mapOfFrequencyWOrds = surnames.stream().collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        System.out.println(mapOfFrequencyWOrds);
    }

    private static Function<String, Integer> getStringIntegerFunction(String word) {
        return it -> {
            word.length();
            return it.hashCode();
        };
    }
}
