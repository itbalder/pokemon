package com.masters.pokemon;


import javax.persistence.*;

@Entity
public class TipoPokemon {
    public id getPokemon() {
        return Pokemon;
    }

    public void setPokemon(id pokemon) {
        Pokemon = pokemon;
    }

    public id getTipo() {
        return Tipo;
    }

    public void setTipo(id tipo) {
        Tipo = tipo;
    }

    @Id
   @GeneratedValue(strategy = GenerationType.IDENTITY)
   private id Pokemon;

   @Id
   @Column
   private id Tipo;

}

