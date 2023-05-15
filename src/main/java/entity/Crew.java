package entity;

import entity.base.BaseEntity;
import jakarta.persistence.*;
import lombok.Data;
import lombok.RequiredArgsConstructor;

import java.util.List;

@Entity
@Table(name = "crew")
@RequiredArgsConstructor
@Data
public class Crew extends BaseEntity {

    // Attributes
    @ElementCollection
    @OneToMany(cascade = CascadeType.ALL)
    private List<Person> persons;

    @OneToOne(mappedBy = "crew")
    private Status status;

}
