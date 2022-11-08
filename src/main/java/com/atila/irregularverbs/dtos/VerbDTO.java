package com.atila.irregularverbs.dtos;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;
import java.io.Serializable;

public class VerbDTO implements Serializable {
    private static final long serialVersionUID = 1L;

    @NotBlank
    private Long id;

    @NotBlank
    @Size(min = 2)
    private String infinitive;

    @NotBlank
    private String simplePast;

    @NotBlank
    private String pastParticiple;

    public VerbDTO() {
    }

    public VerbDTO(Long id, String infinitive, String simplePast, String pastParticiple) {
        this.id = id;
        this.infinitive = infinitive;
        this.simplePast = simplePast;
        this.pastParticiple = pastParticiple;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getInfinitive() {
        return infinitive;
    }

    public void setInfinitive(String infinitive) {
        this.infinitive = infinitive;
    }

    public String getSimplePast() {
        return simplePast;
    }

    public void setSimplePast(String simplePast) {
        this.simplePast = simplePast;
    }

    public String getPastParticiple() {
        return pastParticiple;
    }

    public void setPastParticiple(String pastParticiple) {
        this.pastParticiple = pastParticiple;
    }
}