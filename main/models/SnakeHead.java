package main.models;

import java.util.ArrayList;

public class SnakeHead {

    private int x;
    private int y;
    private ArrayList<SnakeCell> body;

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

    public ArrayList<SnakeCell> getBody() {
        return body;
    }

    public void setBody(ArrayList<SnakeCell> body) {
        this.body = body;
    }
}
