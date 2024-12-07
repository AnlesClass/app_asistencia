package GUI;

import Entities.Usuario;
import Services.AsistenciaService;
import Services.UsuarioService;
import java.text.SimpleDateFormat;
import java.util.List;
import javax.swing.table.DefaultTableModel;

public class ConsultaAsistencia extends javax.swing.JFrame {

    public ConsultaAsistencia() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jSpinField1 = new com.toedter.components.JSpinField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaAsistencia = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tablaInformacionUsuario = new javax.swing.JTable();
        buttonBuscar = new javax.swing.JButton();
        dataAsistenciaFinal = new com.toedter.calendar.JDateChooser();
        dataAsistenciaInicio = new com.toedter.calendar.JDateChooser();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        textoAlerta = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        comboBoxEstados = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        tablaAsistencia.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Fecha", "Estado de Asistencia "
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tablaAsistencia);
        if (tablaAsistencia.getColumnModel().getColumnCount() > 0) {
            tablaAsistencia.getColumnModel().getColumn(0).setResizable(false);
            tablaAsistencia.getColumnModel().getColumn(1).setResizable(false);
            tablaAsistencia.getColumnModel().getColumn(2).setResizable(false);
        }

        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel1.setForeground(new java.awt.Color(204, 204, 255));

        tablaInformacionUsuario.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "id", "nombre", "apellido", "total asistencia"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(tablaInformacionUsuario);
        if (tablaInformacionUsuario.getColumnModel().getColumnCount() > 0) {
            tablaInformacionUsuario.getColumnModel().getColumn(0).setResizable(false);
            tablaInformacionUsuario.getColumnModel().getColumn(0).setPreferredWidth(10);
            tablaInformacionUsuario.getColumnModel().getColumn(1).setResizable(false);
            tablaInformacionUsuario.getColumnModel().getColumn(2).setResizable(false);
            tablaInformacionUsuario.getColumnModel().getColumn(3).setResizable(false);
        }

        buttonBuscar.setText("Buscar");
        buttonBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonBuscarActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Cascadia Code", 1, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Consulta de Asistencias");

        jLabel2.setText("Inicio");

        jLabel3.setText("Fin");

        textoAlerta.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        textoAlerta.setForeground(new java.awt.Color(255, 51, 51));
        textoAlerta.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        jLabel4.setText("Estados: ");

        comboBoxEstados.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Todos", "Presente", "Ausente", "Tardanza", "Justificado" }));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 367, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(dataAsistenciaInicio, javax.swing.GroupLayout.DEFAULT_SIZE, 150, Short.MAX_VALUE))
                        .addGap(27, 27, 27)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(dataAsistenciaFinal, javax.swing.GroupLayout.DEFAULT_SIZE, 150, Short.MAX_VALUE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addComponent(textoAlerta, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(comboBoxEstados, 0, 144, Short.MAX_VALUE)
                                .addGap(42, 42, 42)
                                .addComponent(buttonBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel4))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel3)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(dataAsistenciaFinal, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(dataAsistenciaInicio, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(comboBoxEstados, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(buttonBuscar))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(textoAlerta, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(16, 16, 16))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 520, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(18, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane1)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 470, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 17, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private AsistenciaService asistenciaService = new AsistenciaService();
    private UsuarioService usuarioService = new UsuarioService();

    private void buttonBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonBuscarActionPerformed

        DefaultTableModel modelo2 = (DefaultTableModel) tablaInformacionUsuario.getModel();
        modelo2.setRowCount(0);
        int idEstado = comboBoxEstados.getSelectedIndex();
        SimpleDateFormat sdf = new SimpleDateFormat("YYYY-MM-dd");
        String fechaInicio = sdf.format(dataAsistenciaInicio.getDate()).trim();
        String fechaFinal = sdf.format(dataAsistenciaFinal.getDate()).trim();
        
            List<Usuario> usuarios = usuarioService.ListaPorRangoFecha(fechaInicio, fechaFinal, idEstado);
            for (Usuario u : usuarios) {
                Object[] fila = {u.getIdUsuario(), u.getNombre(), u.getApellido(), u.getTotalAsistencia()};
                modelo2.addRow(fila);
            }

            // FUNCION ACCEDER AL ID DE LA TABLA, ESTO PARA MOSTRAR CADA ASISTENCIA POR UN RANGO
            tablaInformacionUsuario.addMouseListener(new java.awt.event.MouseAdapter() {
                int idEstado = comboBoxEstados.getSelectedIndex();
                Object idSeleccionado = null;
                @Override
                public void mouseClicked(java.awt.event.MouseEvent evt) {
                    DefaultTableModel modelo = (DefaultTableModel) tablaAsistencia.getModel();
                    modelo.setRowCount(0);
                    int filaSeleccionada = tablaInformacionUsuario.getSelectedRow();

                    if (filaSeleccionada != -1) {idSeleccionado = tablaInformacionUsuario.getValueAt(filaSeleccionada, 0);}
                    List<String[]> asistencias = asistenciaService.listarPorFecha(fechaInicio, fechaFinal, idSeleccionado, idEstado );
                    for (String[] a : asistencias) {
                        modelo.addRow(a);
                    }
                }
            });

    }//GEN-LAST:event_buttonBuscarActionPerformed

    /**
     * @param args the command line arguments
     */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttonBuscar;
    private javax.swing.JComboBox<String> comboBoxEstados;
    private com.toedter.calendar.JDateChooser dataAsistenciaFinal;
    private com.toedter.calendar.JDateChooser dataAsistenciaInicio;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private com.toedter.components.JSpinField jSpinField1;
    private javax.swing.JTable tablaAsistencia;
    private javax.swing.JTable tablaInformacionUsuario;
    private javax.swing.JLabel textoAlerta;
    // End of variables declaration//GEN-END:variables
}
