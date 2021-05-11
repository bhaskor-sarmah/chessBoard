package com.bhaskor.pieces;

import com.bhaskor.Board;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

@Tag("Pawn")
public class PawnTest {
    
    @Mock
    private Pawns pawn;
    @Mock
    private Board board;

    @BeforeEach
    public void setup() {
        MockitoAnnotations.initMocks(this);
    }

    @Test
    @DisplayName("Test successful Pawns creation")
    void testPawnsObject() {
        Assertions.assertNotNull(pawn);
    }

    @Test
    @DisplayName("Test successful Pawns moves")
    void testPawnsMoves() {
        Board board = new Board();
        Pawns pawn = new Pawns();
        StringBuilder sb = new StringBuilder();
        for (String moves : pawn.getPossibleMoves(board, HelperClass.getIndex(board, "E3"))) {
            sb.append(moves + ",");
        }
        if (sb.length() > 0)
            sb.deleteCharAt(sb.length() - 1);

        Assertions.assertEquals("F3",sb.toString());
    }

    @Test
    @DisplayName("Test Pawns on the edge")
    void testPawnsOnTheEdge() {
        Board board = new Board();
        Pawns pawn = new Pawns();
        StringBuilder sb = new StringBuilder();
        for (String moves : pawn.getPossibleMoves(board, HelperClass.getIndex(board, "H4"))) {
            sb.append(moves + ",");
        }
        if (sb.length() > 0)
            sb.deleteCharAt(sb.length() - 1);

        Assertions.assertEquals("",sb.toString());
    }

}
