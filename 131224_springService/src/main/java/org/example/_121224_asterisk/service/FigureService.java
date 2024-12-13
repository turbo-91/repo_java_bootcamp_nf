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

    public FigureDTO createFigure(FigureDTO figureDTO) {
        String id = UUID.randomUUID().toString();
        Figure toSave = new Figure(id, figureDTO.name(), figureDTO.age(), figureDTO.job());
        Figure saved = figureRepo.save(toSave);
        return new FigureDTO(saved.id(), saved.name(), saved.age(), saved.job());
    }

    public FigureDTO updateFigure(Figure figure, String id) {
        Figure existing = figureRepo.findById(id).orElseThrow();
        Figure updated = new Figure(
                id,
                figure.name(),
                figure.age(),
                figure.job()
        );
        Figure saved = figureRepo.save(updated);
        return new FigureDTO(saved.id(), saved.name(), saved.age(), saved.job());
    }

    public void deleteFigure(String id) {
        if (figureRepo.existsById(id)) {
            figureRepo.deleteById(id);
        }else {
            throw new RuntimeException("Apple not found");
        }
    }

}
