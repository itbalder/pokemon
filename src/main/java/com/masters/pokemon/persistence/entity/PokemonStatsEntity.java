package com.masters.pokemon.persistence.entity;

import javax.persistence.*;

@Entity
@Table(name = "estadisticasPokemon")

public class PokemonStatsEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "estadisticaId")
    private int statId;

    @Column(name = "datosId")
    private String dataId;

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

    @ManyToOne
    @JoinColumn(name = "datosId", insertable = false, updatable = false)
    private PokemonDataEntity pokemonDataEntity;


}
