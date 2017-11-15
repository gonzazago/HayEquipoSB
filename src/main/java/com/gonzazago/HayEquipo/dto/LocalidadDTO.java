package com.gonzazago.HayEquipo.dto;


import java.io.Serializable;
import java.util.Objects;

/**
 * A DTO for the Localidad entity.
 */
public class LocalidadDTO implements Serializable {

    private Long id;

    private String nombre;

    private Long provinciaId;

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

    public Long getProvinciaId() {
        return provinciaId;
    }

    public void setProvinciaId(Long provinciaId) {
        this.provinciaId = provinciaId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }

        LocalidadDTO localidadDTO = (LocalidadDTO) o;
        if(localidadDTO.getId() == null || getId() == null) {
            return false;
        }
        return Objects.equals(getId(), localidadDTO.getId());
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(getId());
    }

    @Override
    public String toString() {
        return "LocalidadDTO{" +
            "id=" + getId() +
            ", nombre='" + getNombre() + "'" +
            "}";
    }
}
