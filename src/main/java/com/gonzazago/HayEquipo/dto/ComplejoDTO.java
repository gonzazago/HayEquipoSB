package com.gonzazago.HayEquipo.dto;


import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import java.io.Serializable;
import java.util.Objects;

/**
 * A DTO for the Complejo entity.
 */
public class ComplejoDTO implements Serializable {

    private Long id;

    @NotNull
    @Pattern(regexp = "[A-Z]+")
    private String nombre;

    @NotNull
    private String direccion;

    private String telefono;

    private Integer cantidadCanchas;

    private String horario;

    private Long complejoprovinciaId;

    private Long complejolocalidadId;

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

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public Integer getCantidadCanchas() {
        return cantidadCanchas;
    }

    public void setCantidadCanchas(Integer cantidadCanchas) {
        this.cantidadCanchas = cantidadCanchas;
    }

    public String getHorario() {
        return horario;
    }

    public void setHorario(String horario) {
        this.horario = horario;
    }

    public Long getComplejoprovinciaId() {
        return complejoprovinciaId;
    }

    public void setComplejoprovinciaId(Long provinciaId) {
        this.complejoprovinciaId = provinciaId;
    }

    public Long getComplejolocalidadId() {
        return complejolocalidadId;
    }

    public void setComplejolocalidadId(Long localidadId) {
        this.complejolocalidadId = localidadId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }

        ComplejoDTO complejoDTO = (ComplejoDTO) o;
        if(complejoDTO.getId() == null || getId() == null) {
            return false;
        }
        return Objects.equals(getId(), complejoDTO.getId());
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(getId());
    }

    @Override
    public String toString() {
        return "ComplejoDTO{" +
            "id=" + getId() +
            ", nombre='" + getNombre() + "'" +
            ", direccion='" + getDireccion() + "'" +
            ", telefono='" + getTelefono() + "'" +
            ", cantidadCanchas='" + getCantidadCanchas() + "'" +
            ", horario='" + getHorario() + "'" +
            "}";
    }
}
