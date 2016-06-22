package net.upliftinglemma.fate;

import java.io.Serializable;
import java.util.List;
import java.util.Map;

import javax.persistence.*;
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
    @MapKeyColumn(name = "name")
    private Map<String, Skill> skills;

}
