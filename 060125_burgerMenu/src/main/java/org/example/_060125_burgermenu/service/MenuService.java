package org.example._060125_burgermenu.service;

import org.example._060125_burgermenu.model.Menu;
import org.example._060125_burgermenu.repo.MenuRepo;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MenuService {

    // field declarations
    public MenuRepo menuRepo;
    public IdService idService;

    // constructor-based dependency injection
    public MenuService(MenuRepo menuRepo, IdService idService) {
        this.menuRepo = menuRepo;
        this.idService = idService;
    }

    public List<Menu> getAllToDos() {
        return menuRepo.findAll();
    }

}
