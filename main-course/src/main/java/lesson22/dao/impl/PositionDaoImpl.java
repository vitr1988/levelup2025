package lesson22.dao.impl;

import lesson20.HibernateHelper;
import lesson22.dao.PositionDao;
import lesson22.model.Position;

import javax.persistence.EntityManager;
import java.util.List;

public class PositionDaoImpl implements PositionDao {

    @Override
    public void save(Position position) {
        EntityManager entityManager = HibernateHelper.getEntityManager();
        entityManager.getTransaction().begin();
        if (position.getId() == null) {
            entityManager.persist(position);
        } else {
            entityManager.merge(position);
        }
        entityManager.getTransaction().commit();
    }

    @Override
    public List<Position> findAll() {
        EntityManager entityManager = HibernateHelper.getEntityManager();
        return entityManager.createQuery("select p from Position p", Position.class).getResultList();
    }

    @Override
    public Position findById(Integer id) {
        EntityManager entityManager = HibernateHelper.getEntityManager();
        return entityManager.find(Position.class, id);
    }
}
