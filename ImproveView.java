package view;

import controller.FirstController;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class ImproveView extends JFrame implements ActionListener {
    private JLabel jContent;
    private JButton btnBack;
    private ImageIcon backgroundIcon;
    private FirstController myController;
    private JScrollPane scrollPane;
    private JTextArea textArea;
    public ImproveView() {
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
        textArea.setText("Este juego pone en acción la habilidad para comparar\n" +
                "patrones visuales, entrenando además la atención a los\n" +
                "detalles y la velocidad perceptiva. Estas capacidades son\n" +
                "relevantes cuando hay que decidir entre estímulos\n" +
                "semejantes y hay que hacerlo de forma rápida, por ejemplo\n" +
                "al reconocer fotografías, caras, objetos cotidianos o\n" +
                "palabras escritas.\n");
        scrollPane.setViewportView(textArea);

        jContent.add(scrollPane);



        btnBack = new JButton("Retroceder");
        btnBack.setBounds(520,650, 150,35);
        jContent.add(btnBack);
        btnBack.setFocusPainted(false);
        btnBack.setFont(new Font("Arial", Font.BOLD, 24));
        btnBack.setForeground(Color.WHITE);
        btnBack.setBorder(null);
        btnBack.setBackground(Color.BLACK);
        btnBack.addActionListener( this);
    }
    //Manda comando al controlador para que realice cualquier accion que se necesite
    public void setFirstController(FirstController myController) {
        this.myController = myController;

    }

//Accion de boton
    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==btnBack){
            myController.getFirstView();
        }
    }

}
