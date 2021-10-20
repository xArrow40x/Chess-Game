package com.samuelarocho.chessgame.Models.Piece;

import com.samuelarocho.chessgame.Models.Game.Player;

import lombok.Data;

@Data
public abstract class Piece {
    public int x1, y1;
    public Player player;

    // This will allow me to decide if the path a certain piece is taking a valid one or not based on it's movement
    // return's true or fale for validPath
    public abstract boolean validPath(int x2, int y2);

    // Lombok creates all boilerplate needed for Piece class
    // now I need to create my methods that will be inherited
    // return's array of pathOptions
    public abstract int[][] pathOptions(int x1, int y1, int x2, int y2);

    // This will help decipher the type of piece a class is
    // return's type name/class/number (not sure yet)
    public abstract Type getType();

}