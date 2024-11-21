package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class PlayerCharacterTest {

    @BeforeEach
        // -> Wird vor jedem Test ausgeführt
    void resetAllXY() {
        //Setze x & y wieder auf 0. Das macht jeden Test wieder erwartbar, da immer von x&y=0 ausgegangen wird.
        PlayerCharacter.x =0;
        PlayerCharacter.y =0;
    }

    @Test
    void getX_shouldBe_0_onStart(){
        //GIVEN
       int expected = 0;
        //WHEN
        int actualResult = PlayerCharacter.getX();
        //THEN
        Assertions.assertEquals(expected, actualResult);
    }

    @Test
    void getY_shouldBe_0_onStart(){
        //GIVEN
        int expected = 0;
        //WHEN
        int actualResult = PlayerCharacter.getY();
        //THEN
        Assertions.assertEquals(expected, actualResult);
    }

    @Test
    void moveW_shouldAdd_1toY(){
        //GIVEN
        String key = "W";
        int expected = 1;
        //WHEN
        int actualResult = PlayerCharacter.move(key);
        //THEN
        Assertions.assertEquals(expected, actualResult);
    }

    @Test
    void moveS_shouldSubtract_1fromY(){
        //GIVEN
        String key = "S";
        int expected = -1;
        //WHEN
        int actualResult = PlayerCharacter.move(key);
        //THEN
        Assertions.assertEquals(expected, actualResult);
    }

    @Test
    void moveD_shouldAdd_1toX(){
        //GIVEN
        String key = "D";
        int expected = 1;
        //WHEN
        int actualResult = PlayerCharacter.move(key);
        //THEN
        Assertions.assertEquals(expected, actualResult);
    }

    @Test
    void moveA_shouldSubtract_1fromX(){
        //GIVEN
        String key = "A";
        int expected = -1;
        //WHEN
        int actualResult = PlayerCharacter.move(key);
        //THEN
        Assertions.assertEquals(expected, actualResult);
    }

    @Test
    void move_ShouldReturn42_WhenInputIsNotWASD() {
        //GIVEN
        String direction = "none";
        int expected = 66;
        //WHEN
        int actualResult = PlayerCharacter.move(direction);
        //THEN
        Assertions.assertEquals(expected, actualResult);
    }


}
