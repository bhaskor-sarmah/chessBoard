package com.bhaskor.pieces;

import java.util.ArrayList;

import com.bhaskor.Board;

/**
 * Piece
 */
public abstract class Piece {
    public abstract ArrayList<String> getPossibleMoves(Board board, String currentSquare);
}