package view;

import javax.swing.*;
import java.awt.*;


public class EndView extends JFrame {
    private JLabel endScore, livesLose, jContent;
    private ImageIcon backgroundIcon;

    public EndView(int score,int fails){
        startFrame(score, fails);


    }
    private void startFrame(int score,int fails){
        backgroundIcon = new ImageIcon(this.getClass().getResource("/images/background.jpg"));
        jContent = new JLabel(backgroundIcon);
        jContent.setSize(1200, 800);
        setTitle("Popsicle");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(1200,800);
        setLocationRelativeTo(null); //Toma la locacion en el medio de pantalla
        setVisible(true);
        setResizable(false);
        setLayout(null);
        add(jContent);
        endScore = new JLabel();
        livesLose = new JLabel();
        endScore.setText("Final Score: " + score);
        endScore.setBounds(500, 100, 600, 200);
        endScore.setFont(new Font("Arial",Font.BOLD,30));
        endScore.setForeground(Color.RED);
        jContent.add(endScore);
        livesLose.setText("Lives left : " + fails);
        livesLose.setBounds(500, 300, 600, 600);
        livesLose.setFont(new Font("Arial",Font.BOLD,30));
        livesLose.setForeground(Color.RED);
        jContent.add(livesLose);

    }
}
