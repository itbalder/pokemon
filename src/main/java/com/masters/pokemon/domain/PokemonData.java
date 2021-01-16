package com.masters.pokemon.domain;

/**
 * This class saves variables,setters and getters
 * for every pokemon created
 */

public class PokemonData {
    private String idDataPokemon;
    private String pokemonName;
    private Double pokemonHeight;
    private Double pokemonWeight;
    private String pokemonDescription;
    private Integer pokemonPriority;
    private String pokemonEvolution;
    private Type type;

    public String getIdDataPokemon() {
        return idDataPokemon;
    }

    public void setIdDataPokemon(String idDataPokemon) {
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

    public Type getType() {
        return type;
    }

    public void setType(Type type) {
        this.type = type;
    }
}
