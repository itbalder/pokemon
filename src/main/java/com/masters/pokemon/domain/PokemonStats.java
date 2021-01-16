package com.masters.pokemon.domain;

/**
 * This class saves variables,setters and getters
 * for every pokemon stat implemented to a pokemon
 */
public class PokemonStats {
    private Integer idStats;
    private String idData;
    private Integer statsPointsHealth;
    private Integer statsAttack;
    private Integer statsDefense;
    private Integer statsSpecial;
    private Integer statsSpeed;
    private PokemonData pokemonData;

    public Integer getIdStats() {
        return idStats;
    }

    public void setIdStats(Integer idStats) {
        this.idStats = idStats;
    }

    public String getIdData() {
        return idData;
    }

    public void setIdData(String idData) {
        this.idData = idData;
    }

    public Integer getStatsPointsHealth() {
        return statsPointsHealth;
    }

    public void setStatsPointsHealth(Integer statsPointsHealth) {
        this.statsPointsHealth = statsPointsHealth;
    }

    public Integer getStatsAttack() {
        return statsAttack;
    }

    public void setStatsAttack(Integer statsAttack) {
        this.statsAttack = statsAttack;
    }

    public Integer getStatsDefense() {
        return statsDefense;
    }

    public void setStatsDefense(Integer statsDefense) {
        this.statsDefense = statsDefense;
    }

    public Integer getStatsSpecial() {
        return statsSpecial;
    }

    public void setStatsSpecial(Integer statsSpecial) {
        this.statsSpecial = statsSpecial;
    }

    public Integer getStatsSpeed() {
        return statsSpeed;
    }

    public void setStatsSpeed(Integer statsSpeed) {
        this.statsSpeed = statsSpeed;
    }

    public PokemonData getPokemonData() {
        return pokemonData;
    }

    public void setPokemonData(PokemonData pokemonData) {
        this.pokemonData = pokemonData;
    }
}
