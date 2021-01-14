package com.masters.pokemon;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Tipo {

    @Id
    @GeneratedValue
    private  int idType;

    @Column
    private String name;
}
