package com.gonzazago.HayEquipo.dto;


import java.io.Serializable;
import java.util.Objects;

/**
 * A DTO for the Equipo entity.
 */
public class EquipoDTO implements Serializable {

    private Long id;

    private String nombre;

    private String creadoPor;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCreadoPor() {
        return creadoPor;
    }

    public void setCreadoPor(String creadoPor) {
        this.creadoPor = creadoPor;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }

        EquipoDTO equipoDTO = (EquipoDTO) o;
        if(equipoDTO.getId() == null || getId() == null) {
            return false;
        }
        return Objects.equals(getId(), equipoDTO.getId());
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(getId());
    }

    @Override
    public String toString() {
        return "EquipoDTO{" +
            "id=" + getId() +
            ", nombre='" + getNombre() + "'" +
            ", creadoPor='" + getCreadoPor() + "'" +
            "}";
    }
}
