package lesson20.model;

import lombok.Data;
import lombok.experimental.Accessors;

import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
@Data
@Accessors(chain = true)
public class Position {

    @Column(name = "position_id")
    private Integer positionId;
}
