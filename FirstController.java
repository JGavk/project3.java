package controller;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import view.FirstView;
import view.GameView; 
import model.GameModel;

public class FirstController {
    private FirstView frame;
    private GameView game;
    private GameModel model;
    public FirstController() {
    
   }    

    public void setFirstView(FirstView frame) {
        this.frame=frame;
    }

    public void chargeGameFrame() {
        GameView game = new GameView();
        GameModel model = new GameModel();
        frame.dispose();
    }

    public void setGameView(GameView game) {
       this.game=game;
    }


}        
        
        
        
