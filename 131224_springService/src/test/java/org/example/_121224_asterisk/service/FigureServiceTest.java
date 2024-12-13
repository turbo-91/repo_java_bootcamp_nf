package org.example._121224_asterisk.service;

import org.example._121224_asterisk.model.FigureDTO;
import org.example._121224_asterisk.repo.FigureRepo;
import org.junit.jupiter.api.Test;

import java.util.Collections;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.mock;

class FigureServiceTest {

    private final FigureRepo figureRepo = mock(FigureRepo.class);

    @Test
    void getAllFigures_shouldReturnEmptyList_whenCalledInitially() {
        //GIVEN
        List<FigureDTO> expected = Collections.emptyList();
        FigureService figureService = new FigureService(figureRepo);
        //WHEN
        List<FigureDTO> actual = figureService.getAllFigures();
        //THEN
        assertEquals(expected, actual);
    }

    @Test
    void getById() {
    }

    @Test
    void updateFigure() {
    }

    @Test
    void deleteFigure() {
    }
}