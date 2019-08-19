package main.controller;

import main.controller.services.BoardService;
import main.model.BoardModel;
import main.utils.listeners.SnakeKeyListener;
import main.view.BoardView;

public class BoardController {

    private BoardView view;
    private BoardModel model;

    private BoardService boardService;
    private SnakeKeyListener listener;

    public BoardController(BoardModel model) {
        this.model = model;
        this.view = new BoardView(this, model);
        listener = new SnakeKeyListener();
        boardService = new BoardService();
        view.getReady();
    }

    public void initBoard(int width, int height) {
        model.setBoard(boardService.initEmptyBoard());
    }

    public void initSnake() {
        model.setSnake(boardService.initSnake());
    }


}
