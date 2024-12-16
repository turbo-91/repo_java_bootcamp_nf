package org.example._121224_asterisk.controller;

import org.example._121224_asterisk.model.Figure;
import org.example._121224_asterisk.repo.FigureRepo;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.DirtiesContext;

import static org.junit.jupiter.api.Assertions.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.annotation.DirtiesContext;
import org.springframework.test.web.servlet.MockMvc;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;

@SpringBootTest
@AutoConfigureMockMvc
@DirtiesContext(classMode = DirtiesContext.ClassMode.BEFORE_EACH_TEST_METHOD)
class FigureControllerTest {

    @Autowired
    private MockMvc mockMvc;

    @Autowired
    private FigureRepo repo;

    @Test
    void getAll_shouldReturnEmptyList_whenCalledInitially() throws Exception {
       //GIVEN

        // THEN & WHEN
        mockMvc.perform(get("/api/asterix/characters")) // mockMvC simuliert get Anfrage an path
                .andExpect(status().isOk()) // expect the status code in the response is 200 (OK)
                .andExpect(content().json("[]")); // expect empty array as response as before initialization
    }


    @Test
    void getById_shouldReturnAsterix_whenCalledWithValidId() throws Exception {
        //GIVEN
        Figure figure = new Figure( // create an instance of the Figure class for testing purposes
                "1",
                "Asterix",
                35,
                "Krieger");
        repo.save(figure); // and save it in the repo
        //WHEN & THEN
        mockMvc.perform(get("/api/asterix/" + figure.id())) // mockMvc performs / mocks / simulates GET request to path
                .andExpect(status().isOk()) // expect response status 200 (OK)
                .andExpect(content().json("""
                                       {
                                         "id": "1",
                                         "name": "Asterix",
                                         "age": 35,
                                         "job": "Krieger"
                                        }
                                        """));  // expect this json response
    }

    @Test
    void createFigure_shouldReturnAsterixAsDTO_whenCalledWithAsterix() throws Exception {

        mockMvc.perform(post("/api/asterix") // mockMvc performs / mocks / simulates POST request to path
                        .contentType(MediaType.APPLICATION_JSON) // posting a JSON
                        .content(""" 
                                {
                                         "id": "1",
                                         "name": "Asterix",
                                         "age": 35,
                                         "occupation": "Krieger"
                                        }
                                """)) // with this content
                .andExpect(status().isOk()) // expect respons 200 OK
                .andExpect(content().json("""
                                       {
                                         "name": "Asterix",
                                         "age": 35,
                                         "job": "Krieger"
                                        }
                                        """)) // expect this JSON as response
                .andExpect(jsonPath("$.id").isNotEmpty()); // expect the "id" field in the response to not be empty
    }

    @Test
    void updateFigure() {
    }

    @Test
    void deleteFigure() {
    }
}