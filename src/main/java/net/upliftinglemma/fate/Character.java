package net.upliftinglemma.fate;

import java.io.Serializable;
import java.util.List;
import java.util.Set;

import javax.persistence.*;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import lombok.Data;
import lombok.EqualsAndHashCode;

@Entity
@Data
@EqualsAndHashCode(exclude = {"id"})
public class Character implements Serializable {

    private static final long serialVersionUID = 1L;

    @SequenceGenerator(name = "character_seq", sequenceName = "character_id_seq")
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "character_seq")
    @Id private Integer id;

    @NotNull private String name;

    @Valid
    @OneToMany(mappedBy = "character", orphanRemoval = true)
    @OrderColumn(name = "index")
    private List<Aspect> aspects;

    @Valid
    @OneToMany(mappedBy = "character", orphanRemoval = true)
    private Set<Skill> skills;

    @Valid
    @OneToMany(mappedBy = "character", orphanRemoval = true)
    @OrderColumn(name = "index")
    private List<StressTrack> stressTracks;

}

