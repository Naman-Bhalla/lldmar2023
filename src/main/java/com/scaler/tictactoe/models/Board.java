package com.scaler.tictactoe.models;

import java.util.ArrayList;
import java.util.List;

public class Board {
    private int size;
    private List<List<Cell>> board;

    public Board(int dimension) {
        size = dimension;
        board = new ArrayList<>(); // []

        for (int i = 0; i < dimension; ++i) { // [[], [], []]
            board.add(new ArrayList<>());

            for (int j = 0; j < dimension; ++j) { // [[o o o] [o o o] [o o o]]
                board.get(i).add(new Cell(i, j));
            }
        }

    }

    public void printBoard() {
        for (List<Cell> row: board) {
            for (Cell cell: row) {
                cell.display();
            }
            System.out.print("\n");
        }
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public List<List<Cell>> getBoard() {
        return board;
    }

    public void setBoard(List<List<Cell>> board) {
        this.board = board;
    }
}
