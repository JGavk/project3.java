
package view;
import java.awt.FlowLayout;
import java.awt.Graphics;
import java.awt.Image;
import javax.swing.*;


public class FirstView extends JFrame {
    private JLabel jBackground;
    private JLabel jContent;
    private JButton btnJoin, btnLeave, btnInstructions;
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
                
        
    }

}
