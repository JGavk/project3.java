package view;

import controller.FirstController;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class InstructionsView extends JFrame implements ActionListener {
    private JLabel jContent;

    private ImageIcon backgroundIcon;
    private JButton btnBackBack;
    private FirstController myController;
    private JTextArea textArea;
    private JScrollPane scrollPane;

    public InstructionsView() {
        startComponent();
    }

    private void startComponent() {
        // Configuración de pantalla y fondo de pantalla--------------------------------------------
        backgroundIcon = new ImageIcon(this.getClass().getResource("/images/background.jpg"));
        jContent = new JLabel(backgroundIcon);
        jContent.setSize(1200, 800);
        setTitle("Popsicle");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(1200, 800);
        setLocationRelativeTo(null); //Toma la locacion en el medio de pantalla
        setVisible(true);
        setResizable(false);
        setLayout(null);
        add(jContent);

///Añade el ScrollPanel más el area de texto al ScrollPanel para mostrar las instrucciones de juego
        scrollPane = new JScrollPane();
        scrollPane.setBackground(new java.awt.Color(0, 0, 0));
        scrollPane.setForeground(new java.awt.Color(255, 255, 255));
        scrollPane.setBounds(300, 300, 600, 200);
        textArea = new JTextArea();
        textArea.setBackground(new java.awt.Color(0, 0, 0));
        textArea.setColumns(20);
        textArea.setFont(new java.awt.Font("Arial", 1, 22));
        textArea.setForeground(new java.awt.Color(255, 255, 255));
        textArea.setRows(5);
        textArea.setText("Este juego se puede ver complicado pero es mas sencillo de \n" +
                "lo que crees,  vas a tener que estar atento a la pantalla para \n" +
                "poder darte cuenta que existen dos cuadros del mismo color \n" +
                "cuando lo veas pulsa el boton para ganar tus puntos,\n" +
                " recuerda, los cuadros van a cambiar aleatoriamente!!!");
        scrollPane.setViewportView(textArea);

        jContent.add(scrollPane);





        btnBackBack = new JButton("Retroceder");
        btnBackBack.setBounds(520,650, 150,35);
        jContent.add(btnBackBack);
        btnBackBack.setFocusPainted(false);
        btnBackBack.setFont(new Font("Arial", Font.BOLD, 24));
        btnBackBack.setForeground(Color.WHITE);
        btnBackBack.setBorder(null);
        btnBackBack.setBackground(Color.BLACK);
        btnBackBack.addActionListener( this);
    }
    //Manda comando al controlador para que realice cualquier accion que se necesite
    public void setFirstController(FirstController myController) {
        this.myController = myController;

    }

//Accion de boton
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==btnBackBack){
            myController.getFirstView2();
        }
    }



}
