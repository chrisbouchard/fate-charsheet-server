package net.upliftinglemma.fate;

import java.io.Serializable;
import java.util.Collection;
import java.util.List;

import javax.persistence.CollectionTable;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OrderColumn;
import javax.persistence.UniqueConstraint;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import lombok.Data;

@Entity
@Data
public class Character implements Serializable {

    private static final long serialVersionUID = 1L;

    @GeneratedValue(strategy = GenerationType.AUTO)
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
    @ElementCollection
    @OrderColumn(name = "index")
    private List<StressTrack> stressTracks;

}
