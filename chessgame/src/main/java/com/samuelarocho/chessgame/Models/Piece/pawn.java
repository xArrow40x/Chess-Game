package com.samuelarocho.chessgame.Models.Piece;

import com.samuelarocho.chessgame.Models.Game.Type;

import lombok.Data;

@Data
public class Pawn extends Piece {
    public int startX, startY, finalX, finalY;
    Type type;

    public Pawn (int startX, int startY, Type type){
        this.startX = startX;
        this.startY = startY;
        this.type = Type.PAWN;
    }

    public boolean validPath(int finalX, int finalY){   // this is the path that is valid for a pawn
        if (finalY-startY==1){
            return true;
        } else{
            return false;
        }
    }

    public int[][] pathOptions(int startX, int startY, int finalX, int finalY){
        int lengthOfPath = Math.abs(finalY - startY);

        int xDirection = 1;  // I need this for when a pwn takes over another piece.
        int yDirection= 1;

        if (finalY - startY < 0){  //this helps determine the Y direction of the pawn movement (black or white)
            yDirection = -1;
        }
        if (finalX - startX < 0){  //this helps determine the X direction of the pawn movement (black or white)
            xDirection = -1;
        }

        int [][] possiblePath = new int [3][lengthOfPath];   //I put 3 for the possibilities of the pawn eating pieces on the left or right

        for (int i = 0; i < lengthOfPath; i++) {
            possiblePath[0][i]= startX + xDirection;
            possiblePath[1][i]= startY + yDirection;
        }

        return possiblePath;
    }

    public Type getType(){
        return this.type;
    }
}
