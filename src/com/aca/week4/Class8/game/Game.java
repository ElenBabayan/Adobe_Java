package com.aca.week4.Class8.game;

public class Game {
    public void startGame() {
        TimerListener o = Game.this::updateFrame;

        Timer timer = new Timer(o);

        timer.start();
    }

    public void updateFrame() {
        System.out.println("updating frame");
    }

    public static void main(String[] args) {
        Game game = new Game();

        game.startGame();

        // onticky kapel enq Game i het
    }
}
