package com.scaler.tictactoe.strategies.winningstrategies;

import com.scaler.tictactoe.models.Board;
import com.scaler.tictactoe.models.Move;

public interface WinningStrategy {

    boolean checkWinner(Board board, Move move);
}
