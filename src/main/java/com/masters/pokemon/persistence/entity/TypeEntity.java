package com.masters.pokemon.persistence.entity;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "tipo")
public class TypeEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idTipo")
    private  int typeId;
    @Column(name = "nombre")
    private String name;

    public int getTypeId() {
        return typeId;
    }

    public void setTypeId(int typeId) {
        this.typeId = typeId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @OneToMany(mappedBy = "typeEntity")
    private List<TypePk> movimientosPokemon;

    @OneToMany(mappedBy = "typeEntity")
    private List<PokemonTypeEntity> datosPokemon;
}
