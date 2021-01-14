package com.masters.pokemon.domain.repository;

import com.masters.pokemon.domain.service.PokemonData;

import java.util.List;
import java.util.Optional;

public interface PokemonRepository {
    List<PokemonData> getAll();
    Optional<PokemonData> getPokemon(int dataId);
    PokemonData save(PokemonData pokemon);
    void delete(int dataId);
}
