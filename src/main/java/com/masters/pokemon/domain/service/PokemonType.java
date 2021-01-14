package com.masters.pokemon.domain.service;


import javax.persistence.*;
/**
 * This class saves variables,setters and getters
 * for every pokemon type implemented to a pokemon
 */
public class PokemonType {

   private int pokemonId;

   private int typeId;

    public int getPokemonId() {
        return pokemonId;
    }

    public void setPokemonId(int pokemonId) {
        this.pokemonId = pokemonId;
    }

    public int getTypeId() {
        return typeId;
    }

    public void setTypeId(int typeId) {
        this.typeId = typeId;
    }
}

