package com.bhaskor;

import java.util.Scanner;
import java.util.regex.Pattern;

import com.bhaskor.pieces.Knight;
import com.bhaskor.pieces.Piece;

/**
 * Chess Board!
 */
public final class App {
    private App() {
    }

    public static void main(String[] args) {
        try {
            final String pattern = "^[ABCDEFGHabcdefgh][1-8]$";

            Scanner scan = new Scanner(System.in);

            // Creating a new chess board
            Board board = new Board();

            // User Input
            System.out.println("Enter The Input");

            // Splitting to get Piece Name and Position
            String input[] = scan.nextLine().split(" ");
            String inputPieceName = input[0];
            String boardPosition = input[1];

            if (!Pattern.matches(pattern, boardPosition)) {
                System.out.println("Invalid Board Position");
                System.exit(0);
            }

            Piece piece = null;

            switch (inputPieceName.toLowerCase()) {
                case "king":
                    piece = new Knight();
                    break;
                case "queen":
                    break;
                case "rook":
                    break;
                case "bishop":
                    break;
                case "knight":
                    break;
                case "pawn":
                    break;
                default:
                    System.out.println("Invalid Input Piece Name !");
                    System.exit(0);
                    break;
            }

            // If valid piece is provided
            if (piece != null) {
                StringBuilder sb = new StringBuilder();
                // For all the possible moves provided from the piece append to a String Builder
                for (String moves : piece.getPossibleMoves(board, boardPosition)) {
                    sb.append(moves + ",");
                }

                // If possible moves present then remove the last ending comma(,)
                if (sb.length() > 0)
                    sb.deleteCharAt(sb.length() - 1);

                // Print the output to the screen
                System.out.println(sb.toString());
            }

        } catch (ArrayIndexOutOfBoundsException e) {
            System.err.println("ArrayIndexOutOfBoundsException : " + e.getMessage());
        } catch (Exception e) {
            System.err.println("Exception : " + e.getMessage());
        }
    }
}
