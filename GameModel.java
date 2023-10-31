/*
Miguel Angel Soto Espitia 2240019
Juan Pablo Puerta Gaviria 2240033
18/10/23-31/10/23
*/
package model;

import controller.FirstController;

import javax.swing.*;
import java.util.*;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;


public class GameModel {
    private List<Cubo> squareArray;
    private FirstController myController;
    private List<String> btnImages;
    public GameModel() {
        this.myController = myController;
        squareArray = new ArrayList<>();
        btnImages = Arrays.asList("/images/image1.jpg", "/images/image2.jpg", "/images/image3.jpg", "/images/image4.jpg");
    }
       
    public void setFirstController(FirstController myController) {
       this.myController = myController;
  }
  //Crea el arreglo base de objetos de tipo Cubo
    public void setSquareArray(){
        Cubo cubo1 = new Cubo("/images/image1.jpg", 100, 100);
        squareArray.add(cubo1);
        Cubo cubo2 = new Cubo("/images/image2.jpg",100,100);
        squareArray.add(cubo2);
        Cubo cubo3 = new Cubo("/images/image3.jpg",100,100);
        squareArray.add(cubo3);
        Cubo cubo4 = new Cubo("/images/image4.jpg",100,100);
        squareArray.add(cubo4);
        this.squareArray= squareArray;
    
    }
//Liga la funcionalidad
    public  void resetButton(){
        this.squareArray = new ArrayList<>();
        this.setSquareArray();
    }
//Da la logica de cambio de imagen en cambio de objeto de memoria
    public void resetImage(){
        this.squareArray.forEach(obj -> {
            //ImageIcon newImage = new ImageIcon(this.btnImages.get(new Random().nextInt(this.btnImages.size())));
            String newImage = this.btnImages.get(new Random().nextInt(this.btnImages.size()));
            obj.setImage(newImage);
            //obj.setImagePath(newImage);
        });
    }
    //Obtiene el arreglo
    public List<Cubo> getSquareArray(){
          
        return squareArray;
    }
//Da la logica de imagenes iguales
    public Boolean checkMatch() {
        AtomicReference<Boolean> match = new AtomicReference<>(Boolean.FALSE);

        Set<String> newitemSet = new HashSet<>();
        long numOfMatches = this.squareArray.stream()
                .filter(cubo -> !newitemSet.add(cubo.getImagePath()))
                .count();



        if (numOfMatches >= 1) {
            match.set(Boolean.TRUE);
        }

        return match.get();
    }
}



       


