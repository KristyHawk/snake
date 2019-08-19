package main.model;

import main.status.CellType;

/**
 * Model of any cell on the board
 */
public class Cell {

    /**
     * X coordinate
     */
    private int x;

    /**
     * Y coordinate
     */
    private int y;
    private CellType type;

    public Cell(int x, int y, CellType type) {
        this.x = x;
        this.y = y;
        this.type = type;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public CellType getType() {
        return type;
    }

    public void setType(CellType type) {
        this.type = type;
    }
}
