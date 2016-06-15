package net.upliftinglemma.fate;

import javax.persistence.*;

@Entity
class Character {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    Long id

    String name

    @ManyToOne
    Template template

}

