package net.upliftinglemma.fate;

import org.hibernate.annotations.NaturalId;

import java.io.Serializable;
import java.util.List;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

import lombok.Data;
import lombok.EqualsAndHashCode;

@Entity
@Data
@EqualsAndHashCode(exclude = {"id", "character"})
public class StressTrack implements Serializable {

    private static final long serialVersionUID = 1L;

    @SequenceGenerator(name = "character_seq", sequenceName = "character_id_seq")
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "character_seq")
    @Id private Integer id;

    @NaturalId private int index;

    @NotNull private String name;

    @ElementCollection
    @Column(name = "value")
    @OrderColumn(name = "index")
    private List<Boolean> boxes;

    @ManyToOne @NaturalId @NotNull
    private Character character;

}

