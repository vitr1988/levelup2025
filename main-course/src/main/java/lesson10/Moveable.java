package lesson10;

@FunctionalInterface
public interface Moveable {

    void move(int distance);

    static int moveTo(String city) {
//        move(1000);
        return 100;
    }
}
