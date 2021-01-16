package com.masters.pokemon.persistence.entity;

import javax.persistence.*;

@Entity
@Table(name = "movimientosPokemon")
public class PokemonMovementsEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "movimientosId")
    private Integer idMovement;
    @Column(name = "tipoId")
    private  Integer typeId;
    @Column(name = "nombre")
    private String nameMovement;
    @Column(name = "potencia")
    private Integer powerMovement;
    @Column(name = "precisio")
    private Integer accuracyMovement;
    @Column(name = "descripcion")
    private String descriptionMovement;
    @Column(name = "cargaAtaque")
    private Integer attackChargesMovement;

    @ManyToOne
    @JoinColumn(name = "idTipo", insertable = false, updatable = false)
    private TypeEntity typeEntity;

    public Integer getIdMovement() {
        return idMovement;
    }

    public void setIdMovement(Integer idMovement) {
        this.idMovement = idMovement;
    }

    public Integer getTypeId() {
        return typeId;
    }

    public void setTypeId(Integer typeId) {
        this.typeId = typeId;
    }

    public Integer getAccuracyMovement() {return accuracyMovement;}

    public void setAccuracyMovement(Integer accuracyMovement) {this.accuracyMovement = accuracyMovement; }

    public String getNameMovement() {
        return nameMovement;
    }

    public void setNameMovement(String nameMovement) {
        this.nameMovement = nameMovement;
    }

    public Integer getPowerMovement() {
        return powerMovement;
    }

    public void setPowerMovement(Integer powerMovement) {
        this.powerMovement = powerMovement;
    }

    public String getDescriptionMovement() {
        return descriptionMovement;
    }

    public void setDescriptionMovement(String descriptionMovement) {
        this.descriptionMovement = descriptionMovement;
    }

    public Integer getAttackChargesMovement() {
        return attackChargesMovement;
    }

    public void setAttackChargesMovement(Integer attackChargesMovement) {
        this.attackChargesMovement = attackChargesMovement;
    }

    public TypeEntity getTypeEntity() {
        return typeEntity;
    }

    public void setTypeEntity(TypeEntity typeEntity) {
        this.typeEntity = typeEntity;
    }
}
