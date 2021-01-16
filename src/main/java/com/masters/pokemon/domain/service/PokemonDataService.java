package com.masters.pokemon.domain.service;

import com.masters.pokemon.domain.PokemonData;
import com.masters.pokemon.domain.repository.PokemonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PokemonDataService {

    @Autowired
    private PokemonRepository pokemonRepository;

    //Creacion de metodos
    public List<PokemonData> getAll(){
        return pokemonRepository.getAll();
    };
    public Optional<PokemonData> getPokemon(int idDataPokemon){
        return pokemonRepository.getPokemon(idDataPokemon);
    }
    public Optional<List<PokemonData>> getByTypee(int type){
        return pokemonRepository.getByType(type);
    }
    public PokemonData save(PokemonData pokemonData){
        return pokemonRepository.save(pokemonData);
    }
    public boolean delete(int idDataPokemon){

        return getPokemon(idDataPokemon).map(pokemon -> {
            pokemonRepository.delete(idDataPokemon);
            return true;
        }).orElse(false);

    }

}
