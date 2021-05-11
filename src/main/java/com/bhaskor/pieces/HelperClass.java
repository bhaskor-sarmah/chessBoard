package com.bhaskor.pieces;

import java.util.ArrayList;

import com.bhaskor.Board;

public class HelperClass {

    public static int[] getIndex(Board board, String currentSquare) {

        int indexArr[] = new int[2];
        // Finding the index of the current square
        for (int i = 0; i < 8; i++) { // Time Complexity is: Big O(8*8) => O(64) => O(Constant)
            boolean found = false;
            for (int j = 0; j < 8; j++) {
                if (board.getSquareName(i, j).equalsIgnoreCase(currentSquare)) {
                    indexArr[0] = i;
                    indexArr[1] = j;
                    found = true;
                }
            }
            if (found)
                break;
        }

        return indexArr;
    }

    public static ArrayList<String> getAllNightMovements(Board board, int[] currentIndex) {

        // Initialize an empty list to save the possible moves
        ArrayList<String> possibleMoves = new ArrayList<>();

        // The possible moves for the knight are (V = Vertical, H = Horizontal)
        // (V+1,H+2),(V+1,H-2),(V-1,H+2),(V-1,H-2),(V+2,H+1),(V+2,H-1),(V-2,H+1),(V-2,H-1)
        // When V = 1, H = 2 and vice versa
        for (int i = 1; i <= 2; i++) { // Time Complexity os O(4) => O(Constant)
            for (int j = 1; j <= 2; j++) {
                if (i != j) {
                    // Checking if the range doesnot exceed the board range
                    if ((currentIndex[0] + i) < 8) {
                        if ((currentIndex[1] + j) < 8)
                            possibleMoves.add(board.getSquareName((currentIndex[0] + i), (currentIndex[1] + j)));
                        if ((currentIndex[1] - j) >= 0)
                            possibleMoves.add(board.getSquareName((currentIndex[0] + i), (currentIndex[1] - j)));
                    }
                    // Checking if the range doesnot exceed the board range
                    if ((currentIndex[0] - i) >= 0) {
                        if ((currentIndex[1] + j) < 8)
                            possibleMoves.add(board.getSquareName((currentIndex[0] - i), (currentIndex[1] + j)));
                        if ((currentIndex[1] - j) >= 0)
                            possibleMoves.add(board.getSquareName((currentIndex[0] - i), (currentIndex[1] - j)));
                    }
                }
            }
        }

        return possibleMoves;
    }

    public static ArrayList<String> getAllOneSquareMovements(Board board, int[] currentIndex) {

        // Initialize an empty list to save the possible moves
        ArrayList<String> possibleMoves = new ArrayList<>();

        // The possible moves for the knight are (V = Vertical, H = Horizontal)
        // (V-1,H-1),(V+0,H-1),(V+1,H-1),(V+1,H+0),(V+1,H+1),(V+0,H+1),(V-1,H+1),(V-1,H+0)
        // Also Checking if index is out of range
        if ((currentIndex[1] - 1) >= 0) {
            possibleMoves.add(board.getSquareName(currentIndex[0], (currentIndex[1] - 1)));
        }
        if ((currentIndex[1] + 1) < 8) {
            possibleMoves.add(board.getSquareName(currentIndex[0], (currentIndex[1] + 1)));
        }
        if ((currentIndex[0] + 1) < 8) {
            possibleMoves.add(board.getSquareName((currentIndex[0] + 1), currentIndex[1]));
            if ((currentIndex[1] + 1) < 8)
                possibleMoves.add(board.getSquareName((currentIndex[0] + 1), (currentIndex[1] + 1)));
            if ((currentIndex[1] - 1) >= 0)
                possibleMoves.add(board.getSquareName((currentIndex[0] + 1), (currentIndex[1] - 1)));
        }
        if ((currentIndex[0] - 1) >= 0) {
            possibleMoves.add(board.getSquareName((currentIndex[0] - 1), currentIndex[1]));
            if ((currentIndex[1] - 1) >= 0)
                possibleMoves.add(board.getSquareName((currentIndex[0] - 1), (currentIndex[1] - 1)));
            if ((currentIndex[1] + 1) < 8)
                possibleMoves.add(board.getSquareName((currentIndex[0] - 1), (currentIndex[1] + 1)));
        }
        return possibleMoves;
    }

    public static ArrayList<String> getAllDiagonalMovements(Board board, int[] currentIndex) {
        ArrayList<String> possibleMoves = new ArrayList<>();

        // Bishop movements are like (V+i , H+i), (V-i, H-i), (V+i, H-i), (V-i, H+i)
        for (int i = 1; i <= 8; i++) {
            if (currentIndex[0] + i < 8) {
                if (currentIndex[1] + i < 8)
                    possibleMoves.add(board.getSquareName(currentIndex[0] + i, currentIndex[1] + i));
                if (currentIndex[1] - i >= 0)
                    possibleMoves.add(board.getSquareName(currentIndex[0] + i, currentIndex[1] - i));
            }
            if (currentIndex[0] - i >= 0) {
                if (currentIndex[1] - i >= 0)
                    possibleMoves.add(board.getSquareName(currentIndex[0] - i, currentIndex[1] - i));
                if (currentIndex[1] + i < 8)
                    possibleMoves.add(board.getSquareName(currentIndex[0] - i, currentIndex[1] + i));
            }
        }
        return possibleMoves;
    }

    public static ArrayList<String> getAllVericalHorizontalMovements(Board board, int[] currentIndex) {
        ArrayList<String> possibleMoves = new ArrayList<>();

        // Rooks movements are like (V , H+i), (V, H-i), (V+i, H), (V-i, H)
        for (int i = 1; i <= 8; i++) {
            if(currentIndex[1] + i < 8){
                possibleMoves.add(board.getSquareName(currentIndex[0], currentIndex[1] + i));
            }
            if(currentIndex[1] - i >= 0){
                possibleMoves.add(board.getSquareName(currentIndex[0], currentIndex[1] - i));
            }
            if(currentIndex[0] + i < 8){
                possibleMoves.add(board.getSquareName(currentIndex[0] + i, currentIndex[1]));
            }
            if(currentIndex[0] - i >= 0){
                possibleMoves.add(board.getSquareName(currentIndex[0] - i, currentIndex[1]));
            }
        }
        return possibleMoves;
    }
}
