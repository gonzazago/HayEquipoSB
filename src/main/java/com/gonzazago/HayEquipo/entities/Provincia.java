package com.gonzazago.HayEquipo.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.io.Serializable;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

/**
 * A Provincia.
 */
@Entity
@Table(name = "provincia")
public class Provincia implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "nombre")
    private String nombre;

    @OneToMany(mappedBy = "provincia")
    @JsonIgnore
    private Set<Localidad> provincialocalidads = new HashSet<>();

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

    public Provincia nombre(String nombre) {
        this.nombre = nombre;
        return this;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Set<Localidad> getProvincialocalidads() {
        return provincialocalidads;
    }

    public Provincia provincialocalidads(Set<Localidad> localidads) {
        this.provincialocalidads = localidads;
        return this;
    }

    public Provincia addProvincialocalidad(Localidad localidad) {
        this.provincialocalidads.add(localidad);
        localidad.setProvincia(this);
        return this;
    }

    public Provincia removeProvincialocalidad(Localidad localidad) {
        this.provincialocalidads.remove(localidad);
        localidad.setProvincia(null);
        return this;
    }

    public void setProvincialocalidads(Set<Localidad> localidads) {
        this.provincialocalidads = localidads;
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
        Provincia provincia = (Provincia) o;
        if (provincia.getId() == null || getId() == null) {
            return false;
        }
        return Objects.equals(getId(), provincia.getId());
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(getId());
    }

    @Override
    public String toString() {
        return "Provincia{" +
            "id=" + getId() +
            ", nombre='" + getNombre() + "'" +
            "}";
    }
}
