package com.scaler;

import com.scaler.tictactoe.controllers.GameController;
import com.scaler.tictactoe.models.*;
import com.scaler.tictactoe.strategies.winningstrategies.WinningStrategy;

import javax.swing.event.ListDataEvent;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        GameController gameController = new GameController();

        try {
            int dimensionOfGame = 3;

            List<Player> players = new ArrayList<>();
            players.add(
                    new Player(1L, "Naman", new Symbol('X'), PlayerType.HUMAN)
            );

            players.add(
                    new Bot(2L, "GPT", new Symbol('O'), BotDifficultyLevel.HARD)
            );

            List<WinningStrategy> winningStrategies = new ArrayList<>();

            Game game = gameController.startGame(
                    dimensionOfGame,
                    players,
                    winningStrategies
            );

            while(gameController.checkState(game).equals(GameState.IN_PROGRESS)) {
                // 1. printBoard
                // 2. x's turn
                // 3. ask to makeMove

                gameController.printBoard(game);

                gameController.makeMove(game);
            }
        } catch (Exception e) {
            System.out.println("Something is wrong");
        }

        System.out.println("Game is created");
    }
}