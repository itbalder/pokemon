package com.masters.pokemon.web.controller;

import com.masters.pokemon.domain.PokemonData;
import com.masters.pokemon.domain.service.PokemonDataService;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

//Indica que s spring que esta clase sera un controlador de un api rest
@RestController
@RequestMapping("/pokemon")
public class PokemonDataEntityController {

    @Autowired
    private PokemonDataService pokemonDataService;

    @GetMapping("/all")
    @ApiOperation("Search every pokemon on the database")
    @ApiResponse(code = 200, message = "Ok")
    public ResponseEntity<List<PokemonData>> getAll() {
        return new ResponseEntity<>(pokemonDataService.getAll(),HttpStatus.OK);
    }



    @GetMapping("/findById/{dataId}")
    @ApiOperation("Search a pokemon with an ID")
    @ApiResponses({
            @ApiResponse(code = 200, message = "OK"),
            @ApiResponse(code = 404, message = "Product Not found")
    })
    public ResponseEntity<PokemonData> getokemon(@ApiParam(value = "The id of a pokemon", required = true, example = "2")@PathVariable("dataId")int idDataPokemon) {
        return pokemonDataService.getPokemon(idDataPokemon)
                .map(pokemonData -> new ResponseEntity<>(pokemonData,HttpStatus.OK))
                .orElse(new ResponseEntity<>(HttpStatus.NOT_FOUND));
    }


    @PostMapping("/save")
    @ApiOperation("Saves a pokemon on the database")
    @ApiResponse(code = 200, message = "Ok")
    public ResponseEntity<PokemonData> save(@RequestBody PokemonData pokemonData) {

        return new ResponseEntity<>( pokemonDataService.save(pokemonData),HttpStatus.CREATED);
    }


    @DeleteMapping("/delete/{dataId}")
    public ResponseEntity delete(@PathVariable("dataId")int idDataPokemon) {
        if(pokemonDataService.delete(idDataPokemon)){
            return new ResponseEntity(HttpStatus.OK);
        }else{
            return new ResponseEntity(HttpStatus.NOT_FOUND);
        }

    }


}
