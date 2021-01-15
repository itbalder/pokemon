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
    private PokemonData pokemonData;


    @ManyToOne
    @MapsId("typeId")
    @JoinColumn(name = "idTipo", insertable = false, updatable = false)
    private TypeEntity typeEntity;

    public TypePk getId() {
        return id;
    }

    public void setId(TypePk id) {
        this.id = id;
    }

    public PokemonData getPokemonData() {
        return pokemonData;
    }

    public void setPokemonData(PokemonData pokemonData) {
        this.pokemonData = pokemonData;
    }

    public TypeEntity getTypeEntity() {
        return typeEntity;
    }

    public void setTypeEntity(TypeEntity typeEntity) {
        this.typeEntity = typeEntity;
    }
}
