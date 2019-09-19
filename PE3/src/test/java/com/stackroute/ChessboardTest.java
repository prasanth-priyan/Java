package com.stackroute;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ChessboardTest {

    private static Chessboard cb;

    @Test
    public void checkSquare_SquareIndexGiven_ShouldPrintColor(){

        assertEquals("Incorrect Output - Square indices are from (0,0) to (7,7)", "BB", cb.checkSquare(5,8));
        assertEquals("Incorrect Output - Square indices are from (0,0) to (7,7)", "WW", cb.checkSquare(7,7));
    }

    @Test
    public void checkSquare_WrongSquareIndexGiven_ShouldPrintError(){

        assertEquals("Incorrect Output - Square indices are from (0,0) to (7,7)", "Error - Square indices out of bounds", cb.checkSquare(13,0));
        assertEquals("Incorrect Output - Square indices are from (0,0) to (7,7)", "Error - Square indices out of bounds", cb.checkSquare(0,8));
    }

    @Test
    public void getChessboard_ShouldPrintPattern() {

        String[][] chessboard = {{"WW", "BB", "WW", "BB", "WW", "BB", "WW", "BB"}, {"BB", "WW", "BB", "WW", "BB", "WW", "BB", "WW"}, {"WW", "BB", "WW", "BB", "WW", "BB", "WW", "BB"}, {"BB", "WW", "BB", "WW", "BB", "WW", "BB", "WW"}, {"WW", "BB", "WW", "BB", "WW", "BB", "WW", "BB"}, {"BB", "WW", "BB", "WW", "BB", "WW", "BB", "WW"}, {"WW", "BB", "WW", "BB", "WW", "BB", "WW", "BB"}, {"BB", "WW", "BB", "WW", "BB", "WW", "BB", "WW"}};
        assertEquals("Incorrect Output", chessboard, cb.getChessboard());
    }

    @Before
    public void setUp() throws Exception {
        cb = new Chessboard();
    }

    @After
    public void tearDown() throws Exception {
        cb = null;
    }
}
