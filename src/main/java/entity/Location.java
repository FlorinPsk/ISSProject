package entity;

import entity.base.BaseEntity;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;

@Entity
@Table(name = "locations")
@NoArgsConstructor(force = true)
@RequiredArgsConstructor
@Data
public class Location extends BaseEntity {

    // Attributes
    @Column(name = "latitude")
    @NonNull
    private double latitude;

    @Column(name = "longitude")
    @NonNull
    private double longitude;

    @Column(name = "altitude")
    @NonNull
    private double altitude;

}
