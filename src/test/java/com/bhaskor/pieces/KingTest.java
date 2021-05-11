package com.bhaskor.pieces;

import com.bhaskor.Board;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

@Tag("King")
public class KingTest {
    @Mock
    private King king;
    @Mock
    private Board board;

    @BeforeEach
    public void setup() {
        MockitoAnnotations.initMocks(this);
    }

    @Test
    @DisplayName("Test successful King creation")
    void testKingObject() {
        Assertions.assertNotNull(king);
    }

    @Test
    @DisplayName("Test successful King moves")
    void testKingMoves() {
        Board board = new Board();
        King king = new King();
        StringBuilder sb = new StringBuilder();
        for (String moves : king.getPossibleMoves(board, HelperClass.getIndex(board, "E3"))) {
            sb.append(moves + ",");
        }
        if (sb.length() > 0)
            sb.deleteCharAt(sb.length() - 1);

        Assertions.assertEquals("E2,E4,F3,F4,F2,D3,D2,D4",sb.toString());
    }

    @Test
    @DisplayName("Test King on the edge")
    void testKingOnTheEdge() {
        Board board = new Board();
        King king = new King();
        StringBuilder sb = new StringBuilder();
        for (String moves : king.getPossibleMoves(board, HelperClass.getIndex(board, "H1"))) {
            sb.append(moves + ",");
        }
        if (sb.length() > 0)
            sb.deleteCharAt(sb.length() - 1);

        Assertions.assertEquals("H2,G1,G2",sb.toString());
    }
}
