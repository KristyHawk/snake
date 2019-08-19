package main;

import main.controller.BoardController;
import main.model.BoardModel;

public class App {
    public static void main(String[] args) {
        BoardModel board = new BoardModel();
        new BoardController(board);
    }
}
