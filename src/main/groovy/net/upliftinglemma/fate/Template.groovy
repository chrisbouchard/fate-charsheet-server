package net.upliftinglemma.fate;

import java.util.Set;
import javax.persistence.*;

@Entity
class Template {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    Long id

    String name

    @OneToMany
    Set<Character> character

}


