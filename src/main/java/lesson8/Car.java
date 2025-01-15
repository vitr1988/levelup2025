package lesson8;

public class Car /*implements Comparable<Car>*/ {

    private String mark;
    private String model;

    public Car(String mark, String model) {
        this.mark = mark;
        this.model = model;
    }

    public String getMark() {
        return mark;
    }

    public String getModel() {
        return model;
    }

    //    @Override
//    public int compareTo(Car car) {
//        return this.mark.compareTo(car.mark);
//    }

    @Override
    public String toString() {
        return "Car{" +
                "mark='" + mark + '\'' +
                ", model='" + model + '\'' +
                '}';
    }
}
