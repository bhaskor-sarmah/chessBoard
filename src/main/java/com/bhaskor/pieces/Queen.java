package com.bhaskor.pieces;

import java.util.ArrayList;

import com.bhaskor.Board;

public class Queen extends Piece {

    @Override
    public ArrayList<String> getPossibleMoves(Board board, int[] currentIndex) {
        
        ArrayList<String> diagonal = HelperClass.getAllDiagonalMovements(board, currentIndex);
        ArrayList<String> verticalHorizontal = HelperClass.getAllVericalHorizontalMovements(board, currentIndex);

        // Merging two list without duplicates
        for (String position : verticalHorizontal) {
            if (!diagonal.contains(position))
                diagonal.add(position);
        }

        return diagonal;
    }

}
