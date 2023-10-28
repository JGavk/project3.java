package model;

import java.awt.Image;
import javax.swing.ImageIcon;

public class Cubo {
    private ImageIcon image;
    private int width;
    private int height;

    public Cubo(String imageUrl, int width, int height) {
        ImageIcon originalImage = new ImageIcon(getClass().getResource(imageUrl));
        image = new ImageIcon(originalImage.getImage().getScaledInstance(width, height, Image.SCALE_SMOOTH));
        this.width = width;
        this.height = height;
    }

    public ImageIcon getImage() {
        return image;
    }

    public int getWidth() {
        return width;
    }

    public int getHeight() {
        return height;
    }
}

