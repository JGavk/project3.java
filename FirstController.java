package controller;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;
import view.FirstView;
import view.GameView; 
import model.GameModel;
import model.Cubo;

public class FirstController {
    private FirstView frame;
    private GameView game;
    private GameModel model;
    private List<Cubo> squareArray;
    
    
    public FirstController() {
        this.frame=frame;
        this.game=game;
   }    

    public void setFirstView(FirstView frame) {
        this.frame=frame;
    }
    public void setSquareArray() {
        model.setSquareArray();
    }
    public void chargeGameFrame() {
        GameView game = new GameView();
        model = new GameModel();
        this.setSquareArray();
        this.squareArray = model.getSquareArray();
        game.displaySquareArray(squareArray);
        frame.dispose();

    }

    public void setGameView(GameView game) {
     this.game=game;

    }

   public Object getGameModel() {
        return model;
    }




}
        
        
