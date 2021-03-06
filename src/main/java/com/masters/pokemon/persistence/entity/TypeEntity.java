package com.masters.pokemon.persistence.entity;

import javax.persistence.*;
import java.util.List;

/**
 * <B>Pokemon Type Entity</B>
 * This class creates the references between
 * table "tipo" and  variables from this class
 * Also includes every setter and getter for each variable to generate access to them
 */
@Entity
@Table(name = "tipo")
public class TypeEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "tipoid")
    private  Integer typeId;
    @Column(name = "nombretipo")
    private String nameType;

    public Integer getTypeId() {
        return typeId;
    }

    public void setTypeId(Integer typeId) {
        this.typeId = typeId;
    }

    public String getNameType() {
        return nameType;
    }

    public void setNameType(String nameType) {
        this.nameType = nameType;
    }

    @OneToMany(mappedBy = "typeEntity")
    private List<PokemonDataEntity> pokemonDataEntities;

    @OneToMany(mappedBy = "typeEntity")
    private List<PokemonMovementsEntity> pokemonMovementsEntities;

    public List<PokemonDataEntity> getPokemonDataEntities() {
        return pokemonDataEntities;
    }

    public void setPokemonDataEntities(List<PokemonDataEntity> pokemonDataEntities) {
        this.pokemonDataEntities = pokemonDataEntities;
    }

    public List<PokemonMovementsEntity> getPokemonMovementsEntities() {
        return pokemonMovementsEntities;
    }

    public void setPokemonMovementsEntities(List<PokemonMovementsEntity> pokemonMovementsEntities) {
        this.pokemonMovementsEntities = pokemonMovementsEntities;
    }
}
