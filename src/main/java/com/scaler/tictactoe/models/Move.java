package com.scaler.tictactoe.models;

import javax.swing.*;

public class Move {
    private Cell cell;
    private Player player;

    public Cell getCell() {
        return cell;
    }

    public void setCell(Cell cell) {
        this.cell = cell;
    }

    public Player getPlayer() {
        return player;
    }

    public void setPlayer(Player player) {
        this.player = player;
    }
}
