package lesson22.dao;

import lesson22.model.Emp;

public interface EmployeeDao {

    Emp findById(int id);
    void save(Emp emp);
}
