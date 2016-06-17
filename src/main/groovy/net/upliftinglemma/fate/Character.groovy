package net.upliftinglemma.fate

import javax.persistence.*

@Entity
class Character implements Serializable {

    private static final long serialVersionUID = 1L

    @GeneratedValue(strategy = GenerationType.AUTO)
    @Id Integer id

    String name

    @OneToMany(mappedBy = "characterId")
    @OrderBy("index")
    List<Aspect> aspects

}
