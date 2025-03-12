package lesson22.dao.impl;

import lesson20.HibernateHelper;
import lesson22.dao.EmployeeDao;
import lesson22.model.Emp;

import javax.persistence.EntityManager;

public class EmployeeDaoImpl implements EmployeeDao {

    @Override
    public Emp findById(int id) {
        EntityManager entityManager = HibernateHelper.getEntityManager();
        return entityManager.find(Emp.class, id);
    }

    @Override
    public void save(Emp emp) {
        EntityManager entityManager = HibernateHelper.getEntityManager();
        entityManager.getTransaction().begin();
        if (emp.getId() == null) {
            entityManager.persist(emp);
        }
        else {
            entityManager.merge(emp);
        }
        entityManager.getTransaction().commit();

        entityManager.detach(emp);
    }
}
