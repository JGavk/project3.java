package model;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import javax.swing.Timer;





public class GameModel {
    private int score;
    private int fails;
    private int good;
    private List<Cubo> squareArray;
    
    public GameModel(){
    
        squareArray= new ArrayList<>(5);

        for(int i=0; i<5; i++){
            Cubo square1 = new Cubo("",100,100);
            
            squareArray.add(square1);

        }
        Timer timer = new Timer(3000, (ActionEvent e) -> {
            Random rand = new Random();
            String[] imageUrls = {"/images/image1.jpg", "/images/image2.jpg", "/images/image3.jpg","images/image3.jpg"};
            
            for (Cubo cubo : squareArray) {
                int randomIndex = rand.nextInt(imageUrls.length);
                cubo.setImageUrl(imageUrls[randomIndex]);
            }
        });
        timer.start();
    }


    public List<Cubo> getSquareArray() {
        return squareArray;
}
    
    
    
       
    
}
