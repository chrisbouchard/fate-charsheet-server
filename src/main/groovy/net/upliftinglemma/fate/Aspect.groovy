package net.upliftinglemma.fate

import javax.persistence.*

import org.springframework.data.rest.core.annotation.RestResource

import groovy.transform.Canonical
import groovy.transform.EqualsAndHashCode

@Embeddable
@Canonical
@EqualsAndHashCode(includes = ['type', 'name'])
class Aspect implements Serializable {

    private static final long serialVersionUID = 1L

    String type
    String name
}
