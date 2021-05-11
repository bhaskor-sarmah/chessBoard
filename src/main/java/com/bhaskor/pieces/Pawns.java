package com.bhaskor.pieces;

import java.util.ArrayList;

import com.bhaskor.Board;

public class Pawns extends Piece {

    @Override
    public ArrayList<String> getPossibleMoves(Board board, int[] currentIndex) {
        ArrayList<String> possibleMoves = new ArrayList<String>();
        if (currentIndex[0] + 1 < 8)
            possibleMoves.add(board.getSquareName(currentIndex[0] + 1, currentIndex[1]));
        return possibleMoves;
    }

}
