package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class PlayerCharacterTest {
    @Test
    void expect_getX_toBe_0(){
        //GIVEN
        int number = 1;
        //WHEN
        int actualResult = PlayerCharacter.getX(number);
        //THEN
        int expected = 0;
        Assertions.assertEquals(expected, actualResult);
    }
}
