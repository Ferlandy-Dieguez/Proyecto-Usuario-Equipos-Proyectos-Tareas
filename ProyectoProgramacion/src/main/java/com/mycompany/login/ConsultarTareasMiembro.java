package com.mycompany.login;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.util.ArrayList;
import javax.swing.ListSelectionModel;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;

public class ConsultarTareasMiembro extends javax.swing.JFrame implements ActionListener, ItemListener {

    public ConsultarTareasMiembro() {
        initComponents();

        this.setTitle("Consulta de Tareas"); /// Nombre
        this.setLocationRelativeTo(null);  /// Centrar la ventana
        cbxUser.addItemListener(this);
        cbxEstado.addItemListener(this);

        //llenarTabla();
        mostrarPanel();
        llenarcbxuser();

    }

    public final void mostrarPanel() {
        if (Login.usuarioLogueado.getRol() == 1) {
            PanelCBX.setVisible(true);
            cbxEstado.setEnabled(false);
            lblTarea.setText("");
        } else {
            PanelCBX.setVisible(false);
        }
    }

    public final void llenarcbxuser() {
        cbxUser.removeAllItems();

        cbxUser.addItem("Seleccione un usuario");
        if (Login.usuarioLogueado.getRol() == 0) {
            ArrayList<Usuario> users = Login.usuarios;
            for (Usuario user : users) {
                String uName = user.getNombre() + " " + user.getApellido();
                cbxUser.addItem(uName);
            }
        } else {
            if (Login.usuarioLogueado.getRol() == 2) {
                int idEquipoGerente = Login.usuarioLogueado.getEquipoAsignado();

                ArrayList<Usuario> users = Login.usuarios;
                for (Usuario user : users) {
                    String uName = user.getNombre() + " " + user.getApellido();
                    if (user.getEquipoAsignado() == idEquipoGerente) {
                        cbxUser.addItem(uName);
                    }
                }
            } else {
                String uName = Login.usuarioLogueado.getNombre() + " " + Login.usuarioLogueado.getApellido();
                cbxUser.addItem(uName);
            }
        }
    }

    private void llenarTabla() {

        if (!"Seleccione un usuario".equals(cbxUser.getSelectedItem().toString())) {

            Usuario tempUser = Busqueda.GetUsuarioById(Busqueda.GetIdUsuarioByNombreApellido(cbxUser.getSelectedItem().toString()));
            DefaultTableModel tabla = new DefaultTableModel(new String[]{"ID Tarea", "Proyecto", "Titulo", "Descripcion", "Fecha inicio", "Fecha final", "Miembro Asignado", "Estado"}, Login.tareas.size());
            Table.setModel(tabla);
            TableModel llenarTabla = Table.getModel();

            for (int i = 0; i < Login.tareas.size(); i++) {

                llenarTabla.setValueAt("", i, 0);
                llenarTabla.setValueAt("", i, 1);
                llenarTabla.setValueAt("", i, 2);
                llenarTabla.setValueAt("", i, 3);
                llenarTabla.setValueAt("", i, 4);
                llenarTabla.setValueAt("", i, 5);
                llenarTabla.setValueAt("", i, 6);
                llenarTabla.setValueAt("", i, 7);

            }
            int contador = 0;

            for (int i = 0; i < Login.tareas.size(); i++) {

                Tarea tareass = Login.tareas.get(i);
                System.out.println("contador: " + contador);

                if (tempUser.getCorreo().equals(tareass.getUsuarioAsignado())) {
                    System.out.println("TRUE");

                    llenarTabla.setValueAt(tareass.getId(), contador, 0);
                    llenarTabla.setValueAt(Busqueda.GetProyectoById(tareass.getProyecto()).getNombre(), contador, 1);
                    llenarTabla.setValueAt(tareass.getTitulo(), contador, 2);
                    llenarTabla.setValueAt(tareass.getDescripcion(), contador, 3);
                    llenarTabla.setValueAt(tareass.getFechaInicio(), contador, 4);
                    llenarTabla.setValueAt(tareass.getFechaFin(), contador, 5);
                    String nombreUser = tempUser.getNombre() + " " + tempUser.getApellido();
                    llenarTabla.setValueAt(nombreUser, contador, 6);
                    llenarTabla.setValueAt(tareass.getEstado(), contador, 7);
                    contador++;
                }

            }

        }

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        Table = new javax.swing.JTable();
        btnInicio = new javax.swing.JButton();
        btnAtras = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        cbxUser = new javax.swing.JComboBox<>();
        PanelCBX = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        cbxEstado = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        lblTarea = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        btnCrearUsuario = new javax.swing.JMenuItem();
        btnEditarUsuario = new javax.swing.JMenuItem();
        EliminarUsuario = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        Table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null}
            },
            new String [] {
                "ID Tarea", "Proyecto", "Titulo", "Descripcion", "Fecha inicio", "Fecha final", "Miembro Asignado", "Estado"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        Table.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(Table);

        btnInicio.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnInicio.setText("Inicio");
        btnInicio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInicioActionPerformed(evt);
            }
        });

        btnAtras.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnAtras.setText("Regresar");
        btnAtras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAtrasActionPerformed(evt);
            }
        });

        jLabel1.setText("Usuario:");
        jLabel1.setToolTipText("");

        cbxUser.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { " ", "Seleccione un usuario" }));
        cbxUser.setAutoscrolls(true);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(87, 87, 87)
                .addComponent(jLabel1)
                .addGap(28, 28, 28)
                .addComponent(cbxUser, javax.swing.GroupLayout.PREFERRED_SIZE, 223, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(cbxUser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(25, Short.MAX_VALUE))
        );

        jLabel2.setText("Cambiar estado: ");

        cbxEstado.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Solicitado", "En proceso", "Finalizado" }));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N

        lblTarea.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblTarea.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTarea.setText(" ");

        javax.swing.GroupLayout PanelCBXLayout = new javax.swing.GroupLayout(PanelCBX);
        PanelCBX.setLayout(PanelCBXLayout);
        PanelCBXLayout.setHorizontalGroup(
            PanelCBXLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelCBXLayout.createSequentialGroup()
                .addGroup(PanelCBXLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PanelCBXLayout.createSequentialGroup()
                        .addContainerGap(46, Short.MAX_VALUE)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(60, 60, 60))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelCBXLayout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lblTarea, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addComponent(jLabel2)
                .addGap(27, 27, 27)
                .addComponent(cbxEstado, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        PanelCBXLayout.setVerticalGroup(
            PanelCBXLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelCBXLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(PanelCBXLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(cbxEstado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addComponent(lblTarea))
                .addContainerGap(16, Short.MAX_VALUE))
        );

        jMenu1.setText("Archivo");

        btnCrearUsuario.setText("Crear Usuario");
        btnCrearUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCrearUsuarioActionPerformed(evt);
            }
        });
        jMenu1.add(btnCrearUsuario);

        btnEditarUsuario.setText("Editar Usuario");
        btnEditarUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarUsuarioActionPerformed(evt);
            }
        });
        jMenu1.add(btnEditarUsuario);

        EliminarUsuario.setText("Eliminar Usuario");
        EliminarUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EliminarUsuarioActionPerformed(evt);
            }
        });
        jMenu1.add(EliminarUsuario);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Salir");
        jMenu2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenu2MouseClicked(evt);
            }
        });
        jMenu2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenu2ActionPerformed(evt);
            }
        });
        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jScrollPane1)
                .addGap(27, 27, 27))
            .addGroup(layout.createSequentialGroup()
                .addGap(237, 237, 237)
                .addComponent(PanelCBX, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(351, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(189, 189, 189)
                .addComponent(btnAtras, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnInicio, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(64, 64, 64))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 258, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(PanelCBX, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAtras)
                    .addComponent(btnInicio, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(19, 19, 19))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnEditarUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarUsuarioActionPerformed

        EditarUsuario editar = new EditarUsuario();
        editar.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnEditarUsuarioActionPerformed

    private void EliminarUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EliminarUsuarioActionPerformed

        EliminarUsuario eliminar = new EliminarUsuario();
        eliminar.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_EliminarUsuarioActionPerformed

    private void btnCrearUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCrearUsuarioActionPerformed

        CreacionUsuarios crear = new CreacionUsuarios();
        crear.setVisible(true);
        this.dispose();

    }//GEN-LAST:event_btnCrearUsuarioActionPerformed

    private void jMenu2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenu2ActionPerformed

    }//GEN-LAST:event_jMenu2ActionPerformed

    private void jMenu2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenu2MouseClicked
        this.dispose();
    }//GEN-LAST:event_jMenu2MouseClicked

    private void btnInicioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInicioActionPerformed
        InicioLogin login = new InicioLogin();
        login.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnInicioActionPerformed

    private void btnAtrasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAtrasActionPerformed
        PantallaHacerUsuarios hacer = new PantallaHacerUsuarios();
        hacer.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnAtrasActionPerformed

    private void TableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TableMouseClicked
        System.out.println("hola");
        DefaultTableModel model = (DefaultTableModel) Table.getModel();
        int columna = Table.getSelectedRow();
        System.out.println(model.getValueAt(columna, 0).toString());

        if (!"".equals(model.getValueAt(columna, 0).toString())) {

            if (Login.usuarioLogueado.getRol() == 1) {
                PanelCBX.setVisible(true);
                cbxEstado.setEnabled(true);
                lblTarea.setText(model.getValueAt(columna, 2).toString());
                System.out.println("estado: "+model.getValueAt(columna, 7).toString()); 
               cbxEstado.setSelectedItem(model.getValueAt(columna, 7).toString());

            }
        } else {
            PanelCBX.setVisible(false);

        }

    }//GEN-LAST:event_TableMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem EliminarUsuario;
    private javax.swing.JPanel PanelCBX;
    private javax.swing.JTable Table;
    private javax.swing.JButton btnAtras;
    private javax.swing.JMenuItem btnCrearUsuario;
    private javax.swing.JMenuItem btnEditarUsuario;
    private javax.swing.JButton btnInicio;
    private javax.swing.JComboBox<String> cbxEstado;
    private javax.swing.JComboBox<String> cbxUser;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblTarea;
    // End of variables declaration//GEN-END:variables

    @Override
    public void actionPerformed(ActionEvent ae) {
    }

    @Override
    public void itemStateChanged(ItemEvent e) {
        if (e.getStateChange() == ItemEvent.SELECTED) {
            if (e.getSource() == cbxUser) {
                System.out.println("CAMBIÓ USER");
                llenarTabla();
            } else {

                if (e.getSource() == cbxEstado) {
                    DefaultTableModel model = (DefaultTableModel) Table.getModel();
                    int columna = Table.getSelectedRow();

                    Tarea tarea = Busqueda.GetTareaById(Integer.valueOf(model.getValueAt(columna, 0).toString()));
                    tarea.setEstado(cbxEstado.getSelectedItem().toString());
                    llenarTabla();

                }

            }
        }
    }
}
