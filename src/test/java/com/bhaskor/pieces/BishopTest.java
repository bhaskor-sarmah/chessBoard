package com.bhaskor.pieces;

import com.bhaskor.Board;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

@Tag("Bishop")
public class BishopTest {
    @Mock
    private Bishop bishop;
    @Mock
    private Board board;

    @BeforeEach
    public void setup() {
        MockitoAnnotations.initMocks(this);
    }

    @Test
    @DisplayName("Test successful Bishop creation")
    void testBishopObject() {
        Assertions.assertNotNull(bishop);
    }

    @Test
    @DisplayName("Test successful Bishop moves")
    void testBishopMoves() {
        Board board = new Board();
        Bishop bishop = new Bishop();
        StringBuilder sb = new StringBuilder();
        for (String moves : bishop.getPossibleMoves(board, HelperClass.getIndex(board, "E4"))) {
            sb.append(moves + ",");
        }
        if (sb.length() > 0)
            sb.deleteCharAt(sb.length() - 1);

        Assertions.assertEquals("F5,F3,D3,D5,G6,G2,C2,C6,H7,H1,B1,B7,A8", sb.toString());
    }

    @Test
    @DisplayName("Test Bishop on the edge")
    void testBishopOnTheEdge() {
        Board board = new Board();
        Bishop bishop = new Bishop();
        StringBuilder sb = new StringBuilder();
        for (String moves : bishop.getPossibleMoves(board, HelperClass.getIndex(board, "A8"))) {
            sb.append(moves + ",");
        }
        if (sb.length() > 0)
            sb.deleteCharAt(sb.length() - 1);

        Assertions.assertEquals("B7,C6,D5,E4,F3,G2,H1", sb.toString());
    }
}
