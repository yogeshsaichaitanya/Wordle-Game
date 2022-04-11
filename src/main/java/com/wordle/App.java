package com.wordle;

import com.wordle.game.Game;

import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Game.Builder wordleBuilder = new Game.Builder()
                .setDifficulty(Game.Difficulty.EASY)
                .setWordSize(5);

        Game wordle = wordleBuilder.build();

        while (wordle.getState() == Game.State.PLAYING) {
            wordle.printBoard();
            String attempt = sc.next();
            wordle.attempt(attempt);
        }
    }
}
