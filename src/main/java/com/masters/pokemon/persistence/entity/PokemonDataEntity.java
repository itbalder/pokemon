package com.masters.pokemon.persistence.entity;

import javax.persistence.*;
import java.util.List;
/**
 * <B>Pokemon Data Entity</B>
 * This class creates the references between
 * table "datospokemon" and  variables from this class
 * Also includes every setter and getter for each variable to generate access to them
 */

@Entity
@Table(name = "datospokemon")
public class PokemonDataEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "datosid")
    private Integer dataId;
    @Column(name = "nombre")
    private String namePokemon;
    @Column(name = "altura")
    private Double heightPokemon;
    @Column(name = "peso")
    private Double weightPokemon;
    @Column(name = "descripcion")
    private String descriptionPokemon;
    @Column(name = "prioridad")
    private Integer priorityPokemon;
    @Column(name = "evolucion")
    private String evolutionPokemon;
    @Column(name = "tipoid")
    private Integer typeId;

    @ManyToOne
    @JoinColumn(name = "tipoid", insertable = false, updatable = false)
    private TypeEntity typeEntity;

    @OneToMany (mappedBy = "pokemonDataEntity")
    private List<PokemonStatsEntity> pokemonStatsEntities;

    public Integer getDataId() {
        return dataId;
    }

    public void setDataId(Integer dataId) {
        this.dataId = dataId;
    }

    public String getNamePokemon() {
        return namePokemon;
    }

    public void setNamePokemon(String namePokemon) {
        this.namePokemon = namePokemon;
    }

    public Double getHeightPokemon() {
        return heightPokemon;
    }

    public void setHeightPokemon(Double heightPokemon) {
        this.heightPokemon = heightPokemon;
    }

    public Double getWeightPokemon() {
        return weightPokemon;
    }

    public void setWeightPokemon(Double weightPokemon) {
        this.weightPokemon = weightPokemon;
    }

    public String getDescriptionPokemon() {
        return descriptionPokemon;
    }

    public void setDescriptionPokemon(String descriptionPokemon) {
        this.descriptionPokemon = descriptionPokemon;
    }

    public Integer getPriorityPokemon() {
        return priorityPokemon;
    }

    public void setPriorityPokemon(Integer priorityPokemon) {
        this.priorityPokemon = priorityPokemon;
    }

    public String getEvolutionPokemon() {
        return evolutionPokemon;
    }

    public void setEvolutionPokemon(String evolutionPokemon) {
        this.evolutionPokemon = evolutionPokemon;
    }

    public Integer getTypeId() {
        return typeId;
    }

    public void setTypeId(Integer typeId) {
        this.typeId = typeId;
    }

    public TypeEntity getTypeEntity() {
        return typeEntity;
    }

    public void setTypeEntity(TypeEntity typeEntity) {
        this.typeEntity = typeEntity;
    }

    public List<PokemonStatsEntity> getPokemonStatsEntities() {
        return pokemonStatsEntities;
    }

    public void setPokemonStatsEntities(List<PokemonStatsEntity> pokemonStatsEntities) {
        this.pokemonStatsEntities = pokemonStatsEntities;
    }
}
