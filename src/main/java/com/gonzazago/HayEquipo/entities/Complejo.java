package com.gonzazago.HayEquipo.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import java.io.Serializable;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

/**
 * A Complejo.
 */
@Entity
@Table(name = "complejo")
public class Complejo implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotNull
    @Pattern(regexp = "[A-Z]+")
    @Column(name = "nombre", nullable = false)
    private String nombre;

    @NotNull
    @Column(name = "direccion", nullable = false)
    private String direccion;

    @Column(name = "telefono")
    private String telefono;

    @Column(name = "cantidad_canchas")
    private Integer cantidadCanchas;

    @Column(name = "horario")
    private String horario;

    @OneToOne
    @JoinColumn(unique = true)
    private Provincia complejoprovincia;

    @OneToOne
    @JoinColumn(unique = true)
    private Localidad complejolocalidad;

    @OneToMany(mappedBy = "complejo")
    @JsonIgnore
    private Set<Reserva> complejoreservas = new HashSet<>();

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

    public Complejo nombre(String nombre) {
        this.nombre = nombre;
        return this;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public Complejo direccion(String direccion) {
        this.direccion = direccion;
        return this;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getTelefono() {
        return telefono;
    }

    public Complejo telefono(String telefono) {
        this.telefono = telefono;
        return this;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public Integer getCantidadCanchas() {
        return cantidadCanchas;
    }

    public Complejo cantidadCanchas(Integer cantidadCanchas) {
        this.cantidadCanchas = cantidadCanchas;
        return this;
    }

    public void setCantidadCanchas(Integer cantidadCanchas) {
        this.cantidadCanchas = cantidadCanchas;
    }

    public String getHorario() {
        return horario;
    }

    public Complejo horario(String horario) {
        this.horario = horario;
        return this;
    }

    public void setHorario(String horario) {
        this.horario = horario;
    }

    public Provincia getComplejoprovincia() {
        return complejoprovincia;
    }

    public Complejo complejoprovincia(Provincia provincia) {
        this.complejoprovincia = provincia;
        return this;
    }

    public void setComplejoprovincia(Provincia provincia) {
        this.complejoprovincia = provincia;
    }

    public Localidad getComplejolocalidad() {
        return complejolocalidad;
    }

    public Complejo complejolocalidad(Localidad localidad) {
        this.complejolocalidad = localidad;
        return this;
    }

    public void setComplejolocalidad(Localidad localidad) {
        this.complejolocalidad = localidad;
    }

    public Set<Reserva> getComplejoreservas() {
        return complejoreservas;
    }

    public Complejo complejoreservas(Set<Reserva> reservas) {
        this.complejoreservas = reservas;
        return this;
    }

    public Complejo addComplejoreserva(Reserva reserva) {
        this.complejoreservas.add(reserva);
        reserva.setComplejo(this);
        return this;
    }

    public Complejo removeComplejoreserva(Reserva reserva) {
        this.complejoreservas.remove(reserva);
        reserva.setComplejo(null);
        return this;
    }

    public void setComplejoreservas(Set<Reserva> reservas) {
        this.complejoreservas = reservas;
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
        Complejo complejo = (Complejo) o;
        if (complejo.getId() == null || getId() == null) {
            return false;
        }
        return Objects.equals(getId(), complejo.getId());
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(getId());
    }

    @Override
    public String toString() {
        return "Complejo{" +
            "id=" + getId() +
            ", nombre='" + getNombre() + "'" +
            ", direccion='" + getDireccion() + "'" +
            ", telefono='" + getTelefono() + "'" +
            ", cantidadCanchas='" + getCantidadCanchas() + "'" +
            ", horario='" + getHorario() + "'" +
            "}";
    }
}
