package com.bhaskor.pieces;

import com.bhaskor.Board;
import com.bhaskor.pieces.HelperClass;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

@Tag("Knight")
public class KnightTest {
    @Mock
    private Knight knight;
    @Mock
    private Board board;

    @BeforeEach
    public void setup() {
        MockitoAnnotations.initMocks(this); // without this you will get NPE
    }

    @Test
    @DisplayName("Test successful Knight creation")
    void testKnightObject() {
        Assertions.assertNotNull(knight);
    }

    @Test
    @DisplayName("Test successful Knight moves")
    void testKnightMoves() {
        Board board = new Board();
        Knight knight = new Knight();
        StringBuilder sb = new StringBuilder();
        for (String moves : knight.getPossibleMoves(board, HelperClass.getIndex(board, "E3"))) {
            sb.append(moves + ",");
        }
        if (sb.length() > 0)
            sb.deleteCharAt(sb.length() - 1);

        Assertions.assertEquals("F5,F1,D5,D1,G4,G2,C4,C2",sb.toString());
    }
}
