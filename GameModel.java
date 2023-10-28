package model;

import controller.FirstController;
import java.util.ArrayList;
import java.util.List;



public class GameModel {
    private List<List<Square>> squareArray;
    private FirstController myController;
    public GameModel() {
        squareArray = new ArrayList<>();
        squareArray.add(new ArrayList<>());
        squareArray.add(new ArrayList<>());
        squareArray.add(new ArrayList<>());
        squareArray.add(new ArrayList<>());
    

    
        Cubo cubo1 = new Cubo("/images/image1.jpg",100,100);
        squareArray.get(0).add(cubo1);
        Cubo cubo2 = new Cubo("/images/image2.jpg",100,100);
        squareArray.get(1).add(cubo2);
        Cubo cubo3 = new Cubo("/images/image3.jpg",100,100);
        squareArray.get(2).add(cubo3);
        Cubo cubo4 = new Cubo("/images/image4.jpg",100,100);
        squareArray.get(3).add(cubo4);
    }
      public void setFirstController(FirstController myController) {
       this.myController = myController;
  }
       public List<List<Square>> getSquareArray(){
          
           return squareArray;}
}

