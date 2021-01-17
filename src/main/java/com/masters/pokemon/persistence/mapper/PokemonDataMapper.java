package com.masters.pokemon.persistence.mapper;

import com.masters.pokemon.domain.PokemonData;
import com.masters.pokemon.persistence.entity.PokemonDataEntity;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;
import org.mapstruct.*;

import java.util.List;

/**
 * <B>Pokemon Data Mapper</B>
 * This class creates the mapping between classes
 */
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

    /**
     * <B>To Pokemon Data</B>
     * Converts a designated PokemonData list into a pokemonDataEntity List
     */
    PokemonData toPokemonDatae(PokemonDataEntity pokemonDataEntity);
    List<PokemonData> toPokemonsData(List<PokemonDataEntity> pokemonDataEntity);

    //Conversion inversa  PokemonDataEntity a PokemonData

    /**
     * <B>Invert to PokemonData</B>
     * @param pokemonData refers to the converted PokemonData List
     * @return a PokemonDataList
     */
    @InheritInverseConfiguration
    @Mapping(target = "pokemonStatsEntities",ignore = true)
    PokemonDataEntity toPokemonDataEntityes(PokemonData pokemonData);


}
