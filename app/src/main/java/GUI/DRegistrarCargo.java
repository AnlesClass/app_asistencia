package GUI;

import Entities.Cargo;
import Services.CargoService;
import java.awt.Color;

public class DRegistrarCargo extends javax.swing.JFrame {

    CargoService cargoService = new CargoService();
    int isAdminValue = 0;

    public DRegistrarCargo() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        textNombreCargo = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        textoDescripcionCargo = new javax.swing.JTextField();
        opcionCorriente = new javax.swing.JRadioButton();
        opcionAdministrativo = new javax.swing.JRadioButton();
        botonRegistrarCargo = new javax.swing.JButton();
        botonCancelarRegistro = new javax.swing.JButton();
        textoAlertaNombre = new javax.swing.JLabel();
        textoAlertaDescripcion = new javax.swing.JLabel();
        textAceptacionCargo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel1.setBackground(new java.awt.Color(255, 204, 204));
        jLabel1.setFont(new java.awt.Font("Cascadia Code", 1, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("REGISTRO NUEVO CARGO");

        jLabel2.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLabel2.setText("Nombre  del cargo");

        jLabel3.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLabel3.setText("Descripción");

        opcionCorriente.setSelected(true);
        opcionCorriente.setText("Corriente");
        opcionCorriente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                opcionCorrienteActionPerformed(evt);
            }
        });

        opcionAdministrativo.setText("Administrativo");
        opcionAdministrativo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                opcionAdministrativoActionPerformed(evt);
            }
        });

        botonRegistrarCargo.setText("Registrar Cargo");
        botonRegistrarCargo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonRegistrarCargoActionPerformed(evt);
            }
        });

        botonCancelarRegistro.setText("Cancelar Registro");
        botonCancelarRegistro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonCancelarRegistroActionPerformed(evt);
            }
        });

        textoAlertaNombre.setForeground(new java.awt.Color(255, 0, 0));

        textoAlertaDescripcion.setForeground(new java.awt.Color(255, 0, 0));

        textAceptacionCargo.setForeground(new java.awt.Color(0, 153, 0));
        textAceptacionCargo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 389, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(opcionAdministrativo, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(opcionCorriente, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(botonCancelarRegistro, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 45, Short.MAX_VALUE)
                                .addComponent(botonRegistrarCargo, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(textNombreCargo)
                            .addComponent(textoDescripcionCargo)
                            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(textoAlertaNombre, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(textoAlertaDescripcion, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(textAceptacionCargo, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap(24, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(textNombreCargo, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(textoAlertaNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 13, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(textoDescripcionCargo, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(textoAlertaDescripcion, javax.swing.GroupLayout.DEFAULT_SIZE, 16, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(opcionCorriente)
                    .addComponent(opcionAdministrativo))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(botonCancelarRegistro, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(botonRegistrarCargo, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(textAceptacionCargo, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botonCancelarRegistroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonCancelarRegistroActionPerformed
        dispose();
    }//GEN-LAST:event_botonCancelarRegistroActionPerformed

    private void botonRegistrarCargoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonRegistrarCargoActionPerformed
        String nombre = textNombreCargo.getText().trim();
    String descripcion = textoDescripcionCargo.getText().trim();

    boolean esValido = true;

    if (nombre.isEmpty()) {
        textoAlertaNombre.setText("Agregar Nombre");
        esValido = false;
    } else {
        textoAlertaNombre.setText(""); 
    }

    if (descripcion.isEmpty()) {
        textoAlertaDescripcion.setText("Agregar Descripción");
        esValido = false;
    } else {
        textoAlertaDescripcion.setText(""); 
    }

    if (esValido && cargoService.existeCargo(nombre, descripcion)) {
        textAceptacionCargo.setForeground(Color.red);
        textAceptacionCargo.setText("El cargo ya existe. Intenta con otro nombre o descripción.");
        return; 
    }
    if (esValido) {
        Cargo cargo = new Cargo(nombre, descripcion, isAdminValue);
        cargoService.agregar(cargo);
        textNombreCargo.setText("");
        textoDescripcionCargo.setText("");
        }
    }//GEN-LAST:event_botonRegistrarCargoActionPerformed

    private void opcionCorrienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_opcionCorrienteActionPerformed
        isAdminValue = 0;
        opcionAdministrativo.setSelected(false);
    }//GEN-LAST:event_opcionCorrienteActionPerformed

    private void opcionAdministrativoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_opcionAdministrativoActionPerformed
        isAdminValue = 1;
        opcionCorriente.setSelected(false);
    }//GEN-LAST:event_opcionAdministrativoActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonCancelarRegistro;
    private javax.swing.JButton botonRegistrarCargo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JRadioButton opcionAdministrativo;
    private javax.swing.JRadioButton opcionCorriente;
    private javax.swing.JLabel textAceptacionCargo;
    private javax.swing.JTextField textNombreCargo;
    private javax.swing.JLabel textoAlertaDescripcion;
    private javax.swing.JLabel textoAlertaNombre;
    private javax.swing.JTextField textoDescripcionCargo;
    // End of variables declaration//GEN-END:variables
}
