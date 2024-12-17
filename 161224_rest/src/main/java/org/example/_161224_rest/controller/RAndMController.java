package org.example._161224_rest.controller;

import org.example._161224_rest.model.RickAndMortyChar;
import org.example._161224_rest.service.RAndMService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class RAndMController {

    private final RAndMService service;

    public RAndMController(RAndMService service) {
        this.service = service;
    }

    @GetMapping("/characters")
    public List<RickAndMortyChar> getAllChars(){
        return service.getCharacters();
    }

    @GetMapping("/characters/{id}")
    public RickAndMortyChar getCharById(@PathVariable int id){
        return service.getCharacterById(id);
    }

    @GetMapping("/characters/alive")
    public List<RickAndMortyChar> getAliveCharacters(){
        return service.getAliveCharacters();
    }

    @GetMapping("/species-statistic")
    public int getCharacterCountBySpecies(@RequestParam String species) {
        return service.getCharacterCountBySpecies(species);
    }

}