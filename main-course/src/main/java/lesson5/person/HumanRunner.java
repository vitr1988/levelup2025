package lesson5.person;

public class HumanRunner {
    public static void main(String[] args) {
        Person ivanovV = new Student("Vitaly Ivanov", 36, Gender.MALE);
        ivanovV.think();
        if (ivanovV.getGender().isProlong()) {
            ivanovV.work();
        }
    }
}
