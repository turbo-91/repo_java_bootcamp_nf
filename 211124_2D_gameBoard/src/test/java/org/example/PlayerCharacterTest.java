package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class PlayerCharacterTest {
    @Test
    void expectPlayer_toBeOnField0(){
        //GIVEN

        //WHEN
        String actualResult = PlayerCharacter.getX();
        //THEN
        int expected = 0;
        Assertions.assertEquals(expected, actualResult);
    }
}
}
