package com.samuelarocho.chessgame.ModelTests.PieceTests;

import static org.junit.jupiter.api.Assertions.assertEquals;

import com.samuelarocho.chessgame.Models.Game.Type;
import com.samuelarocho.chessgame.Models.Piece.Pawn;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.TestComponent;

@TestComponent
public class PawnTest {
    
    //Testing that the type of the piece is PAWN
    @Test
    void getType() {
        Pawn pawnPiece = new Pawn(0, 0, null);
        Type Response = pawnPiece.getType();
        assertEquals(Type.PAWN, Response);
    }

    //Testing that the PAWN can move correctly (not including when it eats other pieces. Will be added later)
    @Test
    void validPath() {
        Pawn pawnPiece = new Pawn(2, 2, Type.PAWN);
        boolean Response = pawnPiece.validPath(2, 3);
        assertEquals(true, Response);
    }
}
