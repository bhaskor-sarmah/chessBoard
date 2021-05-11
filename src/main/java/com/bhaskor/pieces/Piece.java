package com.bhaskor.pieces;

import com.bhaskor.Board;

/**
 * Piece
 */
abstract class Piece {
    public abstract String[] getPossibleMoves(Board board);
}