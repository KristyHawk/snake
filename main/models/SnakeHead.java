package main.models;

import java.util.ArrayList;

public class SnakeHead {

    private int x;
    private int y;
    private ArrayList<Cell> body;

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

    public ArrayList<Cell> getBody() {
        return body;
    }

    public void setBody(ArrayList<Cell> body) {
        this.body = body;
    }
}
