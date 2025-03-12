package lesson1;

import java.io.PrintStream;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

    public static void main(String[] args) {
        String format = "Hello, Russia!\n";
        // переменная временно хранит некоторый текст
        /*
        fdafda
        fdafgda
        fdafda
         */
        String format2 = "Здесь была бы Ваша реклама\n" +
                "Если бы было желание\n" +
                "авфоа";
        String text = """
                Здесь была бы Ваша реклама
                Если бы было желание
                авфоа
                """;
        PrintStream printf = System.out.printf(format);
        int value = (int) (1235 + 2147483649L);
        long value2 = 1235 + 2147483649L;
        int a = 100500;
        int otherB = 1000;
        long digit = a + otherB;
        System.out.println(value);
        System.out.println(value2);
        System.out.println(digit);

        int c = 17;
//        float d = 10d;
        float d = 10;
        d += 100D; // d = (float) (d + 100D);
        System.out.println("c - d = " + (c - d));
        System.out.println("c * d = " + (c * d));
        double i = c / d;
        System.out.println("c / d = " + i);
        System.out.println("c % d = " + (c % d));
        System.out.println("c ^ d = " + (Math.pow(c, d)));
//        c = c + 1;
        System.out.println("c++ = " + c++);
        System.out.println("c = " + c);
//        System.out.println("++c = " + (++c));
        System.out.println("--d = " + (--d));

        int it;
        double result = ((5 + 7f) / c - i) / 2;
        double result2 = 5 + 7 * c - i / 2;
        System.out.println(result);
        System.out.println(result2);

        int r = c = 10;
        System.out.println("r = " + r);
        boolean conjuction = i >= result && c > d && result2 != d;
        boolean disjunction = i >= result || c > d;
        boolean flag3 = i >= result & c > d;
        boolean flag2 = !conjuction;
        System.out.println("flag = " +  conjuction);
        System.out.println("flag2 = " +  flag2);
        System.out.println("flag3 = " +  flag3);

        it = 100;
        boolean booleanResult = i >= it;
    }

}