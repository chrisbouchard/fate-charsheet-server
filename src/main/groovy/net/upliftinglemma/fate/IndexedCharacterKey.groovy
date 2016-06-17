package net.upliftinglemma.fate

import javax.persistence.*

@Embeddable
class IndexedCharacterKey implements Serializable {

    private static final long serialVersionUID = 1L

    @Column(name = "character_id")
    Integer characterId

    Integer index

}
