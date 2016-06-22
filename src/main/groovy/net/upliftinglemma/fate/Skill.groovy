package net.upliftinglemma.fate

import javax.persistence.*
import javax.validation.constraints.Min
import javax.validation.constraints.NotNull

import org.springframework.data.rest.core.annotation.RestResource

import groovy.transform.Canonical
import groovy.transform.EqualsAndHashCode

@Embeddable
@Canonical
@EqualsAndHashCode(includes = 'rank')
class Skill implements Serializable {

    private static final long serialVersionUID = 1L

    @Min(1L) int rank

}
