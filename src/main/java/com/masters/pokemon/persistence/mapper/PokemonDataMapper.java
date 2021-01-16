package com.masters.pokemon.persistence.mapper;

import com.masters.pokemon.domain.PokemonData;
import com.masters.pokemon.persistence.entity.PokemonDataEntity;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;
import org.mapstruct.*;

import java.util.List;
//Indicamos que el modelo de componenetes es de spring
@Mapper(componentModel = "spring", uses = {TypeMapper.class})
public interface PokemonDataMapper {

    @Mappings({
            @Mapping(source = "dataId",target ="idDataPokemon" ),
            @Mapping(source = "namePokemon",target ="pokemonName" ),
            @Mapping(source = "heightPokemon",target ="pokemonHeight" ),
            @Mapping(source = "weightPokemon",target ="pokemonWeight" ),
            @Mapping(source = "descriptionPokemon",target ="pokemonDescription" ),
            @Mapping(source = "priorityPokemon",target ="pokemonPriority" ),
            @Mapping(source = "evolutionPokemon",target ="pokemonEvolution" ),
            @Mapping(source = "typeId",target ="idType" ),
    })

    //Conversion inversa PokemonData a PokemonDataEntity
    PokemonData toPokemonDatae(PokemonDataEntity pokemonDataEntity);
    List<PokemonData> toPokemonsData(List<PokemonDataEntity> pokemonDataEntity);

    //Conversion inversa  PokemonDataEntity a PokemonData
    @InheritInverseConfiguration
    @Mapping(target = "pokemonStatsEntities",ignore = true)
    PokemonDataEntity toPokemonDataEntityes(PokemonData pokemonData);


}
