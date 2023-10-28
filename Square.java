package model;

import java.awt.Graphics;
import java.awt.Image;
import javax.swing.ImageIcon;

/**
 *
 * @author juanp
 */
public abstract class Square {
    
    public ImageIcon image;
    public String imageUrl;
    public Square(String imageUrl, int width, int height) { 
        ImageIcon originalImage = new ImageIcon(getClass().getResource(imageUrl));
        Image scaledImage = originalImage.getImage().getScaledInstance(width, height, Image.SCALE_SMOOTH);
        image = new ImageIcon(scaledImage);
        }
    public ImageIcon getImage() {
        return image;
    }
    public abstract void draw(Graphics g, int x, int y);
}   
    // Subclase cuadrado
    class Cubo extends Square {
        public Cubo (String imageUrl, int width, int height) {
            super(imageUrl, width, height);
            
    }
        public void setImageUrl(String newImageUrl) {
            imageUrl = newImageUrl;
            ImageIcon originalImage = new ImageIcon(getClass().getResource(imageUrl));
            Image scaledImage = originalImage.getImage().getScaledInstance(image.getIconWidth(), image.getIconHeight(), Image.SCALE_SMOOTH);
            image = new ImageIcon(scaledImage);
        }

    @Override
    public void draw(Graphics g, int x, int y) {
        g.drawImage(image.getImage(), x, y, null);
    }
}
    
