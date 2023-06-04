package com.mycompany.login;

import static com.mycompany.login.Login.equipos;
import static com.mycompany.login.Login.usuarios;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class AsignacióndeMiembrosaEquipo extends javax.swing.JFrame {

    public AsignacióndeMiembrosaEquipo() {
        initComponents();
        this.setTitle("Asignación de miembros a equipo"); /// Nombre 
        this.setLocationRelativeTo(null);  /// Centrar la ventana
        llenarcomboEquipos();
        llenarcomboUsuarios();

    }
    
    public final void llenarcomboEquipos() {

        for (Equipos equipos : equipos) {
            cbxEquipos.addItem(equipos.getNombre());
        }
    }
    
    public final void llenarcomboUsuarios() {

        for (Usuario usuarios : usuarios) {
            if (usuarios.getRol()==1&&usuarios.getEquipoAsignado()<0){
                cbxMiembros.addItem(usuarios.getNombre()+" "+usuarios.getApellido());
            }
            
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnAsignar = new javax.swing.JButton();
        btnRegresar = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        cbxEquipos = new javax.swing.JComboBox<>();
        regresarButton = new javax.swing.JButton();
        cbxMiembros = new javax.swing.JComboBox<>();
        jLabel9 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        BarraMenu = new javax.swing.JMenu();
        itemCrearUsuario = new javax.swing.JMenuItem();
        itemEliminarUsuario = new javax.swing.JMenuItem();
        itemConsultarUsuario = new javax.swing.JMenuItem();
        btnSalir = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        btnAsignar.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnAsignar.setText("Asignar");
        btnAsignar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAsignarActionPerformed(evt);
            }
        });

        btnRegresar.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnRegresar.setText("Regresar");
        btnRegresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegresarActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 102, 0));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Asignación de miembros a equipo");

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel8.setText("Equipo:");

        cbxEquipos.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { " " }));
        cbxEquipos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cbxEquiposMouseClicked(evt);
            }
        });
        cbxEquipos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbxEquiposActionPerformed(evt);
            }
        });

        regresarButton.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        regresarButton.setText("Inicio");
        regresarButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                regresarButtonActionPerformed(evt);
            }
        });

        cbxMiembros.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { " " }));
        cbxMiembros.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbxMiembrosActionPerformed(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel9.setText("Miembros:");

        BarraMenu.setText("Archivo");

        itemCrearUsuario.setText("Crear Usuario");
        itemCrearUsuario.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                itemCrearUsuarioMouseClicked(evt);
            }
        });
        itemCrearUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemCrearUsuarioActionPerformed(evt);
            }
        });
        BarraMenu.add(itemCrearUsuario);

        itemEliminarUsuario.setText("Eliminar Usuario");
        itemEliminarUsuario.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                itemEliminarUsuarioMouseClicked(evt);
            }
        });
        itemEliminarUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemEliminarUsuarioActionPerformed(evt);
            }
        });
        BarraMenu.add(itemEliminarUsuario);

        itemConsultarUsuario.setText("Consultar Usuario");
        itemConsultarUsuario.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                itemConsultarUsuarioMouseClicked(evt);
            }
        });
        itemConsultarUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemConsultarUsuarioActionPerformed(evt);
            }
        });
        BarraMenu.add(itemConsultarUsuario);

        jMenuBar1.add(BarraMenu);

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
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(7, 7, 7)
                                .addComponent(regresarButton, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(30, 30, 30)
                                .addComponent(btnRegresar, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnAsignar))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(cbxEquipos, javax.swing.GroupLayout.PREFERRED_SIZE, 236, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(cbxMiembros, javax.swing.GroupLayout.PREFERRED_SIZE, 236, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(0, 22, Short.MAX_VALUE)))
                        .addGap(28, 28, 28))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(cbxMiembros, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 95, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(cbxEquipos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(92, 92, 92)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnAsignar)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(regresarButton)
                        .addComponent(btnRegresar)))
                .addGap(17, 17, 17))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAsignarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAsignarActionPerformed

        if(cbxEquipos.getSelectedItem().toString().trim().equals("")||cbxMiembros.getSelectedItem().toString().trim().equals("")){
             JOptionPane.showMessageDialog(this, "No se han seleccionado todos los campos necesarios");
        } else{
            
             int teamID = cbxEquipos.getSelectedIndex();
        
        int user = Busqueda.GetIdUsuarioByNombreApellido(cbxMiembros.getSelectedItem().toString());

        Equipos team = Busqueda.GetEquipoById(teamID);
        
        System.out.println("Equipo ID "+ teamID);
        System.out.println("Usuario "+ user);
        
        if(teamID>0){
             ArrayList<Integer> members = new ArrayList<>();
             members.addAll(team.getMiembros());
             
             members.add(user);
             team.setMiembros(members);
             Usuario us = Busqueda.GetUsuarioById(user);
             
             us.setEquipoAsignado(teamID);
           
                   JOptionPane.showMessageDialog(this, "Miembro asignado");
                   
                   cbxMiembros.setSelectedIndex(0);
                   cbxEquipos.setSelectedIndex(0);
                   cbxMiembros.removeAllItems();
                   llenarcomboUsuarios();
        
        } else {
            JOptionPane.showMessageDialog(this, "No se ha asignado un equipo");
        }
        
        }
               

      
       
        
        
    }//GEN-LAST:event_btnAsignarActionPerformed

    private void btnRegresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegresarActionPerformed

        PantallaHacerUsuarios hacer = new PantallaHacerUsuarios();
        hacer.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnRegresarActionPerformed

    private void cbxEquiposActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbxEquiposActionPerformed


    }//GEN-LAST:event_cbxEquiposActionPerformed

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
        System.exit(0);
    }//GEN-LAST:event_btnSalirActionPerformed

    private void btnSalirMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSalirMouseClicked
        this.dispose();
    }//GEN-LAST:event_btnSalirMouseClicked

    private void itemCrearUsuarioMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_itemCrearUsuarioMouseClicked

        CreacionUsuarios crear = new CreacionUsuarios();
        crear.setVisible(true);
        this.dispose();

    }//GEN-LAST:event_itemCrearUsuarioMouseClicked

    private void itemEliminarUsuarioMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_itemEliminarUsuarioMouseClicked

        EliminarUsuario eliminar = new EliminarUsuario();
        eliminar.setVisible(true);
        this.dispose();

    }//GEN-LAST:event_itemEliminarUsuarioMouseClicked

    private void itemConsultarUsuarioMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_itemConsultarUsuarioMouseClicked

        ConsultarUsuarios consultar = new ConsultarUsuarios();
        consultar.setVisible(true);
        this.dispose();

    }//GEN-LAST:event_itemConsultarUsuarioMouseClicked

    private void itemCrearUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemCrearUsuarioActionPerformed

        CreacionUsuarios crear = new CreacionUsuarios();
        crear.setVisible(true);
        this.dispose();

    }//GEN-LAST:event_itemCrearUsuarioActionPerformed

    private void itemEliminarUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemEliminarUsuarioActionPerformed

        EliminarUsuario eliminar = new EliminarUsuario();
        eliminar.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_itemEliminarUsuarioActionPerformed

    private void itemConsultarUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemConsultarUsuarioActionPerformed

        ConsultarUsuarios consultar = new ConsultarUsuarios();
        consultar.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_itemConsultarUsuarioActionPerformed

    private void regresarButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_regresarButtonActionPerformed
        InicioLogin login = new InicioLogin();
        login.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_regresarButtonActionPerformed

    private void cbxMiembrosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbxMiembrosActionPerformed


    }//GEN-LAST:event_cbxMiembrosActionPerformed

    private void cbxEquiposMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cbxEquiposMouseClicked

    }//GEN-LAST:event_cbxEquiposMouseClicked

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        
    }//GEN-LAST:event_formWindowOpened

    
            
            
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu BarraMenu;
    private javax.swing.JButton btnAsignar;
    private javax.swing.JButton btnRegresar;
    private javax.swing.JMenu btnSalir;
    private javax.swing.JComboBox<String> cbxEquipos;
    private javax.swing.JComboBox<String> cbxMiembros;
    private javax.swing.JMenuItem itemConsultarUsuario;
    private javax.swing.JMenuItem itemCrearUsuario;
    private javax.swing.JMenuItem itemEliminarUsuario;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JButton regresarButton;
    // End of variables declaration//GEN-END:variables
}
