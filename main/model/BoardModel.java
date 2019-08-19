package main.model;

import main.status.GameStatus;
import main.utils.config.Configuration;

public class BoardModel {

    private int height = Configuration.boardHeight;
    private int width = Configuration.boardWidth;
    private Snake snake;

    private Cell[][] board;
    public GameStatus status;

    public Snake getSnake() {
        return snake;
    }

    public void setSnake(Snake snake) {
        this.snake = snake;
    }

    public GameStatus getStatus() {
        return status;
    }

    public void setStatus(GameStatus status) {
        this.status = status;
    }

    public Cell[][] getBoard() {
        return board;
    }

    public void setBoard(Cell[][] board) {
        this.board = board;
    }

}
