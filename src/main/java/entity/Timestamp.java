package entity;

import entity.base.BaseEntity;
import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;

import java.time.LocalDate;

@Entity
@Table(name = "timestamp")
@NoArgsConstructor
@RequiredArgsConstructor
@Data
public class Timestamp extends BaseEntity {

    // Attributes
    @Column(name = "speed")
    @NonNull
    private double speed;

    @Column(name = "timestamp")
    @NonNull
    private LocalDate timestamp;

    @OneToOne
    @JoinColumn(name = "location")
    private Location location;

}
