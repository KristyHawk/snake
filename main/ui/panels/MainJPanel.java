package main.ui.panels;

import main.config.Configuration;
import main.logic.field.BoardService;
import main.models.Cell;

import javax.swing.*;
import java.awt.*;

public class MainJPanel extends JPanel {

    BoardService boardService = new BoardService();

    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        Cell[][] board = boardService.fillBoard();
        for (Cell[] arr : board) {
            for (Cell cell : arr) {
                ImageIcon imageIcon = new ImageIcon(cell.getType().getImage());
                imageIcon.paintIcon(this, g, cell.getX() * Configuration.iconSize, cell.getY() * Configuration.iconSize);
            }
        }
        //paint
    }
}
