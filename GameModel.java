package model;

import controller.FirstController;
import java.util.ArrayList;
import java.util.List;



public class GameModel {
    private List<Cubo> squareArray;
    private FirstController myController;
    public GameModel() {
        
        squareArray = new ArrayList<>();
    
        Cubo cubo1 = new Cubo("/images/image1.jpg",100,100);
        squareArray.add(cubo1);
        Cubo cubo2 = new Cubo("/images/image2.jpg",100,100);
        squareArray.add(cubo2);
        Cubo cubo3 = new Cubo("/images/image3.jpg",100,100);
        squareArray.add(cubo3);
        Cubo cubo4 = new Cubo("/images/image4.jpg",100,100);
        squareArray.add(cubo4);
        Cubo cubo5 = new Cubo("/images/image4.jpg",100,100);
        squareArray.add(cubo5);
        Cubo cubo6 = new Cubo("/images/image3.jpg",100,100);
        squareArray.add(cubo6);
        Cubo cubo7 = new Cubo("/images/image2.jpg",100,100);
        squareArray.add(cubo7);
        Cubo cubo8 = new Cubo("/images/image1.jpg",100,100);
        squareArray.add(cubo8);
    }
       
    public void setFirstController(FirstController myController) {
       this.myController = myController;
  }
    public void setSquareArray(List<Cubo> squareArray){
        this.squareArray= squareArray;
    
    }
    public List<Cubo> getSquareArray(){
          
        return squareArray;}
}

