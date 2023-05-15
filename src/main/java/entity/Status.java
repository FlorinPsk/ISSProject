package entity;

import entity.base.BaseEntity;
import jakarta.persistence.*;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;

@Data
@Entity
@Table(name = "status")
public class Status extends BaseEntity {

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "location", referencedColumnName = "id")
    private Location location;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "timestamp", referencedColumnName = "id")
    private Timestamp timestamp;

    @OneToOne
    @JoinColumn(name = "crew_id")
    @ToString.Exclude
    @EqualsAndHashCode.Exclude
    private Crew crew;

}

