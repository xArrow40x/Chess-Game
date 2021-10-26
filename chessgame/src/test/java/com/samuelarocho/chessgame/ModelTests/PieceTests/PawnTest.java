package com.samuelarocho.chessgame.ModelTests.PieceTests;

import static org.junit.jupiter.api.Assertions.assertEquals;

import com.samuelarocho.chessgame.Models.Game.Type;
import com.samuelarocho.chessgame.Models.Piece.Pawn;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.TestComponent;

@TestComponent
public class PawnTest {
    
    @Test
    void getType() {
        Pawn pawnPiece = new Pawn(0, 0, null);
        Type Response = pawnPiece.getType();
        assertEquals(Type.PAWN, Response);
    }

    
}
