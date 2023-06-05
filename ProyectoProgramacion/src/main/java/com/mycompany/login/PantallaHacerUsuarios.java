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
               // BotonesAdmin();
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

    }

    public final void BotonesGerente() {

        jPanel2.setVisible(false);

        btnPerfilAdministrador.setEnabled(false);

        btnCrearEquipo.setEnabled(false);
        btnConsultarEquipos.setEnabled(false);
        btnAsignarMiembroaEquipo.setEnabled(false);

        btnConsultarProyectos.setEnabled(false);
        btnConsultarTareasdeMiembros.setEnabled(true);
        btnConsultartodasTareas.setEnabled(false);

    }

    public final void BotonesMiembro() {
        jPanel2.setVisible(false);

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
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        btnInicio = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        btnCrearUsuario = new javax.swing.JButton();
        btnEditarUsuario = new javax.swing.JButton();
        btnConsultarUsuario = new javax.swing.JButton();
        btnEliminarUsuario = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        btnCrearEquipo = new javax.swing.JButton();
        btnConsultarEquipos = new javax.swing.JButton();
        btnAsignarMiembroaEquipo = new javax.swing.JButton();
        btnConsultarMiembrodelEquipo = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        btnCrearProyecto = new javax.swing.JButton();
        btnEditarProyecto = new javax.swing.JButton();
        btnConsultarProyectos = new javax.swing.JButton();
        btnAsignarProyectoaEquipo = new javax.swing.JButton();
        btnConsultarProyectosdelEquipo = new javax.swing.JButton();
        jPanel5 = new javax.swing.JPanel();
        btnCrearTarea = new javax.swing.JButton();
        btnEditarTareas = new javax.swing.JButton();
        btnConsultartodasTareas = new javax.swing.JButton();
        btnConsultarTareasdeMiembros = new javax.swing.JButton();
        btnEliminarTareas = new javax.swing.JButton();
        btnPerfilAdministrador = new javax.swing.JButton();
        btnPerfil = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        btnSalir = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        btnInicio.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnInicio.setText("Inicio");
        btnInicio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInicioActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 153, 0));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/edificios.png"))); // NOI18N
        jLabel1.setText(" BIENVENIDO");

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Usuarios", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 18), new java.awt.Color(255, 102, 0))); // NOI18N
        jPanel2.setToolTipText("");

        btnCrearUsuario.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnCrearUsuario.setText("Crear Usuario");
        btnCrearUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCrearUsuarioActionPerformed(evt);
            }
        });

        btnEditarUsuario.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnEditarUsuario.setText("Editar Usuario");
        btnEditarUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarUsuarioActionPerformed(evt);
            }
        });

        btnConsultarUsuario.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnConsultarUsuario.setText("Listado de Usuarios");
        btnConsultarUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConsultarUsuarioActionPerformed(evt);
            }
        });

        btnEliminarUsuario.setFont(new java.awt.Font("Segoe UI", 1, 11)); // NOI18N
        btnEliminarUsuario.setText("Eliminar Usuario");
        btnEliminarUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarUsuarioActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(btnCrearUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnConsultarUsuario, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(btnEditarUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnEliminarUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(15, 15, 15))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCrearUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnConsultarUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnEditarUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnEliminarUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(21, Short.MAX_VALUE))
        );

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Equipos", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 18), new java.awt.Color(255, 102, 0))); // NOI18N

        btnCrearEquipo.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnCrearEquipo.setText("Crear Equipo");
        btnCrearEquipo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCrearEquipoActionPerformed(evt);
            }
        });

        btnConsultarEquipos.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnConsultarEquipos.setText("Listado de Equipos");
        btnConsultarEquipos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConsultarEquiposActionPerformed(evt);
            }
        });

        btnAsignarMiembroaEquipo.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnAsignarMiembroaEquipo.setText("Asignar miembro a equipo");
        btnAsignarMiembroaEquipo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAsignarMiembroaEquipoActionPerformed(evt);
            }
        });

        btnConsultarMiembrodelEquipo.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnConsultarMiembrodelEquipo.setText("Consultar miembros del equipo");
        btnConsultarMiembrodelEquipo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConsultarMiembrodelEquipoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(btnCrearEquipo, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnConsultarEquipos, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnAsignarMiembroaEquipo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnConsultarMiembrodelEquipo)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(19, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCrearEquipo, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnConsultarEquipos, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnAsignarMiembroaEquipo, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnConsultarMiembrodelEquipo, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20))
        );

        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Proyectos", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 18), new java.awt.Color(255, 102, 0))); // NOI18N

        btnCrearProyecto.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnCrearProyecto.setText("Crear Proyecto");
        btnCrearProyecto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCrearProyectoActionPerformed(evt);
            }
        });

        btnEditarProyecto.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnEditarProyecto.setText("Editar Proyecto");
        btnEditarProyecto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarProyectoActionPerformed(evt);
            }
        });

        btnConsultarProyectos.setFont(new java.awt.Font("Segoe UI", 1, 10)); // NOI18N
        btnConsultarProyectos.setText("Ver todos los proyectos");
        btnConsultarProyectos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConsultarProyectosActionPerformed(evt);
            }
        });

        btnAsignarProyectoaEquipo.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnAsignarProyectoaEquipo.setText("Asignar proyecto a equipo");
        btnAsignarProyectoaEquipo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAsignarProyectoaEquipoActionPerformed(evt);
            }
        });

        btnConsultarProyectosdelEquipo.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnConsultarProyectosdelEquipo.setText("Listado de proyectos del equipo");
        btnConsultarProyectosdelEquipo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConsultarProyectosdelEquipoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(btnCrearProyecto)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnConsultarProyectos, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnEditarProyecto, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnAsignarProyectoaEquipo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnConsultarProyectosdelEquipo)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCrearProyecto, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnConsultarProyectos, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnEditarProyecto, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnAsignarProyectoaEquipo, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnConsultarProyectosdelEquipo, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(19, 19, 19))
        );

        jPanel5.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Tareas", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 18), new java.awt.Color(255, 102, 0))); // NOI18N

        btnCrearTarea.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnCrearTarea.setText("Crear Tarea");
        btnCrearTarea.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCrearTareaActionPerformed(evt);
            }
        });

        btnEditarTareas.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnEditarTareas.setText("Editar Tareas");
        btnEditarTareas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarTareasActionPerformed(evt);
            }
        });

        btnConsultartodasTareas.setFont(new java.awt.Font("Segoe UI", 1, 10)); // NOI18N
        btnConsultartodasTareas.setText("Ver las tareas de todos ");
        btnConsultartodasTareas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConsultartodasTareasActionPerformed(evt);
            }
        });

        btnConsultarTareasdeMiembros.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnConsultarTareasdeMiembros.setText("Listado de tareas de miembros");
        btnConsultarTareasdeMiembros.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConsultarTareasdeMiembrosActionPerformed(evt);
            }
        });

        btnEliminarTareas.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnEliminarTareas.setText("Eliminar Tarea");
        btnEliminarTareas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarTareasActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(btnCrearTarea)
                .addGap(18, 18, 18)
                .addComponent(btnConsultartodasTareas, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnEditarTareas, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnEliminarTareas, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnConsultarTareasdeMiembros)
                .addContainerGap(14, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addContainerGap(21, Short.MAX_VALUE)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCrearTarea, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnConsultartodasTareas, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnEditarTareas, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnConsultarTareasdeMiembros, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnEliminarTareas, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(19, 19, 19))
        );

        btnPerfilAdministrador.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnPerfilAdministrador.setText("Mi perfil");
        btnPerfilAdministrador.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPerfilAdministradorActionPerformed(evt);
            }
        });

        btnPerfil.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnPerfil.setText("Perfil");
        btnPerfil.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPerfilActionPerformed(evt);
            }
        });

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/agregar-usuario.png"))); // NOI18N

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/equipos.png"))); // NOI18N

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proyecto.png"))); // NOI18N

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/lista-de-tareas.png"))); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(0, 37, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 381, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(30, 30, 30)
                        .addComponent(btnPerfilAdministrador, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnInicio, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnPerfil, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.LEADING))
                                .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.LEADING))
                            .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.LEADING))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btnPerfilAdministrador, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnPerfil, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnInicio, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(34, 34, 34)))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addGap(39, 39, 39)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(25, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLabel4)
                        .addGap(64, 64, 64)
                        .addComponent(jLabel5)
                        .addGap(60, 60, 60))))
        );

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
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 28, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
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


    // Variables declaration - do not modify//GEN-BEGIN:variables
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
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    // End of variables declaration//GEN-END:variables
}
