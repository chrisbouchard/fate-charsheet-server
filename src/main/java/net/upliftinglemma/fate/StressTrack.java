package net.upliftinglemma.fate;

import java.io.Serializable;
import java.util.List;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

import lombok.Data;


@Entity
@Data
public class StressTrack implements Serializable {

    private static final long serialVersionUID = 1L;

    @SequenceGenerator(name = "character_seq", sequenceName = "character_id_seq")
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "character_seq")
    @Id private Integer id;

    @NotNull private String name;

    @ElementCollection
    @Column(name = "value")
    @OrderColumn(name = "index")
    private List<Boolean> boxes;

    @ManyToOne
    private Character character;

}
