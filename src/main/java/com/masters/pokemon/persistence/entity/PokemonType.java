package com.masters.pokemon.persistence.entity;

import javax.persistence.*;

@Entity
@Table(name = "tipoPokemon")
public class PokemonType {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idPokemon")
    private int pokemonId;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idTipo")
    private int typeId;


}
