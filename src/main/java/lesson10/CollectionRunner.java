package lesson10;

import java.util.Comparator;
import java.util.List;
import java.util.Set;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class CollectionRunner {

    public static void main(String[] args) {
        List<String> words = List.of("Hello", "Vitaly", "Ivanov", "Ivanovre2r242");
        System.out.println(words);
        Stream<String> stream = words.stream();
        Stream<String> stream2 = Stream.of("Hello", "Vitaly", "Ivanov", "Ivanovre2r242");
        System.out.println(stream2.count());
//        Stream<Integer> integerStream = stream.map(it -> it.length());
        stream = words.stream();
        System.out.println(stream.count());
        System.out.println(words.size());
        System.out.println(words.size());
        Stream<Integer> integerStream = words.stream().map(Function.identity())
                .map(String::length)
                .filter(it -> it >= 6)
                .sorted(Comparator.reverseOrder())
                .distinct()
                .limit(1)
                ;
//        List<Integer> list = integerStream.toList();
//        System.out.println(list); // 1
//        Set<Integer> list = integerStream.collect(Collectors.toSet());
        List<Integer> list = integerStream.collect(Collectors.toList());
//        list.add(1);
//        list.add(100);
        System.out.println(list); // 2
    }
}
