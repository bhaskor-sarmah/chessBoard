package com.bhaskor.pieces;

import java.util.ArrayList;

import com.bhaskor.Board;

public class Knight extends Piece {

    @Override
    public ArrayList<String> getPossibleMoves(Board board, int[] currentIndex) {
        return HelperClass.getAllNightMovements(board, currentIndex);
    }

}
