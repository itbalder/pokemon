package com.masters.pokemon.web.controller;

import com.masters.pokemon.domain.PokemonData;
import com.masters.pokemon.domain.service.PokemonDataService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

//Indica que s spring que esta clase sera un controlador de un api rest
@RestController
@RequestMapping("/pokemon")
public class PokemonDataEntityController {

    @Autowired
    private PokemonDataService pokemonDataService;

    @GetMapping("/all")
    public List<PokemonData> getAll(){
        return pokemonDataService.getAll();
    }

    public Optional<PokemonData> getPokemon(int idDataPokemon){
        return pokemonDataService.getPokemon(idDataPokemon);
    }
    public Optional<List<PokemonData>> getByType(int type){
        return pokemonDataService.getByTypee(type);
    }
    public PokemonData save(PokemonData pokemonData){
        return pokemonDataService.save(pokemonData);
    }
    public boolean delete(int idDataPokemon){
        return pokemonDataService.delete(idDataPokemon);
    }

}
