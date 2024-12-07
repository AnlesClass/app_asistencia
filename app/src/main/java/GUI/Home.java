package GUI;

import Entities.Usuario;
import Services.UsuarioService;
import java.awt.Color;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import java.util.List;
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
                usuario.getDni()
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
                usuario.getDni()
            };
            dtmUsuario.addRow(userArray);
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        popOpciones = new javax.swing.JPopupMenu();
        miRegistrarEntrada = new javax.swing.JMenuItem();
        miRegistrarSalida = new javax.swing.JMenuItem();
        lblBuscar = new javax.swing.JLabel();
        tfdBuscar = new javax.swing.JTextField();
        btnBuscar = new javax.swing.JButton();
        scrollUsuarios = new javax.swing.JScrollPane();
        tblUsuarios = new javax.swing.JTable();
        lblCoincidencias = new javax.swing.JLabel();
        mnbrOperaciones = new javax.swing.JMenuBar();
        mnUsuario = new javax.swing.JMenu();
        mniAdd = new javax.swing.JMenuItem();
        mnAsistencia = new javax.swing.JMenu();

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

        tblUsuarios.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "COD", "Nombre", "Apellido", "DNI"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblUsuarios.setComponentPopupMenu(popOpciones);
        tblUsuarios.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        tblUsuarios.setShowGrid(true);
        scrollUsuarios.setViewportView(tblUsuarios);
        tblUsuarios.getColumnModel().getSelectionModel().setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        if (tblUsuarios.getColumnModel().getColumnCount() > 0) {
            tblUsuarios.getColumnModel().getColumn(0).setMinWidth(50);
            tblUsuarios.getColumnModel().getColumn(0).setMaxWidth(100);
        }

        lblCoincidencias.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        lblCoincidencias.setText("Coincidencias de Búsqueda");

        mnUsuario.setText("Usuario");

        mniAdd.setText("Crear");
        mniAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mniAddActionPerformed(evt);
            }
        });
        mnUsuario.add(mniAdd);

        mnbrOperaciones.add(mnUsuario);

        mnAsistencia.setText("Asistencia");
        mnbrOperaciones.add(mnAsistencia);

        setJMenuBar(mnbrOperaciones);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblCoincidencias)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(lblBuscar)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(tfdBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 559, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(btnBuscar))
                        .addComponent(scrollUsuarios)))
                .addContainerGap(29, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addComponent(lblBuscar)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(tfdBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnBuscar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(3, 3, 3)))
                .addComponent(lblCoincidencias)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(scrollUsuarios, javax.swing.GroupLayout.PREFERRED_SIZE, 392, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tfdBuscarFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_tfdBuscarFocusGained
        if ("Ingrese nombre de usuario...".equals(tfdBuscar.getText())){
            tfdBuscar.setText("");
            tfdBuscar.setForeground(Color.BLACK);
        }
    }//GEN-LAST:event_tfdBuscarFocusGained

    private void tfdBuscarFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_tfdBuscarFocusLost
        if (tfdBuscar.getText().length() == 0){
            tfdBuscar.setText("Ingrese nombre de usuario...");
            tfdBuscar.setForeground(Color.GRAY);
        }
    }//GEN-LAST:event_tfdBuscarFocusLost

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

    private void miRegistrarEntradaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miRegistrarEntradaActionPerformed
        abrirRegistroAsistencia(0);
    }//GEN-LAST:event_miRegistrarEntradaActionPerformed

    private void tfdBuscarKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tfdBuscarKeyTyped
        // No realizar consulta de menos de 3 caracteres.
        if (tfdBuscar.getText().length() >= 3){
            UsuarioService userS = new UsuarioService();
            recargarTabla(userS.filtrarNombre(tfdBuscar.getText()));
        } else if (tfdBuscar.getText().length() == 0){
            recargarTabla();
        }
    }//GEN-LAST:event_tfdBuscarKeyTyped

    private void miRegistrarSalidaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miRegistrarSalidaActionPerformed
        abrirRegistroAsistencia(1);
    }//GEN-LAST:event_miRegistrarSalidaActionPerformed

    private void mniAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mniAddActionPerformed
        abrirRegistroUsuario();
    }//GEN-LAST:event_mniAddActionPerformed

    private void abrirRegistroAsistencia(int tipoRegistro){
        if (tblUsuarios.getSelectedRow() != -1){
            // OBTENER ID del Usuario.
            int idRow = tblUsuarios.getSelectedRow();
            int idUsuario = Integer.parseInt(dtmUsuario.getValueAt(idRow, 0).toString());
            // COMPROBAR que el ID tenga posible asistencia para hoy.
            UsuarioService userS = new UsuarioService();
            if (userS.getEntrada(idUsuario) == null) return;
            // ABRIR el Dialog correspondiente.
            DRegistroAsistencia registrarEntrada = new DRegistroAsistencia(this, true, idUsuario, tipoRegistro);
            registrarEntrada.setLocationRelativeTo(this);
            registrarEntrada.setVisible(true);
        } else {
            DialogAlert.genericDialog("No hay filas seleccionadas.", "SIN FILAS SELECCIONADAS", 2);
        }
    }
    
    private void abrirRegistroUsuario(){
        DCrearUsuario registrarUsuario = new DCrearUsuario(this, true);
        registrarUsuario.setLocationRelativeTo(this);
        registrarUsuario.setVisible(true);
    }
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBuscar;
    private javax.swing.JLabel lblBuscar;
    private javax.swing.JLabel lblCoincidencias;
    private javax.swing.JMenuItem miRegistrarEntrada;
    private javax.swing.JMenuItem miRegistrarSalida;
    private javax.swing.JMenu mnAsistencia;
    private javax.swing.JMenu mnUsuario;
    private javax.swing.JMenuBar mnbrOperaciones;
    private javax.swing.JMenuItem mniAdd;
    private javax.swing.JPopupMenu popOpciones;
    private javax.swing.JScrollPane scrollUsuarios;
    private javax.swing.JTable tblUsuarios;
    private javax.swing.JTextField tfdBuscar;
    // End of variables declaration//GEN-END:variables
}
