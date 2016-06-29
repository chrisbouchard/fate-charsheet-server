package net.upliftinglemma.fate;

import java.io.Serializable;

import javax.persistence.Basic;
import javax.persistence.Embeddable;
import javax.validation.constraints.NotNull;

import lombok.Data;

@Embeddable
@Data
public class Aspect implements Serializable {

    private static final long serialVersionUID = 1L;

    private String type;

    @Basic(optional = false)
    @NotNull private String name;

}
