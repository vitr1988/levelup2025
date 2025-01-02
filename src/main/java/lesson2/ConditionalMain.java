package lesson2;

public class ConditionalMain {

//    static boolean flag = true;

    public static void main(String[] args) {
        int account = -1000;
        if (account == 0) {
            account += 1000; // account = account + 1000;
            System.out.println("Текущий баланс (но исходно был нулевой) : " + account);

            return;
        } else if (account > 0) {
//            if (flag) {
//
//            }
            account -= 100;
            System.out.println("Текущий баланс : " + account);
        } else if (account == -1000) {
            System.out.println("Минусовой баланс при -1000 : " + account);
        } else {
            System.out.println("Минусовой баланс : " + account);
        }

        if (account == 100 && account == 200 && account == 300) { //A
//            //TODO:
//            if (account == 200) { //B
//                //TODO:
//                if (account == 300) {
//                    //..
//                }
//            }
        } else {
            //TODO:
        }
        System.out.println("Текущий баланс при ситуации наличия средств : " + account);

        double one = 100;
        double two = 200;
        double min = min(one, two);
        System.out.println("min(%1$,.2f, %2$,.2f) = %3$,.2f".formatted(one, two, min));
        System.out.println("min(%1$,.2f, %2$,.2f) = %3$,.2f".formatted(one, two, Math.min(one, two)));
        System.out.println("max(%1$,.2f, %2$,.2f) = %3$,.2f".formatted(one, two, max(one, two)));
        System.out.println("max(%1$,.2f, %2$,.2f) = %3$,.2f".formatted(one, two, Math.max(one, two)));
        System.out.println("max(%1$,.2f, %2$,.2f) = %3$,.2f".formatted(one, two, avg(one, two)));

        String color = "green";
        switch (color) {
            case "green" : {
                System.out.println("Пожалуйста пройдите"); // 1
                break;
            }
//            case "yellow" : {
//                System.out.println("Внимательно"); // 2
//                break;
//            }
            case "yellow" :
            case "red" : {
                System.out.println("Проход запрещен"); // 3
                break;
            }
            default:
                System.out.println("Неправильно передан цвет светофора"); // 4
        }

        int amountInCurrency = 100;
        String currency = "fdafda";
        int result = switch (currency) {
            case "dollar" -> amountInCurrency * 100;
            case "euro" -> amountInCurrency * 110;
            default -> amountInCurrency;
        };
        System.out.println("%d USD = %d RUBLES".formatted(amountInCurrency, result));
    }

    public static double min(double a, double b) {
//        if (a > b) {
//            return b;
//        }
//        return a;
        return a > b ? b : a;
    }

    public static double max(double a, double b) {
//        if (a > b) {
//            return b;
//        }
//        return a;
        return a < b ? b : a;
    }

    public static double avg(double a, double b) {
//        if (a > b) {
//            return b;
//        }
//        return a;
        return (a + b) / 2;
    }
}
