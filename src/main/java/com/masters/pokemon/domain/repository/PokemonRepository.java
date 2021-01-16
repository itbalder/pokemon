package com.masters.pokemon.domain.repository;

import com.masters.pokemon.domain.PokemonData;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;
@Component
public interface PokemonRepository {
    //Creacion de objetos que se encargaran de la logica del domino o del negocio
    List<PokemonData> getAll();
    Optional<List<PokemonData>> getByType(int type);
    Optional<List<PokemonData>> getDescription(String pokemonDescription);
    Optional<PokemonData> getPokemon(int idDataPokemon);
    PokemonData save(PokemonData pokemonData);
    void delete(int dataId);
}
