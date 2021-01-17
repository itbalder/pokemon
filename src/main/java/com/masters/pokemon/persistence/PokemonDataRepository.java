package com.masters.pokemon.persistence;

import com.masters.pokemon.domain.PokemonData;
import com.masters.pokemon.domain.repository.PokemonRepository;
import com.masters.pokemon.persistence.crud.PokemonDataCrudRepository;
import com.masters.pokemon.persistence.entity.PokemonDataEntity;
import com.masters.pokemon.persistence.mapper.PokemonDataMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;
/**
 * <B>Pokemon Data Repository</B>
 * This class acts as repository by interacting with the database
 */
@Repository
public class PokemonDataRepository implements PokemonRepository {
    /*Con la notacion @Autowire Los objetos que reciben esta notacion se le cede el control a spring para qie cree en automtico
    las instancias*/
    @Autowired
    private PokemonDataCrudRepository pokemonDataCrudRepository;
    @Autowired
    private PokemonDataMapper mapper;

    /**
     * <B>get All List</>
     * @return a mapped list for each pokemon using toPokemonsData method
     *
     */
    public List<PokemonData> getAll(){
        List<PokemonDataEntity> pokemonDataEntities =(List<PokemonDataEntity>)pokemonDataCrudRepository.findAll();
        return mapper.toPokemonsData(pokemonDataEntities);
    }

    /**
     * <B>getByType List</B>
     * @param IdType refers to an int value it has to match with any existing on the database
     * @return a mapped list of pokemon that belong to the  type id related on the param inserted ordered by ascending alphabetical order
     *
     */
    public Optional<List<PokemonData>>getByType(int IdType){
        List<PokemonDataEntity> pokemonDataEntities=pokemonDataCrudRepository.findByTypeIdOrderByNamePokemonAsc(IdType);
        return Optional.of(mapper.toPokemonsData(pokemonDataEntities));
    }

    /**
     * <B>Get Description</B>
     * @param pokemonDescription refers to a int value
     * @return the specified description of a pokemon
     */
    @Override
    public Optional<List<PokemonData>>getDescription(int pokemonDescription){
        Optional<List<PokemonDataEntity>> pokemonDataEntities=pokemonDataCrudRepository.findByDescriptionPokemon(pokemonDescription);
        return pokemonDataEntities.map(poke ->mapper.toPokemonsData(poke));
    }

    /**
     * <B>get Pokemon List</B>
     * @param idDataPokemon refers to the pokemon Id
     * @return the specified pokemon data according to the id matched on the database
     */
    @Override
    public Optional<PokemonData> getPokemon(int idDataPokemon){
        return pokemonDataCrudRepository.findById(idDataPokemon).map(pokemon ->mapper.toPokemonDatae(pokemon)) ;
    }

    /**
     *
     * @param pokemon refers to an object from PokemonData class
     * @return saves the object on a mapped list
     */
    @Override
    public PokemonData save(PokemonData pokemon){
        PokemonDataEntity pokemonDataEntity= mapper.toPokemonDataEntityes(pokemon);
        return mapper.toPokemonDatae(pokemonDataCrudRepository.save(pokemonDataEntity));
    }

    /**
     *
     * @param idDataPokemon refers to the pokemon id it has to exist on the database
     * @return Deletes the pokemon with the specified Id
     */
    @Override
    public void delete(int idDataPokemon){
        pokemonDataCrudRepository.deleteById(idDataPokemon);
    }



}
