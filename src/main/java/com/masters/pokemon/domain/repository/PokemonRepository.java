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
     * @return a list with pokemon objects
     */
    List<PokemonData> getAll();

    /**
     * <B>Get By Type</B>
     * @param type integer value refers to idType
     * @return An optonal List with the pokemon specified on  the idType
     */
    Optional<List<PokemonData>> getByType(int type);

    /**
     * <B>Get Description</B>
     * @param pokemonDescription integer value refers to the description id on the database
     * @return an Optional List with the description of the pokemon specified on the id
     */
    Optional<List<PokemonData>> getDescription(int pokemonDescription);


    /**
     * <B>Get Pokemon</B>
     * @param idDataPokemon refers to the pokemon Id
     * @return A list with the pokemon data specified on the pokemon Id
     */
    Optional<PokemonData> getPokemon(int idDataPokemon);

    /**
     * <B>Save</B>
     * @param pokemonData Refers to an object of the class PokemonData
     * @return Deletes the pokemon according to the specified Id
     */
    PokemonData save(PokemonData pokemonData);
    void delete(int dataId);
}
