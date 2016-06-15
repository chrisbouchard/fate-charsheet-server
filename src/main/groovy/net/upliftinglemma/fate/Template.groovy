package net.upliftinglemma.fate;

import java.util.Set;
import javax.persistence.*;

@Entity
class Template {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id

    private String name

    @OneToMany
    private Set<Character> character

}


