package org.example._060125_burgermenu.controller;

import org.example._060125_burgermenu.exception.IdNotFoundException;
import org.example._060125_burgermenu.model.Menu;
import org.example._060125_burgermenu.model.MenuDTO;
import org.example._060125_burgermenu.service.MenuService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class MenuController {

    private final MenuService menuService;

    public MenuController(MenuService menuService) {
        this.menuService = menuService;
    }

    @GetMapping("/menu")
    public List<Menu> getAll() {
        return menuService.getAllMenus();
    }

    @GetMapping("/menu/{id}")
    public Menu getMenuById(@PathVariable String id) throws IdNotFoundException {
        return menuService.getMenuById(id);
    }

    @PostMapping("/menu")
    public Menu createMenu(@RequestBody MenuDTO newMenu ){
        return menuService.createToDo(newMenu);
    }

    @PutMapping("/menu/{id}")
    public Menu updateMenu(@PathVariable String id, @RequestBody Menu updatedMenu) throws IdNotFoundException {
        return menuService.updateMenu(updatedMenu);
    }

    @DeleteMapping("/menu/{id}")
    public Menu deleteMenu(@PathVariable String id) throws IdNotFoundException {
        return menuService.deleteMenu(id);
    }

}
