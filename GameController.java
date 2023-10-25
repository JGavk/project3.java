package controller;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import view.FirstView;
import view.GameView; 
import model.GameModel;

public class GameController {
    private GameModel logic;
    private FirstView view;
    private GameView gameView; 
    public GameController(GameModel logic, FirstView view, GameView gameView) {
        this.logic = logic;
        this.view = view;
        this.gameView = gameView; 

        view.AddDoListener(new DoListener());
        view.AddGameListener(new GameListener());
        view.AddInstructionListener(new InstructionListener());

        updateView();
    }
    public ActionListener getGameListener() {
        return new GameListener();
    }
    class DoListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {

        }
    }

    class GameListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
         
            view.dispose();
            gameView.showGameView();
            
        }
    }

    class InstructionListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {

        }
    }

    private void updateView() {

    }
}
