package com.bhaskor.pieces;

import com.bhaskor.Board;

/**
 * Piece
 */
public abstract class Piece {
    public abstract String[] getPossibleMoves(Board board, String currentSquare);
}