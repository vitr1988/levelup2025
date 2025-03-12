package lesson6.problems;

public interface D extends B, C {
//    public static final int VALUE = 100;

    String d();

    @Override
    default void print() {
//        B.super.print();

        System.out.println("D");
    }
}
