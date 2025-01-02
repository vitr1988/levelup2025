package lesson3;

import java.util.Arrays;

public class ArrayExcercise {

    public static void main(String[] args) {
//        String[] arrayOfWords = {"Hello", "World"};
//        String[] arrayOfWords = new String[]{"Hello", "World"};
        String[] arrayOfWords = new String[3000];
        arrayOfWords[0] = "Hello11";
//        arrayOfWords[1] = "Worldfadfadfadadf";
        arrayOfWords[1] = "Worldfadfadfadadf";
        arrayOfWords[2] = "Testfasfadfa";


        for (int i = 0; i < arrayOfWords.length; i++) {
//        for (String word : arrayOfWords) {
            String word = arrayOfWords[i];
            if (word != null) {
                System.out.println(word);
            }
        }
        System.out.println(Arrays.toString(arrayOfWords));
        int i = 0;

        String[] result = {};
        for (int j = 0; j < result.length; j++) {
            System.out.println(result[j]);
        }
        System.out.println(result.length);

//        int[] values = new int[] {1, 3, 5, 7, 9, 11};
//        int[] values = {1, 3, 5, 7, 9, 11};
        int[] values = new int[10];
        for (int k = 0; k < values.length; k++) {
            values[k] = 2 * k + 1;
        }
        System.out.println(Arrays.toString(values));
        int summa = 0;
        for (int arg : values) {
            summa += arg;
        }
        System.out.println("Итоговый результат = " + summa);

        int[] newValues = new int[20];
        for (int index = 0; index < values.length; index++) {
            newValues[index] = values[index];
        }
        for (int index = values.length; index < newValues.length; index++) {
            newValues[index] = 100 * index;
        }
        System.out.println(Arrays.toString(newValues));

        boolean[] results = new boolean[100];
        System.out.println(Arrays.toString(results));

        double[] digits = new double[100];
        System.out.println(Arrays.toString(digits));

        char[] characters = new char[10];
        for (int j = 0; j < characters.length; j++) {
            System.out.println((int) characters[j]);
        }

        int[][] matrixA = new int[3][4];
        matrixA[0][0] = 1;
        matrixA[0][1] = 0;
        matrixA[0][2] = 3;
        matrixA[0][3] = 23;
        matrixA[1][0] = -1;
        matrixA[1][1] = 10;
        matrixA[1][2] = 20;
        matrixA[1][3] = 120;
        matrixA[2][0] = 17;
        matrixA[2][1] = 18;
        matrixA[2][2] = 18;
        matrixA[2][3] = 108;
        for (int k = 0; k < matrixA.length; k++) {
            for (int l = 0; l < matrixA[k].length; l++) {
                System.out.print(matrixA[k][l] + " ");
            }
            System.out.println();
        }

        extracted(120);
    }

    private static double[] extracted(double discriminant) {
        double[] array = new double[10];
        double x1 = 0, x2 = 1;
        if (discriminant == 0) {
            array = new double[1];
//            return new double[]{x1};
            return array;
        } else if (discriminant > 0){
            array = new double[]{x1, x2};
            return array;
        }
        return new double[]{};
    }
//        System.out.println(arrayOfWords);
}
