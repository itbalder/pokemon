package com.masters.pokemon.persistence.mapper;

import com.masters.pokemon.domain.Type;
import com.masters.pokemon.persistence.entity.TypeEntity;
import org.mapstruct.*;

@Mapper(componentModel = "spring")
public interface TypeMapper {

    @Mappings(
            {
                    @Mapping(source = "typeId",target ="IdType"),
                    @Mapping(source = "nameType",target ="TypeName"),

            }
    )
    Type toType(TypeEntity typeEntity);

    ////Objetos que no se utilizaran indicamos que se ignoraran
    @InheritInverseConfiguration
    @Mappings({
            @Mapping(target = "pokemonDataEntities", ignore = true),
            @Mapping(target = "pokemonMovementsEntities", ignore = true)
    })

     TypeEntity toTypeEntitys(Type type);



}
