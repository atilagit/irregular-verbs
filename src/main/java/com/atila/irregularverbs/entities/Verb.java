package com.atila.irregularverbs.entities;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "TB_VERB")
public class Verb implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String infinitive;

    @Column(nullable = false)
    private String simplePast;

    @Column(nullable = false)
    private String pastParticiple;

    @Column(nullable = false)
    private String portugueseTranslation;

    public Verb() {
    }

    public Verb(Long id, String infinitive, String simplePast, String pastParticiple) {
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

    public String getPortugueseTranslation() {
        return portugueseTranslation;
    }

    public void setPortugueseTranslation(String portugueseTranslation) {
        this.portugueseTranslation = portugueseTranslation;
    }
}
