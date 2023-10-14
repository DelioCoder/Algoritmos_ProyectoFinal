package ui;

import algoritmos.clientes.ordenamiento.MetodoQuickSort;
import code.Cliente;
import code.DetalleVenta;
import code.Proveedor;
import Dao.ClienteDao;
import Dao.ProductoDao;
import algoritmos.clientes.busqueda.BusquedaBinaria;
import algoritmos.clientes.busqueda.BusquedaSecuencial;
import algoritmos.clientes.ordenamiento.MetodoSeleccion;
import algoritmos.clientes.ordenamiento.ShellSort;
import algoritmos.productos.ordenamiento.MetodosBusquedaProductos;
import algoritmos.productos.ordenamiento.MetodosOrdenamientoProductos;
import algoritmos.usuarios.linkedList.LUsuario;
import code.Producto;
import code.Usuario;
import java.awt.event.MouseEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class formMenuPrincipal extends javax.swing.JFrame {

    // Variables venta
    DefaultTableModel modeloProv = new DefaultTableModel();
    DefaultTableModel ventaModel = new DefaultTableModel();
    String codigoClienteVenta = "";
    String codigoProductoVenta = "";
    String nombreProductoVenta = "";
    String idVentaSeleccionada = "";
    double precioProductoVenta = 0; // Guarda el precio actual del producto seleccionado
    int stockProductoBBDDVenta = 0; // Guarda el stock actual del producto seleccionado
    // Lista que almacena los productos seleccionados por vender
    ArrayList<DetalleVenta> listaProductos = new ArrayList<>();

    ClienteDao cDao = new ClienteDao();
    ProductoDao pDao = new ProductoDao();
    
    LUsuario listU = new LUsuario();
    
    int IdUser = 0;
    
    public formMenuPrincipal() {
        initComponents();
        abrirPanel(null); 
        
        // Ventana Ventas
        iniciarTablaVentas();
        cargarProductosParaVenta();
        colocarCodigoBoletaVenta();

        // Cargar Historial
        cargarHistorialVentas();

        // Ventana Productos
        cargarTablaProductos(null);
        cargarTotalProductos();

        // Ventana Cliente
        cargarTablaClientes(null);

        // Tabla Usuarios
        cargarTablaUsuarios();

        // Principal Proveedor
        cabeceraProveedor();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Fondo = new javax.swing.JPanel();
        Botones = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        btnVender = new javax.swing.JButton();
        btnHistorial = new javax.swing.JButton();
        btnProductos = new javax.swing.JButton();
        btnClientes = new javax.swing.JButton();
        btnProveedor = new javax.swing.JButton();
        btnUsuarios = new javax.swing.JButton();
        btnCerrarSesion = new javax.swing.JButton();
        jLabel24 = new javax.swing.JLabel();
        Ventanas = new javax.swing.JPanel();
        jPanelVentanaVender = new javax.swing.JPanel();
        jPanel8 = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        jPanel11 = new javax.swing.JPanel();
        jLabel32 = new javax.swing.JLabel();
        jLabel33 = new javax.swing.JLabel();
        jLabel35 = new javax.swing.JLabel();
        cbxBuscarProductoVenta = new javax.swing.JComboBox<>();
        txtCantidadVender = new javax.swing.JTextField();
        txtClienteDNI = new javax.swing.JTextField();
        btnBuscarCliente = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        txtBoleta = new javax.swing.JTextField();
        btnAñadirProducto = new javax.swing.JButton();
        txtClienteDatosVenta = new javax.swing.JTextField();
        jPanel15 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaVenta = new javax.swing.JTable();
        jPanel16 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        txtSubtotal = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        txtIGV = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        txtTotal = new javax.swing.JTextField();
        jPanel17 = new javax.swing.JPanel();
        btnCancelarVenta = new javax.swing.JButton();
        btnGenerarVenta = new javax.swing.JButton();
        jPanelVentanaClientes = new javax.swing.JPanel();
        jPanel9 = new javax.swing.JPanel();
        jLabel15 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        txtNombreRegistroCliente = new javax.swing.JTextField();
        txtApellidoRegistroCliente = new javax.swing.JTextField();
        jLabel18 = new javax.swing.JLabel();
        txtDNIRegistroCliente = new javax.swing.JTextField();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        txtTelefonoRegistroCliente = new javax.swing.JTextField();
        jLabel21 = new javax.swing.JLabel();
        txtDireccionRegistroCliente = new javax.swing.JTextField();
        jLabel22 = new javax.swing.JLabel();
        txtSexoRegistroCliente = new javax.swing.JTextField();
        jLabel23 = new javax.swing.JLabel();
        txtEdadRegistroCliente = new javax.swing.JTextField();
        txtCodigoDeCliente = new javax.swing.JTextField();
        jPanel10 = new javax.swing.JPanel();
        btnAgregarCliente1 = new javax.swing.JLabel();
        jPanel14 = new javax.swing.JPanel();
        lblActualizarCliente = new javax.swing.JLabel();
        jPanel18 = new javax.swing.JPanel();
        lblBorrarBusquedaVentanaCliente = new javax.swing.JLabel();
        jPanel19 = new javax.swing.JPanel();
        lblEliminarCliente = new javax.swing.JLabel();
        jScrollClientes = new javax.swing.JScrollPane();
        tablaClientesVentanaCliente = new javax.swing.JTable();
        jPanel20 = new javax.swing.JPanel();
        txtInput1 = new javax.swing.JTextField();
        jPanel22 = new javax.swing.JPanel();
        lblBuscar1 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jPanel21 = new javax.swing.JPanel();
        jLabel13 = new javax.swing.JLabel();
        jPanel23 = new javax.swing.JPanel();
        lblBuscar2 = new javax.swing.JLabel();
        txtInput2 = new javax.swing.JTextField();
        jPanel24 = new javax.swing.JPanel();
        jLabel14 = new javax.swing.JLabel();
        jPanel32 = new javax.swing.JPanel();
        lblLimpiarTablaCliente = new javax.swing.JLabel();
        jPanel27 = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        jPanel28 = new javax.swing.JPanel();
        lblOrdenarxCodigo = new javax.swing.JLabel();
        jPanel30 = new javax.swing.JPanel();
        lblOrdenarxNombreCliente = new javax.swing.JLabel();
        jPanel31 = new javax.swing.JPanel();
        lblOrdenarxEdadCliente = new javax.swing.JLabel();
        jPanelVentanaHistorial = new javax.swing.JPanel();
        jPanel12 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jPanel13 = new javax.swing.JPanel();
        jScrollPaneHistorial = new javax.swing.JScrollPane();
        tableHistorial = new javax.swing.JTable();
        jScrollDetalleVenta = new javax.swing.JScrollPane();
        tableHistorialDetalle = new javax.swing.JTable();
        jLabel9 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        btnVerDetalle = new javax.swing.JButton();
        jPanelVentanaUsuarios = new javax.swing.JPanel();
        jPanel6 = new javax.swing.JPanel();
        jScrollPaneUsuarios = new javax.swing.JScrollPane();
        tblUsuarios = new javax.swing.JTable();
        jPanel5 = new javax.swing.JPanel();
        btnInsertUser = new javax.swing.JButton();
        btnInsertEndUser = new javax.swing.JButton();
        btnInsertAfterUser = new javax.swing.JButton();
        txtIndex1 = new javax.swing.JTextField();
        jPanel29 = new javax.swing.JPanel();
        btnDeleteUser = new javax.swing.JButton();
        btnDeleteEndUser = new javax.swing.JButton();
        btnDeleteAfterUser = new javax.swing.JButton();
        txtIndex2 = new javax.swing.JTextField();
        btnActualizarUsuario = new javax.swing.JButton();
        jPanel33 = new javax.swing.JPanel();
        jLabel25 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        txtApellido = new javax.swing.JTextField();
        jLabel28 = new javax.swing.JLabel();
        jLabel30 = new javax.swing.JLabel();
        txtUsuario = new javax.swing.JTextField();
        jLabel31 = new javax.swing.JLabel();
        txtContra = new javax.swing.JTextField();
        jLabel34 = new javax.swing.JLabel();
        txtTelefono = new javax.swing.JTextField();
        jLabel36 = new javax.swing.JLabel();
        txtEdad = new javax.swing.JTextField();
        jLabel37 = new javax.swing.JLabel();
        rbtnMasculino = new javax.swing.JRadioButton();
        rbtnFemenino = new javax.swing.JRadioButton();
        btnShow = new javax.swing.JButton();
        JPanelProveedor3 = new javax.swing.JPanel();
        jPanel25 = new javax.swing.JPanel();
        jLabel58 = new javax.swing.JLabel();
        jLabel59 = new javax.swing.JLabel();
        jLabel60 = new javax.swing.JLabel();
        jLabel63 = new javax.swing.JLabel();
        txtCodigoProv = new javax.swing.JTextField();
        txtNombreProv = new javax.swing.JTextField();
        txtTelefonoProv = new javax.swing.JTextField();
        txtEmailProv = new javax.swing.JTextField();
        btnModificarProveedor = new javax.swing.JButton();
        btnEliminarProveedor = new javax.swing.JButton();
        btnListarProveedor = new javax.swing.JButton();
        jPanel26 = new javax.swing.JPanel();
        btnRegistrarIngreso2 = new javax.swing.JButton();
        btnVerProveedores = new javax.swing.JButton();
        btnRegistrarProveedor = new javax.swing.JButton();
        jScrollPane7 = new javax.swing.JScrollPane();
        jTablaProveedor = new javax.swing.JTable();
        jLabel64 = new javax.swing.JLabel();
        jPanelVentanaProductos = new javax.swing.JPanel();
        jScrollPaneProductos = new javax.swing.JScrollPane();
        jTableProductos = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        btnCategoriaProductos = new javax.swing.JButton();
        btnNuevaCategoriaProducto = new javax.swing.JButton();
        jLabel29 = new javax.swing.JLabel();
        txtTotalProductos = new javax.swing.JTextField();
        btnActualizarProducto = new javax.swing.JButton();
        btnRegistrarProducto = new javax.swing.JButton();
        jPanel7 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jPanel34 = new javax.swing.JPanel();
        jLabel38 = new javax.swing.JLabel();
        jLabel39 = new javax.swing.JLabel();
        cbxTipoOrdenamiento = new javax.swing.JComboBox<>();
        btnOrdenar = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel40 = new javax.swing.JLabel();
        cbxTipoBusqueda = new javax.swing.JComboBox<>();
        btnBuscar = new javax.swing.JButton();
        txtBusqueda = new javax.swing.JTextField();
        btnLimpiar = new javax.swing.JButton();
        jSeparator4 = new javax.swing.JSeparator();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        Fondo.setPreferredSize(new java.awt.Dimension(1655, 900));

        Botones.setBackground(new java.awt.Color(34, 33, 33));
        Botones.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel1.setFont(new java.awt.Font("Comic Sans MS", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Sistema");

        jLabel2.setFont(new java.awt.Font("Comic Sans MS", 1, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Vega");

        btnVender.setBackground(new java.awt.Color(51, 51, 51));
        btnVender.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        btnVender.setText("Vender");
        btnVender.setPreferredSize(new java.awt.Dimension(180, 40));
        btnVender.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVenderActionPerformed(evt);
            }
        });

        btnHistorial.setBackground(new java.awt.Color(51, 51, 51));
        btnHistorial.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        btnHistorial.setText("Historial");
        btnHistorial.setPreferredSize(new java.awt.Dimension(180, 40));
        btnHistorial.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHistorialActionPerformed(evt);
            }
        });

        btnProductos.setBackground(new java.awt.Color(51, 51, 51));
        btnProductos.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        btnProductos.setText("Productos");
        btnProductos.setPreferredSize(new java.awt.Dimension(180, 40));
        btnProductos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnProductosActionPerformed(evt);
            }
        });

        btnClientes.setBackground(new java.awt.Color(51, 51, 51));
        btnClientes.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        btnClientes.setText("Clientes");
        btnClientes.setPreferredSize(new java.awt.Dimension(180, 40));
        btnClientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClientesActionPerformed(evt);
            }
        });

        btnProveedor.setBackground(new java.awt.Color(51, 51, 51));
        btnProveedor.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        btnProveedor.setText("Proveedor");
        btnProveedor.setPreferredSize(new java.awt.Dimension(180, 40));
        btnProveedor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnProveedorActionPerformed(evt);
            }
        });

        btnUsuarios.setBackground(new java.awt.Color(51, 51, 51));
        btnUsuarios.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        btnUsuarios.setText("Usuarios");
        btnUsuarios.setPreferredSize(new java.awt.Dimension(180, 40));
        btnUsuarios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUsuariosActionPerformed(evt);
            }
        });

        btnCerrarSesion.setBackground(new java.awt.Color(51, 51, 51));
        btnCerrarSesion.setFont(new java.awt.Font("Times New Roman", 1, 22)); // NOI18N
        btnCerrarSesion.setText("Cerrar Sesión");
        btnCerrarSesion.setPreferredSize(new java.awt.Dimension(180, 40));
        btnCerrarSesion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCerrarSesionActionPerformed(evt);
            }
        });

        jLabel24.setText("jLabel24");

        javax.swing.GroupLayout BotonesLayout = new javax.swing.GroupLayout(Botones);
        Botones.setLayout(BotonesLayout);
        BotonesLayout.setHorizontalGroup(
            BotonesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, BotonesLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(BotonesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addGroup(BotonesLayout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(jLabel2)))
                .addGap(23, 23, 23))
            .addGroup(BotonesLayout.createSequentialGroup()
                .addGroup(BotonesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(BotonesLayout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addGroup(BotonesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btnProveedor, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnUsuarios, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnCerrarSesion, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnClientes, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnHistorial, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(BotonesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(btnProductos, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(btnVender, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(BotonesLayout.createSequentialGroup()
                        .addGap(50, 50, 50)
                        .addComponent(jLabel24)))
                .addContainerGap(14, Short.MAX_VALUE))
        );
        BotonesLayout.setVerticalGroup(
            BotonesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BotonesLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addComponent(btnVender, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnHistorial, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnProductos, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnClientes, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnProveedor, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnUsuarios, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnCerrarSesion, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(98, 98, 98)
                .addComponent(jLabel24)
                .addContainerGap(110, Short.MAX_VALUE))
        );

        Ventanas.setBackground(new java.awt.Color(34, 33, 33));

        jPanel8.setBackground(new java.awt.Color(0, 102, 102));

        jLabel10.setFont(new java.awt.Font("Times New Roman", 1, 48)); // NOI18N
        jLabel10.setText("Facturación");

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel8Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel10)
                .addGap(501, 501, 501))
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(jLabel10)
                .addContainerGap(22, Short.MAX_VALUE))
        );

        jPanel11.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel32.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        jLabel32.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel32.setText("Boleta:");

        jLabel33.setFont(new java.awt.Font("Times New Roman", 0, 28)); // NOI18N
        jLabel33.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel33.setText("Cantidad:");

        jLabel35.setFont(new java.awt.Font("Times New Roman", 0, 28)); // NOI18N
        jLabel35.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel35.setText("Producto:");

        cbxBuscarProductoVenta.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        cbxBuscarProductoVenta.setForeground(new java.awt.Color(255, 255, 255));
        cbxBuscarProductoVenta.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccionar producto:", "Item 2", "Item 3", "Item 4" }));

        txtCantidadVender.setFont(new java.awt.Font("Times New Roman", 0, 20)); // NOI18N

        txtClienteDNI.setFont(new java.awt.Font("Times New Roman", 0, 20)); // NOI18N

        btnBuscarCliente.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        btnBuscarCliente.setText("Buscar");
        btnBuscarCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarClienteActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Times New Roman", 0, 28)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel5.setText("Cliente:");

        txtBoleta.setFont(new java.awt.Font("Times New Roman", 0, 20)); // NOI18N

        btnAñadirProducto.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        btnAñadirProducto.setText("Añadir Producto");
        btnAñadirProducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAñadirProductoActionPerformed(evt);
            }
        });

        txtClienteDatosVenta.setEditable(false);
        txtClienteDatosVenta.setBackground(new java.awt.Color(153, 153, 153));
        txtClienteDatosVenta.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        txtClienteDatosVenta.setForeground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout jPanel11Layout = new javax.swing.GroupLayout(jPanel11);
        jPanel11.setLayout(jPanel11Layout);
        jPanel11Layout.setHorizontalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel11Layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel11Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel35, javax.swing.GroupLayout.DEFAULT_SIZE, 231, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(cbxBuscarProductoVenta, 0, 210, Short.MAX_VALUE)
                    .addComponent(txtClienteDatosVenta))
                .addGap(18, 18, 18)
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel11Layout.createSequentialGroup()
                        .addComponent(jLabel33)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtCantidadVender))
                    .addGroup(jPanel11Layout.createSequentialGroup()
                        .addComponent(txtClienteDNI, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnBuscarCliente)))
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel11Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 555, Short.MAX_VALUE)
                        .addComponent(jLabel32, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtBoleta, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())
                    .addGroup(jPanel11Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(btnAñadirProducto)
                        .addContainerGap(651, Short.MAX_VALUE))))
        );
        jPanel11Layout.setVerticalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel11Layout.createSequentialGroup()
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel11Layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel32)
                            .addComponent(txtClienteDNI, javax.swing.GroupLayout.DEFAULT_SIZE, 36, Short.MAX_VALUE)
                            .addComponent(btnBuscarCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5)
                            .addComponent(txtBoleta, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtClienteDatosVenta, javax.swing.GroupLayout.DEFAULT_SIZE, 36, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 22, Short.MAX_VALUE)
                        .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cbxBuscarProductoVenta, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel35, javax.swing.GroupLayout.Alignment.TRAILING)))
                    .addGroup(jPanel11Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(txtCantidadVender)
                            .addComponent(jLabel33, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnAñadirProducto, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addGap(33, 33, 33))
        );

        jPanel15.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        tablaVenta.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "N°", "Codigo", "Nombre", "Cantidad", "P. Unitario", "Total", "Editar"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tablaVenta.getTableHeader().setReorderingAllowed(false);
        tablaVenta.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tablaVentaMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tablaVenta);
        if (tablaVenta.getColumnModel().getColumnCount() > 0) {
            tablaVenta.getColumnModel().getColumn(0).setResizable(false);
            tablaVenta.getColumnModel().getColumn(1).setResizable(false);
            tablaVenta.getColumnModel().getColumn(2).setResizable(false);
            tablaVenta.getColumnModel().getColumn(3).setResizable(false);
            tablaVenta.getColumnModel().getColumn(4).setResizable(false);
            tablaVenta.getColumnModel().getColumn(5).setResizable(false);
            tablaVenta.getColumnModel().getColumn(6).setResizable(false);
        }

        javax.swing.GroupLayout jPanel15Layout = new javax.swing.GroupLayout(jPanel15);
        jPanel15.setLayout(jPanel15Layout);
        jPanel15Layout.setHorizontalGroup(
            jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1)
        );
        jPanel15Layout.setVerticalGroup(
            jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 586, Short.MAX_VALUE)
        );

        jPanel16.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel6.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        jLabel6.setText("Subtotal:");

        txtSubtotal.setEditable(false);
        txtSubtotal.setBackground(new java.awt.Color(153, 153, 153));
        txtSubtotal.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N

        jLabel7.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        jLabel7.setText("IGV:");

        txtIGV.setEditable(false);
        txtIGV.setBackground(new java.awt.Color(153, 153, 153));
        txtIGV.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N

        jLabel8.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        jLabel8.setText("Total");

        txtTotal.setEditable(false);
        txtTotal.setBackground(new java.awt.Color(153, 153, 153));
        txtTotal.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N

        javax.swing.GroupLayout jPanel16Layout = new javax.swing.GroupLayout(jPanel16);
        jPanel16.setLayout(jPanel16Layout);
        jPanel16Layout.setHorizontalGroup(
            jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel16Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel16Layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtSubtotal, javax.swing.GroupLayout.DEFAULT_SIZE, 167, Short.MAX_VALUE))
                    .addGroup(jPanel16Layout.createSequentialGroup()
                        .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel8)
                            .addComponent(jLabel7))
                        .addGap(41, 41, 41)
                        .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtIGV)
                            .addComponent(txtTotal))))
                .addContainerGap())
        );
        jPanel16Layout.setVerticalGroup(
            jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel16Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtSubtotal)
                    .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtIGV)
                    .addComponent(jLabel7))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtTotal)
                    .addComponent(jLabel8))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel17.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        btnCancelarVenta.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        btnCancelarVenta.setText("Cancelar");
        btnCancelarVenta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarVentaActionPerformed(evt);
            }
        });

        btnGenerarVenta.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        btnGenerarVenta.setText("Generar Venta");
        btnGenerarVenta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGenerarVentaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel17Layout = new javax.swing.GroupLayout(jPanel17);
        jPanel17.setLayout(jPanel17Layout);
        jPanel17Layout.setHorizontalGroup(
            jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel17Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(btnCancelarVenta, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnGenerarVenta, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(36, 36, 36))
        );
        jPanel17Layout.setVerticalGroup(
            jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel17Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(btnGenerarVenta, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnCancelarVenta, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(17, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanelVentanaVenderLayout = new javax.swing.GroupLayout(jPanelVentanaVender);
        jPanelVentanaVender.setLayout(jPanelVentanaVenderLayout);
        jPanelVentanaVenderLayout.setHorizontalGroup(
            jPanelVentanaVenderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanelVentanaVenderLayout.createSequentialGroup()
                .addComponent(jPanel15, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(0, 0, 0)
                .addGroup(jPanelVentanaVenderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel16, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel17, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        jPanelVentanaVenderLayout.setVerticalGroup(
            jPanelVentanaVenderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelVentanaVenderLayout.createSequentialGroup()
                .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jPanel11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanelVentanaVenderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel15, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanelVentanaVenderLayout.createSequentialGroup()
                        .addComponent(jPanel16, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(0, 0, 0)
                        .addComponent(jPanel17, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
        );

        jPanelVentanaClientes.setBackground(new java.awt.Color(102, 102, 102));
        jPanelVentanaClientes.setMaximumSize(new java.awt.Dimension(1440, 820));
        jPanelVentanaClientes.setMinimumSize(new java.awt.Dimension(1440, 820));
        jPanelVentanaClientes.setPreferredSize(new java.awt.Dimension(1440, 820));

        jPanel9.setBackground(new java.awt.Color(102, 102, 102));

        jLabel15.setFont(new java.awt.Font("Comic Sans MS", 1, 48)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(255, 255, 255));
        jLabel15.setText("Clientes");

        jPanel3.setBackground(new java.awt.Color(102, 102, 102));
        jPanel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel16.setFont(new java.awt.Font("Comic Sans MS", 0, 24)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(255, 255, 255));
        jLabel16.setText("Código");

        jLabel17.setFont(new java.awt.Font("Comic Sans MS", 0, 24)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(255, 255, 255));
        jLabel17.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel17.setText("Nombre");

        txtNombreRegistroCliente.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N

        txtApellidoRegistroCliente.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N

        jLabel18.setFont(new java.awt.Font("Comic Sans MS", 0, 24)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(255, 255, 255));
        jLabel18.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel18.setText("Apellido");

        txtDNIRegistroCliente.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N

        jLabel19.setFont(new java.awt.Font("Comic Sans MS", 0, 24)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(255, 255, 255));
        jLabel19.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel19.setText("DNI");

        jLabel20.setFont(new java.awt.Font("Comic Sans MS", 0, 24)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(255, 255, 255));
        jLabel20.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel20.setText("Telefono");

        txtTelefonoRegistroCliente.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N

        jLabel21.setFont(new java.awt.Font("Comic Sans MS", 0, 24)); // NOI18N
        jLabel21.setForeground(new java.awt.Color(255, 255, 255));
        jLabel21.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel21.setText("Direccion");

        txtDireccionRegistroCliente.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N

        jLabel22.setFont(new java.awt.Font("Comic Sans MS", 0, 24)); // NOI18N
        jLabel22.setForeground(new java.awt.Color(255, 255, 255));
        jLabel22.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel22.setText("Sexo");

        txtSexoRegistroCliente.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N

        jLabel23.setFont(new java.awt.Font("Comic Sans MS", 0, 24)); // NOI18N
        jLabel23.setForeground(new java.awt.Color(255, 255, 255));
        jLabel23.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel23.setText("Edad");

        txtEdadRegistroCliente.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N

        txtCodigoDeCliente.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        txtCodigoDeCliente.setEnabled(false);

        jPanel10.setBackground(new java.awt.Color(102, 102, 102));
        jPanel10.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));

        btnAgregarCliente1.setFont(new java.awt.Font("Comic Sans MS", 1, 24)); // NOI18N
        btnAgregarCliente1.setForeground(new java.awt.Color(255, 255, 255));
        btnAgregarCliente1.setText("AGREGAR");
        btnAgregarCliente1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnAgregarCliente1MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel10Layout = new javax.swing.GroupLayout(jPanel10);
        jPanel10.setLayout(jPanel10Layout);
        jPanel10Layout.setHorizontalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel10Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnAgregarCliente1)
                .addGap(98, 98, 98))
        );
        jPanel10Layout.setVerticalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(btnAgregarCliente1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 60, Short.MAX_VALUE)
        );

        jPanel14.setBackground(new java.awt.Color(102, 102, 102));
        jPanel14.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));

        lblActualizarCliente.setFont(new java.awt.Font("Comic Sans MS", 1, 24)); // NOI18N
        lblActualizarCliente.setForeground(new java.awt.Color(255, 255, 255));
        lblActualizarCliente.setText("ACTUALIZAR");
        lblActualizarCliente.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblActualizarClienteMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel14Layout = new javax.swing.GroupLayout(jPanel14);
        jPanel14.setLayout(jPanel14Layout);
        jPanel14Layout.setHorizontalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel14Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblActualizarCliente)
                .addGap(71, 71, 71))
        );
        jPanel14Layout.setVerticalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblActualizarCliente, javax.swing.GroupLayout.DEFAULT_SIZE, 60, Short.MAX_VALUE)
        );

        jPanel18.setBackground(new java.awt.Color(102, 102, 102));
        jPanel18.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));

        lblBorrarBusquedaVentanaCliente.setFont(new java.awt.Font("Comic Sans MS", 1, 24)); // NOI18N
        lblBorrarBusquedaVentanaCliente.setForeground(new java.awt.Color(255, 255, 255));
        lblBorrarBusquedaVentanaCliente.setText("CANCELAR");
        lblBorrarBusquedaVentanaCliente.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblBorrarBusquedaVentanaClienteMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel18Layout = new javax.swing.GroupLayout(jPanel18);
        jPanel18.setLayout(jPanel18Layout);
        jPanel18Layout.setHorizontalGroup(
            jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel18Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblBorrarBusquedaVentanaCliente)
                .addGap(88, 88, 88))
        );
        jPanel18Layout.setVerticalGroup(
            jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel18Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblBorrarBusquedaVentanaCliente)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel19.setBackground(new java.awt.Color(102, 102, 102));
        jPanel19.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));

        lblEliminarCliente.setFont(new java.awt.Font("Comic Sans MS", 1, 24)); // NOI18N
        lblEliminarCliente.setForeground(new java.awt.Color(255, 255, 255));
        lblEliminarCliente.setText("ELIMINAR");
        lblEliminarCliente.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblEliminarClienteMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel19Layout = new javax.swing.GroupLayout(jPanel19);
        jPanel19.setLayout(jPanel19Layout);
        jPanel19Layout.setHorizontalGroup(
            jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel19Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblEliminarCliente)
                .addGap(87, 87, 87))
        );
        jPanel19Layout.setVerticalGroup(
            jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblEliminarCliente, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 60, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel3Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel19, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel3Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel18, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel3Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel14, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel3Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel3Layout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                                .addComponent(jLabel23, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(13, 13, 13)
                                .addComponent(txtEdadRegistroCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                                .addComponent(jLabel22, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(13, 13, 13)
                                .addComponent(txtSexoRegistroCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                                .addComponent(jLabel21, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(13, 13, 13)
                                .addComponent(txtDireccionRegistroCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                                .addComponent(jLabel20, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(13, 13, 13)
                                .addComponent(txtTelefonoRegistroCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(jPanel3Layout.createSequentialGroup()
                                        .addComponent(jLabel19, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(24, 24, 24))
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel3Layout.createSequentialGroup()
                                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(jLabel18, javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel17, javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel16, javax.swing.GroupLayout.Alignment.LEADING))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(txtApellidoRegistroCliente, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)
                                    .addComponent(txtNombreRegistroCliente, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtCodigoDeCliente, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtDNIRegistroCliente))))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel16)
                    .addComponent(txtCodigoDeCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtNombreRegistroCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel17))
                .addGap(21, 21, 21)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtApellidoRegistroCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel18))
                .addGap(21, 21, 21)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtDNIRegistroCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel19))
                .addGap(21, 21, 21)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtTelefonoRegistroCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(jLabel20)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtDireccionRegistroCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(jLabel21)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtSexoRegistroCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(jLabel22)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtEdadRegistroCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(jLabel23)))
                .addGap(26, 26, 26)
                .addComponent(jPanel10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel14, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel19, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel18, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addGap(96, 96, 96)
                .addComponent(jLabel15)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 8, Short.MAX_VALUE))
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel15)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        tablaClientesVentanaCliente.setBackground(new java.awt.Color(204, 204, 204));
        tablaClientesVentanaCliente.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "CODIGO", "NOMBRE", "APELLIDO", "DNI", "TELEFONO", "DIRECCION", "SEXO", "EDAD"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, true, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tablaClientesVentanaCliente.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tablaClientesVentanaClienteMouseClicked(evt);
            }
        });
        jScrollClientes.setViewportView(tablaClientesVentanaCliente);

        jPanel20.setBackground(new java.awt.Color(102, 102, 102));
        jPanel20.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));

        jPanel22.setBackground(new java.awt.Color(102, 102, 102));
        jPanel22.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));

        lblBuscar1.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        lblBuscar1.setForeground(new java.awt.Color(255, 255, 255));
        lblBuscar1.setText("Buscar");
        lblBuscar1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblBuscar1MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel22Layout = new javax.swing.GroupLayout(jPanel22);
        jPanel22.setLayout(jPanel22Layout);
        jPanel22Layout.setHorizontalGroup(
            jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel22Layout.createSequentialGroup()
                .addContainerGap(27, Short.MAX_VALUE)
                .addComponent(lblBuscar1, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(21, 21, 21))
        );
        jPanel22Layout.setVerticalGroup(
            jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblBuscar1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 34, Short.MAX_VALUE)
        );

        jLabel12.setFont(new java.awt.Font("Comic Sans MS", 3, 14)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("Busqueda Secuencial por nombre");

        javax.swing.GroupLayout jPanel20Layout = new javax.swing.GroupLayout(jPanel20);
        jPanel20.setLayout(jPanel20Layout);
        jPanel20Layout.setHorizontalGroup(
            jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel20Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel20Layout.createSequentialGroup()
                        .addComponent(txtInput1, javax.swing.GroupLayout.PREFERRED_SIZE, 352, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel22, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel12))
                .addContainerGap())
        );
        jPanel20Layout.setVerticalGroup(
            jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel20Layout.createSequentialGroup()
                .addComponent(jLabel12)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtInput1, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel22, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(16, Short.MAX_VALUE))
        );

        jPanel21.setBackground(new java.awt.Color(102, 102, 102));
        jPanel21.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));

        jLabel13.setFont(new java.awt.Font("Comic Sans MS", 3, 14)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setText("Busqueda Binaria por código");

        jPanel23.setBackground(new java.awt.Color(102, 102, 102));
        jPanel23.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));

        lblBuscar2.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        lblBuscar2.setForeground(new java.awt.Color(255, 255, 255));
        lblBuscar2.setText("Buscar");
        lblBuscar2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblBuscar2MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel23Layout = new javax.swing.GroupLayout(jPanel23);
        jPanel23.setLayout(jPanel23Layout);
        jPanel23Layout.setHorizontalGroup(
            jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel23Layout.createSequentialGroup()
                .addContainerGap(27, Short.MAX_VALUE)
                .addComponent(lblBuscar2, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(21, 21, 21))
        );
        jPanel23Layout.setVerticalGroup(
            jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblBuscar2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 34, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel21Layout = new javax.swing.GroupLayout(jPanel21);
        jPanel21.setLayout(jPanel21Layout);
        jPanel21Layout.setHorizontalGroup(
            jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel21Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel21Layout.createSequentialGroup()
                        .addComponent(txtInput2, javax.swing.GroupLayout.PREFERRED_SIZE, 352, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel23, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel13))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel21Layout.setVerticalGroup(
            jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel21Layout.createSequentialGroup()
                .addComponent(jLabel13)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtInput2, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel23, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, Short.MAX_VALUE))
        );

        jPanel24.setBackground(new java.awt.Color(102, 102, 102));
        jPanel24.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 2));

        jLabel14.setFont(new java.awt.Font("Comic Sans MS", 3, 18)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setText("Acciones para tabla");

        jPanel32.setBackground(new java.awt.Color(102, 102, 102));
        jPanel32.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 2));

        lblLimpiarTablaCliente.setFont(new java.awt.Font("Comic Sans MS", 1, 36)); // NOI18N
        lblLimpiarTablaCliente.setForeground(new java.awt.Color(255, 255, 255));
        lblLimpiarTablaCliente.setText("Limpiar");
        lblLimpiarTablaCliente.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblLimpiarTablaClienteMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel32Layout = new javax.swing.GroupLayout(jPanel32);
        jPanel32.setLayout(jPanel32Layout);
        jPanel32Layout.setHorizontalGroup(
            jPanel32Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel32Layout.createSequentialGroup()
                .addContainerGap(78, Short.MAX_VALUE)
                .addComponent(lblLimpiarTablaCliente)
                .addGap(72, 72, 72))
        );
        jPanel32Layout.setVerticalGroup(
            jPanel32Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblLimpiarTablaCliente, javax.swing.GroupLayout.DEFAULT_SIZE, 77, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel24Layout = new javax.swing.GroupLayout(jPanel24);
        jPanel24.setLayout(jPanel24Layout);
        jPanel24Layout.setHorizontalGroup(
            jPanel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel24Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel24Layout.createSequentialGroup()
                        .addComponent(jLabel14)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jPanel32, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel24Layout.setVerticalGroup(
            jPanel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel24Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel14)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel32, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel27.setBackground(new java.awt.Color(102, 102, 102));
        jPanel27.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 3));

        jLabel11.setFont(new java.awt.Font("Comic Sans MS", 3, 18)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("Ordenar por:");

        jPanel28.setBackground(new java.awt.Color(102, 102, 102));
        jPanel28.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 2));

        lblOrdenarxCodigo.setFont(new java.awt.Font("Comic Sans MS", 1, 24)); // NOI18N
        lblOrdenarxCodigo.setForeground(new java.awt.Color(255, 255, 255));
        lblOrdenarxCodigo.setText("CÓDIGO");
        lblOrdenarxCodigo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblOrdenarxCodigoMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel28Layout = new javax.swing.GroupLayout(jPanel28);
        jPanel28.setLayout(jPanel28Layout);
        jPanel28Layout.setHorizontalGroup(
            jPanel28Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel28Layout.createSequentialGroup()
                .addContainerGap(57, Short.MAX_VALUE)
                .addComponent(lblOrdenarxCodigo)
                .addGap(54, 54, 54))
        );
        jPanel28Layout.setVerticalGroup(
            jPanel28Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblOrdenarxCodigo, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 68, Short.MAX_VALUE)
        );

        jPanel30.setBackground(new java.awt.Color(102, 102, 102));
        jPanel30.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 2));

        lblOrdenarxNombreCliente.setFont(new java.awt.Font("Comic Sans MS", 1, 24)); // NOI18N
        lblOrdenarxNombreCliente.setForeground(new java.awt.Color(255, 255, 255));
        lblOrdenarxNombreCliente.setText("NOMBRE");
        lblOrdenarxNombreCliente.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblOrdenarxNombreClienteMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel30Layout = new javax.swing.GroupLayout(jPanel30);
        jPanel30.setLayout(jPanel30Layout);
        jPanel30Layout.setHorizontalGroup(
            jPanel30Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel30Layout.createSequentialGroup()
                .addGap(51, 51, 51)
                .addComponent(lblOrdenarxNombreCliente)
                .addContainerGap(56, Short.MAX_VALUE))
        );
        jPanel30Layout.setVerticalGroup(
            jPanel30Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblOrdenarxNombreCliente, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jPanel31.setBackground(new java.awt.Color(102, 102, 102));
        jPanel31.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 2));

        lblOrdenarxEdadCliente.setFont(new java.awt.Font("Comic Sans MS", 1, 24)); // NOI18N
        lblOrdenarxEdadCliente.setForeground(new java.awt.Color(255, 255, 255));
        lblOrdenarxEdadCliente.setText("EDAD");
        lblOrdenarxEdadCliente.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblOrdenarxEdadClienteMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel31Layout = new javax.swing.GroupLayout(jPanel31);
        jPanel31.setLayout(jPanel31Layout);
        jPanel31Layout.setHorizontalGroup(
            jPanel31Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel31Layout.createSequentialGroup()
                .addContainerGap(65, Short.MAX_VALUE)
                .addComponent(lblOrdenarxEdadCliente)
                .addGap(61, 61, 61))
        );
        jPanel31Layout.setVerticalGroup(
            jPanel31Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblOrdenarxEdadCliente, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel27Layout = new javax.swing.GroupLayout(jPanel27);
        jPanel27.setLayout(jPanel27Layout);
        jPanel27Layout.setHorizontalGroup(
            jPanel27Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel27Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel27Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel27Layout.createSequentialGroup()
                        .addComponent(jLabel11)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel27Layout.createSequentialGroup()
                        .addComponent(jPanel28, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(35, 35, 35)
                        .addComponent(jPanel30, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jPanel31, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel27Layout.setVerticalGroup(
            jPanel27Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel27Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel11)
                .addGap(18, 18, 18)
                .addGroup(jPanel27Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel28, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel31, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel30, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanelVentanaClientesLayout = new javax.swing.GroupLayout(jPanelVentanaClientes);
        jPanelVentanaClientes.setLayout(jPanelVentanaClientesLayout);
        jPanelVentanaClientesLayout.setHorizontalGroup(
            jPanelVentanaClientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelVentanaClientesLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanelVentanaClientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelVentanaClientesLayout.createSequentialGroup()
                        .addComponent(jPanel20, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jPanel21, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelVentanaClientesLayout.createSequentialGroup()
                        .addComponent(jPanel27, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jPanel24, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollClientes))
                .addGap(1088, 1088, 1088))
        );
        jPanelVentanaClientesLayout.setVerticalGroup(
            jPanelVentanaClientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelVentanaClientesLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelVentanaClientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel20, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel21, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addComponent(jScrollClientes, javax.swing.GroupLayout.PREFERRED_SIZE, 510, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanelVentanaClientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel27, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel24, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(jPanel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jPanel12.setBackground(new java.awt.Color(36, 121, 121));
        jPanel12.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel4.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Historial de ventas");

        javax.swing.GroupLayout jPanel12Layout = new javax.swing.GroupLayout(jPanel12);
        jPanel12.setLayout(jPanel12Layout);
        jPanel12Layout.setHorizontalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel12Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel4)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel12Layout.setVerticalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel12Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(jLabel4)
                .addContainerGap(30, Short.MAX_VALUE))
        );

        jPanel13.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        tableHistorial.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "N°", "Cliente", "Monto"
            }
        ));
        tableHistorial.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tableHistorialMouseClicked(evt);
            }
        });
        jScrollPaneHistorial.setViewportView(tableHistorial);

        tableHistorialDetalle.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "N° Detalle", "N° Venta", "Cod Producto", "Cantidad", "Importe"
            }
        ));
        jScrollDetalleVenta.setViewportView(tableHistorialDetalle);

        jLabel9.setFont(new java.awt.Font("Times New Roman", 0, 36)); // NOI18N
        jLabel9.setText("Detalle de Venta");

        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        btnVerDetalle.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        btnVerDetalle.setText("Ver");
        btnVerDetalle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVerDetalleActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnVerDetalle, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnVerDetalle, javax.swing.GroupLayout.DEFAULT_SIZE, 88, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel13Layout = new javax.swing.GroupLayout(jPanel13);
        jPanel13.setLayout(jPanel13Layout);
        jPanel13Layout.setHorizontalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel13Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPaneHistorial)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel13Layout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addComponent(jScrollDetalleVenta)
                        .addContainerGap())
                    .addGroup(jPanel13Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 305, Short.MAX_VALUE)
                        .addComponent(jLabel9)
                        .addGap(260, 260, 260))))
        );
        jPanel13Layout.setVerticalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel13Layout.createSequentialGroup()
                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel13Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPaneHistorial, javax.swing.GroupLayout.DEFAULT_SIZE, 617, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel13Layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addComponent(jLabel9)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollDetalleVenta)))
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanelVentanaHistorialLayout = new javax.swing.GroupLayout(jPanelVentanaHistorial);
        jPanelVentanaHistorial.setLayout(jPanelVentanaHistorialLayout);
        jPanelVentanaHistorialLayout.setHorizontalGroup(
            jPanelVentanaHistorialLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelVentanaHistorialLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelVentanaHistorialLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel13, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanelVentanaHistorialLayout.setVerticalGroup(
            jPanelVentanaHistorialLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelVentanaHistorialLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel13, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanelVentanaUsuarios.setPreferredSize(new java.awt.Dimension(1633, 790));

        jPanel6.setBackground(new java.awt.Color(204, 204, 204));

        tblUsuarios.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        tblUsuarios.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Codigo", "Usuario", "Contraseña", "Nombre", "Apellido", "Telefono", "Edad", "Sexo"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblUsuarios.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblUsuariosMouseClicked(evt);
            }
        });
        jScrollPaneUsuarios.setViewportView(tblUsuarios);

        jPanel5.setBackground(new java.awt.Color(255, 255, 255));
        jPanel5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));

        btnInsertUser.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        btnInsertUser.setText("Insertar");
        btnInsertUser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInsertUserActionPerformed(evt);
            }
        });

        btnInsertEndUser.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        btnInsertEndUser.setText("Insertar Final");
        btnInsertEndUser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInsertEndUserActionPerformed(evt);
            }
        });

        btnInsertAfterUser.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        btnInsertAfterUser.setText("Insertar Después de");
        btnInsertAfterUser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInsertAfterUserActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnInsertAfterUser, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnInsertUser, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnInsertEndUser, javax.swing.GroupLayout.DEFAULT_SIZE, 213, Short.MAX_VALUE)
                    .addComponent(txtIndex1))
                .addGap(28, 28, 28))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnInsertUser, javax.swing.GroupLayout.DEFAULT_SIZE, 61, Short.MAX_VALUE)
                    .addComponent(btnInsertEndUser, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnInsertAfterUser, javax.swing.GroupLayout.DEFAULT_SIZE, 62, Short.MAX_VALUE)
                    .addComponent(txtIndex1))
                .addContainerGap())
        );

        jPanel29.setBackground(new java.awt.Color(255, 255, 255));
        jPanel29.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));

        btnDeleteUser.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        btnDeleteUser.setText("Eliminar");
        btnDeleteUser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteUserActionPerformed(evt);
            }
        });

        btnDeleteEndUser.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        btnDeleteEndUser.setText("Eliminar Final");
        btnDeleteEndUser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteEndUserActionPerformed(evt);
            }
        });

        btnDeleteAfterUser.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        btnDeleteAfterUser.setText("Eliminar Después de");
        btnDeleteAfterUser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteAfterUserActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel29Layout = new javax.swing.GroupLayout(jPanel29);
        jPanel29.setLayout(jPanel29Layout);
        jPanel29Layout.setHorizontalGroup(
            jPanel29Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel29Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel29Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(btnDeleteAfterUser, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnDeleteUser, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel29Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnDeleteEndUser, javax.swing.GroupLayout.DEFAULT_SIZE, 181, Short.MAX_VALUE)
                    .addComponent(txtIndex2))
                .addContainerGap())
        );
        jPanel29Layout.setVerticalGroup(
            jPanel29Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel29Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel29Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnDeleteEndUser, javax.swing.GroupLayout.DEFAULT_SIZE, 55, Short.MAX_VALUE)
                    .addComponent(btnDeleteUser, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(jPanel29Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnDeleteAfterUser, javax.swing.GroupLayout.DEFAULT_SIZE, 68, Short.MAX_VALUE)
                    .addComponent(txtIndex2))
                .addContainerGap())
        );

        btnActualizarUsuario.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        btnActualizarUsuario.setText("Actualizar");
        btnActualizarUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnActualizarUsuarioActionPerformed(evt);
            }
        });

        jPanel33.setBackground(new java.awt.Color(255, 255, 255));
        jPanel33.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));

        jLabel25.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel25.setText("Registro");

        jLabel27.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel27.setText("Nombre:");

        jLabel28.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel28.setText("Apellido:");

        jLabel30.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel30.setText("Usuario:");

        jLabel31.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel31.setText("Contraseña:");

        txtContra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtContraActionPerformed(evt);
            }
        });

        jLabel34.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel34.setText("Telefono:");

        jLabel36.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel36.setText("Edad:");

        jLabel37.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel37.setText("Sexo:");

        rbtnMasculino.setText("Masculino");

        rbtnFemenino.setText("Femenino");

        btnShow.setText("Mostrar");
        btnShow.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnShowActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel33Layout = new javax.swing.GroupLayout(jPanel33);
        jPanel33.setLayout(jPanel33Layout);
        jPanel33Layout.setHorizontalGroup(
            jPanel33Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel33Layout.createSequentialGroup()
                .addGroup(jPanel33Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel33Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel33Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtApellido)
                            .addComponent(txtUsuario)
                            .addComponent(txtContra)
                            .addComponent(txtTelefono)
                            .addGroup(jPanel33Layout.createSequentialGroup()
                                .addGroup(jPanel33Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel27)
                                    .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 258, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel28)
                                    .addComponent(jLabel30)
                                    .addComponent(jLabel31)
                                    .addComponent(jLabel34)
                                    .addGroup(jPanel33Layout.createSequentialGroup()
                                        .addGap(22, 22, 22)
                                        .addComponent(rbtnMasculino)
                                        .addGap(42, 42, 42)
                                        .addComponent(rbtnFemenino))
                                    .addComponent(jLabel37)
                                    .addComponent(jLabel36)
                                    .addComponent(txtEdad, javax.swing.GroupLayout.PREFERRED_SIZE, 258, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(0, 0, Short.MAX_VALUE))))
                    .addGroup(jPanel33Layout.createSequentialGroup()
                        .addGap(80, 80, 80)
                        .addComponent(jLabel25)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel33Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(btnShow, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel33Layout.setVerticalGroup(
            jPanel33Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel33Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel25)
                .addGap(38, 38, 38)
                .addComponent(jLabel27)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel28)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtApellido, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel30)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel31)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtContra, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel34)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel36)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtEdad, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel37)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel33Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rbtnMasculino)
                    .addComponent(rbtnFemenino))
                .addGap(18, 18, 18)
                .addComponent(btnShow, javax.swing.GroupLayout.DEFAULT_SIZE, 84, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel33, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jPanel29, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnActualizarUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPaneUsuarios, javax.swing.GroupLayout.PREFERRED_SIZE, 1164, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(217, 217, 217))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addComponent(jScrollPaneUsuarios)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jPanel29, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnActualizarUsuario, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jPanel33, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanelVentanaUsuariosLayout = new javax.swing.GroupLayout(jPanelVentanaUsuarios);
        jPanelVentanaUsuarios.setLayout(jPanelVentanaUsuariosLayout);
        jPanelVentanaUsuariosLayout.setHorizontalGroup(
            jPanelVentanaUsuariosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, 1633, Short.MAX_VALUE)
        );
        jPanelVentanaUsuariosLayout.setVerticalGroup(
            jPanelVentanaUsuariosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelVentanaUsuariosLayout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        JPanelProveedor3.setBackground(new java.awt.Color(51, 51, 51));

        jPanel25.setBackground(new java.awt.Color(255, 255, 255));
        jPanel25.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel25.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel58.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel58.setText("CODIGO:");
        jPanel25.add(jLabel58, new org.netbeans.lib.awtextra.AbsoluteConstraints(37, 7, -1, -1));

        jLabel59.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel59.setText("TELEFONO:");
        jPanel25.add(jLabel59, new org.netbeans.lib.awtextra.AbsoluteConstraints(37, 181, -1, -1));

        jLabel60.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel60.setText("E-MAIL:");
        jPanel25.add(jLabel60, new org.netbeans.lib.awtextra.AbsoluteConstraints(37, 265, -1, -1));

        jLabel63.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel63.setText("NOMBRE:");
        jPanel25.add(jLabel63, new org.netbeans.lib.awtextra.AbsoluteConstraints(37, 91, -1, -1));

        txtCodigoProv.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jPanel25.add(txtCodigoProv, new org.netbeans.lib.awtextra.AbsoluteConstraints(37, 42, 275, -1));

        txtNombreProv.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jPanel25.add(txtNombreProv, new org.netbeans.lib.awtextra.AbsoluteConstraints(37, 132, 275, -1));

        txtTelefonoProv.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jPanel25.add(txtTelefonoProv, new org.netbeans.lib.awtextra.AbsoluteConstraints(37, 222, 275, -1));

        txtEmailProv.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jPanel25.add(txtEmailProv, new org.netbeans.lib.awtextra.AbsoluteConstraints(37, 306, 275, -1));

        btnModificarProveedor.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        btnModificarProveedor.setText("MODIFICAR");
        btnModificarProveedor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModificarProveedorActionPerformed(evt);
            }
        });
        jPanel25.add(btnModificarProveedor, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 380, 144, -1));

        btnEliminarProveedor.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        btnEliminarProveedor.setText("ELIMINAR");
        btnEliminarProveedor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarProveedorActionPerformed(evt);
            }
        });
        jPanel25.add(btnEliminarProveedor, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 380, 125, -1));

        btnListarProveedor.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        btnListarProveedor.setText("LISTA");
        btnListarProveedor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnListarProveedorActionPerformed(evt);
            }
        });
        jPanel25.add(btnListarProveedor, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 430, 140, -1));

        jPanel26.setBackground(new java.awt.Color(255, 255, 255));
        jPanel26.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        btnRegistrarIngreso2.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        btnRegistrarIngreso2.setText("REGISTRAR INGRESO");
        btnRegistrarIngreso2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistrarIngreso2ActionPerformed(evt);
            }
        });

        btnVerProveedores.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        btnVerProveedores.setText("VER INGRESOS");
        btnVerProveedores.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVerProveedoresActionPerformed(evt);
            }
        });

        btnRegistrarProveedor.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        btnRegistrarProveedor.setText("REGISTRAR PROVEEDOR");
        btnRegistrarProveedor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistrarProveedorActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel26Layout = new javax.swing.GroupLayout(jPanel26);
        jPanel26.setLayout(jPanel26Layout);
        jPanel26Layout.setHorizontalGroup(
            jPanel26Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel26Layout.createSequentialGroup()
                .addGroup(jPanel26Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel26Layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addComponent(btnVerProveedores, javax.swing.GroupLayout.PREFERRED_SIZE, 296, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel26Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel26Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnRegistrarIngreso2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 296, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnRegistrarProveedor, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 296, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(22, Short.MAX_VALUE))
        );
        jPanel26Layout.setVerticalGroup(
            jPanel26Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel26Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(btnRegistrarProveedor, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnRegistrarIngreso2, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnVerProveedores, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(12, Short.MAX_VALUE))
        );

        jTablaProveedor.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Codigo", "Nombre", "Telefono", "E-Mail"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTablaProveedor.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTablaProveedorMouseClicked(evt);
            }
        });
        jScrollPane7.setViewportView(jTablaProveedor);

        jLabel64.setFont(new java.awt.Font("Times New Roman", 1, 48)); // NOI18N
        jLabel64.setForeground(new java.awt.Color(255, 255, 255));
        jLabel64.setText("Gestionar Proveedores");

        javax.swing.GroupLayout JPanelProveedor3Layout = new javax.swing.GroupLayout(JPanelProveedor3);
        JPanelProveedor3.setLayout(JPanelProveedor3Layout);
        JPanelProveedor3Layout.setHorizontalGroup(
            JPanelProveedor3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JPanelProveedor3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(JPanelProveedor3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel26, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel25, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGroup(JPanelProveedor3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(JPanelProveedor3Layout.createSequentialGroup()
                        .addGap(263, 263, 263)
                        .addComponent(jLabel64))
                    .addGroup(JPanelProveedor3Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane7, javax.swing.GroupLayout.PREFERRED_SIZE, 936, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        JPanelProveedor3Layout.setVerticalGroup(
            JPanelProveedor3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JPanelProveedor3Layout.createSequentialGroup()
                .addGroup(JPanelProveedor3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(JPanelProveedor3Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel25, javax.swing.GroupLayout.PREFERRED_SIZE, 497, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jPanel26, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(JPanelProveedor3Layout.createSequentialGroup()
                        .addGap(4, 4, 4)
                        .addComponent(jLabel64)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane7, javax.swing.GroupLayout.PREFERRED_SIZE, 674, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(124, Short.MAX_VALUE))
        );

        jPanelVentanaProductos.setBackground(new java.awt.Color(255, 255, 255));
        jPanelVentanaProductos.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanelVentanaProductos.setEnabled(false);

        jTableProductos.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jTableProductos.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jTableProductos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "CODIGO", "NOMBRE", "DESCRIPCION", "PRECIO", "STOCK", "CATEGORIA"
            }
        ));
        jScrollPaneProductos.setViewportView(jTableProductos);

        jPanel1.setBackground(new java.awt.Color(102, 102, 102));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        btnCategoriaProductos.setFont(new java.awt.Font("Times New Roman", 1, 30)); // NOI18N
        btnCategoriaProductos.setText("Categorias");
        btnCategoriaProductos.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnCategoriaProductos.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnCategoriaProductos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCategoriaProductosActionPerformed(evt);
            }
        });

        btnNuevaCategoriaProducto.setFont(new java.awt.Font("Times New Roman", 1, 30)); // NOI18N
        btnNuevaCategoriaProducto.setText("Nueva Categoria");
        btnNuevaCategoriaProducto.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnNuevaCategoriaProducto.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnNuevaCategoriaProducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNuevaCategoriaProductoActionPerformed(evt);
            }
        });

        jLabel29.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        jLabel29.setForeground(new java.awt.Color(255, 255, 255));
        jLabel29.setText("Productos:");

        txtTotalProductos.setEditable(false);
        txtTotalProductos.setBackground(new java.awt.Color(255, 255, 255));
        txtTotalProductos.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N

        btnActualizarProducto.setFont(new java.awt.Font("Times New Roman", 1, 30)); // NOI18N
        btnActualizarProducto.setText("Actualizar");
        btnActualizarProducto.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnActualizarProducto.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnActualizarProducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnActualizarProductoActionPerformed(evt);
            }
        });

        btnRegistrarProducto.setFont(new java.awt.Font("Times New Roman", 1, 30)); // NOI18N
        btnRegistrarProducto.setText("Registrar");
        btnRegistrarProducto.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnRegistrarProducto.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnRegistrarProducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistrarProductoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel29)
                    .addComponent(txtTotalProductos, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(42, 42, 42)
                .addComponent(btnNuevaCategoriaProducto)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnCategoriaProductos, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnRegistrarProducto, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnActualizarProducto, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel29)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtTotalProductos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btnNuevaCategoriaProducto, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnCategoriaProductos, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnRegistrarProducto, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnActualizarProducto, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 10, Short.MAX_VALUE))
        );

        jPanel7.setBackground(new java.awt.Color(80, 80, 80));

        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 48)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Productos");

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel3)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap(15, Short.MAX_VALUE)
                .addComponent(jLabel3)
                .addContainerGap(20, Short.MAX_VALUE))
        );

        jPanel34.setBackground(new java.awt.Color(90, 90, 90));

        jLabel38.setBackground(new java.awt.Color(255, 255, 255));
        jLabel38.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        jLabel38.setForeground(new java.awt.Color(255, 255, 255));
        jLabel38.setText("Ajustes");

        jLabel39.setBackground(new java.awt.Color(255, 255, 255));
        jLabel39.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel39.setForeground(new java.awt.Color(255, 255, 255));
        jLabel39.setText("Ordenamiento");

        cbxTipoOrdenamiento.setBackground(new java.awt.Color(204, 204, 204));
        cbxTipoOrdenamiento.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        cbxTipoOrdenamiento.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccionar tipo", "Código", "Nombre", "Precio", "Stock" }));
        cbxTipoOrdenamiento.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));

        btnOrdenar.setBackground(new java.awt.Color(204, 204, 204));
        btnOrdenar.setFont(new java.awt.Font("Times New Roman", 1, 30)); // NOI18N
        btnOrdenar.setText("Ordenar");
        btnOrdenar.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        btnOrdenar.setBorderPainted(false);
        btnOrdenar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOrdenarActionPerformed(evt);
            }
        });

        jSeparator1.setForeground(new java.awt.Color(255, 255, 255));

        jLabel40.setBackground(new java.awt.Color(255, 255, 255));
        jLabel40.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel40.setForeground(new java.awt.Color(255, 255, 255));
        jLabel40.setText("Busqueda");

        cbxTipoBusqueda.setBackground(new java.awt.Color(204, 204, 204));
        cbxTipoBusqueda.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        cbxTipoBusqueda.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccionar busqueda", "Secuencial", "Binaria" }));
        cbxTipoBusqueda.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));

        btnBuscar.setBackground(new java.awt.Color(204, 204, 204));
        btnBuscar.setFont(new java.awt.Font("Times New Roman", 1, 30)); // NOI18N
        btnBuscar.setText("Buscar");
        btnBuscar.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        btnBuscar.setBorderPainted(false);
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });

        txtBusqueda.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N

        btnLimpiar.setBackground(new java.awt.Color(185, 56, 65));
        btnLimpiar.setFont(new java.awt.Font("Times New Roman", 1, 30)); // NOI18N
        btnLimpiar.setForeground(new java.awt.Color(255, 255, 255));
        btnLimpiar.setText("Limpiar");
        btnLimpiar.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        btnLimpiar.setBorderPainted(false);
        btnLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimpiarActionPerformed(evt);
            }
        });

        jSeparator4.setForeground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout jPanel34Layout = new javax.swing.GroupLayout(jPanel34);
        jPanel34.setLayout(jPanel34Layout);
        jPanel34Layout.setHorizontalGroup(
            jPanel34Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel34Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel34Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel34Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLabel38)
                        .addGap(71, 71, 71))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel34Layout.createSequentialGroup()
                        .addComponent(btnLimpiar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(jPanel34Layout.createSequentialGroup()
                        .addComponent(jLabel39)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel34Layout.createSequentialGroup()
                        .addGroup(jPanel34Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cbxTipoBusqueda, 0, 231, Short.MAX_VALUE)
                            .addComponent(txtBusqueda)
                            .addGroup(jPanel34Layout.createSequentialGroup()
                                .addComponent(jLabel40)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(btnBuscar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel34Layout.createSequentialGroup()
                        .addGroup(jPanel34Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btnOrdenar, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(cbxTipoOrdenamiento, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jSeparator1))
                        .addContainerGap())
                    .addComponent(jSeparator4)))
        );
        jPanel34Layout.setVerticalGroup(
            jPanel34Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel34Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jLabel38)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel39)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cbxTipoOrdenamiento, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnOrdenar, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31)
                .addComponent(jSeparator4, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel40)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(cbxTipoBusqueda, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtBusqueda, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnLimpiar, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(15, 15, 15))
        );

        javax.swing.GroupLayout jPanelVentanaProductosLayout = new javax.swing.GroupLayout(jPanelVentanaProductos);
        jPanelVentanaProductos.setLayout(jPanelVentanaProductosLayout);
        jPanelVentanaProductosLayout.setHorizontalGroup(
            jPanelVentanaProductosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelVentanaProductosLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelVentanaProductosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanelVentanaProductosLayout.createSequentialGroup()
                        .addGroup(jPanelVentanaProductosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jScrollPaneProductos))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel34, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanelVentanaProductosLayout.setVerticalGroup(
            jPanelVentanaProductosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelVentanaProductosLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanelVentanaProductosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanelVentanaProductosLayout.createSequentialGroup()
                        .addComponent(jScrollPaneProductos, javax.swing.GroupLayout.PREFERRED_SIZE, 616, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(jPanel34, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        javax.swing.GroupLayout VentanasLayout = new javax.swing.GroupLayout(Ventanas);
        Ventanas.setLayout(VentanasLayout);
        VentanasLayout.setHorizontalGroup(
            VentanasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(VentanasLayout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(jPanelVentanaVender, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(26, 26, 26))
            .addGroup(VentanasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(VentanasLayout.createSequentialGroup()
                    .addGap(3, 3, 3)
                    .addComponent(jPanelVentanaClientes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap()))
            .addGroup(VentanasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(VentanasLayout.createSequentialGroup()
                    .addGap(50, 50, 50)
                    .addComponent(jPanelVentanaHistorial, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGap(50, 50, 50)))
            .addGroup(VentanasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(VentanasLayout.createSequentialGroup()
                    .addGap(4, 4, 4)
                    .addComponent(jPanelVentanaUsuarios, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGap(5, 5, 5)))
            .addGroup(VentanasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(VentanasLayout.createSequentialGroup()
                    .addGap(11, 11, 11)
                    .addComponent(JPanelProveedor3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGap(11, 11, 11)))
            .addGroup(VentanasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(VentanasLayout.createSequentialGroup()
                    .addGap(172, 172, 172)
                    .addComponent(jPanelVentanaProductos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(172, Short.MAX_VALUE)))
        );
        VentanasLayout.setVerticalGroup(
            VentanasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(VentanasLayout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addComponent(jPanelVentanaVender, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(31, 31, 31))
            .addGroup(VentanasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(VentanasLayout.createSequentialGroup()
                    .addGap(34, 34, 34)
                    .addComponent(jPanelVentanaClientes, javax.swing.GroupLayout.PREFERRED_SIZE, 800, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(24, Short.MAX_VALUE)))
            .addGroup(VentanasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(VentanasLayout.createSequentialGroup()
                    .addGap(25, 25, 25)
                    .addComponent(jPanelVentanaHistorial, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGap(25, 25, 25)))
            .addGroup(VentanasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(VentanasLayout.createSequentialGroup()
                    .addGap(33, 33, 33)
                    .addComponent(jPanelVentanaUsuarios, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(34, Short.MAX_VALUE)))
            .addGroup(VentanasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(VentanasLayout.createSequentialGroup()
                    .addGap(19, 19, 19)
                    .addComponent(JPanelProveedor3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(20, Short.MAX_VALUE)))
            .addGroup(VentanasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(VentanasLayout.createSequentialGroup()
                    .addGap(21, 21, 21)
                    .addComponent(jPanelVentanaProductos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(22, Short.MAX_VALUE)))
        );

        javax.swing.GroupLayout FondoLayout = new javax.swing.GroupLayout(Fondo);
        Fondo.setLayout(FondoLayout);
        FondoLayout.setHorizontalGroup(
            FondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(FondoLayout.createSequentialGroup()
                .addComponent(Botones, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(Ventanas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        FondoLayout.setVerticalGroup(
            FondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Botones, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(Ventanas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Fondo, javax.swing.GroupLayout.DEFAULT_SIZE, 1842, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Fondo, javax.swing.GroupLayout.DEFAULT_SIZE, 903, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnVenderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVenderActionPerformed
        // TODO add your handling code here:
        abrirPanel(jPanelVentanaVender);
    }//GEN-LAST:event_btnVenderActionPerformed

    private void btnHistorialActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHistorialActionPerformed
        // TODO add your handling code here:
        abrirPanel(jPanelVentanaHistorial);
    }//GEN-LAST:event_btnHistorialActionPerformed

    private void btnProductosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnProductosActionPerformed
        // TODO add your handling code here:
        abrirPanel(jPanelVentanaProductos);
    }//GEN-LAST:event_btnProductosActionPerformed

    private void btnClientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClientesActionPerformed
        // TODO add your handling code here:
        abrirPanel(jPanelVentanaClientes);
    }//GEN-LAST:event_btnClientesActionPerformed

    private void btnProveedorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnProveedorActionPerformed
        abrirPanel(JPanelProveedor3);
    }//GEN-LAST:event_btnProveedorActionPerformed

    private void btnUsuariosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUsuariosActionPerformed
        // TODO add your handling code here:
        abrirPanel(jPanelVentanaUsuarios);
    }//GEN-LAST:event_btnUsuariosActionPerformed

    private void btnCerrarSesionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCerrarSesionActionPerformed
        // TODO add your handling code here:
        cerrarSesion();
    }//GEN-LAST:event_btnCerrarSesionActionPerformed

    private void btnGenerarVentaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGenerarVentaActionPerformed
        // TODO add your handling code here:
        registrarVenta();
    }//GEN-LAST:event_btnGenerarVentaActionPerformed

    private void btnCancelarVentaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarVentaActionPerformed
        // TODO add your handling code here:
        cancelarVenta();
    }//GEN-LAST:event_btnCancelarVentaActionPerformed

    private void tablaVentaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablaVentaMouseClicked
        // TODO add your handling code here:
        seleccionarProductoTablaVenta(evt);
    }//GEN-LAST:event_tablaVentaMouseClicked

    private void btnAñadirProductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAñadirProductoActionPerformed
        // TODO add your handling code here:
        agregarProductoParaVenta();
    }//GEN-LAST:event_btnAñadirProductoActionPerformed

    private void btnBuscarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarClienteActionPerformed
        // TODO add your handling code here:
        if (buscarClienteVentas()) {
            cargarClienteVentas();
        } else {
            JOptionPane.showMessageDialog(null, "Cliente no existe en BD.");
            txtClienteDNI.setText(null);
            txtClienteDNI.requestFocus();
        }
    }//GEN-LAST:event_btnBuscarClienteActionPerformed

    private void btnInsertUserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInsertUserActionPerformed
        
        String seleccion = "";
        
        if(rbtnMasculino.isSelected())
        {
            seleccion = "Masculino";
        }else if (rbtnFemenino.isSelected())
        {
            seleccion = "Femenino";
        }else {
            JOptionPane.showMessageDialog(null, "No se selecciono un Genero");
        }
        
        String nombre = txtNombre.getText();
        String apellido = txtApellido.getText();
        String usuario = txtUsuario.getText();
        String clave = txtContra.getText();
        String telefono = txtTelefono.getText();
        String edad = txtEdad.getText();
                
        Usuario nuevo = new Usuario(IdUser, usuario, clave, nombre, apellido, telefono, edad, seleccion);
        
        listU.insertFirst(nuevo);
        
        //listU.showUsuarios();
        
        IdUser++;
        
        showUsuarios();
        
    }//GEN-LAST:event_btnInsertUserActionPerformed

    private void btnActualizarUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActualizarUsuarioActionPerformed
        actualizarUsuario();
        cargarTablaUsuarios();
    }//GEN-LAST:event_btnActualizarUsuarioActionPerformed

    private void tblUsuariosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblUsuariosMouseClicked
        // TODO add your handling code here:
        seleccionarUsuarioDeTabla();
    }//GEN-LAST:event_tblUsuariosMouseClicked

    private void btnVerDetalleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVerDetalleActionPerformed
        // TODO add your handling code here:
        if (idVentaSeleccionada.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Selecciona una venta.");
        } else {
            cargarHistorialDetalleVenta();
        }
    }//GEN-LAST:event_btnVerDetalleActionPerformed

    private void tableHistorialMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableHistorialMouseClicked
        // TODO add your handling code here:
        seleccionarVenta();
    }//GEN-LAST:event_tableHistorialMouseClicked

    private void jTablaProveedorMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTablaProveedorMouseClicked
        // TODO add your handling code here:
        int seleccion = jTablaProveedor.rowAtPoint(evt.getPoint());

        String codigo = String.valueOf(jTablaProveedor.getValueAt(seleccion, 0));
        String nombre = String.valueOf(jTablaProveedor.getValueAt(seleccion, 1));
        String telefono = String.valueOf(jTablaProveedor.getValueAt(seleccion, 2));
        String email = String.valueOf(jTablaProveedor.getValueAt(seleccion, 3));

        txtCodigoProv.setText(codigo + "");
        txtNombreProv.setText(nombre + "");
        txtTelefonoProv.setText(telefono + "");
        txtEmailProv.setText(email + "");
    }//GEN-LAST:event_jTablaProveedorMouseClicked

    private void btnRegistrarProveedorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrarProveedorActionPerformed
        formRegistrarProveedor r = new formRegistrarProveedor();
        r.setVisible(true);
        r.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
    }//GEN-LAST:event_btnRegistrarProveedorActionPerformed

    private void btnVerProveedoresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVerProveedoresActionPerformed
        // TODO add your handling code here:
        formDetalleIngreso dt = new formDetalleIngreso();
        dt.setVisible(true);
        dt.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
    }//GEN-LAST:event_btnVerProveedoresActionPerformed

    private void btnRegistrarIngreso2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrarIngreso2ActionPerformed
        formRegistrarIngreso r = new formRegistrarIngreso();
        r.setVisible(true);
        r.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
    }//GEN-LAST:event_btnRegistrarIngreso2ActionPerformed

    private void btnListarProveedorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnListarProveedorActionPerformed
        // TODO add your handling code here:
        ListarProveedor();
    }//GEN-LAST:event_btnListarProveedorActionPerformed

    private void btnEliminarProveedorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarProveedorActionPerformed
        // TODO add your handling code here:
        eliminarProveedor();
    }//GEN-LAST:event_btnEliminarProveedorActionPerformed

    private void btnModificarProveedorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModificarProveedorActionPerformed
        // TODO add your handling code here:
        modificarProveedor();
    }//GEN-LAST:event_btnModificarProveedorActionPerformed

    private void tablaClientesVentanaClienteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablaClientesVentanaClienteMouseClicked
        // TODO add your handling code here:
        seleccionarClienteDeTabla();
    }//GEN-LAST:event_tablaClientesVentanaClienteMouseClicked

    private void lblBuscar1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblBuscar1MouseClicked
    
        BusquedaSecuencial busqueda = new BusquedaSecuencial();
        
        Cliente clienteEn = busqueda.sequentialSearch(cDao.getClientes(), txtInput1.getText());
        
        cargarTablaClientes(clienteEn);
        
    }//GEN-LAST:event_lblBuscar1MouseClicked

    private void lblBuscar2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblBuscar2MouseClicked
        
        BusquedaBinaria busqueda = new BusquedaBinaria();
        
        int input = Integer.parseInt(txtInput2.getText());
        
        if(txtInput2.getText().isEmpty())
        {
            cargarTablaClientes(null);
        }else{
            Cliente clienteEn = busqueda.binarySearch(cDao.getClientes(), input);

            cargarTablaClientes(clienteEn);
        }
        
        
        
    }//GEN-LAST:event_lblBuscar2MouseClicked

    
    //Ordenar cliente por código
    private void lblOrdenarxCodigoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblOrdenarxCodigoMouseClicked
        // TODO add your handling code here:
        ShellSort ordena = new ShellSort();
        
        ordena.shellSort(cDao.getClientes());
        
        cargarTablaClientes(null);
        
    }//GEN-LAST:event_lblOrdenarxCodigoMouseClicked

    private void lblOrdenarxNombreClienteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblOrdenarxNombreClienteMouseClicked
        // TODO add your handling code here:
        
        MetodoSeleccion ordenar = new MetodoSeleccion();
        
        ordenar.selectionSort(cDao.getClientes());
        
        cargarTablaClientes(null);
    }//GEN-LAST:event_lblOrdenarxNombreClienteMouseClicked

    private void lblOrdenarxEdadClienteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblOrdenarxEdadClienteMouseClicked
        // TODO add your handling code here:
        MetodoQuickSort ordenar = new MetodoQuickSort();
        
        ordenar.quickSort(cDao.getClientes(), 0, cDao.getClientes().size() - 1);
        
        cargarTablaClientes(null);
    }//GEN-LAST:event_lblOrdenarxEdadClienteMouseClicked

    private void lblLimpiarTablaClienteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblLimpiarTablaClienteMouseClicked
        // TODO add your handling code here:
        txtInput1.setText("");
        txtInput2.setText("");
        
        cargarTablaClientes(null);
    }//GEN-LAST:event_lblLimpiarTablaClienteMouseClicked

    private void lblEliminarClienteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblEliminarClienteMouseClicked

        if (txtCodigoDeCliente.getText().isEmpty() == false) {

            Integer codigo = Integer.parseInt(txtCodigoDeCliente.getText());

            cDao.deleteById(codigo);

            JOptionPane.showMessageDialog(null, "Cliente Borrado.");
            cargarTablaClientes(null);
            cancelarBusquedaCliente();

        } else {
            JOptionPane.showMessageDialog(null, "Error");
        }
    }//GEN-LAST:event_lblEliminarClienteMouseClicked

    private void lblBorrarBusquedaVentanaClienteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblBorrarBusquedaVentanaClienteMouseClicked
        // TODO add your handling code here:

        cancelarBusquedaCliente();
        cargarTablaClientes(null);
    }//GEN-LAST:event_lblBorrarBusquedaVentanaClienteMouseClicked

    private void lblActualizarClienteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblActualizarClienteMouseClicked

        actualizarCliente();
        cargarTablaClientes(null);
    }//GEN-LAST:event_lblActualizarClienteMouseClicked

    private void btnAgregarCliente1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAgregarCliente1MouseClicked
        // TODO add your handling code here:
        agregarCliente();
        cargarTablaClientes(null);
    }//GEN-LAST:event_btnAgregarCliente1MouseClicked

    private void txtContraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtContraActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtContraActionPerformed

    private void btnInsertEndUserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInsertEndUserActionPerformed
        
        String seleccion = "";
        
        if(rbtnMasculino.isSelected())
        {
            seleccion = "Masculino";
        }else if (rbtnFemenino.isSelected())
        {
            seleccion = "Femenino";
        }else {
            JOptionPane.showMessageDialog(null, "No se selecciono un Genero");
        }
        
        String nombre = txtNombre.getText();
        String apellido = txtApellido.getText();
        String usuario = txtUsuario.getText();
        String clave = txtContra.getText();
        String telefono = txtTelefono.getText();
        String edad = txtEdad.getText();
                
        Usuario nuevo = new Usuario(IdUser, usuario, clave, nombre, apellido, telefono, edad, seleccion);
        
        listU.insertEnd(nuevo);
        
        IdUser++;
        
        showUsuarios();
        
    }//GEN-LAST:event_btnInsertEndUserActionPerformed

    private void btnInsertAfterUserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInsertAfterUserActionPerformed
        
        String seleccion = "";
        
        if(rbtnMasculino.isSelected())
        {
            seleccion = "Masculino";
        }else if (rbtnFemenino.isSelected())
        {
            seleccion = "Femenino";
        }else {
            JOptionPane.showMessageDialog(null, "No se selecciono un Genero");
        }
        
        String nombre = txtNombre.getText();
        String apellido = txtApellido.getText();
        String usuario = txtUsuario.getText();
        String clave = txtContra.getText();
        String telefono = txtTelefono.getText();
        String edad = txtEdad.getText();
                
        int index = Integer.parseInt(txtIndex1.getText());
        
        Usuario nuevo = new Usuario(IdUser, usuario, clave, nombre, apellido, telefono, edad, seleccion);
        
        listU.insertAfter(index, nuevo);
        
        IdUser++;
        
        showUsuarios();
        
    }//GEN-LAST:event_btnInsertAfterUserActionPerformed

    public void showUsuarios()
    {
        ArrayList<Usuario> datos;
        
        DefaultTableModel model = new DefaultTableModel();
        
        datos = listU.showUsuarios();    
        
        model.addColumn("Código");
        model.addColumn("Nombre");
        model.addColumn("Apellido");
        model.addColumn("Usuario");
        model.addColumn("Cotraseña");
        model.addColumn("Telefono");
        model.addColumn("Edad");
        model.addColumn("Sexo");
        
        tblUsuarios.setModel(model);
        
        for (Usuario dato : datos) {
            model.addRow(new Object[] {
                dato.getCodigo(),
                dato.getNombre(),
                dato.getApellido(),
                dato.getUsuario(),
                dato.getContraseña(),
                dato.getTelefono(),
                dato.getEdad(),
                dato.getSexo()
            });
        }
    }
    
    private void btnShowActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnShowActionPerformed
        
        showUsuarios();
        
    }//GEN-LAST:event_btnShowActionPerformed

    private void btnDeleteUserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteUserActionPerformed
        
        listU.deleteFirst();
        
        JOptionPane.showMessageDialog(null, "Primer elemento eliminado de la lista.");
        
    }//GEN-LAST:event_btnDeleteUserActionPerformed

    private void btnDeleteEndUserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteEndUserActionPerformed
        
        listU.deleteEnd();
        
        JOptionPane.showMessageDialog(null, "Ultimo elemento eliminado de la lista.");
        
    }//GEN-LAST:event_btnDeleteEndUserActionPerformed

    private void btnDeleteAfterUserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteAfterUserActionPerformed
        
        int index = Integer.parseInt(txtIndex2.getText());
        
        listU.deleteUsuario(index);
        
        JOptionPane.showMessageDialog(null, "Elemento eliminado después de la posición: " + index);
        
    }//GEN-LAST:event_btnDeleteAfterUserActionPerformed

    private void btnCategoriaProductosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCategoriaProductosActionPerformed
        // TODO add your handling code here:
        formCategorias categorias = new formCategorias();
        categorias.setVisible(true);
        categorias.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
    }//GEN-LAST:event_btnCategoriaProductosActionPerformed

    private void btnNuevaCategoriaProductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNuevaCategoriaProductoActionPerformed
        // TODO add your handling code here:
        formNuevaCategoria nuevaCategoria = new formNuevaCategoria();
        nuevaCategoria.setVisible(true);
        nuevaCategoria.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
    }//GEN-LAST:event_btnNuevaCategoriaProductoActionPerformed

    private void btnActualizarProductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActualizarProductoActionPerformed
        // TODO add your handling code here:
        formActualizarProducto actualizarProducto = new formActualizarProducto();
        actualizarProducto.setVisible(true);
        actualizarProducto.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosed(WindowEvent e) {
                cargarTablaProductos(null);
            }
        });
    }//GEN-LAST:event_btnActualizarProductoActionPerformed

    private void btnRegistrarProductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrarProductoActionPerformed
        formRegistrarProducto registrarProducto = new formRegistrarProducto();
        registrarProducto.setVisible(true);
        registrarProducto.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        registrarProducto.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosed(WindowEvent e) {
                cargarTablaProductos(null);
            }
        });
    }//GEN-LAST:event_btnRegistrarProductoActionPerformed

    private void ordenarProductos() {
        if (cbxTipoOrdenamiento.getSelectedItem() == "Código") {
            MetodosOrdenamientoProductos.sortBurbujaCodigos(ProductoDao.obtenerProductos());
            cargarTablaProductos(null);
        } else if (cbxTipoOrdenamiento.getSelectedItem() == "Stock") {
            MetodosOrdenamientoProductos.sortBurbujaMejoradoStock(ProductoDao.obtenerProductos());
            cargarTablaProductos(null);
        } else if (cbxTipoOrdenamiento.getSelectedItem() == "Precio") {
            MetodosOrdenamientoProductos.sortMergeSortPrecio(ProductoDao.obtenerProductos());
            cargarTablaProductos(null);
        } else if (cbxTipoOrdenamiento.getSelectedItem() == "Nombre") {
            MetodosOrdenamientoProductos.sortInsercionNombre(ProductoDao.obtenerProductos());
            cargarTablaProductos(null);
        }
    }
    
    private void btnOrdenarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOrdenarActionPerformed
        // TODO add your handling code here:
        ordenarProductos();
    }//GEN-LAST:event_btnOrdenarActionPerformed

    private void buscarProducto() {
        if (txtBusqueda.getText().isBlank()) {
            JOptionPane.showMessageDialog(null, "Ingresar valor.");
            return;
        }
        
        if (cbxTipoBusqueda.getSelectedItem().equals("Secuencial")) {
            Producto p = MetodosBusquedaProductos.busquedaSecuencialNombre(ProductoDao.obtenerProductos(), txtBusqueda.getText());
            cargarTablaProductos(p);
        } else {
            Producto p = MetodosBusquedaProductos.busquedaBinariaCodigo(ProductoDao.obtenerProductos(), Integer.parseInt(txtBusqueda.getText()));
            cargarTablaProductos(p);
        }
    }
    
    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
        // TODO add your handling code here:
        buscarProducto();
    }//GEN-LAST:event_btnBuscarActionPerformed

    private void btnLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpiarActionPerformed
        // TODO add your handling code here:
        MetodosOrdenamientoProductos.sortBurbujaCodigos(ProductoDao.obtenerProductos());
        cargarTablaProductos(null);
    }//GEN-LAST:event_btnLimpiarActionPerformed

    // Permite activar SOLO el panel seleccionado
    private void abrirPanel(JPanel panel) {
        jPanelVentanaVender.setVisible(false);
        jPanelVentanaProductos.setVisible(false);
        jPanelVentanaClientes.setVisible(false);
        jPanelVentanaUsuarios.setVisible(false);
        jPanelVentanaHistorial.setVisible(false);
        JPanelProveedor3.setVisible(false);
        if (panel != null) {
            panel.setVisible(true);
        }
    }

    // <editor-fold defaultstate="collapsed" desc="Ventana Ventas">
    private void iniciarTablaVentas() {
        ventaModel.addColumn("N");
        ventaModel.addColumn("Codigo");
        ventaModel.addColumn("Nombre");
        ventaModel.addColumn("Cantidad");
        ventaModel.addColumn("P. Unitario");
        ventaModel.addColumn("Importe");
        ventaModel.addColumn("Editar");
        tablaVenta.setModel(ventaModel);

        txtSubtotal.setText("0.00");
        txtIGV.setText("0.00");
        txtTotal.setText("0.00");
    }

    private void colocarCodigoBoletaVenta() {
//        C_Ventas cv = new C_Ventas();
//        String boleta = cv.generarCodigo();
//        txtBoleta.setText(boleta);
    }

    // Permite seleccionar una fila de la tabla para eleminar el Producto
    private void seleccionarProductoTablaVenta(MouseEvent evt) {
        System.out.println("Hola venta");
        int fila = tablaVenta.rowAtPoint(evt.getPoint());
        int columna = 0;
        int id = 0;
        if (fila > -1) {
            id = (int) ventaModel.getValueAt(fila, columna);
        }

        int opcion = JOptionPane.showConfirmDialog(null, "¿Desea eliminar el producto?");
        switch (opcion) {
            case 0:
                listaProductos.remove(id - 1);
                agregarProductoATabla();
                calcularImporteVenta();
                break;
            case 1:
                break;
            default:
                throw new AssertionError();
        }
    }

    // Registra una venta con todos los productos de la tabla
    private void registrarVenta() {
//        Venta venta = new Venta();
//        DetalleVenta detalle = new DetalleVenta();
//        C_Ventas cv = new C_Ventas();
//        C_Cliente cc = new C_Cliente();
//
//        if (listaProductos.size() <= 0) {
//            JOptionPane.showMessageDialog(null, "Error: Llenar los campos.");
//        } else {
//            venta.setCodigo(txtBoleta.getText().trim());
//            venta.setCodigoCliente(cc.obtenerCodigoCliente(codigoClienteVenta));
//            venta.setImporte(Double.parseDouble(txtTotal.getText()));
//            // Intentamos registrar la venta en la BBDD
//            if (cv.registrarVenta(venta)) {
//                JOptionPane.showMessageDialog(null, "Venta registrada.");
//                // Registramos cada detalle de venta a la BBDD
//                System.out.println("Tamaño: " + listaProductos.size());
//                for (int i = 0; i < listaProductos.size(); i++) {
//                    detalle.setCodigoVenta(listaProductos.get(i).getCodigoVenta());
//                    detalle.setCodigoDetalleVenta(listaProductos.get(i).getCodigoDetalleVenta());
//                    detalle.setCodigoProducto(listaProductos.get(i).getCodigoProducto());
//                    detalle.setCantidad(listaProductos.get(i).getCantidad());
//                    detalle.setPrecio(listaProductos.get(i).getPrecio());
//                    detalle.setImporte(listaProductos.get(i).getImporte());
//                    if (cv.registrarDetalleVenta(detalle)) {
//                        cargarProductosParaVenta();
//                        txtSubtotal.setText("0.00");
//                        txtIGV.setText("0.00");
//                        txtTotal.setText("0.00");
//                    } else {
//                        JOptionPane.showMessageDialog(null, "Error al registrar detalle de venta.....");
//                    }
//                }
//
//                colocarCodigoBoletaVenta();
//                actualizarProductosPostVenta();
//                cancelarVenta();
//                cargarHistorialVentas();
//
//            } else {
//                JOptionPane.showMessageDialog(null, "Error al registrar venta.");
//            }
//        }
    }

    private void actualizarProductosPostVenta() {
//        try {
//            for (int i = 0; i < listaProductos.size(); i++) {
//                String codProducto = listaProductos.get(i).getCodigoProducto().trim();
//                System.out.println("Codigo postVenta: " + codProducto);
//                int cantidadPorVender = listaProductos.get(i).getCantidad();
//                System.out.println("Cantidad postVenta: " + cantidadPorVender);
//                String query = "select * from Producto where codigo = '" + codProducto + "'";
//                System.out.println("Query postVenta: " + query);
//                int stockActual = 0;
//
//                Connection c = Conexion.Conectar();
//                Statement st = c.createStatement();
//                ResultSet rs = st.executeQuery(query);
//                if (rs.next()) {
//                    stockActual = rs.getInt("stock");
//                }
//
//                Producto producto = new Producto();
//                C_Producto cp = new C_Producto();
//
//                int nuevoStock = stockActual - cantidadPorVender;
//                producto.setStock(nuevoStock);
//                if (cp.actualizarStock(producto, codProducto)) {
//                    System.out.println("Stock Actualizado -> " + i);
//                    cargarTablaProductos();
//                } else {
//                    System.out.println("No se pudo actualizar poo se st venta");
//                }
//
//            }
//        } catch (SQLException e) {
//            System.out.println("SQL Error: No se pudo actualizar el stock post venta.");
//        }

    }

    // Obtiene los datos del producto seleccionado del Cbx
    private void obtenerDatosProductoParaVenta() {
//        String query = "select * from Producto where nombre = '" + cbxBuscarProductoVenta.getSelectedItem() + "'";
//        try {
//            Connection c = Conexion.Conectar();
//            Statement st = c.createStatement();
//            ResultSet rs = st.executeQuery(query);
//            while (rs.next()) {
//                codigoProductoVenta = rs.getString("codigo");
//                nombreProductoVenta = rs.getString("nombre");
//                precioProductoVenta = rs.getDouble("precio");
//                stockProductoBBDDVenta = rs.getInt("stock");
//                System.out.println(codigoProductoVenta);
//                System.out.println(nombreProductoVenta);
//                System.out.println(precioProductoVenta);
//                System.out.println(stockProductoBBDDVenta);
//            }
//        } catch (SQLException e) {
//            System.out.println("Error al obtener datos del producto" + e.getMessage());
//        }
    }

    // Permite obtener los valores de un producto y agregarlo a la tabla
    private void agregarProductoParaVenta() {
//        String productoSeleccionado = cbxBuscarProductoVenta.getSelectedItem().toString();
//        if (productoSeleccionado.equals("Seleccionar producto:")) {
//            JOptionPane.showMessageDialog(null, "Error: Seleccionar un producto válido.");
//        } else if (txtClienteDatosVenta.getText().isEmpty()) {
//            JOptionPane.showMessageDialog(null, "Error: Ingresar Cliente.");
//        } else {
//            if (txtCantidadVender.getText().isEmpty() || Integer.parseInt(txtCantidadVender.getText()) <= 0) {
//                JOptionPane.showMessageDialog(null, "Error: Ingresar cantidad.");
//            } else {
//                int cantidadVenta = Integer.parseInt(txtCantidadVender.getText()) + obtenerCantidadProductoAñadidoEnVenta();
//                obtenerDatosProductoParaVenta();
//                if (stockProductoBBDDVenta >= cantidadVenta) {
//                    double importe = redondear(cantidadVenta * precioProductoVenta);
//                    System.out.println(codigoClienteVenta + codigoProductoVenta.trim() + txtBoleta.getText());
//                    DetalleVenta producto = new DetalleVenta(codigoClienteVenta + codigoProductoVenta.trim() + txtBoleta.getText().trim(),
//                            txtBoleta.getText(),
//                            codigoProductoVenta, nombreProductoVenta, Integer.parseInt(txtCantidadVender.getText()), precioProductoVenta, importe);
//                    listaProductos.add(producto);
//                    agregarProductoATabla();
//                    cargarProductosParaVenta();
//                    calcularImporteVenta();
//
//                    JOptionPane.showMessageDialog(null, "Producto agregado.");
//                    txtCantidadVender.setText(null);
//                } else {
//                    JOptionPane.showMessageDialog(null, "Error: Cantidad supera el stock\nStock restante: "
//                            + (stockProductoBBDDVenta - obtenerCantidadProductoAñadidoEnVenta()));
//                }
//            }
//        }
    }

    // Agrega un producto a la tabla de ventas
    private void agregarProductoATabla() {
        ventaModel.setRowCount(listaProductos.size());
        for (int i = 0; i < listaProductos.size(); i++) {
            ventaModel.setValueAt(i + 1, i, 0);
            ventaModel.setValueAt(listaProductos.get(i).getCodigoProducto(), i, 1);
            ventaModel.setValueAt(listaProductos.get(i).getNombre(), i, 2);
            ventaModel.setValueAt(listaProductos.get(i).getCantidad(), i, 3);
            ventaModel.setValueAt(listaProductos.get(i).getPrecio(), i, 4);
            ventaModel.setValueAt(listaProductos.get(i).getImporte(), i, 5);
            ventaModel.setValueAt("Eliminar", i, 6);
        }
        tablaVenta.setModel(ventaModel);
    }

    // Regresa la cantidad de un producto en la tabla de ventas
    // Nos ayuda a evaluar el no pasarnos del stock
    private int obtenerCantidadProductoAñadidoEnVenta() {
        int cantidadProductoPorVender = 0;
        for (int i = 0; i < tablaVenta.getRowCount(); i++) {
            String codigo = (String) ventaModel.getValueAt(i, 1);
            if (codigoProductoVenta.equals(codigo)) {
                cantidadProductoPorVender += (int) ventaModel.getValueAt(i, 3);

            }
        }
        System.out.println("Total ahora: " + cantidadProductoPorVender);
        return cantidadProductoPorVender;
    }

    // Calcula el importe total de la venta
    private void calcularImporteVenta() {
        double total = 0;
        for (DetalleVenta producto : listaProductos) {
            total += producto.getImporte();
        }

        double IGV = redondear(total * 0.18);
        double importeSubTotal = total - IGV;
        txtSubtotal.setText(String.valueOf(importeSubTotal));
        txtIGV.setText(String.valueOf(IGV));
        txtTotal.setText(String.valueOf(total));

    }

    private boolean buscarClienteVentas() {
//        C_Cliente cliente = new C_Cliente();
//        boolean existe = cliente.existeCliente(txtClienteDNI.getText());
//        return existe;
        return true;
    }

    private void cargarClienteVentas() {
//        C_Cliente cliente = new C_Cliente();
//        String nombre = cliente.obtenerNombreCliente(txtClienteDNI.getText());
//        if (nombre.isEmpty()) {
//            JOptionPane.showMessageDialog(null, "DNI no existe en la BD.");
//        } else {
//            txtClienteDatosVenta.setText(nombre);
//            codigoClienteVenta = txtClienteDNI.getText();
//            txtClienteDNI.setEditable(false);
//            txtClienteDNI.setText(null);
//        }
    }

    // Cargar los productos en el combo box de la ventana Venta
    private void cargarProductosParaVenta() {
//        Connection c = Conexion.Conectar();
//        String query = "select * from Producto";
//        try {
//            Statement st = c.createStatement();
//            ResultSet rs = st.executeQuery(query);
//            cbxBuscarProductoVenta.removeAllItems();
//            cbxBuscarProductoVenta.addItem("Seleccionar producto:");
//            while (rs.next()) {
//                cbxBuscarProductoVenta.addItem(rs.getString("Nombre"));
//            }
//            c.close();
//        } catch (SQLException e) {
//            System.out.println("Error al cargar productos " + e.getMessage());
//        }
    }

    // Reinicia la ventana
    private void cancelarVenta() {
        txtClienteDatosVenta.setText(null);
        txtClienteDNI.setEditable(true);
        txtClienteDNI.requestFocus();
        listaProductos.clear();
        txtSubtotal.setText("0.00");
        txtIGV.setText("0.00");
        txtTotal.setText("0.00");
        agregarProductoATabla();
    }

    // Redondea los montos
    private double redondear(double n) {
        return (Math.round(n) * 100) / 100;
    }

    // </editor-fold> 
    // <editor-fold defaultstate="collapsed" desc="Ventana Historial">
    // Carga en la tabla todas las ventas realizadas
    private void cargarHistorialVentas() {
//        Connection c = Conexion.Conectar();
//        DefaultTableModel model = new DefaultTableModel();
//        String query = "select * from TB_Venta";
//        try {
//            Statement st = c.createStatement();
//            ResultSet rs = st.executeQuery(query);
//            jScrollPaneHistorial.setViewportView(tableHistorial);
//            model.addColumn("N° Boleta");
//            model.addColumn("Monto");
//            model.addColumn("Cliente");
//            tableHistorial.setModel(model);
//            while (rs.next()) {
//                Object[] data = new Object[3];
//
//                for (int i = 0; i < 3; i++) {
//                    data[i] = rs.getObject(i + 1);
//                }
//
//                model.addRow(data);
//            }
//            c.close();
//        } catch (SQLException e) {
//            System.out.println("Error al cargar el historial de ventas.");
//        }
    }

    // Carga en la tabla todos los detalles de la venta seleccionada
    private void cargarHistorialDetalleVenta() {
//        Connection c = Conexion.Conectar();
//        DefaultTableModel model = new DefaultTableModel();
//        String query = "select * from TB_DetalleVenta where codigo_ven = '" + idVentaSeleccionada + "'";
//        try {
//            Statement st = c.createStatement();
//            ResultSet rs = st.executeQuery(query);
//            jScrollDetalleVenta.setViewportView(tableHistorialDetalle);
//            model.addColumn("N° Detalle");
//            model.addColumn("N° Venta");
//            model.addColumn("Cod Producto");
//            model.addColumn("Cantidad");
//            model.addColumn("Importe");
//            tableHistorialDetalle.setModel(model);
//            while (rs.next()) {
//                Object[] data = new Object[5];
//
//                for (int i = 0; i < 5; i++) {
//                    data[i] = rs.getObject(i + 1);
//                }
//
//                model.addRow(data);
//            }
//            c.close();
//        } catch (SQLException e) {
//            System.out.println("Error al cargar el detalle de ventas.");
//        }
    }

    // Obtiene el ID de la venta que estamos tocando en la tabla
    private void seleccionarVenta() {
        int fila = tableHistorial.getSelectedRow();
        idVentaSeleccionada = tableHistorial.getValueAt(fila, 0).toString().trim();
    }

    // </editor-fold> 
    // <editor-fold defaultstate="collapsed" desc="Ventana Productos">
    // Carga los productos de la BBDD a la tabla de Productos
    private void cargarTablaProductos(Producto productoBuscado) {

        DefaultTableModel model = new DefaultTableModel();
        jTableProductos = new JTable(model);
        jScrollPaneProductos.setViewportView(jTableProductos);
        model.addColumn("Código");
        model.addColumn("Nombre");
        model.addColumn("Descripción");
        model.addColumn("Stock");
        model.addColumn("Precio");
        model.addColumn("Categoria");

        ArrayList<Producto> productos = new ArrayList<>();
        if (productoBuscado != null) {
            productos.add(productoBuscado);
        } else {
            productos = pDao.obtenerProductos();
        }

        Object[] data = new Object[6];
        for (int i = 0; i < productos.size(); i++) {
            data[0] = productos.get(i).getCodigo();
            data[1] = productos.get(i).getNombre();
            data[2] = productos.get(i).getDescripcion();
            data[3] = productos.get(i).getStock();
            data[4] = productos.get(i).getPrecio();
            data[5] = productos.get(i).getCategoria();
            model.addRow(data);
        }
        
    }

    private void cargarTotalProductos() {
        int i = 0;
        for (int j = 0; j < jTableProductos.getRowCount(); j++) {
            i++;
        }
        txtTotalProductos.setText(String.valueOf(i));

    }

    // </editor-fold> 
    // <editor-fold defaultstate="collapsed" desc="Ventana Cliente">
    private void agregarCliente() {
        
          Cliente cliente = new Cliente();
        
          //Integer codigoCliente = Integer.parseInt(txtCodigoDeCliente.getText());
          
          cliente.setNombre(txtNombreRegistroCliente.getText());
          cliente.setApellidos(txtApellidoRegistroCliente.getText());
          cliente.setDni(txtDNIRegistroCliente.getText());
          cliente.setTelefono(txtTelefonoRegistroCliente.getText());
          cliente.setDireccion(txtDireccionRegistroCliente.getText());
          cliente.setSexo(txtSexoRegistroCliente.getText());
          cliente.setEdad(Integer.parseInt(txtEdadRegistroCliente.getText()));
          
          cDao.insertarCliente(cliente);
         // Cliente clienteIngresado = cDao.confirmarInsert(codigoCliente);
          
        JOptionPane.showMessageDialog(null, "Cliente registrado correctamente.");
        reiniciarRegistroCliente();
        cargarTablaClientes(null);
    }

    // Crear nuevo cliente en la base
    private void cargarTablaClientes(Cliente clienteBuscado) {
        
        ArrayList<Cliente> datos;
        
        DefaultTableModel model = new DefaultTableModel();
        
        model.addColumn("Codigo");
        model.addColumn("Nombre");
        model.addColumn("Apellido");
        model.addColumn("DNI");
        model.addColumn("Telefono");
        model.addColumn("Direccion");
        model.addColumn("Sexo");
        model.addColumn("Edad");
        
        if(clienteBuscado != null)
        {
            datos = new ArrayList<>();
            datos.add(clienteBuscado);
        }else {
            datos = cDao.getClientes();
        }
        
        tablaClientesVentanaCliente.setModel(model);
        
        for (Cliente cliente : datos) {
            model.addRow(new Object[] {
            cliente.getCodigo(),
            cliente.getNombre(),
            cliente.getApellidos(),
            cliente.getDni(),
            cliente.getTelefono(),
            cliente.getDireccion(),
            cliente.getSexo(),
            cliente.getEdad()
            });
        }
        
    }

    private void seleccionarClienteDeTabla() {
  
        int fila = tablaClientesVentanaCliente.getSelectedRow();
        Integer codigoCliente = Integer.parseInt(tablaClientesVentanaCliente.getValueAt(fila, 0).toString());
        
        Cliente cliente = cDao.getCliente(codigoCliente);
        txtCodigoDeCliente.setText(cliente.getCodigo().toString());
        txtNombreRegistroCliente.setText(cliente.getNombre());
        txtApellidoRegistroCliente.setText(cliente.getApellidos());
        txtDNIRegistroCliente.setText(cliente.getDni());
        txtTelefonoRegistroCliente.setText(cliente.getTelefono());
        txtDireccionRegistroCliente.setText(cliente.getDireccion());
        txtSexoRegistroCliente.setText(cliente.getSexo());
        txtEdadRegistroCliente.setText(Integer.toString(cliente.getEdad()));

    }

    private void actualizarCliente() {
        if (registroEstaVacio()) {
            JOptionPane.showMessageDialog(null, "Error: Llenar los campos.");
        } else {
            if (txtCodigoDeCliente.getText().isEmpty() == false) {
                Cliente cliente = new Cliente();
                
                Integer codigo = Integer.parseInt(txtCodigoDeCliente.getText());
                String nombre = txtNombreRegistroCliente.getText();
                String apellido = txtApellidoRegistroCliente.getText();
                String dni = txtDNIRegistroCliente.getText();
                String telefono = txtTelefonoRegistroCliente.getText();
                String direccion = txtDireccionRegistroCliente.getText();
                String sexo = txtSexoRegistroCliente.getText();
                int edad = Integer.parseInt(txtEdadRegistroCliente.getText());
                
                cliente.setCodigo(codigo);
                cliente.setNombre(nombre);
                cliente.setApellidos(apellido);
                cliente.setDni(dni);
                cliente.setTelefono(telefono);
                cliente.setDireccion(direccion);
                cliente.setSexo(sexo);
                cliente.setEdad(edad);

                cDao.updatecliente(cliente);
                
                JOptionPane.showMessageDialog(null, "Cliente actualizado.");
                cargarTablaClientes(null);
                cancelarBusquedaCliente();

            } else {
                JOptionPane.showMessageDialog(null, "Error");
            }
        }
    }

    private void cancelarBusquedaCliente() {
        reiniciarRegistroCliente();
        txtCodigoDeCliente.requestFocus();
    }

    private boolean registroEstaVacio() {
        return (txtNombreRegistroCliente.getText().trim().isEmpty()
                || txtApellidoRegistroCliente.getText().trim().isEmpty()
                || txtDNIRegistroCliente.getText().trim().isEmpty()
                || txtTelefonoRegistroCliente.getText().trim().isEmpty()
                || txtDireccionRegistroCliente.getText().trim().isEmpty()
                || txtSexoRegistroCliente.getText().trim().isEmpty()
                || txtEdadRegistroCliente.getText().trim().isEmpty());
    }

    // Reinicia la tabla de registro
    private void reiniciarRegistroCliente() {
        txtCodigoDeCliente.setText(null);
        txtNombreRegistroCliente.setText(null);
        txtApellidoRegistroCliente.setText(null);
        txtDNIRegistroCliente.setText(null);
        txtTelefonoRegistroCliente.setText(null);
        txtDireccionRegistroCliente.setText(null);
        txtSexoRegistroCliente.setText(null);
        txtEdadRegistroCliente.setText(null);
    }

    // </editor-fold> 
    // <editor-fold defaultstate="collapsed" desc="Ventana Proveedor">
    //Cabecera principal de la tabla Proveedor
    public void cabeceraProveedor() {
        modeloProv.addColumn("Codigo");
        modeloProv.addColumn("Nombre");
        modeloProv.addColumn("Telefono");
        modeloProv.addColumn("E-mail");

        jTablaProveedor.setModel(modeloProv);
    }

    //<Buttom>Listar; los datos se visualizaran en la tabla
    List<Proveedor> lista;
//    C_Proveedor cp = new C_Proveedor();

    public void ListarProveedor() {
//        modeloProv.getDataVector().removeAllElements();
//        //Limpiara la Tabla
//        jTablaProveedor.updateUI();
//        lista = cp.Listar();
//
//        for (int i = 0; i < lista.size(); i++) {
//            //Creamos un objeto 
//            Object[] lp = {
//                lista.get(i).getCodigo(),
//                lista.get(i).getNombre(),
//                lista.get(i).getTelefono(),
//                lista.get(i).getEmail(),};
//            modeloProv.addRow(lp);
//        }
    }

    //<Buttom>Modificar; permitira realizar cambios y se 
    //guardara en la tabla
    public void modificarProveedor() {
        int Codigo = Integer.parseInt(txtCodigoProv.getText());
        String Nombre = txtNombreProv.getText();
        String Telefono = txtTelefonoProv.getText();
        String Email = txtEmailProv.getText();

        Proveedor pp = new Proveedor();

        pp.setCodigo(Codigo);
        pp.setNombre(Nombre);
        pp.setTelefono(Telefono);
        pp.setEmail(Email);

//        cp.actualizarProveedor(pp, pp.getCodigo());
    }

    //<Buttom>Eliminar; depura la fila seleccionada de la tabla
    //y tambien en BD
    public void eliminarProveedor() {
        String codigo = txtCodigoProv.getText();
//        cp.eliminarProveedor(codigo);
    }

    // </editor-fold> 
    // <editor-fold defaultstate="collapsed" desc="Ventana Usuarios">
    private void seleccionarUsuarioDeTabla() {
//        try {
//            int fila = tblUsuarios.getSelectedRow();
//            String id = tblUsuarios.getValueAt(fila, 0).toString().trim();
//            PreparedStatement ps;
//            ResultSet rs;
//
//            Connection c = Conexion.Conectar();
//            ps = c.prepareStatement("select codigo, usuario, contraseña, telefono from Usuario where codigo=?");
//            ps.setString(1, id);
//            rs = ps.executeQuery();
//
//            while (rs.next()) {
//                // txtUsuarioCodigo.setText(String.valueOf(id));
//                txtUsuarioCodigo.setText(rs.getString("codigo"));
//                txtUsuarioUser.setText(rs.getString("usuario"));
//                txtUsuarioContra.setText(rs.getString("contraseña"));
//                txtUsuarioTelefono.setText(rs.getString("telefono"));
//
//            }
//        } catch (SQLException e) {
//            JOptionPane.showMessageDialog(null, "Error al cargar Usuarios");
//        }
    }

    private void actualizarUsuario() {
//        if (txtUsuarioCodigo.getText().isEmpty() || txtUsuarioUser.getText().isEmpty()
//                || txtUsuarioContra.getText().isEmpty() || txtUsuarioTelefono.getText().isEmpty()) {
//            JOptionPane.showMessageDialog(null, "Error: Llenar el stock por agregar.");
//        } else {
//            if (txtUsuarioCodigo.getText().isEmpty() == false) {
//                Usuario usuario = new Usuario();
//                C_Usuario cu = new C_Usuario();
//
//                String CodigoActual = txtUsuarioCodigo.getText().trim();
//                String UsuarioActual = txtUsuarioUser.getText();
//                String ContraActual = txtUsuarioContra.getText();
//                String TelefonoActual = txtUsuarioTelefono.getText();
//                usuario.setCodigo(CodigoActual);
//                usuario.setUsuario(UsuarioActual);
//                usuario.setContraseña(ContraActual);
//                usuario.setTelefono(TelefonoActual);
//                if (cu.actualizarUsuario(usuario, CodigoActual)) {
//                    JOptionPane.showMessageDialog(null, "Usuario actualizado.");
//
//                    txtUsuarioCodigo.setText(null);
//                    txtUsuarioUser.setText(null);
//                    txtUsuarioContra.setText(null);
//                    txtUsuarioTelefono.setText(null);
//                } else {
//                    JOptionPane.showMessageDialog(null, "Error al actualizar Usuario");
//                }
//            } else {
//                JOptionPane.showMessageDialog(null, "Error");
//            }
//        }
    }

    private void cargarTablaUsuarios() {
//        Connection c = Conexion.Conectar();
//        DefaultTableModel model = new DefaultTableModel();
//        String query = "select * from Usuario";
//        Statement st;
//        try {
//            st = c.createStatement();
//            ResultSet rs = st.executeQuery(query);
//            // tblUsuarios = new JTable(model);
//            jScrollPaneUsuarios.setViewportView(tblUsuarios);
//            model.addColumn("codigo");
//            model.addColumn("nombre");
//            model.addColumn("apellido");
//            model.addColumn("usuario");
//            model.addColumn("contraseña");
//            model.addColumn("telefono");
//            model.addColumn("edad");
//            model.addColumn("sexo");
//            tblUsuarios.setModel(model);
//            while (rs.next()) {
//                Object[] data = new Object[8];
//                for (int i = 0; i < 8; i++) {
//                    data[i] = rs.getObject(i + 1);
//                }
//
//                model.addRow(data);
//            }
//            c.close();
//        } catch (SQLException e) {
//            System.out.println("Error al cargar las categorías.");
//        }
    }

    private void eliminarUsuario() {
//        Usuario usuario = new Usuario();
//        C_Usuario cu = new C_Usuario();
//        String CodigoActualUsuario = txtUsuarioCodigo.getText().trim();
//        usuario.setCodigo(CodigoActualUsuario);
//        while (cu.eliminarUsuario(usuario, CodigoActualUsuario)) {
//            JOptionPane.showMessageDialog(null, "Usuario Eliminado Correctamente");
//        }
    }

    // Limpiar Datos usuario

    // </editor-fold> 
    // <editor-fold defaultstate="collapsed" desc="Extras">
    private void cerrarSesion() {
        formLogin login = new formLogin();
        login.setVisible(true);
        this.dispose();
    }

    // </editor-fold> 
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
            java.util.logging.Logger.getLogger(formMenuPrincipal.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(formMenuPrincipal.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(formMenuPrincipal.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(formMenuPrincipal.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new formMenuPrincipal().setVisible(true);
            }
        });
    }

    // <editor-fold defaultstate="collapsed" desc="Variables">
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Botones;
    private javax.swing.JPanel Fondo;
    private javax.swing.JPanel JPanelProveedor3;
    private javax.swing.JPanel Ventanas;
    private javax.swing.JButton btnActualizarProducto;
    private javax.swing.JButton btnActualizarUsuario;
    private javax.swing.JLabel btnAgregarCliente1;
    private javax.swing.JButton btnAñadirProducto;
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnBuscarCliente;
    private javax.swing.JButton btnCancelarVenta;
    private javax.swing.JButton btnCategoriaProductos;
    private javax.swing.JButton btnCerrarSesion;
    private javax.swing.JButton btnClientes;
    private javax.swing.JButton btnDeleteAfterUser;
    private javax.swing.JButton btnDeleteEndUser;
    private javax.swing.JButton btnDeleteUser;
    private javax.swing.JButton btnEliminarProveedor;
    private javax.swing.JButton btnGenerarVenta;
    private javax.swing.JButton btnHistorial;
    private javax.swing.JButton btnInsertAfterUser;
    private javax.swing.JButton btnInsertEndUser;
    private javax.swing.JButton btnInsertUser;
    private javax.swing.JButton btnLimpiar;
    private javax.swing.JButton btnListarProveedor;
    private javax.swing.JButton btnModificarProveedor;
    private javax.swing.JButton btnNuevaCategoriaProducto;
    private javax.swing.JButton btnOrdenar;
    private javax.swing.JButton btnProductos;
    private javax.swing.JButton btnProveedor;
    private javax.swing.JButton btnRegistrarIngreso2;
    private javax.swing.JButton btnRegistrarProducto;
    private javax.swing.JButton btnRegistrarProveedor;
    private javax.swing.JButton btnShow;
    private javax.swing.JButton btnUsuarios;
    private javax.swing.JButton btnVender;
    private javax.swing.JButton btnVerDetalle;
    private javax.swing.JButton btnVerProveedores;
    private javax.swing.JComboBox<String> cbxBuscarProductoVenta;
    private javax.swing.JComboBox<String> cbxTipoBusqueda;
    private javax.swing.JComboBox<String> cbxTipoOrdenamiento;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel38;
    private javax.swing.JLabel jLabel39;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel40;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel58;
    private javax.swing.JLabel jLabel59;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel60;
    private javax.swing.JLabel jLabel63;
    private javax.swing.JLabel jLabel64;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel13;
    private javax.swing.JPanel jPanel14;
    private javax.swing.JPanel jPanel15;
    private javax.swing.JPanel jPanel16;
    private javax.swing.JPanel jPanel17;
    private javax.swing.JPanel jPanel18;
    private javax.swing.JPanel jPanel19;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel20;
    private javax.swing.JPanel jPanel21;
    private javax.swing.JPanel jPanel22;
    private javax.swing.JPanel jPanel23;
    private javax.swing.JPanel jPanel24;
    private javax.swing.JPanel jPanel25;
    private javax.swing.JPanel jPanel26;
    private javax.swing.JPanel jPanel27;
    private javax.swing.JPanel jPanel28;
    private javax.swing.JPanel jPanel29;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel30;
    private javax.swing.JPanel jPanel31;
    private javax.swing.JPanel jPanel32;
    private javax.swing.JPanel jPanel33;
    private javax.swing.JPanel jPanel34;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JPanel jPanelVentanaClientes;
    private javax.swing.JPanel jPanelVentanaHistorial;
    private javax.swing.JPanel jPanelVentanaProductos;
    private javax.swing.JPanel jPanelVentanaUsuarios;
    private javax.swing.JPanel jPanelVentanaVender;
    private javax.swing.JScrollPane jScrollClientes;
    private javax.swing.JScrollPane jScrollDetalleVenta;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JScrollPane jScrollPaneHistorial;
    private javax.swing.JScrollPane jScrollPaneProductos;
    private javax.swing.JScrollPane jScrollPaneUsuarios;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JTable jTablaProveedor;
    private javax.swing.JTable jTableProductos;
    private javax.swing.JLabel lblActualizarCliente;
    private javax.swing.JLabel lblBorrarBusquedaVentanaCliente;
    private javax.swing.JLabel lblBuscar1;
    private javax.swing.JLabel lblBuscar2;
    private javax.swing.JLabel lblEliminarCliente;
    private javax.swing.JLabel lblLimpiarTablaCliente;
    private javax.swing.JLabel lblOrdenarxCodigo;
    private javax.swing.JLabel lblOrdenarxEdadCliente;
    private javax.swing.JLabel lblOrdenarxNombreCliente;
    private javax.swing.JRadioButton rbtnFemenino;
    private javax.swing.JRadioButton rbtnMasculino;
    private javax.swing.JTable tablaClientesVentanaCliente;
    private javax.swing.JTable tablaVenta;
    private javax.swing.JTable tableHistorial;
    private javax.swing.JTable tableHistorialDetalle;
    private javax.swing.JTable tblUsuarios;
    private javax.swing.JTextField txtApellido;
    private javax.swing.JTextField txtApellidoRegistroCliente;
    private javax.swing.JTextField txtBoleta;
    private javax.swing.JTextField txtBusqueda;
    private javax.swing.JTextField txtCantidadVender;
    private javax.swing.JTextField txtClienteDNI;
    private javax.swing.JTextField txtClienteDatosVenta;
    private javax.swing.JTextField txtCodigoDeCliente;
    private javax.swing.JTextField txtCodigoProv;
    private javax.swing.JTextField txtContra;
    private javax.swing.JTextField txtDNIRegistroCliente;
    private javax.swing.JTextField txtDireccionRegistroCliente;
    private javax.swing.JTextField txtEdad;
    private javax.swing.JTextField txtEdadRegistroCliente;
    private javax.swing.JTextField txtEmailProv;
    private javax.swing.JTextField txtIGV;
    private javax.swing.JTextField txtIndex1;
    private javax.swing.JTextField txtIndex2;
    private javax.swing.JTextField txtInput1;
    private javax.swing.JTextField txtInput2;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtNombreProv;
    private javax.swing.JTextField txtNombreRegistroCliente;
    private javax.swing.JTextField txtSexoRegistroCliente;
    private javax.swing.JTextField txtSubtotal;
    private javax.swing.JTextField txtTelefono;
    private javax.swing.JTextField txtTelefonoProv;
    private javax.swing.JTextField txtTelefonoRegistroCliente;
    private javax.swing.JTextField txtTotal;
    private javax.swing.JTextField txtTotalProductos;
    private javax.swing.JTextField txtUsuario;
    // End of variables declaration//GEN-END:variables

    // </editor-fold> 
}
