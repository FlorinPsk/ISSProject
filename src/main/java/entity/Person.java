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
//@Table(name = "people_on_board")
@NoArgsConstructor(force = true)
@RequiredArgsConstructor
@Data
public class Person extends BaseEntity {

    // Attributes
    @Column(name = "name")
    @NonNull
    private String name;

    @Column(name = "nationality")
    @NonNull
    private String nationality;

    @Column(name = "role")
    @NonNull
    private String role;

}