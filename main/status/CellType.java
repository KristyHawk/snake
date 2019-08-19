package main.status;

import java.awt.*;

/**
 * Describes possible Cell types
 */
public enum CellType {

    APPLE,
    SNAKE,
    EMPTY;

    public Image image;

    public Image getImage() {
        return image;
    }

    public void setImage(Image image) {
        this.image = image;
    }
}
