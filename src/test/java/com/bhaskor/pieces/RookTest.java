package com.bhaskor.pieces;

import com.bhaskor.Board;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

@Tag("Rook")
public class RookTest {
    @Mock
    private Rook rook;
    @Mock
    private Board board;

    @BeforeEach
    public void setup() {
        MockitoAnnotations.initMocks(this);
    }

    @Test
    @DisplayName("Test successful Rook creation")
    void testRookObject() {
        Assertions.assertNotNull(rook);
    }

    @Test
    @DisplayName("Test successful Rook moves")
    void testRookMoves() {
        Board board = new Board();
        Rook rook = new Rook();
        StringBuilder sb = new StringBuilder();
        for (String moves : rook.getPossibleMoves(board, HelperClass.getIndex(board, "E4"))) {
            sb.append(moves + ",");
        }
        if (sb.length() > 0)
            sb.deleteCharAt(sb.length() - 1);

        Assertions.assertEquals("E5,E3,F4,D4,E6,E2,G4,C4,E7,E1,H4,B4,E8,A4", sb.toString());
    }

    @Test
    @DisplayName("Test Rook on the edge")
    void testRookOnTheEdge() {
        Board board = new Board();
        Rook rook = new Rook();
        StringBuilder sb = new StringBuilder();
        for (String moves : rook.getPossibleMoves(board, HelperClass.getIndex(board, "A8"))) {
            sb.append(moves + ",");
        }
        if (sb.length() > 0)
            sb.deleteCharAt(sb.length() - 1);

        Assertions.assertEquals("A7,B8,A6,C8,A5,D8,A4,E8,A3,F8,A2,G8,A1,H8", sb.toString());
    }
}
