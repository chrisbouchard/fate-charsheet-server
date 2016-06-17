package net.upliftinglemma.fate

import javax.persistence.*

@Entity
@IdClass(IndexedCharacterKey)
class Aspect implements Serializable {

    private static final long serialVersionUID = 1L

    @Column(name = "character_id")
    @Id Integer characterId

    @Id Integer index

    String type
    String name

    @ManyToOne
    @MapsId("characterId")
    Character character

}
