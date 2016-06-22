package net.upliftinglemma.fate;

import java.io.Serializable;

import javax.persistence.Basic;
import javax.persistence.Embeddable;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;

import lombok.Data;
import lombok.EqualsAndHashCode;

@Embeddable
@Data
@EqualsAndHashCode(of = "rank")
class Skill implements Serializable {

    private static final long serialVersionUID = 1L;

    @Basic(optional = false)
    @NotNull private String name;

    @Min(1L) private int rank;

}
