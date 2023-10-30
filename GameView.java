package view;

import controller.FirstController;
import javax.swing.Timer;
import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;
import java.util.List;
import javax.swing.ImageIcon;
import javax.swing.*;
import model.Cubo;
import model.GameModel;

import java.util.Random;

public class GameView extends JFrame implements ActionListener {
    private FirstController myController;
    private ImageIcon backgroundIcon;
    private List<JLabel> buttonLabels;
    private JPanel gamePanel;
    private List<Cubo> squareArray;
    private JButton btnCompare;
    private JLabel scoreLabel, livesLabel;
    private int score = 0;
    private int fails = 3;

    public GameView () {
        this.buttonLabels = new ArrayList<>();
        startComponent();

    }


    private void startComponent() {
        setTitle("GAME!!!");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(1200, 800);
        setLocationRelativeTo(null);
        setVisible(true);
        setResizable(false);
        setLayout(null);
        gamePanel = new JPanel();
        gamePanel.setBackground(new java.awt.Color(100, 50, 208));
        gamePanel.setLayout(null);
        gamePanel.setSize(1200, 800);

        btnCompare = new JButton("Wololo!");
        btnCompare.setBounds(900,650, 150,60);
        btnCompare.setFont(new Font("Arial", Font.BOLD, 24));
        btnCompare.setFocusPainted(false);
        btnCompare.setForeground(Color.WHITE);
        btnCompare.setBorder(null);
        btnCompare.setBackground(Color.BLACK);
        btnCompare.addActionListener( this);
        gamePanel.add(btnCompare);

        scoreLabel = new JLabel("Score: " + score);
        scoreLabel.setBounds(0,5, 1220,200);
        scoreLabel.setForeground(new java.awt.Color(255, 255, 255));
        scoreLabel.setFont(new Font("arial", Font.BOLD, 25));
        gamePanel.add(scoreLabel);
        livesLabel = new JLabel("Lives: " + fails);
        livesLabel.setBounds(200,5, 1220,200);
        livesLabel.setForeground(new java.awt.Color(255, 255, 255));
        livesLabel.setFont(new Font("arial", Font.BOLD, 25));
        gamePanel.add(livesLabel);
        add(gamePanel);

    }

    public void setFirstController(FirstController myController) {
        this.myController = myController;
    }

    public void actionPerformed(ActionEvent e){
        if(e.getSource()==btnCompare){
            myController.updateScore();

        }
    }
    public void pressMe(boolean match) {

        if (match) {
            this.score += 5;
;
        } else {
            this.fails -= 1;
        }
        // actualizar jlabel de score
        scoreLabel.setText("Score: " + this.score);
        livesLabel.setText("Lives: "+ this.fails);
        if (fails == 0) {
            gamePanel.invalidate();
            dispose();
            EndView endFrame = new EndView(score, fails);
        }
    }
    public void displaySquareArray(List<Cubo> squareArray) {
        this.squareArray = squareArray;
        putImages(squareArray, false);
    }

    public void putImages(List<Cubo> updatedSquareArray, boolean reset) {

        if (reset) {
            buttonLabels.forEach(obj -> {
                gamePanel.remove(obj);
            });

            buttonLabels = new ArrayList<>();
        }

        int labelWidth = 100;
        int labelHeight = 100;

        Random random = new Random();

        for (int i = 0; i < updatedSquareArray.size(); i++) {
            Cubo cubo = updatedSquareArray.get(i);

            int x = random.nextInt(gamePanel.getWidth() - labelWidth);
            int y = random.nextInt(gamePanel.getHeight() - labelHeight);

            JLabel label = new JLabel(cubo.getImage());
            label.setBounds(x, y, labelWidth, labelHeight);
            buttonLabels.add(label);
            gamePanel.add(label);
        }
        if (fails==0){
            gamePanel.invalidate();
        }
        gamePanel.revalidate();
        gamePanel.repaint();
    }

    public void updateImages(List<Cubo> updatedSquareArray) {

        for (int i = 0; i < updatedSquareArray.size(); i++) {
            Cubo cubo = updatedSquareArray.get(i);

            JLabel currentButtonLabel = buttonLabels.get(i);
            currentButtonLabel.setIcon(cubo.getImage());
        }
        if (fails==0){
            gamePanel.invalidate();
        }
        gamePanel.revalidate();
        gamePanel.repaint();
    }


}
