package com.masters.pokemon.persistence.crud;

import com.masters.pokemon.persistence.entity.PokemonDataEntity;
import org.springframework.data.repository.CrudRepository;

import java.util.List;
import java.util.Optional;

public interface PokemonDataCrudRepository extends CrudRepository<PokemonDataEntity,Integer> {

    //Traer todos los elementos de un tipo en especial
    List<PokemonDataEntity> findByTypeIdOrderByNamePokemonAsc(int typeId);

    //Trae la descripcion
    Optional<List<PokemonDataEntity>> findByDescriptionPokemon(String descriptionPokemon);
}
