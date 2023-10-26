package view;

import controller.FirstController;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;


public class GameView extends JFrame{
    private FirstController myController;

    public  GameView(){
        startComponent();
    }
    private void startComponent(){
        // Configuración de pantalla y fondo de pantalla--------------------------------------------
        setTitle("Popsicle");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(1200,800);
        setLocationRelativeTo(null); //Toma la locacion en el medio de pantalla
        setVisible(true);
        setResizable(false);
        setLayout(null);

    }

    public void setFirstController(FirstController myController) {
        this.myController = myController;
    }

}
