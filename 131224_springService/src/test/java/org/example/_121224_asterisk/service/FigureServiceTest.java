package org.example._121224_asterisk.service;

import org.example._121224_asterisk.model.Figure;
import org.example._121224_asterisk.model.FigureDTO;
import org.example._121224_asterisk.repo.FigureRepo;
import org.junit.jupiter.api.Test;

import java.util.Collections;
import java.util.List;
import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

class FigureServiceTest {

    private final FigureRepo figureRepo = mock(FigureRepo.class); // mocking the repo, as we're not testing it, we're testing FigureService
    private final IdService idService= mock(IdService.class); // mocking idService

    @Test
    void getAllFigures_shouldReturnEmptyList_whenCalledInitially() {
        //GIVEN
        FigureService figureService = new FigureService(figureRepo, idService); // empty by default

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
        FigureService figureService = new FigureService(figureRepo, idService); // the mocked repo again where we will "find" our figure
        when(figureRepo.findById(figure.id())).thenReturn(Optional.of(figure)); // mocking that the figure is being found from the repo

        FigureDTO expected = new FigureDTO(figure.id(), figure.name(), figure.age(), figure.job());
        //WHEN
        FigureDTO actual = figureService.getById(figure.id());
        //THEN
        assertEquals(expected, actual);
    }

    @Test
    void updateFigure_shouldReturnUpdatedAsterix_whenCalledWithValidData() {
        // GIVEN
        Figure figure = new Figure("1", "Asterix", 35, "Krieger");
        FigureService figureService = new FigureService(figureRepo, idService); // siehe oben
        when(figureRepo.existsById(figure.id())).thenReturn(true); // mocking the fulfilled if-condition
        when(figureRepo.findById(figure.id())).thenReturn(Optional.of(figure)); // mocking that statement of condition returns optional of figure

        Figure expected = new Figure(
                figure.id(),
                figure.name(),
                figure.age(),
                figure.job());

        // WHEN
        Figure actual = figureService.updateFigure(figure, figure.id());

        //THEN
        assertEquals(expected, actual);
        verify(figureRepo).save(figure); // verifying if figureRepo.save(figure) is called once in updateFigure
                                         // which is sufficient as we do not need to check if figureRepo.save works
                                         // -> that's a test for the figureRepo tests
    }

        @Test
        void testDeleteFigure_GivenValidId_WhenExists_ThenDeletesSuccessfully() {
            // GIVEN
            Figure figure = new Figure("1", "Asterix", 35, "Krieger");
            when(figureRepo.existsById(figure.id())).thenReturn(true);
            FigureService figureService = new FigureService(figureRepo, idService);

            // WHEN
            figureService.deleteFigure(figure.id());

            // THEN
            verify(figureRepo).deleteById(figure.id()); // verify deleteById was called once
        }

    }

