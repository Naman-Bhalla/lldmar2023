package com.scaler.tictactoe.strategies.winningstrategies;

import com.scaler.tictactoe.models.Board;
import com.scaler.tictactoe.models.Move;
import com.scaler.tictactoe.models.Symbol;

import java.util.List;
import java.util.Map;

public class RowWinningStrategy implements WinningStrategy {
    private List<Map<Symbol, Integer>> symbolCount;
    @Override
    public boolean checkWinner(Board board, Move move) {
        return false;
    }
}
