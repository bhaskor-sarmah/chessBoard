package com.bhaskor;

import lombok.AccessLevel;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Data
public class Board {

    @Getter(AccessLevel.NONE)
    @Setter(AccessLevel.NONE)
    final private String[] veritcalAxis = { "A", "B", "C", "D", "E", "F", "G", "H" };

    @Getter(AccessLevel.NONE)
    @Setter(AccessLevel.NONE)
    final private String[] horizontalAxis = { "1", "2", "3", "4", "5", "6", "7", "8" };
    
    // 8x8 dimention square array to represent the board
    private Squares[][] squares = new Squares[8][8];

    // Initialize a board with all the squares
    public Board() {
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                squares[i][j] = new Squares(veritcalAxis[i], horizontalAxis[j], false);
            }
        }
    }

    // Print the board squares
    public void printBoardSquares() {
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                System.out.print(squares[i][j].getVertical() + squares[i][j].getHorizontal() + " ");
            }
            System.out.println();
        }
    }

}
