package view;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import javax.swing.*;


public class FirstView extends JFrame {
    private JLabel jBackground;
    private JLabel jContent;
    private JButton btnJoin, btnDo, btnInstructions;
    private ImageIcon backgroundIcon;
    
    public FirstView(){
        startComponent();
    }
    private void startComponent(){
        // Configuración de pantalla y fondo de pantalla--------------------------------------------
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
        //-------------------------------------------------------------------------------------------

        btnJoin = new JButton("JUGAR");
        btnJoin.setBounds(520,650, 150,35);
        jContent.add(btnJoin);
        btnJoin.setFocusPainted(false);  
        btnJoin.setFont(new Font("Arial", Font.BOLD, 24));
        btnJoin.setForeground(Color.WHITE);
        btnJoin.setBorder(null);
        btnJoin.setBackground(Color.BLACK);
        //------------------------------------------------------------------------------------------- 
        
        btnDo = new JButton("Para qué sirve");
        btnDo.setBounds(850, 580, 200, 60);
        jContent.add(btnDo);
        btnDo.setFont(new Font("Arial",Font.BOLD,26));
        btnDo.setBorder(null);
        btnDo.setFocusPainted(false);
        btnDo.setBackground(Color.GRAY);
        //--------------------------------------------------------------------------------------------
        
        btnInstructions = new JButton ("Cómo Jugar");
        btnInstructions.setBounds(185,580,200,60);
        jContent.add(btnInstructions);
        btnInstructions.setFont(new Font("Arial",Font.BOLD,26));
        btnInstructions.setBorder(null);
        btnInstructions.setFocusPainted(false);
        btnInstructions.setBackground(Color.GRAY);
        
        //--------------------------------------------------------------------------------------------
    }

}
