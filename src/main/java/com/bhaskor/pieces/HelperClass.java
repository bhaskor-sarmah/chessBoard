package com.bhaskor.pieces;

import java.util.ArrayList;

import com.bhaskor.Board;

public class HelperClass {
    
    public static ArrayList<String> getAllNightMovements(Board board, int currentVertical, int currentHorizontal){
        
        // Initialize an empty list to save the possible moves
        ArrayList<String> possibleMoves = new ArrayList<>();

        // The possible moves for the knight are (V = Vertical, H = Horizontal)
        // (V+1,H+2),(V+1,H-2),(V-1,H+2),(V-1,H-2),(V+2,H+1),(V+2,H-1),(V-2,H+1),(V-2,H-1)
        // When V = 1, H = 2 and vice versa
        for (int i = 1; i <= 2; i++) { // Time Complexity os O(4) => O(Constant)
            for (int j = 1; j <= 2; j++) {
                if (i != j) {
                    possibleMoves.add(board.getSquareName((currentVertical + i), (currentHorizontal + j)));
                    possibleMoves.add(board.getSquareName((currentVertical + i), (currentHorizontal - j)));
                    possibleMoves.add(board.getSquareName((currentVertical - i), (currentHorizontal + j)));
                    possibleMoves.add(board.getSquareName((currentVertical - i), (currentHorizontal - j)));
                }
            }
        }

        return possibleMoves;
    }

    // public static ArrayList<String> getAllDiagonalMovements(){

    // }
    // public static ArrayList<String> getAllVericalHorizontalMovements(){

    // }
    // public static ArrayList<String> getAllOneSquareMovements(){

    // }

}
