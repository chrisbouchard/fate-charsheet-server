package net.upliftinglemma.fate

import javax.persistence.*

import groovy.transform.Canonical

@Entity
@Canonical
class Character implements Serializable {

    private static final long serialVersionUID = 1L

    @GeneratedValue(strategy = GenerationType.AUTO)
    @Id Integer id

    String name

    @ElementCollection
    @OrderColumn(name = 'index')
    List<Aspect> aspects

    @ElementCollection
    Set<Skill> skills

}
