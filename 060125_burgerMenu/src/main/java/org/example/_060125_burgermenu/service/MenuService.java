package org.example._060125_burgermenu.service;

import org.example._060125_burgermenu.repo.MenuRepo;
import org.springframework.stereotype.Service;

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

}
