package com.samuelarocho.chessgame.Models.Game;

import org.springframework.objenesis.instantiator.basic.NewInstanceInstantiator;

import lombok.Data;

@Data
public abstract class Game {
    Player player1 = new Player();
    Player player2 = new Player();
    Type chess = new Type();
    Type pokeChess = new Type();
}
