package com.masters.pokemon.persistence.entity;

import io.swagger.models.auth.In;

import javax.persistence.*;

@Entity
@Table(name = "estadisticasPokemon")

public class PokemonStatsEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "estadisticaId")
    private Integer statId;
    @Column(name = "datosId")
    private String dataId;
    @Column(name = "puntosVida")
    private Integer healthPointsStats;
    @Column(name = "ataque")
    private Integer attackStats;
    @Column(name = "defensa")
    private Integer defenseStats;
    @Column(name = "especial")
    private Integer specialStats;
    @Column(name = "velocidad")
    private Integer speedStats;

    @OneToOne
    @JoinColumn(name = "datosId", insertable = false, updatable = false)
    private PokemonDataEntity pokemonDataEntity;

    public Integer getStatId() {
        return statId;
    }

    public void setStatId(Integer statId) {
        this.statId = statId;
    }

    public String getDataId() {
        return dataId;
    }

    public void setDataId(String dataId) {
        this.dataId = dataId;
    }

    public Integer getHealthPointsStats() {
        return healthPointsStats;
    }

    public void setHealthPointsStats(Integer healthPointsStats) {
        this.healthPointsStats = healthPointsStats;
    }

    public Integer getAttackStats() {
        return attackStats;
    }

    public void setAttackStats(Integer attackStats) {
        this.attackStats = attackStats;
    }

    public Integer getDefenseStats() {
        return defenseStats;
    }

    public void setDefenseStats(Integer defenseStats) {
        this.defenseStats = defenseStats;
    }

    public Integer getSpecialStats() {
        return specialStats;
    }

    public void setSpecialStats(Integer specialStats) {
        this.specialStats = specialStats;
    }

    public Integer getSpeedStats() {
        return speedStats;
    }

    public void setSpeedStats(Integer speedStats) {
        this.speedStats = speedStats;
    }

    public PokemonDataEntity getPokemonDataEntity() {
        return pokemonDataEntity;
    }

    public void setPokemonDataEntity(PokemonDataEntity pokemonDataEntity) {
        this.pokemonDataEntity = pokemonDataEntity;
    }
}
