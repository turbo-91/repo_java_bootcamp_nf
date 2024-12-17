package org.example._161224_rest.controller;

import org.example._161224_rest.model.RickAndMortyChar;
import org.example._161224_rest.service.RAndMService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/characters")
public class RAndMController {

    private final RAndMService service;

    public RAndMController(RAndMService service) {
        this.service = service;
    }

    @GetMapping
    public List<RickAndMortyChar> getAllChars(){
        return service.getCharacters();
    }

    @GetMapping("/{id}")
    public RickAndMortyChar getCharById(@PathVariable int id){
        return service.getCharacterById(id);
    }
}