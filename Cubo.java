package model;

import java.awt.Image;
import javax.swing.ImageIcon;

public class Cubo {
    private ImageIcon image;
    private String imagePath;
    private int width;
    private int height;

    public void setImage(String imageUrl) {
        ImageIcon originalImage = new ImageIcon(getClass().getResource(imageUrl));
        image = new ImageIcon(originalImage.getImage().getScaledInstance(width, height, Image.SCALE_SMOOTH));
        this.imagePath = imageUrl;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public Cubo(String imageUrl, int width, int height) {
        ImageIcon originalImage = new ImageIcon(getClass().getResource(imageUrl));
        image = new ImageIcon(originalImage.getImage().getScaledInstance(width, height, Image.SCALE_SMOOTH));
        this.width = width;
        this.height = height;
        this.imagePath = imageUrl;
    }

    public String getImagePath() {
        return this.imagePath;
    }

    /*public void setImagePath(String imagePath) {
        this.imagePath = imagePath;
    }*/


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

