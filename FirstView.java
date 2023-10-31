/*
Miguel Angel Soto Espitia 2240019
Juan Pablo Puerta Gaviria 2240033
18/10/23-31/10/23
*/
package view;
import controller.FirstController;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;


public class FirstView extends JFrame implements ActionListener {
    private JLabel jBackground;
    private JLabel jContent, title;
    private JButton btnJoin, btnDo, btnInstructions;
    private ImageIcon backgroundIcon;
    private FirstController myController;
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
        title = new JLabel("OBSERVA RAPIDO!");
        title.setBounds(320,100,700,400);
        title.setFont(new Font("Arial", Font.BOLD,60));
        title.setForeground(Color.WHITE);
        jContent.add(title);
        //-------------------------------------------------------------------------------------------

        btnJoin = new JButton("JUGAR");
        btnJoin.setBounds(520,650, 150,35);
        jContent.add(btnJoin);
        btnJoin.setFocusPainted(false);
        btnJoin.setFont(new Font("Arial", Font.BOLD, 24));
        btnJoin.setForeground(Color.WHITE);
        btnJoin.setBorder(null);
        btnJoin.setBackground(Color.BLACK);
        btnJoin.addActionListener(this);
        //-------------------------------------------------------------------------------------------

        btnDo = new JButton("Para qué sirve");
        btnDo.setBounds(850, 580, 200, 60);
        jContent.add(btnDo);
        btnDo.setFont(new Font("Arial",Font.BOLD,26));
        btnDo.setBorder(null);
        btnDo.setFocusPainted(false);
        btnDo.setBackground(Color.GRAY);
        btnDo.addActionListener(this::accionHecha);
        //--------------------------------------------------------------------------------------------

        btnInstructions = new JButton ("Cómo Jugar");
        btnInstructions.setBounds(185,580,200,60);
        jContent.add(btnInstructions);
        btnInstructions.setFont(new Font("Arial",Font.BOLD,26));
        btnInstructions.setBorder(null);
        btnInstructions.setFocusPainted(false);
        btnInstructions.setBackground(Color.GRAY);
        btnInstructions.addActionListener(this::actionDone);

        //--------------------------------------------------------------------------------------------

    }
//Manda comando al controlador para que realice cualquier accion que se necesite
    public void setFirstController(FirstController myController) {
        this.myController = myController;
    }
//Llama a accion del btnJoin, descrita en el controlador
    public void actionPerformed(ActionEvent e){
        if(e.getSource()==btnJoin){
            myController.chargeGameFrame();

        }
    }
 //Llama a accion del btnDo, descrita en el controlador
    public void accionHecha(ActionEvent n) {
        if (n.getSource() == btnDo) {
            myController.chargeImproveView();
        }
    }
//Llama a accion del btnInstructions, descrita en el controlador
    public void actionDone(ActionEvent v){
        if (v.getSource()==btnInstructions)
            myController.chargeInstructionsView();
    }

}
