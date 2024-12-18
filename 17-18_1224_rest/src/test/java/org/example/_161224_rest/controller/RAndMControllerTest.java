package org.example._161224_rest.controller;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.client.AutoConfigureMockRestServiceServer;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.test.web.client.MockRestServiceServer;
import org.springframework.test.web.servlet.MockMvc;

import static org.junit.jupiter.api.Assertions.*;
import static org.springframework.test.web.client.match.MockRestRequestMatchers.method;
import static org.springframework.test.web.client.match.MockRestRequestMatchers.requestTo;
import static org.springframework.test.web.client.response.MockRestResponseCreators.withSuccess;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@SpringBootTest
@AutoConfigureMockMvc
@AutoConfigureMockRestServiceServer
class RAndMControllerTest {

    @Autowired
    private MockMvc mockMvc;

    @Autowired
    private MockRestServiceServer mockRestServiceServer;

    @Test
    void getAllCharacters() throws Exception {

        mockRestServiceServer.expect(requestTo("https://rickandmortyapi.com/api/character"))
                .andExpect(method(HttpMethod.GET))
                .andRespond(withSuccess(
                        """
                                {
                                    "info": {
                                     "count": 826,
                                     "pages": 42,
                                     "next": "https://rickandmortyapi.com/api/character/?page=2",
                                     "prev": null
                                   },
                                   "results": [
                                       {
                                         "id": 1,
                                         "name": "Rick Sanchez",
                                         "status": "Alive"
                                       }
                                     ]
                                }
                                """, MediaType.APPLICATION_JSON
                ));

        mockMvc.perform(get("/api/characters"))
                .andExpect(status().isOk())
                .andExpect(content().json(
                        """
                                [
                                {
                                    "id": 1,
                                    "name": "Rick Sanchez",
                                    "status": "Alive"
                                }
                                ]
                                """
                ));
    }

    @Test
    void getCharacterById() throws Exception {

        mockRestServiceServer.expect(requestTo("https://rickandmortyapi.com/api/character/24"))
                .andExpect(method(HttpMethod.GET))
                .andRespond(withSuccess(
                        """
                                {
                                   "id": 24,
                                   "name": "Armagheadon",
                                   "status": "Alive",
                                   "species": "Alien",
                                   "type": "Cromulon",
                                   "gender": "Male",
                                   "origin": {
                                     "name": "Signus 5 Expanse",
                                     "url": "https://rickandmortyapi.com/api/location/22"
                                   },
                                   "location": {
                                     "name": "Signus 5 Expanse",
                                     "url": "https://rickandmortyapi.com/api/location/22"
                                   },
                                   "image": "https://rickandmortyapi.com/api/character/avatar/24.jpeg",
                                   "episode": [
                                     "https://rickandmortyapi.com/api/episode/16"
                                   ],
                                   "url": "https://rickandmortyapi.com/api/character/24",
                                   "created": "2017-11-05T08:48:30.776Z"
                                 }
                                """, MediaType.APPLICATION_JSON
                ));

        mockMvc.perform(get("/api/characters/24")) // Use the correct endpoint here
                .andExpect(status().isOk())
                .andExpect(content().json(
                        """
                                {
                                   "id": 24,
                                   "name": "Armagheadon",
                                   "status": "Alive"
                                }
                                """
                ));
    }

    @Test
    void getAliveCharacters() throws Exception {

        mockRestServiceServer.expect(requestTo("https://rickandmortyapi.com/api/character?status=alive"))
                .andExpect(method(HttpMethod.GET))
                .andRespond(withSuccess(
                        """
                                {
                                    "info": {
                                        "count": 5,
                                        "pages": 1,
                                        "next": null,
                                        "prev": null
                                    },
                                    "results": [
                                        {
                                            "id": 1,
                                            "name": "Rick Sanchez",
                                            "status": "Alive"
                                        },
                                        {
                                            "id": 2,
                                            "name": "Morty Smith",
                                            "status": "Alive"
                                        }
                                    ]
                                }
                                """, MediaType.APPLICATION_JSON
                ));

        mockMvc.perform(get("/api/characters/alive"))
                .andExpect(status().isOk())
                .andExpect(content().json(
                        """
                                [
                                    {
                                        "id": 1,
                                        "name": "Rick Sanchez",
                                        "status": "Alive"
                                    },
                                    {
                                        "id": 2,
                                        "name": "Morty Smith",
                                        "status": "Alive"
                                    }
                                ]
                                """
                ));
    }
}