package com.gonzazago.HayEquipo.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.gonzazago.HayEquipo.entities.enumeration.TiposCanchas;


import javax.persistence.*;
import java.io.Serializable;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

/**
 * A Cancha.
 */
@Entity
@Table(name = "cancha")
public class Cancha implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Enumerated(EnumType.STRING)
    @Column(name = "tipos_canchas")
    private TiposCanchas tiposCanchas;

    @OneToOne
    @JoinColumn(unique = true)
    private Reserva canchareserva;

    @OneToMany(mappedBy = "cancha")
    @JsonIgnore
    private Set<Partido> canchapartidos = new HashSet<>();

    // jhipster-needle-entity-add-field - JHipster will add fields here, do not remove
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public TiposCanchas getTiposCanchas() {
        return tiposCanchas;
    }

    public Cancha tiposCanchas(TiposCanchas tiposCanchas) {
        this.tiposCanchas = tiposCanchas;
        return this;
    }

    public void setTiposCanchas(TiposCanchas tiposCanchas) {
        this.tiposCanchas = tiposCanchas;
    }

    public Reserva getCanchareserva() {
        return canchareserva;
    }

    public Cancha canchareserva(Reserva reserva) {
        this.canchareserva = reserva;
        return this;
    }

    public void setCanchareserva(Reserva reserva) {
        this.canchareserva = reserva;
    }

    public Set<Partido> getCanchapartidos() {
        return canchapartidos;
    }

    public Cancha canchapartidos(Set<Partido> partidos) {
        this.canchapartidos = partidos;
        return this;
    }

    public Cancha addCanchapartido(Partido partido) {
        this.canchapartidos.add(partido);
        partido.setCancha(this);
        return this;
    }

    public Cancha removeCanchapartido(Partido partido) {
        this.canchapartidos.remove(partido);
        partido.setCancha(null);
        return this;
    }

    public void setCanchapartidos(Set<Partido> partidos) {
        this.canchapartidos = partidos;
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
        Cancha cancha = (Cancha) o;
        if (cancha.getId() == null || getId() == null) {
            return false;
        }
        return Objects.equals(getId(), cancha.getId());
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(getId());
    }

    @Override
    public String toString() {
        return "Cancha{" +
            "id=" + getId() +
            ", tiposCanchas='" + getTiposCanchas() + "'" +
            "}";
    }
}
