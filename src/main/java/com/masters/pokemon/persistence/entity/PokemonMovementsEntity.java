package com.masters.pokemon.persistence.entity;

import javax.persistence.*;

@Entity
@Table(name = "movimientosPokemon")
public class PokemonMovementsEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "movimientosId")
    private int movementId;

    @Column(name = "idTipo")
    private  int typeId;

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

    @ManyToOne
    @JoinColumn(name = "idTipo", insertable = false, updatable = false)
    private TypeEntity typeEntity;
}
