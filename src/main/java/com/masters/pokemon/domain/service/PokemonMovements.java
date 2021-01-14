package com.masters.pokemon.domain.service;
/**
 * This class saves variables,setters and getters
 * for every pokemon movement implemented to a pokemon
 */
public class PokemonMovements {
        private int movementId;
        private String name;
        private int power;
        private int accuracy;
        private String description;
        private int attackCharges;

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getAttackCharges() {
        return attackCharges;
    }

    public void setAttackCharges(int attackCharges) {
        this.attackCharges = attackCharges;
    }

    public int getMovementId() {
        return movementId;
    }

    public void setMovementId(int movementId) {
        this.movementId = movementId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPower() {
        return power;
    }

    public void setPower(int power) {
        this.power = power;
    }

    public int getAccuracy() {
        return accuracy;
    }

    public void setAccuracy(int accuracy) {
        this.accuracy = accuracy;
    }


}
