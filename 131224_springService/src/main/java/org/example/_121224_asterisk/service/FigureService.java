package org.example._121224_asterisk.service;

import lombok.AllArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.example._121224_asterisk.model.Figure;
import org.example._121224_asterisk.model.FigureDTO;
import org.example._121224_asterisk.repo.FigureRepo;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
public class FigureService {

    private final FigureRepo figureRepo;
    private final IdService idService;

    public FigureService(FigureRepo figureRepo, IdService idService) {
        this.figureRepo = figureRepo;
        this.idService = idService;
    }

    public List<FigureDTO> getAllFigures() {
        return figureRepo.findAll().stream()
                .map(figure -> {
                    FigureDTO figureDTO = new FigureDTO(
                            figure.id(),
                            figure.name(),
                            figure.age(),
                            figure.job());
                    return figureDTO;
                })
                .toList();
    }

    public FigureDTO getById(String id) {
        Figure temp = figureRepo.findById(id).orElseThrow();
        FigureDTO figureDTO = new FigureDTO(
                temp.id(),
                temp.name(),
                temp.age(),
                temp.job());
        return figureDTO;
    }

    public Figure createFigure(FigureDTO figureDTO) {
        String id = idService.generateId();
        Figure figureToSave = new Figure(
                id,
                figureDTO.name(),
                figureDTO.age(),
                figureDTO.job());
        return figureRepo.save(figureToSave);
    }

    public Figure updateFigure(Figure figure, String id) {
        if (figureRepo.existsById(id)) {
            figureRepo.save(figure);
            return figureRepo.findById(id).orElseThrow();
        }else {
            throw new RuntimeException("Character not found");
        }
    }

    public void deleteFigure(String id) {
        if (figureRepo.existsById(id)) {
            figureRepo.deleteById(id);
        }else {
            throw new RuntimeException("Apple not found");
        }
    }

}
