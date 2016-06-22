package net.upliftinglemma.fate;

import java.io.Serializable;

import javax.persistence.Embeddable;
import javax.validation.constraints.Min;

import lombok.Data;
import lombok.EqualsAndHashCode;

@Embeddable
@Data
@EqualsAndHashCode(of = "rank")
class Skill implements Serializable {

    private static final long serialVersionUID = 1L;

    @Min(1L) private int rank;

}
