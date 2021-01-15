package com.masters.pokemon.persistence.entity;

import javax.persistence.*;

import com.masters.pokemon.domain.service.PokemonData;

@Entity
@Table(name = "tipoPokemon")
public class PokemonTypeEntity {


    @EmbeddedId
    private TypePk id;

    @ManyToOne
    @MapsId("dataId")
    @JoinColumn(name = "datosId", insertable = false, updatable = false)
    private PokemonData data;


    @ManyToOne
    @MapsId("typeId")
    @JoinColumn(name = "idTipo", insertable = false, updatable = false)
    private TypeEntity type;

    public TypePk getId() {
        return id;
    }

    public void setId(TypePk id) {
        this.id = id;
    }

    public PokemonData getData() {
        return data;
    }

    public void setData(PokemonData data) {
        this.data = data;
    }

    public TypeEntity getType() {
        return type;
    }

    public void setType(TypeEntity type) {
        this.type = type;
    }
}
