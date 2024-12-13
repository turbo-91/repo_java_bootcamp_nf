package org.example._121224_asterisk.controller;

import lombok.AllArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.example._121224_asterisk.model.Figure;
import org.example._121224_asterisk.model.FigureDTO;
import org.example._121224_asterisk.repo.FigureRepo;
import org.example._121224_asterisk.service.FigureService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/asterix")
public class FigureController {

    private final FigureService figureService;

    public FigureController(FigureService figureService) {
        this.figureService = figureService;
    }

    @GetMapping("/characters")
    public List<FigureDTO> getAll() {
        return figureService.getAllFigures();
    }

    @GetMapping("/{id}")
    public FigureDTO getById(@PathVariable String id) {
        return figureService.getById(id);
    }

    @PostMapping
    public FigureDTO createFigure(@RequestBody Figure figure) {
        return figureService.createFigure(figure);
    }

    @PutMapping("/{id}")
    public Figure updateFigure(@RequestBody Figure figure, @PathVariable String id) {
        return figureService.updateFigure(figure, id);
    }

    @DeleteMapping("/{id}")
    public void deleteFigure(@PathVariable String id) {
        figureService.deleteFigure(id);
    }
}
