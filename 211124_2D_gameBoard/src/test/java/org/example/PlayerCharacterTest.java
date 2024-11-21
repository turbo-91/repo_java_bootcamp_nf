package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class PlayerCharacterTest {
    @Test
    void expect_getX_toBe_0(){
        //GIVEN
        PlayerCharacter.x = 0;
        //WHEN
        int actualResult = PlayerCharacter.getX();
        //THEN
        Assertions.assertEquals(0, actualResult);
    }
@Test
    void expect_getY_toBe_0(){
        //GIVEN
        PlayerCharacter.y = 0;
        //WHEN
        int actualResult = PlayerCharacter.getY();
        //THEN
        Assertions.assertEquals(0, actualResult);
    }

    @Test
    void expect_moveW_toAdd_1toY(){
        //GIVEN
        String key = "W";
        //WHEN
        int actualResult = PlayerCharacter.move(key);
        //THEN
        int y = 1;
        Assertions.assertEquals(y, actualResult);
    }

    @Test
    void expect_moveS_toSubtract_1fromY(){
        //GIVEN
        String key = "S";
        //WHEN
        int actualResult = PlayerCharacter.move(key);
        //THEN
        int y = -1;
        Assertions.assertEquals(y, actualResult);
    }

    @Test
    void expect_moveD_toAdd_1toX(){
        //GIVEN
        String key = "D";
        //WHEN
        int actualResult = PlayerCharacter.move(key);
        //THEN
        int x = 1;
        Assertions.assertEquals(x, actualResult);
    }

    @Test
    void expect_moveA_toSubtract_1fromX(){
        //GIVEN
        String key = "A";
        //WHEN
        int actualResult = PlayerCharacter.move(key);
        //THEN
        int x = -1;
        Assertions.assertEquals(x, actualResult);
    }


}
