package com.masters.pokemon.persistence.entity;

import javax.persistence.*;

@Entity
@Table(name = "estadisticasPokemon")

public class PokemonStats {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "pokemonId")
    private int pokemonId;
    @Column(name = "puntosVida")
    private int healthPoints;
    @Column(name = "ataque")
    private int attack;
    @Column(name = "defensa")
    private int defense;
    @Column(name = "especial")
    private int special;
    @Column(name = "velocidad")
    private int speed;

}
