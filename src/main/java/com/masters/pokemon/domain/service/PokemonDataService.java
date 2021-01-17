package com.masters.pokemon.domain.service;

import com.masters.pokemon.domain.PokemonData;
import com.masters.pokemon.domain.repository.PokemonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
/**
 * <B> Pokemon Data Service</B>
 * This class is a collection of getters that operate for the pokemon repository
 */
@Service
public class PokemonDataService {

    @Autowired
    private PokemonRepository pokemonRepository;

    /*<B>Methods</B>*/

    /**
     * <B>getAll method</B>
     * @return A <code>pokemonRepository.getAll()</code>
     * this returns every registry on the pokemon database for the table "datosPokemon"
     */
    public List<PokemonData> getAll(){
        return pokemonRepository.getAll();
    };

    /**
     *<B>getPokemon Method</B>
     * @param idDataPokemon refers to the pokemon Id on the table "Datos pokemon" is an int value and needs to exists on the database
     * @return A <code>pokemonRepository.getPokemon(idDataPokemon)</code> Returns the specified pokemon  according to the id param
     */
    public Optional<PokemonData> getPokemon(int idDataPokemon){
        return pokemonRepository.getPokemon(idDataPokemon);
    }


    /**
     * <B>Save Method</B>
     * @param pokemonData refers to an object from public class PokemonData
     * @return A<code>pokemonRepository.save(pokemonData)</code> Saves the pokemon object on the "datosPokemon" table from Database
     */
    public PokemonData save(PokemonData pokemonData){
        return pokemonRepository.save(pokemonData);
    }


    /**
     *<B>getByType Method</B>
     * @param type refers to the pokemon type Id on the table "tipos" is an int value and it needs to exists on the database
     * @return A <code>pokemonRepository.getByType(type)</code> Returns the specified pokemon according to the type of the id parameter related to the pokemon
     */
    public Optional<List<PokemonData>> getByType(int type){
        return pokemonRepository.getByType(type);
    }


    /**
     *<B>Delete Method </B>
     * @param idDataPokemon is an int value and needs to exists on the database
     * @return delete<code>pokemonRepository.delete(idDataPokemon)</code> Deletes the pokemon data from "datosPokemon" where id matches with the given parameter
     */

    public boolean delete(int idDataPokemon){

        return getPokemon(idDataPokemon).map(pokemon -> {
            pokemonRepository.delete(idDataPokemon);
            return true;
        }).orElse(false);

    }

}
