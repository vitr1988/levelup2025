package lesson5.figure;

public class Kvadrat {

    private int a;

    public Kvadrat(int b) {
        this.a = b;
    }

    public Kvadrat(int a, int b) {
        if (a != b) {
            System.out.println("Стороны должны быть равны");
        }
        this.a = a;
    }

    public int perimeter() {
        return 4 * a;
    }

    public int square() {
        return a * a;
    }
}
