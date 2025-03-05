package lesson22.dao;

import lesson22.model.Position;

import java.util.List;

public interface PositionDao {

    void save(Position position);

    List<Position> findAll();

    Position findById(Integer id);
}
