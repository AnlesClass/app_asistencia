package GUI;

import Services.DialogAlert;
import Entities.Usuario;
import Services.UsuarioService;
import java.util.Arrays;
import java.util.HashMap;

public class DIngresarAdministrador extends javax.swing.JDialog {

    HashMap<String, Integer> usuariosMap = new HashMap<>();
    UsuarioService usuarioS = new UsuarioService();
    private boolean Admin = false;

    private void setAdmin(boolean Admin) {
        this.Admin = Admin;
    }

    public boolean isAdmin() {
        return Admin;
    }
    
    public DIngresarAdministrador(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        initData();
    }
    
    private void initData(){
        //CARGAR opciones de usuario.
        cbxUsuarios.removeAllItems();        
        for(Usuario usuario : usuarioS.listarAdmins()){
            String nombreCompleto = usuario.getDni() + " - " + usuario.getNombre() + " " + usuario.getApellido();
            usuariosMap.put(nombreCompleto, usuario.getIdUsuario());
            cbxUsuarios.addItem(nombreCompleto);
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlAdmin = new javax.swing.JPanel();
        lblUsuario = new javax.swing.JLabel();
        cbxUsuarios = new javax.swing.JComboBox<>();
        lblPassword = new javax.swing.JLabel();
        btnIngreso = new javax.swing.JButton();
        tfdPassword = new javax.swing.JPasswordField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Ingresar");

        pnlAdmin.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Administrador", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 20))); // NOI18N

        lblUsuario.setText("Usuario(s)");

        cbxUsuarios.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "<Sin Información>" }));

        lblPassword.setText("Contraseña");

        btnIngreso.setBackground(javax.swing.UIManager.getDefaults().getColor("Button.default.borderColor"));
        btnIngreso.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnIngreso.setForeground(new java.awt.Color(255, 255, 255));
        btnIngreso.setText("Ingresar como Administrador");
        btnIngreso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIngresoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnlAdminLayout = new javax.swing.GroupLayout(pnlAdmin);
        pnlAdmin.setLayout(pnlAdminLayout);
        pnlAdminLayout.setHorizontalGroup(
            pnlAdminLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlAdminLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(pnlAdminLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lblUsuario)
                    .addComponent(lblPassword)
                    .addComponent(cbxUsuarios, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnIngreso, javax.swing.GroupLayout.DEFAULT_SIZE, 208, Short.MAX_VALUE)
                    .addComponent(tfdPassword))
                .addContainerGap(14, Short.MAX_VALUE))
        );
        pnlAdminLayout.setVerticalGroup(
            pnlAdminLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlAdminLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(lblUsuario)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cbxUsuarios, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(lblPassword)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tfdPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addComponent(btnIngreso, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(18, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(pnlAdmin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(12, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(pnlAdmin, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(12, 12, 12))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnIngresoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIngresoActionPerformed
        int usuarioId = usuariosMap.get(cbxUsuarios.getSelectedItem().toString());
        Usuario usuario = usuarioS.leer(usuarioId);
        // DEVOLVER si las contraseñas no coinciden.
        if (!Arrays.equals(tfdPassword.getPassword(), usuario.getContrasenia().toCharArray())){
            DialogAlert.genericDialog("Contraseña no coincide.", "CONTRASEÑA ERRÓNEA", 2);
            return;
        }
        
        // MSG + DEVOLVER con un true.
        setAdmin(true);
        dispose();
    }//GEN-LAST:event_btnIngresoActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnIngreso;
    private javax.swing.JComboBox<String> cbxUsuarios;
    private javax.swing.JLabel lblPassword;
    private javax.swing.JLabel lblUsuario;
    private javax.swing.JPanel pnlAdmin;
    private javax.swing.JPasswordField tfdPassword;
    // End of variables declaration//GEN-END:variables
}
