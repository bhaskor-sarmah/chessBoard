package com.bhaskor.pieces;

import java.util.ArrayList;

import com.bhaskor.Board;

public class Knight extends Piece {

    @Override
    public ArrayList<String> getPossibleMoves(Board board, String currentSquare) {

        int currentVertical = 0;
        int currentHorizontal = 0;

        // Finding the index of the current square
        for (int i = 0; i < 8; i++) { // Time Complexity is: Big O(8*8) => O(64) => O(Constant)
            boolean found = false;
            for (int j = 0; j < 8; j++) {
                if (board.getSquareName(i, j).equalsIgnoreCase(currentSquare)) {
                    currentVertical = i;
                    currentHorizontal = j;
                    found = true;
                }
            }
            if (found)
                break;
        }

        return HelperClass.getAllNightMovements(board, currentVertical, currentHorizontal);
    }

}
