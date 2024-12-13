package org.example._121224_asterisk.service;

import org.example._121224_asterisk.model.Figure;
import org.example._121224_asterisk.model.FigureDTO;
import org.example._121224_asterisk.repo.FigureRepo;
import org.junit.jupiter.api.Test;

import java.util.Collections;
import java.util.List;
import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

class FigureServiceTest {

    private final FigureRepo figureRepo = mock(FigureRepo.class); // mocking the repo, as we're not testing it, we're testing FigureService

    @Test
    void getAllFigures_shouldReturnEmptyList_whenCalledInitially() {
        //GIVEN
        FigureService figureService = new FigureService(figureRepo); // empty by default

        List<FigureDTO> expected = Collections.emptyList();
        //WHEN
        List<FigureDTO> actual = figureService.getAllFigures();
        //THEN
        assertEquals(expected, actual);
    }

    @Test
    void getById_shouldReturnAsterix_whenCalledWithValidId() {
        //GIVEN
        Figure figure = new Figure("1", "Asterix", 35, "Krieger");
        FigureService figureService = new FigureService(figureRepo); // the mocked repo again where we will "find" our figure
        when(figureRepo.findById(figure.id())).thenReturn(Optional.of(figure)); // mocking that the figure is being found from the repo

        FigureDTO expected = new FigureDTO(figure.id(), figure.name(), figure.age(), figure.job());
        //WHEN
        FigureDTO actual = figureService.getById(figure.id());
        //THEN
        assertEquals(expected, actual);
    }

    @Test
    void updateFigure() {
    }

    @Test
    void deleteFigure() {
    }
}