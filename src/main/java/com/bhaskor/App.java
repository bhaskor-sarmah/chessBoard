package com.bhaskor;

import java.util.Scanner;

import com.bhaskor.pieces.Knight;

/**
 * Chess Board!
 */
public final class App {
    private App() {
    }

    public static void main(String[] args) {
        try {
            Scanner scan = new Scanner(System.in);

            // Creating a new chess board
            Board board = new Board();

            // User Input
            System.out.println("Enter The Input");

            // Splitting to get Piece Name and Position
            String input[] = scan.nextLine().split(" ");
            String inputPieceName = input[0];
            String boardPosition = input[1];

            board.printBoardSquares();

        } catch (ArrayIndexOutOfBoundsException e) {
            System.err.println("ArrayIndexOutOfBoundsException : " + e.getMessage());
        } catch (Exception e) {
            System.err.println("Exception : " + e.getMessage());
        }
    }
}
