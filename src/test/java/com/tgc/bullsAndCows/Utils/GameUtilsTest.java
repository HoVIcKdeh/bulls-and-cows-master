package com.tgc.bullsAndCows.Utils;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class GameUtilsTest {



    @Test
    void generateRandomNumberTest() {
        int number = GameUtils.generateRandomNumber();
        assertTrue(number >= 1000 && number < 10000);
    }

    @Test
    void getBACCTest() {
        GameUtils gameUtils = new GameUtils();

        gameUtils.getBullsAndCowsCount(6159, 7891);
        assertEquals(gameUtils.getBulls(), 0);
        assertEquals(gameUtils.getCows(), 2);


        gameUtils.getBullsAndCowsCount(7819, 7891);
        assertEquals(gameUtils.getBulls(), 2);
        assertEquals(gameUtils.getCows(), 4);
    }

}