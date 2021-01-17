package com.masters.pokemon.domain;

import com.masters.pokemon.persistence.entity.TypeEntity;

/**
 * This class saves variables,setters and getters
 * for every pokemon created
 */


public class PokemonData {
    private int idDataPokemon;
    private String pokemonName;
    private Double pokemonHeight;
    private Double pokemonWeight;
    private String pokemonDescription;
    private Integer pokemonPriority;
    private String pokemonEvolution;
    private  Integer idType;
    private Type Type;

    public int getIdDataPokemon() {
        return idDataPokemon;
    }

    public void setIdDataPokemon(int idDataPokemon) {
        this.idDataPokemon = idDataPokemon;
    }

    public String getPokemonName() {
        return pokemonName;
    }

    public void setPokemonName(String pokemonName) {
        this.pokemonName = pokemonName;
    }

    public Double getPokemonHeight() {
        return pokemonHeight;
    }

    public void setPokemonHeight(Double pokemonHeight) {
        this.pokemonHeight = pokemonHeight;
    }

    public Double getPokemonWeight() {
        return pokemonWeight;
    }

    public void setPokemonWeight(Double pokemonWeight) {
        this.pokemonWeight = pokemonWeight;
    }

    public String getPokemonDescription() {
        return pokemonDescription;
    }

    public void setPokemonDescription(String pokemonDescription) {
        this.pokemonDescription = pokemonDescription;
    }

    public Integer getPokemonPriority() {
        return pokemonPriority;
    }

    public void setPokemonPriority(Integer pokemonPriority) {
        this.pokemonPriority = pokemonPriority;
    }

    public String getPokemonEvolution() {
        return pokemonEvolution;
    }

    public void setPokemonEvolution(String pokemonEvolution) {
        this.pokemonEvolution = pokemonEvolution;
    }

    public Integer getIdType() {
        return idType;
    }

    public void setIdType(Integer idType) {
        this.idType = idType;
    }

    public com.masters.pokemon.domain.Type getType() {
        return Type;
    }

    public void setType(com.masters.pokemon.domain.Type type) {
        Type = type;
    }
}
