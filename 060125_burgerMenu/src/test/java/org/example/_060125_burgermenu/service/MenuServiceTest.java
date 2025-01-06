package org.example._060125_burgermenu.service;

import org.example._060125_burgermenu.model.Menu;
import org.example._060125_burgermenu.repo.MenuRepo;
import org.junit.jupiter.api.Test;
import org.springframework.test.annotation.DirtiesContext;

import java.math.BigDecimal;
import java.util.Collections;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

@DirtiesContext(classMode = DirtiesContext.ClassMode.BEFORE_EACH_TEST_METHOD)
class MenuServiceTest {

    private final MenuRepo menuRepo = mock(MenuRepo.class);
    private final IdService idService = mock(IdService.class);

    // Tests getAllMenus

    @Test
    void getAllMenus_ShouldReturnEmptyList_whenCalledInitially() {
        //GIVEN
        MenuService toDoService = new MenuService(menuRepo, idService); // Service instance
        when(menuRepo.findAll()).thenReturn(Collections.emptyList()); // Mock empty repository

        List<Menu> expected = Collections.emptyList();

        //WHEN
        List<Menu> actual = toDoService.getAllMenus();

        //THEN
        assertEquals(expected, actual); // Verify the returned list is empty
        verify(menuRepo).findAll(); // Verify findAll was called once
    }

    @Test
    void getAllToDos_ShouldReturnListOfToDos_whenCalled() {
        //GIVEN
        Menu menu1 = new Menu("1", "Deluxe", BigDecimal.ONE, "Ceviche", "Plantains", "Beer");
        Menu menu2 = new Menu("2", "DeluxePlus", BigDecimal.TEN, "Big Ceviche", "A lot of Plantains", "Big Beer");

        MenuService menuService = new MenuService(menuRepo, idService);
        List<Menu> menuList = List.of(menu1, menu2);

        when(menuRepo.findAll()).thenReturn(menuList);

        List<Menu> expected = menuList;

        //WHEN
        List<Menu> actual = menuService.getAllMenus();

        //THEN
        assertEquals(expected, actual); // Verify the list matches
        verify(menuRepo).findAll(); // Verify findAll was called once
    }

}