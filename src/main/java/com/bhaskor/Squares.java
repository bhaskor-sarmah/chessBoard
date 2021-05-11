package com.bhaskor;

import lombok.Data;

@Data
public class Squares {
    
    private String vertical; 
    private String horizontal;
    private boolean isOccupied;
    
    public Squares(String vertical, String horizontal, boolean isOccupied){
        this.vertical = vertical;
        this.horizontal = horizontal;
        this.isOccupied = isOccupied;
    }

}
