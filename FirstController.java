package controller;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;
import view.FirstView;
import view.GameView;
import model.GameModel;
import model.Cubo;

import javax.swing.*;

public class FirstController {
    private FirstView frame;
    private GameView game;
    private GameModel model;
    private List<Cubo> squareArray;
    private Timer imageTimer;

    public FirstController() {
        this.frame=frame;
        this.game= game;


   }

    public void setFirstView(FirstView frame) {
        this.frame=frame;
    }
    public void setSquareArray() {
        model.setSquareArray();
    }
    private void startTimer(){
        imageTimer = new Timer(3000, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                changeRandomImage();
            }
        });
        imageTimer.start();
    }
    private void changeRandomImage() {
        if (!squareArray.isEmpty()) {
            this.model.resetImage();
            this.game.updateImages(this.model.getSquareArray());
        }
    }
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

    public void updateScore() {
        this.game.pressMe(this.model.checkMatch());
    }

    public void setGameView(GameView game) {
     this.game=game;

    }

   public Object getGameModel() {
        return model;
    }




}
        
        
