package net.upliftinglemma.fate;

import java.io.Serializable;
import java.util.Collection;
import java.util.List;

import javax.persistence.*;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import lombok.Data;

@Entity
@Data
public class Character implements Serializable {

    private static final long serialVersionUID = 1L;

    @SequenceGenerator(name = "character_seq", sequenceName = "character_id_seq")
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "character_seq")
    @Id private Integer id;

    @NotNull private String name;

    @Valid
    @ElementCollection
    @OrderColumn(name = "index")
    private List<Aspect> aspects;

    @Valid
    @ElementCollection
    @CollectionTable(uniqueConstraints=@UniqueConstraint(columnNames={"character_id", "name"}))
    private Collection<Skill> skills;

    @Valid
    @OneToMany(mappedBy = "character")
    @OrderColumn(name = "index")
    private List<StressTrack> stressTracks;

}

