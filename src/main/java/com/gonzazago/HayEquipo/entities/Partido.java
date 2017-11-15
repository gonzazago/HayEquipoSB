package com.gonzazago.HayEquipo.entities;


import javax.persistence.*;
import java.io.Serializable;
import java.util.Objects;

/**
 * A Partido.
 */
@Entity
@Table(name = "partido")
public class Partido implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "finalizado")
    private Boolean finalizado;

    @Column(name = "resultado")
    private String resultado;

    @ManyToOne
    private Cancha cancha;

    // jhipster-needle-entity-add-field - JHipster will add fields here, do not remove
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Boolean isFinalizado() {
        return finalizado;
    }

    public Partido finalizado(Boolean finalizado) {
        this.finalizado = finalizado;
        return this;
    }

    public void setFinalizado(Boolean finalizado) {
        this.finalizado = finalizado;
    }

    public String getResultado() {
        return resultado;
    }

    public Partido resultado(String resultado) {
        this.resultado = resultado;
        return this;
    }

    public void setResultado(String resultado) {
        this.resultado = resultado;
    }

    public Cancha getCancha() {
        return cancha;
    }

    public Partido cancha(Cancha cancha) {
        this.cancha = cancha;
        return this;
    }

    public void setCancha(Cancha cancha) {
        this.cancha = cancha;
    }
    // jhipster-needle-entity-add-getters-setters - JHipster will add getters and setters here, do not remove

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Partido partido = (Partido) o;
        if (partido.getId() == null || getId() == null) {
            return false;
        }
        return Objects.equals(getId(), partido.getId());
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(getId());
    }

    @Override
    public String toString() {
        return "Partido{" +
            "id=" + getId() +
            ", finalizado='" + isFinalizado() + "'" +
            ", resultado='" + getResultado() + "'" +
            "}";
    }
}
