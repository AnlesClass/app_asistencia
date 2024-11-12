package GUI;

import Entities.Usuario;
import Services.UsuarioService;
import java.time.LocalDate;
import java.time.ZoneId;
import java.util.Date;

public class CreateUsuario extends javax.swing.JPanel {

    public CreateUsuario() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblTitle = new javax.swing.JLabel();
        cbxCargo = new javax.swing.JComboBox<>();
        lblNombre = new javax.swing.JLabel();
        tfdNombre = new javax.swing.JTextField();
        tfdApellido = new javax.swing.JTextField();
        lblApellido = new javax.swing.JLabel();
        lblDni = new javax.swing.JLabel();
        tfdDni = new javax.swing.JTextField();
        tfdCodUsuario = new javax.swing.JTextField();
        lblCodUsuario = new javax.swing.JLabel();
        lblContra = new javax.swing.JLabel();
        tfdpssContra = new javax.swing.JPasswordField();
        lblCargo = new javax.swing.JLabel();
        lblEmail = new javax.swing.JLabel();
        tfdEmail = new javax.swing.JTextField();
        btnAgregar = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();
        spnFechaContra = new javax.swing.JSpinner();
        lblFechaContra = new javax.swing.JLabel();

        lblTitle.setBackground(javax.swing.UIManager.getDefaults().getColor("Button.focusedBorderColor"));
        lblTitle.setFont(new java.awt.Font("Cascadia Code", 1, 18)); // NOI18N
        lblTitle.setForeground(new java.awt.Color(255, 255, 255));
        lblTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTitle.setText("REGISTRO DE NUEVO USUARIO");
        lblTitle.setOpaque(true);

        cbxCargo.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        cbxCargo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "<Denegado>" }));
        cbxCargo.setToolTipText("Seleccione un Cargo");

        lblNombre.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblNombre.setText("Nombre(s)");

        tfdNombre.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        tfdNombre.setToolTipText("Ingresar Nombre");

        tfdApellido.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        tfdApellido.setToolTipText("Ingresar Apellido");

        lblApellido.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblApellido.setText("Apellido(s)");

        lblDni.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblDni.setText("DNI");

        tfdDni.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        tfdDni.setToolTipText("Ingresar DNI");
        tfdDni.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                tfdDniFocusLost(evt);
            }
        });
        tfdDni.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                tfdDniKeyTyped(evt);
            }
        });

        tfdCodUsuario.setEditable(false);
        tfdCodUsuario.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        tfdCodUsuario.setText("<Codigo Autegenerado>");
        tfdCodUsuario.setToolTipText("Su código de Usuario");

        lblCodUsuario.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblCodUsuario.setText("COD-Usuario");

        lblContra.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblContra.setText("Contraseña");

        tfdpssContra.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        tfdpssContra.setToolTipText("Contraseña");
        tfdpssContra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfdpssContraActionPerformed(evt);
            }
        });

        lblCargo.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblCargo.setText("Cargo");

        lblEmail.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblEmail.setText("E-mail");

        tfdEmail.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        tfdEmail.setToolTipText("Ingresar Email");

        btnAgregar.setText("Agregar Usuario");
        btnAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarActionPerformed(evt);
            }
        });

        btnCancelar.setText("Cancelar Registro");

        spnFechaContra.setModel(new javax.swing.SpinnerDateModel(new java.util.Date(), new java.util.Date(), null, java.util.Calendar.DAY_OF_MONTH));

        lblFechaContra.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblFechaContra.setText("Fecha de Contratación");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblNombre)
                                    .addComponent(tfdNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lblDni))
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(tfdDni))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(lblApellido)
                                .addComponent(tfdApellido, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(lblEmail)
                                .addComponent(tfdEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addComponent(btnCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnAgregar, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(lblTitle, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(tfdpssContra, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(lblCargo, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(cbxCargo, javax.swing.GroupLayout.Alignment.LEADING, 0, 180, Short.MAX_VALUE))
                            .addComponent(lblContra))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblFechaContra)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(lblCodUsuario)
                                .addComponent(tfdCodUsuario, javax.swing.GroupLayout.DEFAULT_SIZE, 180, Short.MAX_VALUE)
                                .addComponent(spnFechaContra, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)))))
                .addContainerGap(20, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(lblTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblNombre)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tfdNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblApellido)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tfdApellido, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblDni)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tfdDni, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblEmail)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tfdEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblCargo)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cbxCargo, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblCodUsuario)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tfdCodUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblContra)
                    .addComponent(lblFechaContra))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(spnFechaContra)
                    .addComponent(tfdpssContra, javax.swing.GroupLayout.DEFAULT_SIZE, 36, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnAgregar, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(34, 34, 34))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void tfdpssContraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfdpssContraActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfdpssContraActionPerformed

    private void tfdDniKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tfdDniKeyTyped
        // LIMITAR a 8 caracteres cuando se está escribiendo.
        String text = tfdDni.getText();
        if (text.length() == 8){
            evt.consume();
        } else if (text.length() > 8) {
            tfdDni.setText(text.substring(0,8));
        }
    }//GEN-LAST:event_tfdDniKeyTyped

    private void tfdDniFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_tfdDniFocusLost
        // LIMITAR a 8 caracteres cuando se deja de enfocar.
        String text = tfdDni.getText();
        
        if (text.length() > 8){
            tfdDni.setText(text.substring(0,8));
        }
    }//GEN-LAST:event_tfdDniFocusLost

    private void btnAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarActionPerformed
        // 01. VALIDAR el formulario.
        if (!validarFormulario()) return;
        // 02. CREAR usuario para agregar a la Base de Datos.
        
        Date date = (Date) spnFechaContra.getValue();
        LocalDate fecha = date.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
        
        Usuario user = new Usuario(
            1,
            tfdNombre.getText(),
            tfdApellido.getText(),
            tfdDni.getText(),
            tfdEmail.getText(),
            tfdpssContra.getToolTipText(),
            fecha
        );
        // 03. ENVIAR al usuario a la Base de Datos.
        UsuarioService userS = new UsuarioService();
        userS.agregar(user);
    }//GEN-LAST:event_btnAgregarActionPerformed


    private boolean validarFormulario(){
        return true;
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAgregar;
    private javax.swing.JButton btnCancelar;
    private javax.swing.JComboBox<String> cbxCargo;
    private javax.swing.JLabel lblApellido;
    private javax.swing.JLabel lblCargo;
    private javax.swing.JLabel lblCodUsuario;
    private javax.swing.JLabel lblContra;
    private javax.swing.JLabel lblDni;
    private javax.swing.JLabel lblEmail;
    private javax.swing.JLabel lblFechaContra;
    private javax.swing.JLabel lblNombre;
    private javax.swing.JLabel lblTitle;
    private javax.swing.JSpinner spnFechaContra;
    private javax.swing.JTextField tfdApellido;
    private javax.swing.JTextField tfdCodUsuario;
    private javax.swing.JTextField tfdDni;
    private javax.swing.JTextField tfdEmail;
    private javax.swing.JTextField tfdNombre;
    private javax.swing.JPasswordField tfdpssContra;
    // End of variables declaration//GEN-END:variables
}
