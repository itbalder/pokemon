package com.masters.pokemon.persistence.entity;

import javax.persistence.*;

@Entity
@Table(name = "movimientosPokemon")
public class PokemonMovements {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "movimientosId")
    private int movementId;
    @Column(name = "nombre")
    private String name;
    @Column(name = "potencia")
    private int power;
    @Column(name = "precision")
    private int accuracy;
    @Column(name = "descripcion")
    private String description;
    @Column(name = "cargaAtaque")
    private int attackCharges;
}
