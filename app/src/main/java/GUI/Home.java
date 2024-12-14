package GUI;

import Services.DialogAlert;
import Entities.Usuario;
import Services.UsuarioService;
import java.awt.Color;
import java.util.List;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.table.DefaultTableModel;

public class Home extends javax.swing.JFrame {

    DefaultTableModel dtmUsuario;
    
    public Home() {
        initComponents();
        // CARGAR tablas cuando estén inicializadas.
        dtmUsuario = (DefaultTableModel) tblUsuarios.getModel();
        initData();
    }
    
    private void initData(){
        recargarTabla();
    }
    
    private void recargarTabla(){
        dtmUsuario.setRowCount(0);
        
        UsuarioService userS = new UsuarioService();
        for(Usuario usuario : userS.listar()){
            String[] userArray = {
                String.valueOf(usuario.getIdUsuario()),
                usuario.getNombre(),
                usuario.getApellido(),
                usuario.getDni(),
                usuario.getEmail()
            };
            dtmUsuario.addRow(userArray);
        }
    }
    
    private void recargarTabla(List<Usuario> usuarios){
        dtmUsuario.setRowCount(0);
        
        for(Usuario usuario : usuarios){
            String[] userArray = {
                String.valueOf(usuario.getIdUsuario()),
                usuario.getNombre(),
                usuario.getApellido(),
                usuario.getDni(),
                usuario.getEmail()
            };
            dtmUsuario.addRow(userArray);
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        popOpciones = new javax.swing.JPopupMenu();
        miRegistrarEntrada = new javax.swing.JMenuItem();
        miRegistrarSalida = new javax.swing.JMenuItem();
        tbpnApp = new javax.swing.JTabbedPane();
        pnlRegistrarAsistencia = new javax.swing.JPanel();
        lblBuscar = new javax.swing.JLabel();
        tfdBuscar = new javax.swing.JTextField();
        btnBuscar = new javax.swing.JButton();
        lblCoincidencias = new javax.swing.JLabel();
        scrollUsuarios = new javax.swing.JScrollPane();
        tblUsuarios = new javax.swing.JTable();
        mnbrOperaciones = new javax.swing.JMenuBar();
        mnUsuario = new javax.swing.JMenu();
        mniUsuarioAdmin = new javax.swing.JMenuItem();

        miRegistrarEntrada.setText("Registrar Entrada");
        miRegistrarEntrada.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miRegistrarEntradaActionPerformed(evt);
            }
        });
        popOpciones.add(miRegistrarEntrada);

        miRegistrarSalida.setText("Registrar Salida");
        miRegistrarSalida.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miRegistrarSalidaActionPerformed(evt);
            }
        });
        popOpciones.add(miRegistrarSalida);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Control de Asistencia");
        setResizable(false);

        tbpnApp.setTabPlacement(javax.swing.JTabbedPane.LEFT);

        lblBuscar.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lblBuscar.setText("BUSCAR A USUARIO PARA EL REGISTRO DE ASISTENCIA");

        tfdBuscar.setForeground(java.awt.Color.gray);
        tfdBuscar.setText("Ingrese nombre de usuario...");
        tfdBuscar.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        tfdBuscar.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                tfdBuscarFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                tfdBuscarFocusLost(evt);
            }
        });
        tfdBuscar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                tfdBuscarKeyTyped(evt);
            }
        });

        btnBuscar.setText("Buscar");
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });

        lblCoincidencias.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        lblCoincidencias.setText("Coincidencias de Búsqueda");

        tblUsuarios.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "COD", "Nombre", "Apellido", "DNI", "Email"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblUsuarios.setColumnSelectionAllowed(true);
        tblUsuarios.setComponentPopupMenu(popOpciones);
        tblUsuarios.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        tblUsuarios.setShowGrid(true);
        scrollUsuarios.setViewportView(tblUsuarios);
        tblUsuarios.getColumnModel().getSelectionModel().setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        if (tblUsuarios.getColumnModel().getColumnCount() > 0) {
            tblUsuarios.getColumnModel().getColumn(0).setMinWidth(50);
            tblUsuarios.getColumnModel().getColumn(0).setMaxWidth(100);
            tblUsuarios.getColumnModel().getColumn(3).setMinWidth(150);
            tblUsuarios.getColumnModel().getColumn(3).setMaxWidth(300);
        }

        javax.swing.GroupLayout pnlRegistrarAsistenciaLayout = new javax.swing.GroupLayout(pnlRegistrarAsistencia);
        pnlRegistrarAsistencia.setLayout(pnlRegistrarAsistenciaLayout);
        pnlRegistrarAsistenciaLayout.setHorizontalGroup(
            pnlRegistrarAsistenciaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlRegistrarAsistenciaLayout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(pnlRegistrarAsistenciaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblBuscar)
                    .addGroup(pnlRegistrarAsistenciaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(pnlRegistrarAsistenciaLayout.createSequentialGroup()
                            .addComponent(tfdBuscar)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(btnBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(lblCoincidencias)
                        .addComponent(scrollUsuarios, javax.swing.GroupLayout.PREFERRED_SIZE, 902, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(24, Short.MAX_VALUE))
        );
        pnlRegistrarAsistenciaLayout.setVerticalGroup(
            pnlRegistrarAsistenciaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlRegistrarAsistenciaLayout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(lblBuscar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pnlRegistrarAsistenciaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tfdBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblCoincidencias)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(scrollUsuarios, javax.swing.GroupLayout.PREFERRED_SIZE, 386, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(22, Short.MAX_VALUE))
        );

        tbpnApp.addTab("Buscar", pnlRegistrarAsistencia);

        mnUsuario.setText("Usuario");

        mniUsuarioAdmin.setText("Rol Admin.");
        mniUsuarioAdmin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mniUsuarioAdminActionPerformed(evt);
            }
        });
        mnUsuario.add(mniUsuarioAdmin);

        mnbrOperaciones.add(mnUsuario);

        setJMenuBar(mnbrOperaciones);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(tbpnApp)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(tbpnApp)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void miRegistrarEntradaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miRegistrarEntradaActionPerformed
        abrirRegistroAsistencia(0);
    }//GEN-LAST:event_miRegistrarEntradaActionPerformed

    private void miRegistrarSalidaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miRegistrarSalidaActionPerformed
        abrirRegistroAsistencia(1);
    }//GEN-LAST:event_miRegistrarSalidaActionPerformed

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
        UsuarioService userS = new UsuarioService();
        String nombreConsulta;

        if (tfdBuscar.getText().equals("Ingrese nombre de usuario...")){
            nombreConsulta = "";
        } else {
            nombreConsulta = tfdBuscar.getText();
        }

        recargarTabla(userS.filtrarNombre(nombreConsulta));
    }//GEN-LAST:event_btnBuscarActionPerformed

    private void tfdBuscarKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tfdBuscarKeyTyped
        // No realizar consulta de menos de 3 caracteres.
        if (tfdBuscar.getText().length() >= 3){
            UsuarioService userS = new UsuarioService();
            recargarTabla(userS.filtrarNombre(tfdBuscar.getText()));
        } else if (tfdBuscar.getText().length() == 0){
            recargarTabla();
        }
    }//GEN-LAST:event_tfdBuscarKeyTyped

    private void tfdBuscarFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_tfdBuscarFocusLost
        if (tfdBuscar.getText().length() == 0){
            tfdBuscar.setText("Ingrese nombre de usuario...");
            tfdBuscar.setForeground(Color.GRAY);
        }
    }//GEN-LAST:event_tfdBuscarFocusLost

    private void tfdBuscarFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_tfdBuscarFocusGained
        if ("Ingrese nombre de usuario...".equals(tfdBuscar.getText())){
            tfdBuscar.setText("");
            tfdBuscar.setForeground(Color.BLACK);
        }
    }//GEN-LAST:event_tfdBuscarFocusGained

    private void mniUsuarioAdminActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mniUsuarioAdminActionPerformed
        // ABRIR ingreso como administrador.
        DIngresarAdministrador ingresarAdmin = new DIngresarAdministrador(this, rootPaneCheckingEnabled);
        ingresarAdmin.setLocationRelativeTo(this);
        ingresarAdmin.setVisible(true);
        // COMPROBAR acceso administrativo.
        if (ingresarAdmin.isAdmin()){
            // AGREGAR panel de consulta de asistencias.
            PConsultarAsistencia consultarAsistencia = new PConsultarAsistencia();
            tbpnApp.addTab("Asistencias", consultarAsistencia);
            
            // AGREGAR menu de Cargo + Opciones.
            JMenu cargoMenu = new JMenu("Cargo");
            JMenuItem cargoAdd = new JMenuItem("Añadir");
            cargoAdd.addActionListener((e) -> {
                abrirRegistroCargo();
            });
            cargoMenu.add(cargoAdd);
            mnbrOperaciones.add(cargoMenu);
            
            // AGREGAR opciones de Usuario + BORRAR el ingreso como Administrador.
            mnUsuario.removeAll();
            JMenuItem usuarioAdd = new JMenuItem("Añadir");
            usuarioAdd.addActionListener((e) -> {
                abrirRegistroUsuario();
            });
            mnUsuario.add(usuarioAdd);
            
            // AGREGAR menu de Turno + Opciones
            JMenu detalleTurnoMenu = new JMenu("Turno");
            JMenuItem detalleTurnoAdd = new JMenuItem("Asignar");
            detalleTurnoAdd.addActionListener((e) -> {
                abrirRegistroDetalleTurno();
            });
            detalleTurnoMenu.add(detalleTurnoAdd);
            mnbrOperaciones.add(detalleTurnoMenu);
        }
    }//GEN-LAST:event_mniUsuarioAdminActionPerformed

    private void abrirRegistroAsistencia(int tipoRegistro){
        if (tblUsuarios.getSelectedRow() != -1){
            // OBTENER ID del Usuario.
            int idRow = tblUsuarios.getSelectedRow();
            int idUsuario = Integer.parseInt(dtmUsuario.getValueAt(idRow, 0).toString());
            // COMPROBAR que el ID tenga posible asistencia para hoy.
            UsuarioService userS = new UsuarioService();
            if (userS.getEntrada(idUsuario) == null) return;
            // ABRIR el Dialog correspondiente.
            DRegistrarAsistencia registrarEntrada = new DRegistrarAsistencia(this, true, idUsuario, tipoRegistro);
            registrarEntrada.setLocationRelativeTo(this);
            registrarEntrada.setVisible(true);
        } else {
            DialogAlert.genericDialog("No hay filas seleccionadas.", "SIN FILAS SELECCIONADAS", 2);
        }
    }
    
    private void abrirRegistroUsuario(){
        DRegistrarUsuario registrarUsuario = new DRegistrarUsuario(this, true);
        registrarUsuario.setLocationRelativeTo(this);
        registrarUsuario.setVisible(true);
    }
    
    private void abrirRegistroCargo(){
        DRegistrarCargo registrarCargo = new DRegistrarCargo();
        registrarCargo.setLocationRelativeTo(this);
        registrarCargo.setVisible(true);
    }
    
    private void abrirRegistroDetalleTurno(){
        DRegistrarDetalleTurno registrarDetalleTurno = new DRegistrarDetalleTurno(this, true);
        registrarDetalleTurno.setLocationRelativeTo(this);
        registrarDetalleTurno.setVisible(true);
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBuscar;
    private javax.swing.JLabel lblBuscar;
    private javax.swing.JLabel lblCoincidencias;
    private javax.swing.JMenuItem miRegistrarEntrada;
    private javax.swing.JMenuItem miRegistrarSalida;
    private javax.swing.JMenu mnUsuario;
    private javax.swing.JMenuBar mnbrOperaciones;
    private javax.swing.JMenuItem mniUsuarioAdmin;
    private javax.swing.JPanel pnlRegistrarAsistencia;
    private javax.swing.JPopupMenu popOpciones;
    private javax.swing.JScrollPane scrollUsuarios;
    private javax.swing.JTable tblUsuarios;
    private javax.swing.JTabbedPane tbpnApp;
    private javax.swing.JTextField tfdBuscar;
    // End of variables declaration//GEN-END:variables
}
