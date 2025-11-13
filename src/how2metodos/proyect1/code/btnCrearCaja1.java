package how2metodos.proyect1.code;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class btnCrearCaja1 extends javax.swing.JFrame {
    
    //creacion del objeto del modelo de la tabla default, esto es para colocarle nombre a 
    //los campops de la tabla
    DefaultTableModel modeloTabla = new DefaultTableModel();
    
    public btnCrearCaja1() {
        initComponents();
        
        //colocacion de nombres de las columnas de la modeloTabla en un array
        String columnas[ ] = {"Código", "Nombre", "Precio", "Cantidad"};
        modeloTabla.setColumnIdentifiers(columnas);
        //Se le coloca el modelo a la modeloTabla que esta en el frame
        jTabla1.setModel(modeloTabla);
        //para meter vainas en la modeloTabla es por medio del boton
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
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTabla1 = new javax.swing.JTable();

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
                        .addGap(199, 199, 199)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(94, Short.MAX_VALUE))
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
                .addGap(48, 48, 48)
                .addComponent(jButton1)
                .addContainerGap(93, Short.MAX_VALUE))
        );

        tabbed1.addTab("CrearCaja", bg1);

        javax.swing.GroupLayout bg2Layout = new javax.swing.GroupLayout(bg2);
        bg2.setLayout(bg2Layout);
        bg2Layout.setHorizontalGroup(
            bg2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 537, Short.MAX_VALUE)
        );
        bg2Layout.setVerticalGroup(
            bg2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 374, Short.MAX_VALUE)
        );

        tabbed1.addTab("ActualizarCaja", bg2);

        javax.swing.GroupLayout bg3Layout = new javax.swing.GroupLayout(bg3);
        bg3.setLayout(bg3Layout);
        bg3Layout.setHorizontalGroup(
            bg3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 537, Short.MAX_VALUE)
        );
        bg3Layout.setVerticalGroup(
            bg3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 374, Short.MAX_VALUE)
        );

        tabbed1.addTab("EliminarCaja", bg3);

        jTabla1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTabla1);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 525, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 362, Short.MAX_VALUE)
                .addContainerGap())
        );

        tabbed1.addTab("Tabla", jPanel1);

        javax.swing.GroupLayout bgLayout = new javax.swing.GroupLayout(bg);
        bg.setLayout(bgLayout);
        bgLayout.setHorizontalGroup(
            bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bgLayout.createSequentialGroup()
                .addComponent(tabbed1, javax.swing.GroupLayout.PREFERRED_SIZE, 537, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        bgLayout.setVerticalGroup(
            bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bgLayout.createSequentialGroup()
                .addComponent(tabbed1, javax.swing.GroupLayout.PREFERRED_SIZE, 409, javax.swing.GroupLayout.PREFERRED_SIZE)
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
        int codigo = 0;
        
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
        
        
        
//colocacion de cosas en la modeloTabla
        

//se crea el array de 4 valores que son los de la modeloTabla
        String datosTabla[] =  new String[4];
        
        //se toman los datos desde el metodo "createPerson" con los getters
        datosTabla[0] = String.valueOf(codigo);
        datosTabla[1] = (createPerson.getName());
        datosTabla[2] = String.valueOf(createPerson.getPrice());
        datosTabla[3] = String.valueOf(createPerson.getAmount());
        
        //se coloca en la modeloTabla
        modeloTabla.addRow(datosTabla);
        
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
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTabla1;
    private javax.swing.JTabbedPane tabbed1;
    private javax.swing.JLabel txtCrearCantidad1;
    private javax.swing.JLabel txtCrearNombre;
    private javax.swing.JLabel txtCrearPrecio1;
    // End of variables declaration//GEN-END:variables
}
