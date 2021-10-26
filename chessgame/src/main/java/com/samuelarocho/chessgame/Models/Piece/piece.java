package com.samuelarocho.chessgame.Models.Piece;

import com.samuelarocho.chessgame.Models.Game.Type;

import lombok.Data;

@Data
public abstract class Piece {
    public int x1, y1, x2, y2;
    public boolean isWhite = false;

    // This will allow me to decide if the path a certain piece is taking a valid one or not based on it's movement
    // return's true or fale for validPath
    public abstract boolean validPath(int x2, int y2);

    // Lombok creates all other boilerplate needed for Piece class
    

    // now I need to create my methods that will be inherited
    // return's array of pathOptions
    public abstract int[][] pathOptions(int x1, int y1, int x2, int y2);

    // This will help decipher the type of piece a class is
    // return's type name/class/number (not sure yet)
    public abstract Type getType();

}
