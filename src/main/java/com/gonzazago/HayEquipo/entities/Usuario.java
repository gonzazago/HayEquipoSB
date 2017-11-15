package com.gonzazago.HayEquipo.entities;


import javax.persistence.*;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import java.io.Serializable;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

/**
 * A Usuario.
 */
@Entity
@Table(name = "usuario")
public class Usuario implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotNull
    @Pattern(regexp = "[A-Z]+")
    @Column(name = "nombre", nullable = false)
    private String nombre;

    @NotNull
    @Pattern(regexp = "[A-Z]+")
    @Column(name = "apellido", nullable = false)
    private String apellido;

    @NotNull
    @Column(name = "mail", nullable = false)
    private String mail;

    @NotNull
    @Column(name = "password", nullable = false)
    private String password;

    @OneToOne
    @JoinColumn(unique = true)
    private Complejo usuariocomplejo;

    @OneToOne
    @JoinColumn(unique = true)
    private Reserva usuarioreserva;

    @ManyToMany
    @JoinTable(name = "usuario_usuariopartido",
               joinColumns = @JoinColumn(name="usuarios_id", referencedColumnName="id"),
               inverseJoinColumns = @JoinColumn(name="usuariopartidos_id", referencedColumnName="id"))
    private Set<Partido> usuariopartidos = new HashSet<>();

    @ManyToOne
    private Equipo equipo;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public Usuario nombre(String nombre) {
        this.nombre = nombre;
        return this;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public Usuario apellido(String apellido) {
        this.apellido = apellido;
        return this;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getMail() {
        return mail;
    }

    public Usuario mail(String mail) {
        this.mail = mail;
        return this;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Usuario password (String password){

        this.password=password;
        return this;
    }

    public Complejo getUsuariocomplejo() {
        return usuariocomplejo;
    }

    public Usuario usuariocomplejo(Complejo complejo) {
        this.usuariocomplejo = complejo;
        return this;
    }

    public void setUsuariocomplejo(Complejo complejo) {
        this.usuariocomplejo = complejo;
    }

    public Reserva getUsuarioreserva() {
        return usuarioreserva;
    }

    public Usuario usuarioreserva(Reserva reserva) {
        this.usuarioreserva = reserva;
        return this;
    }

    public void setUsuarioreserva(Reserva reserva) {
        this.usuarioreserva = reserva;
    }

    public Set<Partido> getUsuariopartidos() {
        return usuariopartidos;
    }

    public Usuario usuariopartidos(Set<Partido> partidos) {
        this.usuariopartidos = partidos;
        return this;
    }

    public Usuario addUsuariopartido(Partido partido) {
        this.usuariopartidos.add(partido);
        return this;
    }

    public Usuario removeUsuariopartido(Partido partido) {
        this.usuariopartidos.remove(partido);
        return this;
    }

    public void setUsuariopartidos(Set<Partido> partidos) {
        this.usuariopartidos = partidos;
    }

    public Equipo getEquipo() {
        return equipo;
    }

    public Usuario equipo(Equipo equipo) {
        this.equipo = equipo;
        return this;
    }

    public void setEquipo(Equipo equipo) {
        this.equipo = equipo;
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
        Usuario usuario = (Usuario) o;
        if (usuario.getId() == null || getId() == null) {
            return false;
        }
        return Objects.equals(getId(), usuario.getId());
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(getId());
    }

    @Override
    public String toString() {
        return "Usuario{" +
            "id=" + getId() +
            ", nombre='" + getNombre() + "'" +
            ", apellido='" + getApellido() + "'" +
            ", mail='" + getMail() + "'" +
            "}";
    }
}
