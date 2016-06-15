package net.upliftinglemma.fate;

import javax.persistence.*;

@Entity
class Character {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id

    private String name

    @ManyToOne
    private Template template

}

