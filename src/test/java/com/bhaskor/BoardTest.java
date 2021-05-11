package com.bhaskor;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

@Tag("Board")
public class BoardTest {
    @Mock private Board board;

    @BeforeEach
    public void setup(){
        MockitoAnnotations.initMocks(this); //without this you will get NPE
    }

    @Test
    @DisplayName("Test successful board creation")
    void testChessBoard() {
        Assertions.assertNotNull(board);
    }

    @Test
    @DisplayName("Test successful board square creation")
    void testChessBoardSquare() {
        board = new Board();
        Assertions.assertEquals("E", board.getSquares()[4][4].getVertical());
        Assertions.assertEquals("5", board.getSquares()[4][4].getHorizontal());
    }
}
