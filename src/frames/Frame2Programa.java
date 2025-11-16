package frames;
import clases.class2Methods;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class Frame2Programa extends javax.swing.JFrame {
    
    //creacion del objeto del modelo de la tabla default, esto es para colocarle nombre a 
    //los campops de la tabla
    DefaultTableModel modeloTabla = new DefaultTableModel();
    
    public Frame2Programa() {
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
        bgCrear = new javax.swing.JPanel();
        txtCrearNombre = new javax.swing.JLabel();
        inputCrearNombre1 = new javax.swing.JTextField();
        txtCrearCantidad1 = new javax.swing.JLabel();
        inputCrearCantidad1 = new javax.swing.JTextField();
        txtCrearPrecio1 = new javax.swing.JLabel();
        inputCrearPrecio1 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        bgBuscar = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        bgTabla = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTabla1 = new javax.swing.JTable();
        btnEliminar = new javax.swing.JButton();
        btnActualizar = new javax.swing.JButton();

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

        javax.swing.GroupLayout bgCrearLayout = new javax.swing.GroupLayout(bgCrear);
        bgCrear.setLayout(bgCrearLayout);
        bgCrearLayout.setHorizontalGroup(
            bgCrearLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bgCrearLayout.createSequentialGroup()
                .addGroup(bgCrearLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(bgCrearLayout.createSequentialGroup()
                        .addGap(37, 37, 37)
                        .addGroup(bgCrearLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(bgCrearLayout.createSequentialGroup()
                                .addComponent(txtCrearNombre)
                                .addGap(18, 18, 18)
                                .addComponent(inputCrearNombre1, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(bgCrearLayout.createSequentialGroup()
                                .addComponent(txtCrearCantidad1)
                                .addGap(18, 18, 18)
                                .addComponent(inputCrearCantidad1))
                            .addGroup(bgCrearLayout.createSequentialGroup()
                                .addComponent(txtCrearPrecio1)
                                .addGap(18, 18, 18)
                                .addComponent(inputCrearPrecio1))))
                    .addGroup(bgCrearLayout.createSequentialGroup()
                        .addGap(199, 199, 199)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(94, Short.MAX_VALUE))
        );
        bgCrearLayout.setVerticalGroup(
            bgCrearLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bgCrearLayout.createSequentialGroup()
                .addGap(56, 56, 56)
                .addGroup(bgCrearLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtCrearNombre)
                    .addComponent(inputCrearNombre1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(bgCrearLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtCrearCantidad1)
                    .addComponent(inputCrearCantidad1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(bgCrearLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtCrearPrecio1)
                    .addComponent(inputCrearPrecio1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(48, 48, 48)
                .addComponent(jButton1)
                .addContainerGap(199, Short.MAX_VALUE))
        );

        tabbed1.addTab("CrearCaja", bgCrear);

        jLabel1.setText("Ingrese código");

        javax.swing.GroupLayout bgBuscarLayout = new javax.swing.GroupLayout(bgBuscar);
        bgBuscar.setLayout(bgBuscarLayout);
        bgBuscarLayout.setHorizontalGroup(
            bgBuscarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bgBuscarLayout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jLabel1)
                .addContainerGap(428, Short.MAX_VALUE))
        );
        bgBuscarLayout.setVerticalGroup(
            bgBuscarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bgBuscarLayout.createSequentialGroup()
                .addGap(55, 55, 55)
                .addComponent(jLabel1)
                .addContainerGap(409, Short.MAX_VALUE))
        );

        tabbed1.addTab("BuscarCaja", bgBuscar);

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

        btnEliminar.setFont(new java.awt.Font("Gadugi", 0, 14)); // NOI18N
        btnEliminar.setText("Eliminar");

        btnActualizar.setFont(new java.awt.Font("Gadugi", 0, 14)); // NOI18N
        btnActualizar.setText("Actualizar");

        javax.swing.GroupLayout bgTablaLayout = new javax.swing.GroupLayout(bgTabla);
        bgTabla.setLayout(bgTablaLayout);
        bgTablaLayout.setHorizontalGroup(
            bgTablaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bgTablaLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(bgTablaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 525, Short.MAX_VALUE)
                    .addGroup(bgTablaLayout.createSequentialGroup()
                        .addComponent(btnEliminar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnActualizar)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        bgTablaLayout.setVerticalGroup(
            bgTablaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bgTablaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 404, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(bgTablaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnActualizar)
                    .addComponent(btnEliminar))
                .addContainerGap(37, Short.MAX_VALUE))
        );

        tabbed1.addTab("Tabla", bgTabla);

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
                .addComponent(tabbed1, javax.swing.GroupLayout.PREFERRED_SIZE, 515, javax.swing.GroupLayout.PREFERRED_SIZE)
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

    private void crearCaja(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_crearCaja
        // TODO add your handling code here:
        //i take the variables from the Jframe

        //declaracion de variables
        String name = inputCrearNombre1.getText();
        int amount = Integer.parseInt(inputCrearCantidad1.getText());
        int price = Integer.parseInt(inputCrearPrecio1.getText());
        //Se le suma 1 al codigo para que sea diferente al anterior
        codigo++;

        //se instancia el objeto de la clase para enviar el objeto del producto
        createPerson = new class2Methods(name, amount, price, codigo);

        //debbugging what was the variables in the object
        System.out.println("name: " + createPerson.getName());
        System.out.println("amount: " + createPerson.getAmount());
        System.out.println("price: " + createPerson.getPrice() + "$");
        System.out.println("codigo: " + codigo);

        //confirmation of the creation of the box

        //colocacion de cosas en la modeloTabla
        //se crea el array de 4 valores que son los de la tabla
        String datosTabla[] =  new String[4];

        //se toman los datos desde el metodo "createPerson" con los getters
        int codigo = 3;
        datosTabla[0] = String.valueOf(createPerson.getCodigo());
        datosTabla[1] = (createPerson.getName());
        datosTabla[2] = String.valueOf(createPerson.getPrice());
        datosTabla[3] = String.valueOf(createPerson.getAmount());

        //se coloca en la tabla
        modeloTabla.addRow(datosTabla);

        inputCrearCantidad1.setText("");
        inputCrearNombre1.setText("");
        inputCrearPrecio1.setText("");

        JOptionPane.showMessageDialog(rootPane, "Caja creada");

    }//GEN-LAST:event_crearCaja

    //declaration of the object of the class2
    class2Methods createPerson;
    int codigo = 0;
    
    
    
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
            java.util.logging.Logger.getLogger(Frame2Programa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Frame2Programa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Frame2Programa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Frame2Programa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Frame2Programa().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel bg;
    private javax.swing.JPanel bgBuscar;
    private javax.swing.JPanel bgCrear;
    private javax.swing.JPanel bgTabla;
    private javax.swing.JButton btnActualizar;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JTextField inputCrearCantidad1;
    private javax.swing.JTextField inputCrearNombre1;
    private javax.swing.JTextField inputCrearPrecio1;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTabla1;
    private javax.swing.JTabbedPane tabbed1;
    private javax.swing.JLabel txtCrearCantidad1;
    private javax.swing.JLabel txtCrearNombre;
    private javax.swing.JLabel txtCrearPrecio1;
    // End of variables declaration//GEN-END:variables
}
