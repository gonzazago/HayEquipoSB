package com.gonzazago.HayEquipo.dto;


import java.io.Serializable;
import java.time.ZonedDateTime;
import java.util.Objects;

/**
 * A DTO for the Reserva entity.
 */
public class ReservaDTO implements Serializable {

    private Long id;

    private ZonedDateTime fecha;

    private Boolean aceptada;

    private Boolean finalizado;

    private String reservadaPor;

    private Long complejoId;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public ZonedDateTime getFecha() {
        return fecha;
    }

    public void setFecha(ZonedDateTime fecha) {
        this.fecha = fecha;
    }

    public Boolean isAceptada() {
        return aceptada;
    }

    public void setAceptada(Boolean aceptada) {
        this.aceptada = aceptada;
    }

    public Boolean isFinalizado() {
        return finalizado;
    }

    public void setFinalizado(Boolean finalizado) {
        this.finalizado = finalizado;
    }

    public String getReservadaPor() {
        return reservadaPor;
    }

    public void setReservadaPor(String reservadaPor) {
        this.reservadaPor = reservadaPor;
    }

    public Long getComplejoId() {
        return complejoId;
    }

    public void setComplejoId(Long complejoId) {
        this.complejoId = complejoId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }

        ReservaDTO reservaDTO = (ReservaDTO) o;
        if(reservaDTO.getId() == null || getId() == null) {
            return false;
        }
        return Objects.equals(getId(), reservaDTO.getId());
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(getId());
    }

    @Override
    public String toString() {
        return "ReservaDTO{" +
            "id=" + getId() +
            ", fecha='" + getFecha() + "'" +
            ", aceptada='" + isAceptada() + "'" +
            ", finalizado='" + isFinalizado() + "'" +
            ", reservadaPor='" + getReservadaPor() + "'" +
            "}";
    }
}
