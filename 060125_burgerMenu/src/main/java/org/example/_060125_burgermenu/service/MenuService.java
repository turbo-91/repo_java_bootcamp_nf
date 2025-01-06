package org.example._060125_burgermenu.service;

import org.example._060125_burgermenu.exception.IdNotFoundException;
import org.example._060125_burgermenu.model.Menu;
import org.example._060125_burgermenu.model.MenuDTO;
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

    // CRUD methods

    public List<Menu> getAllMenus() {
        return menuRepo.findAll();
    }

    public Menu getMenuById(String id) throws IdNotFoundException {
        return menuRepo.findById(id)
                .orElseThrow(() -> new IdNotFoundException("No Menu found with ID: " + id));
    }

    public Menu createToDo(MenuDTO newMenu) {
        Menu menu = new Menu(
                idService.generateId(),
                newMenu.name(),
                newMenu.price(),
                newMenu.mainDish(),
                newMenu.sideDish(),
                newMenu.beverage()
        );
        return menuRepo.save(menu);
    }

}
