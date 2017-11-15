package com.gonzazago.HayEquipo.dto;


import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import java.io.Serializable;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

/**
 * A DTO for the Usuario entity.
 */
public class UsuarioDTO implements Serializable {

    private Long id;

    @NotNull
    @Pattern(regexp = "[A-Z]+")
    private String nombre;

    @NotNull
    @Pattern(regexp = "[A-Z]+")
    private String apellido;

    @NotNull
    private String mail;

    @NotNull
    private String password;

    private Long usuariocomplejoId;

    private Long usuarioreservaId;

    private Set<PartidoDTO> usuariopartidos = new HashSet<>();

    private Long equipoId;

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

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getMail() {
        return mail;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public Long getUsuariocomplejoId() {
        return usuariocomplejoId;
    }

    public void setUsuariocomplejoId(Long complejoId) {
        this.usuariocomplejoId = complejoId;
    }

    public Long getUsuarioreservaId() {
        return usuarioreservaId;
    }

    public void setUsuarioreservaId(Long reservaId) {
        this.usuarioreservaId = reservaId;
    }

    public Set<PartidoDTO> getUsuariopartidos() {
        return usuariopartidos;
    }

    public void setUsuariopartidos(Set<PartidoDTO> partidos) {
        this.usuariopartidos = partidos;
    }

    public Long getEquipoId() {
        return equipoId;
    }

    public void setEquipoId(Long equipoId) {
        this.equipoId = equipoId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }

        UsuarioDTO usuarioDTO = (UsuarioDTO) o;
        if(usuarioDTO.getId() == null || getId() == null) {
            return false;
        }
        return Objects.equals(getId(), usuarioDTO.getId());
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(getId());
    }

    @Override
    public String toString() {
        return "UsuarioDTO{" +
            "id=" + getId() +
            ", nombre='" + getNombre() + "'" +
            ", apellido='" + getApellido() + "'" +
            ", mail='" + getMail() + "'" +
            "}";
    }
}
