package com.gonzazago.HayEquipo.dto;




import com.gonzazago.HayEquipo.entities.enumeration.TiposCanchas;

import java.io.Serializable;
import java.util.Objects;

/**
 * A DTO for the Cancha entity.
 */
public class CanchaDTO implements Serializable {

    private Long id;

    private TiposCanchas tiposCanchas;

    private Long canchareservaId;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public TiposCanchas getTiposCanchas() {
        return tiposCanchas;
    }

    public void setTiposCanchas(TiposCanchas tiposCanchas) {
        this.tiposCanchas = tiposCanchas;
    }

    public Long getCanchareservaId() {
        return canchareservaId;
    }

    public void setCanchareservaId(Long reservaId) {
        this.canchareservaId = reservaId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }

        CanchaDTO canchaDTO = (CanchaDTO) o;
        if(canchaDTO.getId() == null || getId() == null) {
            return false;
        }
        return Objects.equals(getId(), canchaDTO.getId());
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(getId());
    }

    @Override
    public String toString() {
        return "CanchaDTO{" +
            "id=" + getId() +
            ", tiposCanchas='" + getTiposCanchas() + "'" +
            "}";
    }
}
