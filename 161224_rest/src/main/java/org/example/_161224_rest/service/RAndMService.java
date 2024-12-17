package org.example._161224_rest.service;

import org.example._161224_rest.model.RickAndMortyChar;
import org.example._161224_rest.model.RickAndMortyResponse;
import org.example._161224_rest.model.SpeciesResponse;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestClient;

import java.util.List;

@Service
public class RAndMService {

    private final RestClient restClient;

    public RAndMService(RestClient.Builder restClientBuilder) {
        this.restClient = restClientBuilder.baseUrl("https://rickandmortyapi.com/api/character").build();
    }

    public List<RickAndMortyChar> getCharacters() {
        return restClient
                .get() //-> REST Methode
                //.uri() -> evtl. URL ergänzen
                .retrieve() // "Drücke" auf Senden und warte auf Antwort!
                .body(RickAndMortyResponse.class) //Wandelt Response in angegebenes Objekt um
                .results();
    }

    public RickAndMortyChar getCharacterById(int id) {
        return restClient
                .get() //-> REST Methode
                .uri("/"+id) // -> evtl. URL ergänzen
                .retrieve() // "Drücke" auf Senden und warte auf Antwort!
                .body(RickAndMortyChar.class); //Wandelt Response in angegebenes Objekt um

    }

    public List<RickAndMortyChar> getAliveCharacters() {
        return restClient
                .get() //-> REST Methode
                .uri("?status=alive") // Append the query parameter dynamically
                .retrieve() // "Drücke" auf Senden und warte auf Antwort!
                .body(RickAndMortyResponse.class) //Wandelt Response in angegebenes Objekt um
                .results();
    }

    public int getCharacterCountBySpecies(String species) {
        return restClient
                .get()
                .uri(uriBuilder -> uriBuilder.queryParam("species", species).build()) // Dynamically append the species parameter
                .retrieve()
                .body(SpeciesResponse.class) // Map the response
                .info()
                .count(); // Extract the count
    }

}
