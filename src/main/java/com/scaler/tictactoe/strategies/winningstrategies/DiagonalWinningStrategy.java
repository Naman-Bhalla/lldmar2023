package com.scaler.tictactoe.strategies.winningstrategies;

import com.scaler.tictactoe.models.Board;
import com.scaler.tictactoe.models.Move;
import com.scaler.tictactoe.models.Symbol;

import java.util.HashMap;
import java.util.Map;

public class DiagonalWinningStrategy implements WinningStrategy {
    private Map<Symbol, Integer> leftDiagCounts = new HashMap<>();
    private Map<Symbol, Integer> rightDiagCounts = new HashMap<>();

    // |  |  |  |
    // |  |  |  |
    // |  |  |  |
    @Override
    public boolean checkWinner(Board board, Move move) {
        Symbol symbol = move.getPlayer().getSymbol();

        int row = move.getCell().getRow();
        int col = move.getCell().getCol();

        // check for left diagonal
        if (row == col) {
            if (!leftDiagCounts.containsKey(symbol)) {
                leftDiagCounts.put(symbol, 0);
            }

            leftDiagCounts.put(
                    symbol,
                    leftDiagCounts.get(symbol) + 1);
        }

        // check for right diagonal
        if (row + col == board.getSize() - 1) {
            if (!rightDiagCounts.containsKey(symbol)) {
                rightDiagCounts.put(symbol, 0);
            }

            rightDiagCounts.put(
                    symbol,
                    rightDiagCounts.get(symbol) + 1
            );
        }

        if (row == col) {
            if (leftDiagCounts.get(symbol).equals(board.getSize())) {
                return true;
            }
        }

        if (row + col == board.getSize() - 1) {
            if (rightDiagCounts.get(symbol).equals(board.getSize())) {
                return true;
            }
        }


        return false;
    }

    @Override
    public void handleUndo(Board board, Move move) {
        Symbol symbol = move.getPlayer().getSymbol();

        int row = move.getCell().getRow();
        int col = move.getCell().getCol();

        // check for left diagonal
        if (row == col) {
            leftDiagCounts.put(
                    symbol,
                    leftDiagCounts.get(symbol) - 1);
        }

        // check for right diagonal
        if (row + col == board.getSize() - 1) {
            rightDiagCounts.put(
                    symbol,
                    rightDiagCounts.get(symbol) - 1
            );
        }
    }
}
