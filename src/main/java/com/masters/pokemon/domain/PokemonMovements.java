package com.masters.pokemon.domain;
/**
 * <B> Pokemon Movements</B>
 * This class saves variables,setters and getters
 * for every pokemon movement implemented to a pokemon
 */
public class PokemonMovements {
        private Integer idMovement;
        private Integer idType;
        private String movementName;
        private Integer movementPower;
        private Integer movementAccuracy;
        private String movementDescription;
        private Integer movementAttackCharges;
        private Type type;

        public Integer getIdMovement() {
                return idMovement;
        }

        public void setIdMovement(Integer idMovement) {
                this.idMovement = idMovement;
        }

        public Integer getIdType() {
                return idType;
        }

        public void setIdType(Integer idType) {
                this.idType = idType;
        }

        public String getMovementName() {
                return movementName;
        }

        public void setMovementName(String movementName) {
                this.movementName = movementName;
        }

        public Integer getMovementPower() {
                return movementPower;
        }

        public void setMovementPower(Integer movementPower) {
                this.movementPower = movementPower;
        }

        public Integer getMovementAccuracy() {
                return movementAccuracy;
        }

        public void setMovementAccuracy(Integer movementAccuracy) {
                this.movementAccuracy = movementAccuracy;
        }

        public String getMovementDescription() {
                return movementDescription;
        }

        public void setMovementDescription(String movementDescription) {
                this.movementDescription = movementDescription;
        }

        public Integer getMovementAttackCharges() {
                return movementAttackCharges;
        }

        public void setMovementAttackCharges(Integer movementAttackCharges) {
                this.movementAttackCharges = movementAttackCharges;
        }

        public Type getType() {
                return type;
        }

        public void setType(Type type) {
                this.type = type;
        }
}
