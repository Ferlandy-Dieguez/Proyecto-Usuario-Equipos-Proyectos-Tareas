package com.mycompany.login;

import static com.mycompany.login.Login.usuarios;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class CreacionEquipos extends javax.swing.JFrame {

    public CreacionEquipos() {
        initComponents();
        this.setTitle("Nuevo Equipo UMG"); /// Nombre 
        this.setLocationRelativeTo(null);  /// Centrar la ventana

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        crearButton = new javax.swing.JButton();
        regresarButton = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        nombreTextField = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        cbxSeleccionarMiembro = new javax.swing.JComboBox<>();
        btnAtras = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        btnEditarUsuario = new javax.swing.JMenuItem();
        EliminarUsuario = new javax.swing.JMenuItem();
        btnConsultarUsuario = new javax.swing.JMenuItem();
        btnSalir = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        crearButton.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        crearButton.setText("Crear");
        crearButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                crearButtonActionPerformed(evt);
            }
        });

        regresarButton.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        regresarButton.setText("Inicio");
        regresarButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                regresarButtonActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 102, 51));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("CREAR NUEVO EQUIPO");

        jLabel4.setText("Nombre:");

        jLabel8.setText("Lider del equipo:");

        cbxSeleccionarMiembro.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { " " }));
        cbxSeleccionarMiembro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbxSeleccionarMiembroActionPerformed(evt);
            }
        });

        btnAtras.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnAtras.setText("Regresar");
        btnAtras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAtrasActionPerformed(evt);
            }
        });

        jMenu1.setText("Archivo");

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

        btnConsultarUsuario.setText("Consultar Usuario");
        btnConsultarUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConsultarUsuarioActionPerformed(evt);
            }
        });
        jMenu1.add(btnConsultarUsuario);

        jMenuBar1.add(jMenu1);

        btnSalir.setText("Salir");
        btnSalir.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnSalirMouseClicked(evt);
            }
        });
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });
        jMenuBar1.add(btnSalir);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(24, 24, 24)
                                .addComponent(regresarButton, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(29, 29, 29)
                                .addComponent(btnAtras, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(31, 31, 31)
                                .addComponent(crearButton, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(13, 13, 13)
                                .addComponent(cbxSeleccionarMiembro, javax.swing.GroupLayout.PREFERRED_SIZE, 236, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap(26, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(nombreTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 236, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(26, 26, 26))))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(nombreTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(cbxSeleccionarMiembro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 98, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(regresarButton, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(crearButton, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnAtras, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void crearButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_crearButtonActionPerformed
        if(nombreTextField.getText().trim().equals("")||cbxSeleccionarMiembro.getSelectedItem().toString().trim().equals("")){
                    JOptionPane.showMessageDialog(this, "No se han completado todos los campos requeridos");
        } else {
             String nombre = nombreTextField.getText();
        int lider = Busqueda.GetIdUsuarioByNombreApellido(cbxSeleccionarMiembro.getSelectedItem().toString());
        
        if(lider>0){
            
              Usuario us = Busqueda.GetUsuarioById(lider);
             
             
        Equipos equipoNuevo = new Equipos();
        Login.incrementalEquipo++;
        
        equipoNuevo.setId(Login.incrementalEquipo);
        us.setEquipoAsignado(Login.incrementalEquipo);
        equipoNuevo.setNombre(nombre);
        equipoNuevo.setLider(lider);
        equipoNuevo.setMiembros(new ArrayList<Integer>());
        
        Login.equipos.add(equipoNuevo);

        nombreTextField.setText("");
        cbxSeleccionarMiembro.setSelectedIndex(0);
        cbxSeleccionarMiembro.removeAllItems();
        llenarcombo();

        JOptionPane.showMessageDialog(this, "Equipo creado exitosamente");
        } else{
        JOptionPane.showMessageDialog(this, "No se ha seleccionado un líder de equipo válido");
        }
        }
       
    }//GEN-LAST:event_crearButtonActionPerformed

    private void regresarButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_regresarButtonActionPerformed

        InicioLogin login = new InicioLogin();
        login.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_regresarButtonActionPerformed

    private void cbxSeleccionarMiembroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbxSeleccionarMiembroActionPerformed


    }//GEN-LAST:event_cbxSeleccionarMiembroActionPerformed

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed

    }//GEN-LAST:event_btnSalirActionPerformed

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

    private void btnConsultarUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConsultarUsuarioActionPerformed

        ConsultarUsuarios consultar = new ConsultarUsuarios();
        consultar.setVisible(true);
        this.dispose();

    }//GEN-LAST:event_btnConsultarUsuarioActionPerformed

    private void btnSalirMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSalirMouseClicked
        this.dispose();
    }//GEN-LAST:event_btnSalirMouseClicked

    private void btnAtrasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAtrasActionPerformed
        PantallaHacerUsuarios hacer = new PantallaHacerUsuarios();
        hacer.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnAtrasActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened

        llenarcombo();
    }//GEN-LAST:event_formWindowOpened

    public void llenarcombo() {

        for (Usuario usuarios : usuarios) {
            
            if (usuarios.getRol()==2&&usuarios.getEquipoAsignado()<0){
            cbxSeleccionarMiembro.addItem(usuarios.getNombre()+" "+usuarios.getApellido());
            }
            

        }
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem EliminarUsuario;
    private javax.swing.JButton btnAtras;
    private javax.swing.JMenuItem btnConsultarUsuario;
    private javax.swing.JMenuItem btnEditarUsuario;
    private javax.swing.JMenu btnSalir;
    private javax.swing.JComboBox<String> cbxSeleccionarMiembro;
    private javax.swing.JButton crearButton;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JTextField nombreTextField;
    private javax.swing.JButton regresarButton;
    // End of variables declaration//GEN-END:variables
}
