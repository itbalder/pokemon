package com.masters.pokemon.persistence.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "tipo")
public class Type {

    @Column(name = "idTipo")
    private  int typeId;
    @Column(name = "nombre")
    private String name;
}
