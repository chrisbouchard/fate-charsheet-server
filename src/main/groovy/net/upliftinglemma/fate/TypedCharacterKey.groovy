package net.upliftinglemma.fate;

import javax.persistence.*

@Embeddable
class TypedCharacterKey implements Serializable {

    @Column(name = "character_id")
    Integer characterId

    String type

}
