package how2metodos.proyect1.code;
import javax.swing.JOptionPane;

public class btnCrearCaja1 extends javax.swing.JFrame {
    
    public btnCrearCaja1() {
        initComponents();
        
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bg = new javax.swing.JPanel();
        tabbed1 = new javax.swing.JTabbedPane();
        bg1 = new javax.swing.JPanel();
        txtCrearNombre = new javax.swing.JLabel();
        inputCrearNombre1 = new javax.swing.JTextField();
        txtCrearCantidad1 = new javax.swing.JLabel();
        inputCrearCantidad1 = new javax.swing.JTextField();
        txtCrearPrecio1 = new javax.swing.JLabel();
        inputCrearPrecio1 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        bg2 = new javax.swing.JPanel();
        bg3 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        txtCrearNombre.setFont(new java.awt.Font("Gadugi", 0, 24)); // NOI18N
        txtCrearNombre.setText("Nombre");

        inputCrearNombre1.setFont(new java.awt.Font("Gadugi", 0, 24)); // NOI18N

        txtCrearCantidad1.setFont(new java.awt.Font("Gadugi", 0, 24)); // NOI18N
        txtCrearCantidad1.setText("Cantidad");

        inputCrearCantidad1.setFont(new java.awt.Font("Gadugi", 0, 24)); // NOI18N

        txtCrearPrecio1.setFont(new java.awt.Font("Gadugi", 0, 24)); // NOI18N
        txtCrearPrecio1.setText("Precio");

        inputCrearPrecio1.setFont(new java.awt.Font("Gadugi", 0, 24)); // NOI18N

        jButton1.setFont(new java.awt.Font("Gadugi", 0, 24)); // NOI18N
        jButton1.setText("CrearCaja");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                crearCaja(evt);
            }
        });

        javax.swing.GroupLayout bg1Layout = new javax.swing.GroupLayout(bg1);
        bg1.setLayout(bg1Layout);
        bg1Layout.setHorizontalGroup(
            bg1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bg1Layout.createSequentialGroup()
                .addGroup(bg1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(bg1Layout.createSequentialGroup()
                        .addGap(37, 37, 37)
                        .addGroup(bg1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(bg1Layout.createSequentialGroup()
                                .addComponent(txtCrearNombre)
                                .addGap(18, 18, 18)
                                .addComponent(inputCrearNombre1, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(bg1Layout.createSequentialGroup()
                                .addComponent(txtCrearCantidad1)
                                .addGap(18, 18, 18)
                                .addComponent(inputCrearCantidad1))
                            .addGroup(bg1Layout.createSequentialGroup()
                                .addComponent(txtCrearPrecio1)
                                .addGap(18, 18, 18)
                                .addComponent(inputCrearPrecio1))))
                    .addGroup(bg1Layout.createSequentialGroup()
                        .addGap(175, 175, 175)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(45, Short.MAX_VALUE))
        );
        bg1Layout.setVerticalGroup(
            bg1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bg1Layout.createSequentialGroup()
                .addGap(56, 56, 56)
                .addGroup(bg1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtCrearNombre)
                    .addComponent(inputCrearNombre1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(bg1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtCrearCantidad1)
                    .addComponent(inputCrearCantidad1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(bg1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtCrearPrecio1)
                    .addComponent(inputCrearPrecio1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(35, 35, 35)
                .addComponent(jButton1)
                .addContainerGap(67, Short.MAX_VALUE))
        );

        tabbed1.addTab("CrearCaja", bg1);

        javax.swing.GroupLayout bg2Layout = new javax.swing.GroupLayout(bg2);
        bg2.setLayout(bg2Layout);
        bg2Layout.setHorizontalGroup(
            bg2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 488, Short.MAX_VALUE)
        );
        bg2Layout.setVerticalGroup(
            bg2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 335, Short.MAX_VALUE)
        );

        tabbed1.addTab("ActualizarCaja", bg2);

        javax.swing.GroupLayout bg3Layout = new javax.swing.GroupLayout(bg3);
        bg3.setLayout(bg3Layout);
        bg3Layout.setHorizontalGroup(
            bg3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 488, Short.MAX_VALUE)
        );
        bg3Layout.setVerticalGroup(
            bg3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 335, Short.MAX_VALUE)
        );

        tabbed1.addTab("EliminarCaja", bg3);

        javax.swing.GroupLayout bgLayout = new javax.swing.GroupLayout(bg);
        bg.setLayout(bgLayout);
        bgLayout.setHorizontalGroup(
            bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(tabbed1)
        );
        bgLayout.setVerticalGroup(
            bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bgLayout.createSequentialGroup()
                .addComponent(tabbed1, javax.swing.GroupLayout.PREFERRED_SIZE, 370, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(bg, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(bg, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    //declaration of the object of the class2
    class2Methods createPerson;
    
    private void crearCaja(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_crearCaja
        // TODO add your handling code here:
        //i take the variables from the Jframe
        String name = inputCrearNombre1.getText();
        int amount = Integer.parseInt(inputCrearCantidad1.getText());
        int price = Integer.parseInt(inputCrearPrecio1.getText());
        
        //put the variables to the constructor
        createPerson = new class2Methods();
        createPerson.setName(name);
        createPerson.setAmount(amount);
        createPerson.setPrice(price);
        
        //confirmation of the creation of the box
        if (createPerson.isCreated() == true){
            JOptionPane.showMessageDialog(rootPane, "Caja creada satisfactoriamente");
        }
        else{
            JOptionPane.showMessageDialog(rootPane, "Caja creada erroneamente, intente otra vez");
        }
        
        //debbugging what was the variables in the object
        System.out.println("name: " + createPerson.getName());
        System.out.println("amount: " + createPerson.getAmount());
        System.out.println("price: " + createPerson.getPrice() + "$");
        
    }//GEN-LAST:event_crearCaja

    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(btnCrearCaja1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(btnCrearCaja1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(btnCrearCaja1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(btnCrearCaja1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new btnCrearCaja1().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel bg;
    private javax.swing.JPanel bg1;
    private javax.swing.JPanel bg2;
    private javax.swing.JPanel bg3;
    private javax.swing.JTextField inputCrearCantidad1;
    private javax.swing.JTextField inputCrearNombre1;
    private javax.swing.JTextField inputCrearPrecio1;
    private javax.swing.JButton jButton1;
    private javax.swing.JTabbedPane tabbed1;
    private javax.swing.JLabel txtCrearCantidad1;
    private javax.swing.JLabel txtCrearNombre;
    private javax.swing.JLabel txtCrearPrecio1;
    // End of variables declaration//GEN-END:variables
}
