package com.gonzazago.HayEquipo.dto;


import java.io.Serializable;
import java.util.Objects;

/**
 * A DTO for the Partido entity.
 */
public class PartidoDTO implements Serializable {

    private Long id;

    private Boolean finalizado;

    private String resultado;

    private Long canchaId;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Boolean isFinalizado() {
        return finalizado;
    }

    public void setFinalizado(Boolean finalizado) {
        this.finalizado = finalizado;
    }

    public String getResultado() {
        return resultado;
    }

    public void setResultado(String resultado) {
        this.resultado = resultado;
    }

    public Long getCanchaId() {
        return canchaId;
    }

    public void setCanchaId(Long canchaId) {
        this.canchaId = canchaId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }

        PartidoDTO partidoDTO = (PartidoDTO) o;
        if(partidoDTO.getId() == null || getId() == null) {
            return false;
        }
        return Objects.equals(getId(), partidoDTO.getId());
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(getId());
    }

    @Override
    public String toString() {
        return "PartidoDTO{" +
            "id=" + getId() +
            ", finalizado='" + isFinalizado() + "'" +
            ", resultado='" + getResultado() + "'" +
            "}";
    }
}
