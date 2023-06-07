package com.mycompany.login;

import com.fasterxml.jackson.core.JsonProcessingException;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.ObjectWriter;
import java.util.logging.Level;
import java.util.logging.Logger;

public class PantallaHacerUsuarios extends javax.swing.JFrame {

    ObjectWriter ow = new ObjectMapper().writer().withDefaultPrettyPrinter();

    public PantallaHacerUsuarios() {

        initComponents();
        this.setTitle(Login.usuarioLogueado.TipoRol()); /// Nombre
        this.setLocationRelativeTo(null);  /// Centrar la ventana

        switch (Login.usuarioLogueado.getRol()) {
            case 0:
               BotonesAdmin();
                break;
            case 1:
                BotonesMiembro();
                break;
            case 2:
                BotonesGerente();
                break;

            default:
                this.dispose();
        }
    }

    public final void BotonesAdmin() {

        btnCrearTarea.setEnabled(false);
        btnPerfil.setEnabled(false);
        btnConsultartodasTareas.setEnabled(false);
        btnEditarTareas.setEnabled(false);

        btnEliminarTareas.setEnabled(false);
        btnConsultarTareasdeMiembros.setEnabled(true);

        ///Ocultar btn
        btnPerfil.setVisible(false);
        /*
        btnCrearTarea.setVisible(false);
        btnConsultartodasTareas.setVisible(false);
        btnEditarTareas.setVisible(false);
        btnEliminarTareas.setVisible(false);*/

    }

    public final void BotonesGerente() {

        //jPanel2Usuarios.setVisible(false);
        jLabel2.setVisible(true);

        btnPerfilAdministrador.setEnabled(false);

        btnCrearEquipo.setEnabled(false);
        btnConsultarEquipos.setEnabled(false);
        btnAsignarMiembroaEquipo.setEnabled(false);

        btnConsultarProyectos.setEnabled(false);
        btnConsultarTareasdeMiembros.setEnabled(true);
        btnConsultartodasTareas.setEnabled(false);

        btnCrearUsuario.setEnabled(false);
        btnConsultarUsuario.setEnabled(false);
        btnEditarUsuario.setEnabled(false);
        btnEliminarUsuario.setEnabled(false);

        ///Ocultar btn
        btnPerfilAdministrador.setVisible(false);
        /*
        btnCrearEquipo.setVisible(false);
        btnConsultarEquipos.setVisible(false);
        btnAsignarMiembroaEquipo.setVisible(false);
        btnConsultarProyectos.setVisible(false);
        btnConsultartodasTareas.setVisible(false);*/
    }

    public final void BotonesMiembro() {
        // jPanel2Usuarios.setVisible(false);
        // jLabel2.setVisible(false);

        btnCrearUsuario.setEnabled(false);
        btnConsultarUsuario.setEnabled(false);
        btnEditarUsuario.setEnabled(false);
        btnEliminarUsuario.setEnabled(false);

        btnPerfilAdministrador.setEnabled(false);

        btnCrearEquipo.setEnabled(false);
        btnConsultarEquipos.setEnabled(false);
        btnAsignarMiembroaEquipo.setEnabled(false);

        btnCrearProyecto.setEnabled(false);
        btnConsultarProyectos.setEnabled(false);
        btnEditarProyecto.setEnabled(false);
        btnAsignarProyectoaEquipo.setEnabled(false);

        btnCrearTarea.setEnabled(false);
        btnConsultartodasTareas.setEnabled(false);
        btnEditarTareas.setEnabled(false);
        btnEliminarTareas.setEnabled(false);

        btnConsultarTareasdeMiembros.setText("Consultar mis tareas");

        ///Ocultar btn
        btnPerfilAdministrador.setVisible(false);

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        btnInicio = new javax.swing.JButton();
        btnPerfilAdministrador = new javax.swing.JButton();
        btnPerfil = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        btnCrearUsuario = new javax.swing.JButton();
        btnConsultarUsuario = new javax.swing.JButton();
        btnEditarUsuario = new javax.swing.JButton();
        btnEliminarUsuario = new javax.swing.JButton();
        btnCrearEquipo = new javax.swing.JButton();
        btnConsultarEquipos = new javax.swing.JButton();
        btnAsignarMiembroaEquipo = new javax.swing.JButton();
        btnConsultarMiembrodelEquipo = new javax.swing.JButton();
        btnCrearProyecto = new javax.swing.JButton();
        btnConsultarProyectos = new javax.swing.JButton();
        btnEditarProyecto = new javax.swing.JButton();
        btnAsignarProyectoaEquipo = new javax.swing.JButton();
        btnConsultarProyectosdelEquipo = new javax.swing.JButton();
        btnCrearTarea = new javax.swing.JButton();
        btnConsultartodasTareas = new javax.swing.JButton();
        btnEditarTareas = new javax.swing.JButton();
        btnEliminarTareas = new javax.swing.JButton();
        btnConsultarTareasdeMiembros = new javax.swing.JButton();
        Usuarios = new javax.swing.JLabel();
        Equipos = new javax.swing.JLabel();
        Proyectos = new javax.swing.JLabel();
        Tareas = new javax.swing.JLabel();
        Fondo = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        btnSalir = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(204, 204, 204));

        jPanel1.setBackground(new java.awt.Color(204, 204, 204));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnInicio.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnInicio.setText("Inicio");
        btnInicio.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        btnInicio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInicioActionPerformed(evt);
            }
        });
        jPanel1.add(btnInicio, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 10, 87, 39));

        btnPerfilAdministrador.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnPerfilAdministrador.setText("Mi Perfil");
        btnPerfilAdministrador.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        btnPerfilAdministrador.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPerfilAdministradorActionPerformed(evt);
            }
        });
        jPanel1.add(btnPerfilAdministrador, new org.netbeans.lib.awtextra.AbsoluteConstraints(840, 10, 105, 40));

        btnPerfil.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnPerfil.setText("Mi Perfil");
        btnPerfil.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        btnPerfil.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPerfilActionPerformed(evt);
            }
        });
        jPanel1.add(btnPerfil, new org.netbeans.lib.awtextra.AbsoluteConstraints(840, 10, 105, 40));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/agregar-usuario.png"))); // NOI18N
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 180, -1, -1));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/equipos.png"))); // NOI18N
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 310, -1, -1));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proyecto.png"))); // NOI18N
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 430, -1, -1));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/lista-de-tareas.png"))); // NOI18N
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 540, -1, -1));

        btnCrearUsuario.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnCrearUsuario.setText("Crear Usuario");
        btnCrearUsuario.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        btnCrearUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCrearUsuarioActionPerformed(evt);
            }
        });
        jPanel1.add(btnCrearUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 200, 127, 60));

        btnConsultarUsuario.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnConsultarUsuario.setText("Listado de Usuarios");
        btnConsultarUsuario.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        btnConsultarUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConsultarUsuarioActionPerformed(evt);
            }
        });
        jPanel1.add(btnConsultarUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 200, 135, 60));

        btnEditarUsuario.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnEditarUsuario.setText("Editar Usuario");
        btnEditarUsuario.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        btnEditarUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarUsuarioActionPerformed(evt);
            }
        });
        jPanel1.add(btnEditarUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 200, 148, 60));

        btnEliminarUsuario.setFont(new java.awt.Font("Segoe UI", 1, 11)); // NOI18N
        btnEliminarUsuario.setText("Eliminar Usuario");
        btnEliminarUsuario.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        btnEliminarUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarUsuarioActionPerformed(evt);
            }
        });
        jPanel1.add(btnEliminarUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 200, 148, 60));

        btnCrearEquipo.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnCrearEquipo.setText("Crear Equipo");
        btnCrearEquipo.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        btnCrearEquipo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCrearEquipoActionPerformed(evt);
            }
        });
        jPanel1.add(btnCrearEquipo, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 330, 120, 60));

        btnConsultarEquipos.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnConsultarEquipos.setText("Listado de Equipos");
        btnConsultarEquipos.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        btnConsultarEquipos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConsultarEquiposActionPerformed(evt);
            }
        });
        jPanel1.add(btnConsultarEquipos, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 330, 148, 60));

        btnAsignarMiembroaEquipo.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnAsignarMiembroaEquipo.setText("Asignar miembro a equipo");
        btnAsignarMiembroaEquipo.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        btnAsignarMiembroaEquipo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAsignarMiembroaEquipoActionPerformed(evt);
            }
        });
        jPanel1.add(btnAsignarMiembroaEquipo, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 330, 171, 60));

        btnConsultarMiembrodelEquipo.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnConsultarMiembrodelEquipo.setText("Consultar miembros del equipo");
        btnConsultarMiembrodelEquipo.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        btnConsultarMiembrodelEquipo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConsultarMiembrodelEquipoActionPerformed(evt);
            }
        });
        jPanel1.add(btnConsultarMiembrodelEquipo, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 330, 195, 60));

        btnCrearProyecto.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnCrearProyecto.setText("Crear Proyecto");
        btnCrearProyecto.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        btnCrearProyecto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCrearProyectoActionPerformed(evt);
            }
        });
        jPanel1.add(btnCrearProyecto, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 450, 101, 60));

        btnConsultarProyectos.setFont(new java.awt.Font("Segoe UI", 1, 10)); // NOI18N
        btnConsultarProyectos.setText("Ver todos los proyectos");
        btnConsultarProyectos.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        btnConsultarProyectos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConsultarProyectosActionPerformed(evt);
            }
        });
        jPanel1.add(btnConsultarProyectos, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 450, 147, 60));

        btnEditarProyecto.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnEditarProyecto.setText("Editar Proyecto");
        btnEditarProyecto.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        btnEditarProyecto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarProyectoActionPerformed(evt);
            }
        });
        jPanel1.add(btnEditarProyecto, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 450, 128, 60));

        btnAsignarProyectoaEquipo.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnAsignarProyectoaEquipo.setText("Asignar proyecto a equipo");
        btnAsignarProyectoaEquipo.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        btnAsignarProyectoaEquipo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAsignarProyectoaEquipoActionPerformed(evt);
            }
        });
        jPanel1.add(btnAsignarProyectoaEquipo, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 450, 170, 60));

        btnConsultarProyectosdelEquipo.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnConsultarProyectosdelEquipo.setText("Listado de proyectos del equipo");
        btnConsultarProyectosdelEquipo.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        btnConsultarProyectosdelEquipo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConsultarProyectosdelEquipoActionPerformed(evt);
            }
        });
        jPanel1.add(btnConsultarProyectosdelEquipo, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 450, 198, 60));

        btnCrearTarea.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnCrearTarea.setText("Crear Tarea");
        btnCrearTarea.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        btnCrearTarea.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCrearTareaActionPerformed(evt);
            }
        });
        jPanel1.add(btnCrearTarea, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 550, 100, 60));

        btnConsultartodasTareas.setFont(new java.awt.Font("Segoe UI", 1, 10)); // NOI18N
        btnConsultartodasTareas.setText("Ver las tareas de todos ");
        btnConsultartodasTareas.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        btnConsultartodasTareas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConsultartodasTareasActionPerformed(evt);
            }
        });
        jPanel1.add(btnConsultartodasTareas, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 550, 173, 60));

        btnEditarTareas.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnEditarTareas.setText("Editar Tareas");
        btnEditarTareas.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        btnEditarTareas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarTareasActionPerformed(evt);
            }
        });
        jPanel1.add(btnEditarTareas, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 550, 130, 60));

        btnEliminarTareas.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnEliminarTareas.setText("Eliminar Tarea");
        btnEliminarTareas.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        btnEliminarTareas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarTareasActionPerformed(evt);
            }
        });
        jPanel1.add(btnEliminarTareas, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 550, 126, 60));

        btnConsultarTareasdeMiembros.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnConsultarTareasdeMiembros.setText("Listado de tareas de miembros");
        btnConsultarTareasdeMiembros.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        btnConsultarTareasdeMiembros.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConsultarTareasdeMiembrosActionPerformed(evt);
            }
        });
        jPanel1.add(btnConsultarTareasdeMiembros, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 550, 189, 60));

        Usuarios.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        Usuarios.setForeground(new java.awt.Color(255, 0, 0));
        Usuarios.setText("Usuarios");
        jPanel1.add(Usuarios, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 170, 110, 30));

        Equipos.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        Equipos.setForeground(new java.awt.Color(255, 0, 0));
        Equipos.setText("Equipos");
        jPanel1.add(Equipos, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 300, 110, 30));

        Proyectos.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        Proyectos.setForeground(new java.awt.Color(255, 0, 0));
        Proyectos.setText("Proyectos");
        jPanel1.add(Proyectos, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 420, 110, 30));

        Tareas.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        Tareas.setForeground(new java.awt.Color(255, 0, 0));
        Tareas.setText("Tareas");
        jPanel1.add(Tareas, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 520, 100, 30));

        Fondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Fondo.png"))); // NOI18N
        jPanel1.add(Fondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 960, 650));

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
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed

        this.dispose();
    }//GEN-LAST:event_btnSalirActionPerformed

    private void btnSalirMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSalirMouseClicked
        this.dispose();
    }//GEN-LAST:event_btnSalirMouseClicked

    private void btnConsultarMiembrodelEquipoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConsultarMiembrodelEquipoActionPerformed

        if (Login.usuarioLogueado.getRol() == 0) {
            consultademiembrosdeequiposporcbx consultamiembros = new consultademiembrosdeequiposporcbx();
            consultamiembros.setVisible(true);
            this.dispose();

        } else {

            if (Login.usuarioLogueado.getEquipoAsignado() > 0) {
                consultademiembrosdeequipos consultar = new consultademiembrosdeequipos(Busqueda.GetEquipoById(Login.usuarioLogueado.getEquipoAsignado()).getNombre());
                consultar.setVisible(true);
                this.dispose();
            } else {
                JOptionPane.showMessageDialog(this, "Usted no pertenece a ningun equipo");
            }
        }


    }//GEN-LAST:event_btnConsultarMiembrodelEquipoActionPerformed

    private void btnAsignarMiembroaEquipoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAsignarMiembroaEquipoActionPerformed
        AsignacióndeMiembrosaEquipo Asignaciondemiembros = new AsignacióndeMiembrosaEquipo();
        Asignaciondemiembros.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnAsignarMiembroaEquipoActionPerformed

    private void btnConsultarEquiposActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConsultarEquiposActionPerformed
        ConsultarEquipos consultarEquipos = new ConsultarEquipos();
        consultarEquipos.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnConsultarEquiposActionPerformed

    private void btnCrearEquipoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCrearEquipoActionPerformed
        CreacionEquipos crearEquipos = new CreacionEquipos();
        crearEquipos.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnCrearEquipoActionPerformed

    private void btnCrearUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCrearUsuarioActionPerformed
        CreacionUsuarios crear = new CreacionUsuarios();
        crear.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnCrearUsuarioActionPerformed

    private void btnConsultarProyectosdelEquipoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConsultarProyectosdelEquipoActionPerformed
        if (Login.usuarioLogueado.getRol() == 0) {
            consultadeProyectosenEquiposporcbx consultaProyectos = new consultadeProyectosenEquiposporcbx();
            consultaProyectos.setVisible(true);
            this.dispose();
        } else {
            if (Login.usuarioLogueado.getEquipoAsignado() > 0) {
                consultadeProyectosenEquipos consultar = new consultadeProyectosenEquipos(Busqueda.GetEquipoById(Login.usuarioLogueado.getEquipoAsignado()).getNombre());
                consultar.setVisible(true);
                this.dispose();
            } else {
                JOptionPane.showMessageDialog(this, "Usted no pertenece a ningun equipo");
            }

        }


    }//GEN-LAST:event_btnConsultarProyectosdelEquipoActionPerformed

    private void btnAsignarProyectoaEquipoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAsignarProyectoaEquipoActionPerformed
        if (Login.usuarioLogueado.getRol() == 0 || Login.usuarioLogueado.getEquipoAsignado() > 0) {
            AsignacióndeProyectosaEquipo AsignaciondeProyectos = new AsignacióndeProyectosaEquipo();
            AsignaciondeProyectos.setVisible(true);
            this.dispose();
        } else {
            JOptionPane.showMessageDialog(this, "Usted no pertenece a ningun equipo");
        }
    }//GEN-LAST:event_btnAsignarProyectoaEquipoActionPerformed

    private void btnEditarProyectoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarProyectoActionPerformed
        if (Login.usuarioLogueado.getRol() == 0 || Login.usuarioLogueado.getEquipoAsignado() > 0) {
            EditarProyectos editar = new EditarProyectos();
            editar.setVisible(true);
            this.dispose();
        } else {
            JOptionPane.showMessageDialog(this, "Usted no pertenece a ningun equipo");
        }

    }//GEN-LAST:event_btnEditarProyectoActionPerformed

    private void btnConsultarProyectosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConsultarProyectosActionPerformed

        ConsultarProyecto consultar = new ConsultarProyecto();
        consultar.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnConsultarProyectosActionPerformed

    private void btnCrearProyectoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCrearProyectoActionPerformed
        if (Login.usuarioLogueado.getRol() == 0 || Login.usuarioLogueado.getEquipoAsignado() > 0) {
            CreacionProyectos crear = new CreacionProyectos();
            crear.setVisible(true);
            this.dispose();
        } else {
            JOptionPane.showMessageDialog(this, "Usted no pertenece a ningun equipo");
        }

    }//GEN-LAST:event_btnCrearProyectoActionPerformed

    private void btnPerfilActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPerfilActionPerformed
        MiPerfil miPerfil = new MiPerfil();
        miPerfil.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnPerfilActionPerformed

    private void btnInicioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInicioActionPerformed

        InicioLogin login = new InicioLogin();
        login.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnInicioActionPerformed

    private void btnCrearTareaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCrearTareaActionPerformed
        if (Login.usuarioLogueado.getRol() == 0 || Login.usuarioLogueado.getEquipoAsignado() > 0) {
            CreacionTareas crear = new CreacionTareas();
            crear.setVisible(true);
            this.dispose();
        } else {
            JOptionPane.showMessageDialog(this, "Usted no pertenece a ningun equipo");
        }
    }//GEN-LAST:event_btnCrearTareaActionPerformed

    private void btnEditarTareasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarTareasActionPerformed
        if (Login.usuarioLogueado.getRol() == 0 || Login.usuarioLogueado.getEquipoAsignado() > 0) {
            EditarTareas editar = new EditarTareas();
            editar.setVisible(true);
            this.dispose();
        } else {
            JOptionPane.showMessageDialog(this, "Usted no pertenece a ningun equipo");
        }
    }//GEN-LAST:event_btnEditarTareasActionPerformed

    private void btnConsultartodasTareasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConsultartodasTareasActionPerformed

        ConsultarTareas consultar = new ConsultarTareas();
        consultar.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnConsultartodasTareasActionPerformed

    private void btnConsultarTareasdeMiembrosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConsultarTareasdeMiembrosActionPerformed

        ConsultarTareasMiembro consultar = new ConsultarTareasMiembro();
        consultar.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnConsultarTareasdeMiembrosActionPerformed

    private void btnEliminarTareasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarTareasActionPerformed

        EliminarTarea eliminar = new EliminarTarea();
        eliminar.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnEliminarTareasActionPerformed

    private void btnPerfilAdministradorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPerfilAdministradorActionPerformed
        MiPerfilAdmin miPerfil = new MiPerfilAdmin();
        miPerfil.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnPerfilAdministradorActionPerformed

    private void btnEliminarUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarUsuarioActionPerformed
        EliminarUsuario eliminar = new EliminarUsuario();
        eliminar.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnEliminarUsuarioActionPerformed

    private void btnConsultarUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConsultarUsuarioActionPerformed
        ConsultarUsuarios consultar = new ConsultarUsuarios();
        consultar.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnConsultarUsuarioActionPerformed

    private void btnEditarUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarUsuarioActionPerformed
        EditarUsuario editar = new EditarUsuario();
        editar.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnEditarUsuarioActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Equipos;
    private javax.swing.JLabel Fondo;
    private javax.swing.JLabel Proyectos;
    private javax.swing.JLabel Tareas;
    private javax.swing.JLabel Usuarios;
    private javax.swing.JButton btnAsignarMiembroaEquipo;
    private javax.swing.JButton btnAsignarProyectoaEquipo;
    private javax.swing.JButton btnConsultarEquipos;
    private javax.swing.JButton btnConsultarMiembrodelEquipo;
    private javax.swing.JButton btnConsultarProyectos;
    private javax.swing.JButton btnConsultarProyectosdelEquipo;
    private javax.swing.JButton btnConsultarTareasdeMiembros;
    private javax.swing.JButton btnConsultarUsuario;
    private javax.swing.JButton btnConsultartodasTareas;
    private javax.swing.JButton btnCrearEquipo;
    private javax.swing.JButton btnCrearProyecto;
    private javax.swing.JButton btnCrearTarea;
    private javax.swing.JButton btnCrearUsuario;
    private javax.swing.JButton btnEditarProyecto;
    private javax.swing.JButton btnEditarTareas;
    private javax.swing.JButton btnEditarUsuario;
    private javax.swing.JButton btnEliminarTareas;
    private javax.swing.JButton btnEliminarUsuario;
    private javax.swing.JButton btnInicio;
    private javax.swing.JButton btnPerfil;
    private javax.swing.JButton btnPerfilAdministrador;
    private javax.swing.JMenu btnSalir;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
