package lesson5.person;

public class Student extends Person {

    public Student(String name, int age, Gender gender) {
        super(name, age, gender);
    }

    protected void work() {
        System.out.println("WORK!!");
    }
}
