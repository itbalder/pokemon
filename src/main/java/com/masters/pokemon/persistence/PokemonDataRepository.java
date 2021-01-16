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
//Indica que esta clase sera la que interactura con la base de datos
@Repository
public class PokemonDataRepository implements PokemonRepository {
    /*Con la notacion @Autowire Los objetos que reciben esta notacion se le cede el control a spring para qie cree en automtico
    las instancias*/
    @Autowired
    private PokemonDataCrudRepository pokemonDataCrudRepository;
    @Autowired
    private PokemonDataMapper mapper;

    public List<PokemonData> getAll(){
        List<PokemonDataEntity> pokemonDataEntities =(List<PokemonDataEntity>)pokemonDataCrudRepository.findAll();
        return mapper.toPokemonsData(pokemonDataEntities);
    }
    //Obtener una lista de pokemones que pertenecen a cierto tipo ordenados de forma alfabetica mediante el querymethod

    public Optional<List<PokemonData>>getByType(int IdType){
        List<PokemonDataEntity> pokemonDataEntities=pokemonDataCrudRepository.findByTypeIdOrderByNamePokemonAsc(IdType);
        return Optional.of(mapper.toPokemonsData(pokemonDataEntities));
    }
    //Obtener la descripcion del pokemon
    @Override
    public Optional<List<PokemonData>>getDescription(String pokemonDescription){
        Optional<List<PokemonDataEntity>> pokemonDataEntities=pokemonDataCrudRepository.findByDescriptionPokemon(pokemonDescription);
        //Lo convierte a PokemonDataEntity y lo retorna
        return pokemonDataEntities.map(poke ->mapper.toPokemonsData(poke));
    }
    //Obtener un poquemon por su Id por medio del findById que pertenece al JP
    @Override
    public Optional<PokemonData> getPokemon(int idDataPokemon){
        return pokemonDataCrudRepository.findById(idDataPokemon).map(pokemon ->mapper.toPokemonDatae(pokemon)) ;
    }
    //Guardar un pokemon
    @Override
    public PokemonData save(PokemonData pokemon){
        PokemonDataEntity pokemonDataEntity= mapper.toPokemonDataEntityes(pokemon);
        return mapper.toPokemonDatae(pokemonDataCrudRepository.save(pokemonDataEntity));
    }
    //Eliminar un pokemon
    @Override
    public void delete(int idDataPokemon){
        pokemonDataCrudRepository.deleteById(idDataPokemon);
    }



}
