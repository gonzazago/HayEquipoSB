package com.gonzazago.HayEquipo.entities;


import javax.persistence.*;
import java.io.Serializable;
import java.time.ZonedDateTime;
import java.util.Objects;

/**
 * A Reserva.
 */
@Entity
@Table(name = "reserva")
public class Reserva implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "fecha")
    private ZonedDateTime fecha;

    @Column(name = "aceptada")
    private Boolean aceptada;

    @Column(name = "finalizado")
    private Boolean finalizado;

    @Column(name = "reservada_por")
    private String reservadaPor;

    @ManyToOne
    private Complejo complejo;

    // jhipster-needle-entity-add-field - JHipster will add fields here, do not remove
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public ZonedDateTime getFecha() {
        return fecha;
    }

    public Reserva fecha(ZonedDateTime fecha) {
        this.fecha = fecha;
        return this;
    }

    public void setFecha(ZonedDateTime fecha) {
        this.fecha = fecha;
    }

    public Boolean isAceptada() {
        return aceptada;
    }

    public Reserva aceptada(Boolean aceptada) {
        this.aceptada = aceptada;
        return this;
    }

    public void setAceptada(Boolean aceptada) {
        this.aceptada = aceptada;
    }

    public Boolean isFinalizado() {
        return finalizado;
    }

    public Reserva finalizado(Boolean finalizado) {
        this.finalizado = finalizado;
        return this;
    }

    public void setFinalizado(Boolean finalizado) {
        this.finalizado = finalizado;
    }

    public String getReservadaPor() {
        return reservadaPor;
    }

    public Reserva reservadaPor(String reservadaPor) {
        this.reservadaPor = reservadaPor;
        return this;
    }

    public void setReservadaPor(String reservadaPor) {
        this.reservadaPor = reservadaPor;
    }

    public Complejo getComplejo() {
        return complejo;
    }

    public Reserva complejo(Complejo complejo) {
        this.complejo = complejo;
        return this;
    }

    public void setComplejo(Complejo complejo) {
        this.complejo = complejo;
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
        Reserva reserva = (Reserva) o;
        if (reserva.getId() == null || getId() == null) {
            return false;
        }
        return Objects.equals(getId(), reserva.getId());
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(getId());
    }

    @Override
    public String toString() {
        return "Reserva{" +
            "id=" + getId() +
            ", fecha='" + getFecha() + "'" +
            ", aceptada='" + isAceptada() + "'" +
            ", finalizado='" + isFinalizado() + "'" +
            ", reservadaPor='" + getReservadaPor() + "'" +
            "}";
    }
}
