package lesson20;

import lesson19.Employee;
import lesson20.impl.EmployeeJpaDaoImpl;

import java.util.Optional;

public class EmployeeJpaRunner {

    private static final EmployeeDao dao = new EmployeeJpaDaoImpl();

    public static void main(String[] args) {
        System.out.println(dao.findAll());
        Optional<Employee> employee29 = dao.findById(33);
        employee29 = dao.findById(33);
        employee29 = dao.findById(33);
        System.out.println(employee29);

        employee29.ifPresent(it -> {
            it.setName("Test Test 33");
            it.setPositionId(null);
            dao.save(it);
        });

        int maxId = dao.getMaxId();
        System.out.println("Max id:" + maxId);
        Employee employee = new Employee("Test Test XXX", 1);
        dao.save(employee);

        dao.findById(7).ifPresent(dao::delete);

        dao.deleteById(13);
    }
}
