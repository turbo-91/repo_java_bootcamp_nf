package org.example._121224_asterisk.controller;

import org.example._121224_asterisk.model.Figure;
import org.example._121224_asterisk.repo.FigureRepo;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/asterix")
public class FigureController {

    private final FigureRepo figureRepo;

    public FigureController(FigureRepo figureRepo) {
        this.figureRepo = figureRepo;
    }

    @GetMapping("/characters")
    public List<Figure> getAllCharacters() {
        return List.of(
                new Figure("1", "Asterix", 35, "Krieger"),
                new Figure("2", "Obelix", 35, "Lieferant"),
                new Figure("3", "Miraculix", 60, "Druide"),
                new Figure("4", "Majestix", 60, "Häuptling"),
                new Figure("5", "Troubadix", 25, "Barden"),
                new Figure("6", "Gutemine", 35, "Häuptlingsfrau"),
                new Figure("7", "Idefix", 5, "Hund"),
                new Figure("8", "Geriatrix", 70, "Rentner"),
                new Figure("9", "Automatix", 35, "Schmied"),
                new Figure("10", "Grockelix", 35, "Fischer")
        );
    }
}
