package net.upliftinglemma.fate;

import org.hibernate.annotations.NaturalId;

import java.io.Serializable;

import javax.persistence.*;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;

import lombok.Data;
import lombok.EqualsAndHashCode;

@Entity
@Data
@EqualsAndHashCode(exclude = {"id", "character"})
public class Skill implements Serializable {

    private static final long serialVersionUID = 1L;

    @SequenceGenerator(name = "character_seq", sequenceName = "character_id_seq")
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "character_seq")
    @Id private Integer id;

    @NaturalId @NotNull
    private String name;

    @Min(1L) private int rank;

    @ManyToOne @NaturalId @NotNull
    private Character character;

}
