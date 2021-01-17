package com.masters.pokemon.domain.repository;

import com.masters.pokemon.domain.PokemonData;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;
/**
 * <B>Pokemon Repository</B>
 * This interface is a repository for the pokemon web app
 *and implements the logic on the domain
 */

@Component
public interface PokemonRepository {
    /**
     * <B>Get All</B>
     * @return a<code> getAll</code> list with pokemon objects
     */
    List<PokemonData> getAll();

    /**
     * <B>Get By Type</B>
     * @param type integer value refers to idType
     * @return An <code>getByTpe</code>optional List with the pokemon specified on  the idType
     */
    Optional<List<PokemonData>> getByType(int type);

    /**
     * <B>Get Description</B>
     * @param pokemonDescription integer value refers to the description id on the database
     * @return an <code>getDescription</code>Optional List with the description of the pokemon specified on the id
     */
    Optional<List<PokemonData>> getDescription(int pokemonDescription);


    /**
     * <B>Get Pokemon</B>
     * @param idDataPokemon refers to the pokemon Id
     * @return A <code>getPokemon</code> list with the pokemon data specified on the pokemon Id
     */
    Optional<PokemonData> getPokemon(int idDataPokemon);

    /**
     * <B>Save</B>
     * @param pokemonData Refers to an object of the class PokemonData
     * @return A <code>save</code>saves the pokemon according to the specified Id
     */
    PokemonData save(PokemonData pokemonData);

    /**
     * <B>Delete</B>
     * @param dataId Refers to the pokemon data id on the database
     * Deletes the pokemon with the specified id
     */

    void delete(int dataId);
}
