package com.bhaskor.pieces;

import java.util.ArrayList;

import com.bhaskor.Board;

public class Rook extends Piece {

    @Override
    public ArrayList<String> getPossibleMoves(Board board, int[] currentIndex) {
        return HelperClass.getAllVericalHorizontalMovements(board, currentIndex);
    }

}
