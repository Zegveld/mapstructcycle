package br.eti.cvm.mapstructcycle.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.Set;

@Entity
@NoArgsConstructor
@Getter
@Setter
public class Mother {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="mother_id")
    private long id;

    @Version
    @Getter(AccessLevel.NONE)
    @Setter(AccessLevel.NONE)
    @JsonIgnore
    private long version;

    private String name;

    @OneToMany(mappedBy = "mother")
    private Set<Child> children;

}