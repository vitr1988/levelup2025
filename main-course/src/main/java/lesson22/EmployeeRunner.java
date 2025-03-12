package lesson22;

import lesson22.dao.EmployeeDao;
import lesson22.dao.PositionDao;
import lesson22.dao.impl.EmployeeDaoImpl;
import lesson22.dao.impl.PositionDaoImpl;
import lesson22.model.Emp;
import lesson22.model.Position;

public class EmployeeRunner {

    private static final EmployeeDao employeeDao = new EmployeeDaoImpl();
    private static final PositionDao positionDao = new PositionDaoImpl();

    public static void main(String[] args) {
        Emp employee = employeeDao.findById(33);
        System.out.println(employee);

//        Emp emp = new Emp();
//        emp.setName("New Employee");
        Position position = new Position();
        position.setName("Manual Tester");
        employee.setPosition(position);
        employee.setBoss(new Emp("Ivanov Ivan Ivanovich"));

        employeeDao.save(employee);
    }
}
