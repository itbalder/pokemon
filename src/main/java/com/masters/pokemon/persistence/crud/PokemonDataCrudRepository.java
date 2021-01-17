package com.masters.pokemon.persistence.crud;

import com.masters.pokemon.persistence.entity.PokemonDataEntity;
import org.springframework.data.repository.CrudRepository;

import java.util.List;
import java.util.Optional;
/**
 * <B>Pokemon Crud Repository</B>
 * This interface creates lists of PokemonDataEntity class
 */

public interface PokemonDataCrudRepository extends CrudRepository<PokemonDataEntity,Integer> {

    /**
     * <B>Query Method FindById</B>
     * @param typeId refers to class variable TypeId that maps "idTipo" from the database
     * @return A <code>List PokemonDataEntity</code>list of pokemon ordered by  alphabetical pokemon name in ascending order
     */
    List<PokemonDataEntity> findByTypeIdOrderByNamePokemonAsc(int typeId);

    /**
     * <B>Query Method FindByDescription</B>
     * @param descriptionPokemon refers to a String type
     * @return A<code>Optional-List-PokemonDataEntity-</code>The pokemon description according to the parameter set
     */
    Optional<List<PokemonDataEntity>> findByDescriptionPokemon(int descriptionPokemon);
}
