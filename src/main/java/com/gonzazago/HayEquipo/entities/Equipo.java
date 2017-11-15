package com.gonzazago.HayEquipo.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.io.Serializable;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

/**
 * A Equipo.
 */
@Entity
@Table(name = "equipo")
public class Equipo implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "nombre")
    private String nombre;

    @Column(name = "creado_por")
    private String creadoPor;

    @OneToMany(mappedBy = "equipo")
    @JsonIgnore
    private Set<Usuario> equipousuarios = new HashSet<>();

    // jhipster-needle-entity-add-field - JHipster will add fields here, do not remove
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public Equipo nombre(String nombre) {
        this.nombre = nombre;
        return this;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCreadoPor() {
        return creadoPor;
    }

    public Equipo creadoPor(String creadoPor) {
        this.creadoPor = creadoPor;
        return this;
    }

    public void setCreadoPor(String creadoPor) {
        this.creadoPor = creadoPor;
    }

    public Set<Usuario> getEquipousuarios() {
        return equipousuarios;
    }

    public Equipo equipousuarios(Set<Usuario> usuarios) {
        this.equipousuarios = usuarios;
        return this;
    }

    public Equipo addEquipousuario(Usuario usuario) {
        this.equipousuarios.add(usuario);
        usuario.setEquipo(this);
        return this;
    }

    public Equipo removeEquipousuario(Usuario usuario) {
        this.equipousuarios.remove(usuario);
        usuario.setEquipo(null);
        return this;
    }

    public void setEquipousuarios(Set<Usuario> usuarios) {
        this.equipousuarios = usuarios;
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
        Equipo equipo = (Equipo) o;
        if (equipo.getId() == null || getId() == null) {
            return false;
        }
        return Objects.equals(getId(), equipo.getId());
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(getId());
    }

    @Override
    public String toString() {
        return "Equipo{" +
            "id=" + getId() +
            ", nombre='" + getNombre() + "'" +
            ", creadoPor='" + getCreadoPor() + "'" +
            "}";
    }
}
