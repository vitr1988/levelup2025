package lesson3;

public class DoWhileExcercise {

    public static void main(String[] args) {
        int value = 25;
        int counter = 0;
        boolean flag = true;
        do {
            if (counter++ % 2 != 0) {
                value /= 2;
                flag = false;
                continue;
            }
            System.out.println("Число " + value + " - четное");
            value /= 2;
        } while (value % 2 == 0);

        if (!flag) {
            System.out.println("Были пропуски");
        }
        System.out.println("Число " + value + " - нечетное");
    }
}
