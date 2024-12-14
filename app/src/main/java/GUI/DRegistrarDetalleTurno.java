package GUI;

import Entities.Dia;
import Entities.Turno;
import Entities.Usuario;
import Services.DiaService;
import Services.TurnoService;
import Services.UsuarioService;
import javax.swing.DefaultListModel;

public class DRegistrarDetalleTurno extends javax.swing.JDialog {

    DiaService diaS = new DiaService();
    UsuarioService usuarioS = new UsuarioService();
    TurnoService turnoS = new TurnoService();
    DefaultListModel<String> dlmDias = new DefaultListModel<>();
    
    public DRegistrarDetalleTurno(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        initData();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblDiaSemana = new javax.swing.JLabel();
        lblUsuario = new javax.swing.JLabel();
        lblHorario = new javax.swing.JLabel();
        lblInicio = new javax.swing.JLabel();
        lblTermina = new javax.swing.JLabel();
        cbxTurnos = new javax.swing.JComboBox<>();
        cbxUsuarios = new javax.swing.JComboBox<>();
        sptHorizontal = new javax.swing.JSeparator();
        btnRegistrar = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();
        scrollDias = new javax.swing.JScrollPane();
        listDias = new javax.swing.JList<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Registro de Turno de Usuario");

        lblDiaSemana.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblDiaSemana.setText("Dia de la Semana");

        lblUsuario.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblUsuario.setText("Usuario");

        lblHorario.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblHorario.setText("Horario del Turno");

        lblInicio.setText("Inicio: 08:00");

        lblTermina.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        lblTermina.setText("Termina: 17:00");

        cbxTurnos.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "<Sin Datos>" }));

        cbxUsuarios.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "<Sin Datos>" }));

        btnRegistrar.setText("Registrar");

        btnCancelar.setText("Cancelar");

        listDias.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "<Sin Datos>" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        listDias.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        listDias.setPreferredSize(new java.awt.Dimension(120, 210));
        scrollDias.setViewportView(listDias);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lblDiaSemana, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(scrollDias, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnRegistrar, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(cbxUsuarios, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addComponent(lblInicio, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lblTermina, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(lblHorario, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblUsuario, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cbxTurnos, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(sptHorizontal, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 223, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(28, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblDiaSemana)
                    .addComponent(lblUsuario))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(cbxUsuarios, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(sptHorizontal, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(9, 9, 9)
                        .addComponent(lblHorario)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cbxTurnos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblInicio)
                            .addComponent(lblTermina))
                        .addGap(29, 29, 29)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnRegistrar, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(scrollDias, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(27, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void initData(){        
        // CARGAR días de la semana.
        dlmDias.clear();
        for(Dia dia : diaS.listar()){
            dlmDias.addElement(dia.getNombre());
        }
        listDias.setModel(dlmDias);
        
        // CARGAR usuarios.
        cbxUsuarios.removeAllItems();
        for(Usuario usuario : usuarioS.listar()){
            cbxUsuarios.addItem(usuario.getDni() + " - " + usuario.getNombre() + " " + usuario.getApellido());
        }
        
        // CARGAR turnos.
        cbxTurnos.removeAllItems();
        for(Turno turno : turnoS.listar()){
            cbxTurnos.addItem(turno.getNombre());
        }
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnRegistrar;
    private javax.swing.JComboBox<String> cbxTurnos;
    private javax.swing.JComboBox<String> cbxUsuarios;
    private javax.swing.JLabel lblDiaSemana;
    private javax.swing.JLabel lblHorario;
    private javax.swing.JLabel lblInicio;
    private javax.swing.JLabel lblTermina;
    private javax.swing.JLabel lblUsuario;
    private javax.swing.JList<String> listDias;
    private javax.swing.JScrollPane scrollDias;
    private javax.swing.JSeparator sptHorizontal;
    // End of variables declaration//GEN-END:variables
}