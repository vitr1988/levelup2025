package lesson5.car;

public class CarLauncher {

    public static void main(String[] args) {
        Car skodaOctavia14 = new Car("Skoda", "Octavia", 1.4);
        Car mercedezA = new Car("Mercedez", "A", 1);

        Car lixiang = new Car("Lixiang", "L7");
//        Car.Engine engine = lixiang.new Engine(1.5);
        Car.Engine engine = new Car.Engine(1.5);
        lixiang.setEngine(engine);
    }
}
