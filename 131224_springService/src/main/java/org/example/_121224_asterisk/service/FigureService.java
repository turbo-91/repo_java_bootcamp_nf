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
@RequiredArgsConstructor
public class FigureService {

    private final FigureRepo figureRepo;

    public List<FigureDTO> getAllFigures() {
        return figureRepo.findAll().stream()
                .map(figure -> {
                    FigureDTO figureDTO = new FigureDTO(
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
                temp.name(),
                temp.age(),
                temp.job());
        return figureDTO;
    }

    public Figure createFigure(FigureDTO figureDTO) {
        Figure figureToSave = new Figure(
                UUID.randomUUID().toString(),
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
