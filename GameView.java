package view;

import controller.FirstController;
import javax.swing.Timer;
import java.awt.*;
import java.util.List;
import javax.swing.ImageIcon;
import javax.swing.*;
import model.Cubo;
import java.util.Random;
public class GameView extends JFrame {
    private FirstController myController;
    private ImageIcon backgroundIcon;
    private JLabel jContent;
    private JPanel gamePanel;
    private List<Cubo> squareArray;
    private JButton btnCompare;

    public GameView() {
        startComponent();
    }

    private void startComponent() {
        // Configuration of screen and background--------------------------------------------
        //backgroundIcon = new ImageIcon(this.getClass().getResource("/images/background.jpg"));
        //jContent = new JLabel(backgroundIcon);
        //jContent.setSize(1200, 800);
        setTitle("GAME!!!");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(1200, 800);
        setLocationRelativeTo(null);
        setVisible(true);
        setResizable(false);
        setLayout(null);
        //add(jContent);
        gamePanel = new JPanel();
        gamePanel.setBackground(new java.awt.Color(102, 0, 204));
        gamePanel.setLayout(null);
        gamePanel.setSize(1200, 800);


        add(gamePanel);

    }

    public void setFirstController(FirstController myController) {
        this.myController = myController;

    }

    public void displaySquareArray(List<Cubo> squareArray) {
        System.out.println(squareArray);
        // Limpia
        gamePanel.removeAll();
        int labelWidth = 100;
        int labelHeight = 100;
        Random random = new Random();
        btnCompare = new JButton("Wololo!");
        btnCompare.setBounds(900,650, 150,60);
        btnCompare.setFont(new Font("Arial", Font.BOLD, 24));
        btnCompare.setFocusPainted(false);
        btnCompare.setForeground(Color.WHITE);
        btnCompare.setBorder(null);
        btnCompare.setBackground(Color.BLACK);
        gamePanel.add(btnCompare);

        for (int i = 0; i < 4 && i < squareArray.size(); i++) {
            Cubo cubo = squareArray.get(i);

            // Randomiza x , y en el JPanel
            int x = random.nextInt(gamePanel.getWidth() - labelWidth);
            int y = random.nextInt(gamePanel.getHeight() - labelHeight);

            JLabel label = new JLabel(cubo.getImage());
            label.setBounds(x, y, labelWidth, labelHeight);
            gamePanel.add(label);
        }

        gamePanel.revalidate();
        gamePanel.repaint();
    }
}
