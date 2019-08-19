package main.model;

import java.util.List;

public class Snake {

    /**
     * Head X coordinate
     */
    private int x;

    /**
     * Head Y coordinate
     */
    private int y;

    /**
     * Body of the snake
     */
    private List<Cell> body;

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

    public List<Cell> getBody() {
        return body;
    }

    public void setBody(List<Cell> body) {
        this.body = body;
    }
}
