package lesson20.impl;

import lesson19.Employee;
import lesson20.EmployeeDao;
import lesson20.HibernateHelper;

import java.util.List;
import java.util.Optional;

public class EmployeeJpaDaoImpl implements EmployeeDao {

    @Override
    public List<Employee> findAll() {
//        try (Session session = HibernateHelper.getSession()) {
//            session.beginTransaction();
//            List<Employee> result = session.createQuery("select employee from Employee employee").list();
//            session.getTransaction().commit();
//            return result;
//        }
        return HibernateHelper.runInTransaction(entityManager -> {
            return entityManager.createQuery("select employee from Employee employee").getResultList();
        });
    }

    @Override
    public Optional<Employee> findById(Integer id) {
//        try (Session session = HibernateHelper.getSession()) {
//            session.beginTransaction();
////            NativeQuery<lesson21.projection.Employee> nativeQuery = session.createNativeQuery(
////                    "select id, name, position_id as positionId from employees employee " +
////                    "where employee.id = :id", lesson21.projection.Employee.class);
////            nativeQuery.setParameter("id", id);
////            Optional<lesson21.projection.Employee> result = nativeQuery.getResultList().stream().findFirst();
////            Query<lesson20.model.Employee> selectEmployeeFromEmployeeEmployee = session.createQuery(
////                    "select employee from Employee employee " +
////                    "where employee.id = :id", lesson20.model.Employee.class);
////            selectEmployeeFromEmployeeEmployee.setParameter("id", id);
////            selectEmployeeFromEmployeeEmployee.setMaxResults(1);
////            List<lesson20.model.Employee> result = selectEmployeeFromEmployeeEmployee.getResultList();
//            lesson20.model.Employee it = session.find(lesson20.model.Employee.class, id);
////            lesson20.model.Employee singleResult = selectEmployeeFromEmployeeEmployee.getSingleResult();
//            session.getTransaction().commit();
////            return result.map(it -> new Employee(it.getId(), it.getName(), it.getPositionId()));
//            return Optional.ofNullable(it).map(that -> new Employee(that.getId(), that.getName(), that.getPositionId()));
////            return result.stream().findFirst()
////                    .map(it -> new Employee(it.getId(), it.getName(), it.getPositionId()));//result.stream().findFirst();
//        }
//        catch (NoResultException e) {
//            return Optional.empty();
//        }

        return HibernateHelper.runInTransaction(entityManager -> {
            return Optional.ofNullable(entityManager.find(lesson20.model.Employee.class, id))
                    .map(that -> new Employee(that.getId(), that.getName(), that.getPositionId()));
        });
    }

    @Override
    public void save(Employee employee) {
//        try (Session session = HibernateHelper.getSession()) {
//            session.beginTransaction();
////            if (employee.getId() != -1) {
////                session.update(new lesson20.model.Employee(employee));
////            } else {
////                session.save(new lesson20.model.Employee(employee));
////            }
//            session.saveOrUpdate(new lesson20.model.Employee(employee));
//            session.getTransaction().commit();
//        }

        HibernateHelper.runInTransaction(entityManager -> {
            boolean idNeedInitialized = employee.getId() != -1;
            lesson20.model.Employee employee1 = new lesson20.model.Employee(employee, idNeedInitialized);
            if (idNeedInitialized) {
                entityManager.merge(employee1);
            } else {
                entityManager.persist(employee1);
            }
        });
    }

    @Override
    public void delete(Employee employee) {
        HibernateHelper.runInTransaction(session -> {
            session.remove(new lesson20.model.Employee(employee, true));
        });
    }

    @Override
    public void deleteById(Integer id) {
        HibernateHelper.runInTransaction(session -> {
            session.createNativeQuery("delete from employees where id = :id")
                    .setParameter("id", id)
                    .executeUpdate();
        });
    }

    @Override
    public int getMaxId() {
        return HibernateHelper.runInTransaction(session -> {
            return session.createQuery("""
                            select max(employee.id) + 1
                            from Employee employee
                            """, Integer.class).getResultList()
                    .stream()
                    .findFirst()
                    .orElse(1);
        });
    }
}
