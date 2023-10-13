package ui;

import code.Producto;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;

public class formActualizarProducto extends javax.swing.JFrame {

    String codigoProducto = "";
    int stock = 0;

    public formActualizarProducto() {
        initComponents();
        cargarProductos();
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnActualizar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        cbxProductos = new javax.swing.JComboBox<>();
        txtAgregarStock = new javax.swing.JTextField();
        txtStockActual = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        btnActualizar.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        btnActualizar.setText("Actualizar");
        btnActualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnActualizarActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel1.setText("Actualizar Stock");

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 22)); // NOI18N
        jLabel2.setText("Agregar:");

        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 22)); // NOI18N
        jLabel3.setText("Actual:");

        jLabel4.setFont(new java.awt.Font("Times New Roman", 1, 22)); // NOI18N
        jLabel4.setText("Producto:");

        cbxProductos.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        cbxProductos.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        cbxProductos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbxProductosActionPerformed(evt);
            }
        });

        txtAgregarStock.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N

        txtStockActual.setEditable(false);
        txtStockActual.setBackground(new java.awt.Color(102, 102, 102));
        txtStockActual.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(126, 126, 126)
                        .addComponent(btnActualizar, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(jLabel3)
                            .addComponent(jLabel2))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtStockActual)
                            .addComponent(cbxProductos, 0, 231, Short.MAX_VALUE)
                            .addComponent(txtAgregarStock))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 119, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(111, 111, 111))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jLabel1)
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(cbxProductos, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtStockActual))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtAgregarStock))
                .addGap(47, 47, 47)
                .addComponent(btnActualizar, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(17, 17, 17))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActualizarActionPerformed
        // TODO add your handling code here:
        actualizarStock();
    }//GEN-LAST:event_btnActualizarActionPerformed

    private void cbxProductosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbxProductosActionPerformed
        // TODO add your handling code here:
        cargarStockProductoSeleccionado();
    }//GEN-LAST:event_cbxProductosActionPerformed

    /**
     * @param args the command line arguments
     */
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
            java.util.logging.Logger.getLogger(formActualizarProducto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(formActualizarProducto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(formActualizarProducto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(formActualizarProducto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new formActualizarProducto().setVisible(true);
            }
        });
    }

    private void cargarProductos() {
//        Connection c = Conexion.Conectar();
//        String query = "select * from Producto";
//        Statement st;
//        try {
//            st = c.createStatement();
//            ResultSet rs = st.executeQuery(query);
//            cbxProductos.removeAllItems();
//            cbxProductos.addItem("Seleccionar Producto:");
//            while (rs.next()) {
//                cbxProductos.addItem(rs.getString("Nombre"));
//            }
//            c.close();
//        } catch (SQLException e) {
//            System.out.println("No se pudo cargar los productos " + e.getMessage());
//        }
    }

    private void cargarStockProductoSeleccionado() {
//        Connection c = Conexion.Conectar();
//        String query = "select * from Producto where nombre = '" + cbxProductos.getSelectedItem() + "'";
//        Statement st;
//        try {
//            st = c.createStatement();
//            ResultSet rs = st.executeQuery(query);
//            if (rs.next()) {
//                codigoProducto = rs.getString("codigo").trim();
//                stock = rs.getInt("stock");
//                txtStockActual.setText(String.valueOf(stock));
//            } else {
//                txtStockActual.setText(null);
//            }
//        } catch (SQLException e) {
//            System.out.println("No se pudo cargar el stock, " + e.getMessage());
//        }
    }

    private void actualizarStock() {
//        if (cbxProductos.getSelectedItem().equals("Seleccionar Producto:")) {
//            JOptionPane.showMessageDialog(null, "Error: Elegir producto.");
//        }else{
//            if (txtAgregarStock.getText().isEmpty()) {
//                JOptionPane.showMessageDialog(null, "Error: Llenar el stock por agregar.");
//            }else{
//                if (Integer.parseInt(txtAgregarStock.getText()) > 0) {
//                    Producto producto = new Producto();
//                    C_Producto cp = new C_Producto();
//                    int stockActual = Integer.parseInt(txtStockActual.getText());
//                    int stockPorAgregar = Integer.parseInt(txtAgregarStock.getText());
//                    int nuevoStock = stockActual + stockPorAgregar;
//                    producto.setStock(nuevoStock);
//                    if (cp.actualizarStock(producto, codigoProducto)) {
//                        JOptionPane.showMessageDialog(null, "Stock actualizado.");
//                        cbxProductos.setSelectedIndex(0);
//                        cbxProductos.requestFocus();
//                        txtAgregarStock.setText(null);
//                        txtStockActual.setText(null);
//                    }else{
//                        JOptionPane.showMessageDialog(null, "Error al actualizar stock.");
//                    }
//                }
//                else{
//                    JOptionPane.showMessageDialog(null, "Error: La cantidad no puede ser cero.");
//                }
//            }
//        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnActualizar;
    private javax.swing.JComboBox<String> cbxProductos;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JTextField txtAgregarStock;
    private javax.swing.JTextField txtStockActual;
    // End of variables declaration//GEN-END:variables

    void addWindowListener() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
