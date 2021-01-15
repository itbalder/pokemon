package com.masters.pokemon.persistence.entity;

import com.masters.pokemon.domain.service.PokemonData;
import com.masters.pokemon.domain.service.Type;

import javax.persistence.*;
import java.io.Serializable;

@Embeddable
public class TypePk implements Serializable {

    @Column(name ="datosId")
    private Integer dataId;

    @Column(name = "idTipo")
    private Integer typeId;

    public Integer getDataId() {
        return dataId;
    }

    public void setDataId(Integer dataId) {
        this.dataId = dataId;
    }

    public Integer getTypeId() {
        return typeId;
    }

    public void setTypeId(Integer typeId) {
        this.typeId = typeId;
    }
}
