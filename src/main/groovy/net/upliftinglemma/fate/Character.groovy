package net.upliftinglemma.fate

import javax.persistence.*
import javax.validation.Valid
import javax.validation.constraints.NotNull

import groovy.transform.Canonical

@Entity
@Canonical
class Character implements Serializable {

    private static final long serialVersionUID = 1L

    @GeneratedValue(strategy = GenerationType.AUTO)
    @Id Integer id

    @NotNull String name

    @Valid
    @ElementCollection
    @OrderColumn(name = 'index')
    List<Aspect> aspects

    @Valid
    @ElementCollection
    @MapKeyColumn(name = 'name')
    Map<String, Skill> skills

}
