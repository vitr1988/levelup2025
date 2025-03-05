package lesson22;

import lesson22.dao.PositionDao;
import lesson22.dao.impl.PositionDaoImpl;
import lesson22.model.Position;

import java.util.List;

public class PositionRunner {

    private static final PositionDao positionDao = new PositionDaoImpl();

    public static void main(String[] args) {
//        Position developer = new Position();
//        developer.setName("Developer");
//        positionDao.save(developer);
//
//
//        Position qa = new Position();
//        qa.setName("QA");
//        positionDao.save(qa);
//
//        Position analytic = new Position();
//        analytic.setName("Analytic");
//        positionDao.save(analytic);
//
//        Position pm = new Position();
//        pm.setName("PM");
//        positionDao.save(pm);

        List<Position> positions = positionDao.findAll();
        System.out.println(positions);

        positions.stream()
                .filter(position -> position.getId().equals(1))
                .findFirst()
                .ifPresent(position -> {
                    System.out.println(position);
                    System.out.println(position.getEmployees());
                });
    }
}
