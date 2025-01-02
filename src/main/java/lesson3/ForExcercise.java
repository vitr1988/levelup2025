package lesson3;

public class ForExcercise {

    public static void main(String[] args) {
        int summa = 0;
//        for (int i = 0, j = 1, b = 100, index = 5; i < 5 && j < 2; i++, j++) {
        for (int i = 0; i < 5; i++) {
            //...
            if (i == 2) {
                continue;
            }
            summa = summa + i * 100;
        }
        System.out.println(summa);

//        String str = "Это строка со значениями %d и %d";
        String str = new String("Это строка со значениями %d и %d");
        System.out.println(str.equals(new String("Это строка со значениями %d и %d")));


//        String str = null;
        if (str != null) {
            str = str.formatted(5245, 4134);
        }
        System.out.println(str);
        String helloWorld = "Hello world";
        for (int i = 0; i < 10; i++) {
            System.out.println(helloWorld);
        }
        System.out.println(factorial(20));

        System.out.println(factorialWithRecursion(20));
    }

    public static long factorial(int value) {
        long result = 1;
        for (int i = 1; i <= value; i++) {
            result *= i; // result = result * i;
        }
        return result;
    }

    public static long factorialWithRecursion(int value) {
        if (value == 1 || value == 2) {
            return value;
        }
        return value * factorialWithRecursion(value - 1);
    }
}

// 20! = 1 * 2 * 3 * 4 * ... * 20
