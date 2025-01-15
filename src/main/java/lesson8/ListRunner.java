package lesson8;

import lesson6.problems.A;
import lesson6.problems.C;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class ListRunner {
    public static void main(String[] args) {
        List list = List.of(1, "String", new Object());
        List<String> strings = List.of("Hello", "World", "!");
//        List<String> stringOfWords = new ArrayList<>(3);
        List<String> stringOfWords = new ArrayList<>(strings);
        stringOfWords.addAll(strings);
        stringOfWords.add("Test");
        stringOfWords.add("Vitaliy");
        stringOfWords.add("Ivanov");
        stringOfWords.add("Test123");
        stringOfWords.add("Hello");
        stringOfWords.add("Hello");
        stringOfWords.add("Hello");
        stringOfWords.add("Hello");
        stringOfWords.add("Hello");
        stringOfWords.add("Hello");
        stringOfWords.add("Hello");
        stringOfWords.add("Hello");
        stringOfWords.add("Hello");
        stringOfWords.add("Hello");
        stringOfWords.add(1, "Test123");
        stringOfWords.add(stringOfWords.size(), "Test123");
        System.out.println(stringOfWords);
        System.out.println(stringOfWords.size());
        System.out.println("----");
        for (int index = 0; index < stringOfWords.size(); index++) {
            if (index % 2 == 0) {
                System.out.println(stringOfWords.get(index));
            }
        }
        System.out.println("----");
        System.out.println(stringOfWords.remove(1));
        System.out.println("----");


        String removedWord = "Hello";
//        for (int index = 0; index < stringOfWords.size(); index++) {
//            String s = stringOfWords.get(index);
//            if (removedWord.equals(s)) {
////                stringOfWords.remove(s);
//                stringOfWords.remove(index);
//            }
//        }

        System.out.println("----");
        Integer counter = 0;
        for (String str : stringOfWords) {
            counter++;
            if (removedWord.equals(str)) {
                stringOfWords.remove(counter);
            }
        }
        System.out.println("----");

        System.out.println("----AA---");
        System.out.println(stringOfWords);
        System.out.println("----AA---");

//        for (String stringOfWord : stringOfWords) {
        for (Iterator<String> iterator = stringOfWords.iterator(); iterator.hasNext();) {
            String next = iterator.next();
            if (next.equals(removedWord)) {
                iterator.remove();
            }
            System.out.println(next);
        }



//        System.out.println(stringOfWords);

        List<String> sortedList = new ArrayList<>(stringOfWords);
        sortedList.sort(new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o1.length() - o2.length();
            }
        });

        int count = 0;
        for (String str : sortedList) {
            if (count++ % 2 == 0) {
                sortedList.remove(count);
            }
        }

        System.out.println(stringOfWords);
        System.out.println(Arrays.toString(sortedList.toArray()));

        String[] str = {"1", "2", "3"};
        List<String> list1 = new ArrayList<>(Arrays.asList(str));
        list1.add("drarqa");
        System.out.println(list1);


        System.out.println("----");
        stringOfWords.clear();
        System.out.println(stringOfWords);
    }
}
