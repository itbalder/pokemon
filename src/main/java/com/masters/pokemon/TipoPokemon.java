package com.masters.pokemon;


import javax.persistence.*;

@Entity
public class TipoPokemon {
    @Id
   @GeneratedValue(strategy = GenerationType.IDENTITY)
   private int idPokemon;

   @Id
   @Column
   private int idTipo;

    public int getIdPokemon() {
        return idPokemon;
    }

    public void setIdPokemon(int idPokemon) {
        this.idPokemon = idPokemon;
    }

    public int getIdTipo() {
        return idTipo;
    }

    public void setIdTipo(int idTipo) {
        this.idTipo = idTipo;
    }
}

