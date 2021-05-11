package com.bhaskor.pieces;

import com.bhaskor.Board;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

@Tag("Queen")
public class QueenTest {
    @Mock
    private Queen queen;
    @Mock
    private Board board;

    @BeforeEach
    public void setup() {
        MockitoAnnotations.initMocks(this);
    }

    @Test
    @DisplayName("Test successful Queen creation")
    void testQueenObject() {
        Assertions.assertNotNull(queen);
    }

    @Test
    @DisplayName("Test successful Queen moves")
    void testQueenMoves() {
        Board board = new Board();
        Queen queen = new Queen();
        StringBuilder sb = new StringBuilder();
        for (String moves : queen.getPossibleMoves(board, HelperClass.getIndex(board, "E4"))) {
            sb.append(moves + ",");
        }
        if (sb.length() > 0)
            sb.deleteCharAt(sb.length() - 1);

        Assertions.assertEquals("F5,F3,D3,D5,G6,G2,C2,C6,H7,H1,B1,B7,A8,E5,E3,F4,D4,E6,E2,G4,C4,E7,E1,H4,B4,E8,A4", sb.toString());
    }

    @Test
    @DisplayName("Test Queen on the edge")
    void testQueenOnTheEdge() {
        Board board = new Board();
        Queen queen = new Queen();
        StringBuilder sb = new StringBuilder();
        for (String moves : queen.getPossibleMoves(board, HelperClass.getIndex(board, "A1"))) {
            sb.append(moves + ",");
        }
        if (sb.length() > 0)
            sb.deleteCharAt(sb.length() - 1);

        Assertions.assertEquals("B2,C3,D4,E5,F6,G7,H8,A2,B1,A3,C1,A4,D1,A5,E1,A6,F1,A7,G1,A8,H1", sb.toString());
    }
}
