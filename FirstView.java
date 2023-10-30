package view;

public class NewJFrame extends javax.swing.JFrame {

    /**
     * Creates new form FirstView
     */
    public NewJFrame() {
        initComponents();
        this.setLocationRelativeTo(null);
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents() {

        btnIngresar = new javax.swing.JButton();
        btnInstrucciones = new javax.swing.JButton();
        btnParaQSirve = new javax.swing.JButton();
        background = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(1200, 800));
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnIngresar.setBackground(new java.awt.Color(0, 0, 0));
        btnIngresar.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        btnIngresar.setForeground(new java.awt.Color(255, 255, 255));
        btnIngresar.setText("JUGAR");
        btnIngresar.setMaximumSize(new java.awt.Dimension(150, 35));
        btnIngresar.setMinimumSize(new java.awt.Dimension(150, 35));
        getContentPane().add(btnIngresar, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 630, 140, 40));

        btnInstrucciones.setBackground(new java.awt.Color(153, 153, 153));
        btnInstrucciones.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        btnInstrucciones.setForeground(new java.awt.Color(51, 51, 51));
        btnInstrucciones.setText("CÓMO JUGAR");
        btnInstrucciones.setMaximumSize(new java.awt.Dimension(200, 60));
        btnInstrucciones.setMinimumSize(new java.awt.Dimension(200, 60));
        btnInstrucciones.setOpaque(true);
        btnInstrucciones.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInstruccionesActionPerformed(evt);
            }
        });
        getContentPane().add(btnInstrucciones, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 570, 210, -1));

        btnParaQSirve.setBackground(new java.awt.Color(153, 153, 153));
        btnParaQSirve.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        btnParaQSirve.setText("PARA QUÉ SIRVE?");
        getContentPane().add(btnParaQSirve, new org.netbeans.lib.awtextra.AbsoluteConstraints(840, 570, -1, -1));

        background.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/background.jpg"))); // NOI18N
        getContentPane().add(background, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, -1, -1));

        pack();
    }// </editor-fold>                        
                                              

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {

        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new NewJFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify                     
    private javax.swing.JLabel background;
    private javax.swing.JButton btnIngresar;
    private javax.swing.JButton btnInstrucciones;
    private javax.swing.JButton btnParaQSirve;
    // End of variables declaration                   
}
