/*
Miguel Angel Soto Espitia 2240019
Juan Pablo Puerta Gaviria 2240033
18/10/23-31/10/23
*/
package controller;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;
import view.FirstView;
import view.GameView;
import model.GameModel;
import model.Cubo;
import view.ImproveView;
import view.InstructionsView;

import javax.swing.*;

public class FirstController {
    private FirstView frame;

    private ImproveView improveFrame;
    private InstructionsView instructionsView;
    private GameView game;
    private GameModel model;
    private List<Cubo> squareArray;
    private Timer imageTimer;

    public FirstController() {
        this.frame = frame;
        this.game = game;
        this.improveFrame = improveFrame;
        this.instructionsView = instructionsView;
   }

//Controla la primera pestaña
    public void setFirstView(FirstView frame) {
        this.frame=frame;
    }
//Controla el cambio desde ventana de función vuelta a FirstFrame    
    public void getFirstView(){
        frame = new FirstView();
        frame.setFirstController(this);
        improveFrame.dispose();
    }
 //Controla el cambio desde Instrucción  y vuelta a FirstFrame     
    public void getFirstView2(){
        frame = new FirstView();
        frame.setFirstController(this);
        instructionsView.dispose();
    }
//Obtiene el arreglo    
    public void setSquareArray() {
        model.setSquareArray();
    }
//Comienza el temporizador de imagenes    
    private void startTimer(){
        imageTimer = new Timer(3000, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                changeRandomImage();
            }
        });
        imageTimer.start();
    }
//Controla el cambio de imagenes comunicando el modelo con la vista    
    private void changeRandomImage() {
        if (!squareArray.isEmpty()) {
            this.model.resetImage();
            this.game.updateImages(this.model.getSquareArray());
        }
    }

//Carga el juego con toda su logica de cambio en la vista    
    public void chargeGameFrame() {
        game = new GameView();
        model = new GameModel();
        game.setFirstController(this);
        this.setSquareArray();
        this.squareArray = model.getSquareArray();
        game.displaySquareArray(squareArray);
        frame.dispose();
        this.startTimer();
    }
//Controla el cambio de puntuacion y vida
    public void updateScore() {
        this.game.pressMe(this.model.checkMatch());
        this.model.resetButton();
        this.game.putImages(this.model.getSquareArray(), true);
    }


   public Object getGameModel() {
        return model;
    }

//Controla el cambio a ventana de función
    public void chargeImproveView() {
        improveFrame = new ImproveView();
        improveFrame.setFirstController(this);
        frame.dispose();
    }
//Controla el cambio a la ventana de instrucciones
    public void chargeInstructionsView() {
        instructionsView = new InstructionsView();
        instructionsView.setFirstController(this);
        frame.dispose();
    }
}
        
        
        
        
        
