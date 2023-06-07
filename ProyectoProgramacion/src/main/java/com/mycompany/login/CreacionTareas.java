package com.mycompany.login;

import com.fasterxml.jackson.databind.ObjectMapper;
import static com.mycompany.login.Login.usuarios;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFileChooser;

import javax.swing.JOptionPane;
import org.json.JSONArray;
import org.json.JSONObject;

public class CreacionTareas extends javax.swing.JFrame implements ActionListener, ItemListener {

    public CreacionTareas() {
        initComponents();

        this.setTitle("Nueva Tarea UMG"); /// Nombre 
        this.setLocationRelativeTo(null);  /// Centrar la ventana
        llenarCbxProyecto();
        cbxProyecto.addItemListener(this);

    }

    public final void llenarCbxProyecto() {

        for (Proyecto p : Login.proyectos) {
            if (Login.usuarioLogueado.getRol() == 0) {
                cbxProyecto.addItem(p.getNombre());

            } else {
                int idequipo = p.getEquipoAsignado();
                Equipos equipo = Busqueda.GetEquipoById(idequipo);
                if (equipo.getLider() == Login.usuarioLogueado.getId()) {
                    cbxProyecto.addItem(p.getNombre());
                }
            }
        }
    }

    public final void llenarCbxUsuarios() {
        cbxUsuarioAsignado.removeAllItems();
        cbxUsuarioAsignado.addItem("Seleccione un usuario");

        if ("Seleccione un proyecto".equals(cbxProyecto.getSelectedItem().toString())) {
            System.out.println("borrando users");

            System.out.println("seleccion: " + cbxUsuarioAsignado.getSelectedItem().toString());

        } else {
            System.out.println("Llenado users");
            Proyecto proyecto = Busqueda.GetProyectoByName(cbxProyecto.getSelectedItem().toString());
            System.out.println(proyecto.getNombre());
            System.out.println("equipo asignado: " + proyecto.getEquipoAsignado());

            ArrayList<Integer> miembros = Busqueda.GetEquipoById(proyecto.getEquipoAsignado()).getMiembros();
            System.out.println("miembros: " + miembros.toString());

            for (Integer miembro : miembros) {

                Usuario tempUser = Busqueda.GetUsuarioById(miembro);
                cbxUsuarioAsignado.addItem(tempUser.getNombre() + " " + tempUser.getApellido());
            }
        }
    }

    private static String leerArchivo(String fileName) {
        BufferedReader reader = null;
        StringBuilder stringBuilder = new StringBuilder();

        try {
            reader = new BufferedReader(new FileReader(fileName));
            String line = null;
            String ls = System.getProperty("line.separator");
            while ((line = reader.readLine()) != null) {
                stringBuilder.append(line);
                stringBuilder.append(ls);
            }
            // delete the last ls
            stringBuilder.deleteCharAt(stringBuilder.length() - 1);
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (reader != null)
				try {
                reader.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        return stringBuilder.toString();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        cbxProyecto = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        tituloTextField = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        descripcionTextField = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        fechaInicioTextField = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        fechaFinalTextField = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        cbxEstado = new javax.swing.JComboBox<>();
        jLabel10 = new javax.swing.JLabel();
        cbxUsuarioAsignado = new javax.swing.JComboBox<>();
        regresarButton = new javax.swing.JButton();
        regresarButton1 = new javax.swing.JButton();
        crearButton = new javax.swing.JButton();
        btnMasiva = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        TextArea = new javax.swing.JTextArea();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        btnEditarUsuario = new javax.swing.JMenuItem();
        EliminarUsuario = new javax.swing.JMenuItem();
        btnConsultarUsuario = new javax.swing.JMenuItem();
        btnSalir = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("CREAR NUEVA TAREA");

        jLabel9.setFont(new java.awt.Font("Segoe UI", 1, 11)); // NOI18N
        jLabel9.setText("Proyecto:");

        cbxProyecto.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione un proyecto" }));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 11)); // NOI18N
        jLabel4.setText("Titulo:");

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 11)); // NOI18N
        jLabel1.setText("Descripción:");

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 11)); // NOI18N
        jLabel5.setText("Fecha Inicio:");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 11)); // NOI18N
        jLabel2.setText("Fecha final:");

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 11)); // NOI18N
        jLabel8.setText("Estado:");

        cbxEstado.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Solicitado", "En Proceso", "Finalizado" }));

        jLabel10.setFont(new java.awt.Font("Segoe UI", 1, 11)); // NOI18N
        jLabel10.setText("Usuario Asignado:");

        cbxUsuarioAsignado.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione un usuario" }));
        cbxUsuarioAsignado.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                cbxUsuarioAsignadoPropertyChange(evt);
            }
        });

        regresarButton.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        regresarButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pagina-de-inicio.png"))); // NOI18N
        regresarButton.setText("Inicio");
        regresarButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                regresarButtonActionPerformed(evt);
            }
        });

        regresarButton1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        regresarButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/regresar.png"))); // NOI18N
        regresarButton1.setText("Regresar");
        regresarButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                regresarButton1ActionPerformed(evt);
            }
        });

        crearButton.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        crearButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/boton-agregar.png"))); // NOI18N
        crearButton.setText("Crear");
        crearButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                crearButtonActionPerformed(evt);
            }
        });

        btnMasiva.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnMasiva.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cargar.png"))); // NOI18N
        btnMasiva.setText("Cargar Json");
        btnMasiva.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMasivaActionPerformed(evt);
            }
        });

        TextArea.setColumns(20);
        TextArea.setRows(5);
        jScrollPane1.setViewportView(TextArea);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(36, 36, 36)
                        .addComponent(regresarButton)
                        .addGap(18, 18, 18)
                        .addComponent(regresarButton1)
                        .addGap(18, 18, 18)
                        .addComponent(crearButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap(32, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addComponent(jLabel8, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel9, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cbxProyecto, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tituloTextField, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(descripcionTextField, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(fechaInicioTextField, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(fechaFinalTextField, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cbxEstado, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cbxUsuarioAsignado, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(26, 26, 26)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnMasiva))
                .addGap(17, 17, 17))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 520, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 241, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel9)
                            .addComponent(cbxProyecto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(tituloTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(descripcionTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(15, 15, 15)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(fechaInicioTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(fechaFinalTextField))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel8)
                            .addComponent(cbxEstado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel10)
                            .addComponent(cbxUsuarioAsignado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(48, 48, 48)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(regresarButton, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(regresarButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(crearButton, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnMasiva, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(17, 17, 17))))
        );

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
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void crearButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_crearButtonActionPerformed

        String titulo = tituloTextField.getText();
        String descripcion = descripcionTextField.getText();
        String fechaInicio = fechaInicioTextField.getText();
        String fechaFinal = fechaFinalTextField.getText();
        String estado = cbxEstado.getSelectedItem().toString();
        int idUsuarioAsignado = Busqueda.GetIdUsuarioByNombreApellido(cbxUsuarioAsignado.getSelectedItem().toString());

        if ("Seleccione un usuario".equals(cbxUsuarioAsignado.getSelectedItem().toString()) || "Seleccione un proyecto".equals(cbxProyecto.getSelectedItem().toString())) {
            JOptionPane.showMessageDialog(this, "No se ha asignado un proyecto o un usuario a la tarea");

        } else {

            Tarea TareaNueva = new Tarea();

            Login.incrementalTarea++;
            TareaNueva.setId(Login.incrementalTarea);
            TareaNueva.setTitulo(titulo);
            TareaNueva.setDescripcion(descripcion);
            TareaNueva.setFechaInicio(fechaInicio);
            TareaNueva.setFechaFinal(fechaFinal);
            TareaNueva.setEstado(estado);
            TareaNueva.setUsuarioAsignado(Busqueda.GetUsuarioById(idUsuarioAsignado).getCorreo());
            TareaNueva.setProyecto(Busqueda.GetIDProyectoByName(cbxProyecto.getSelectedItem().toString()));

            Login.tareas.add(TareaNueva);

            tituloTextField.setText("");
            descripcionTextField.setText("");
            fechaInicioTextField.setText("");
            fechaFinalTextField.setText("");
            cbxEstado.setSelectedIndex(0);

            JOptionPane.showMessageDialog(this, "Tarea creada exitosamente");

        }


    }//GEN-LAST:event_crearButtonActionPerformed

    private void regresarButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_regresarButtonActionPerformed

        InicioLogin login = new InicioLogin();
        login.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_regresarButtonActionPerformed

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

    private void regresarButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_regresarButton1ActionPerformed
        PantallaHacerUsuarios hacer = new PantallaHacerUsuarios();
        hacer.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_regresarButton1ActionPerformed

    private void cbxUsuarioAsignadoPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_cbxUsuarioAsignadoPropertyChange

    }//GEN-LAST:event_cbxUsuarioAsignadoPropertyChange

    private void btnMasivaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMasivaActionPerformed

        if (!"Seleccione un proyecto".equals(cbxProyecto.getSelectedItem().toString())) {

            JFileChooser fileChooser = new JFileChooser();

            int returnValue = fileChooser.showOpenDialog(null);

            if (returnValue == JFileChooser.APPROVE_OPTION) {
                File archivo = fileChooser.getSelectedFile();

                ArrayList<Tarea> arrayTareas = new ArrayList<>();

                String json = leerArchivo(archivo.toString());

                TextArea.setText(json);

                

                JSONArray jsonarray = new JSONArray(json);
                for (int i = 0; i < jsonarray.length(); i++) {
                    JSONObject jsonobject = jsonarray.getJSONObject(i);
                    ObjectMapper objectMapper = new ObjectMapper();
                    try {
                        Tarea tempTarea = objectMapper.readValue(jsonobject.toString(), Tarea.class);
                        tempTarea.setProyecto(Busqueda.GetIDProyectoByName(cbxProyecto.getSelectedItem().toString()));
                        Login.tareas.add(tempTarea);
                    } catch (IOException ex) {
                        ex.printStackTrace();
                    }

                } JOptionPane.showMessageDialog(this, "Se cargaron exitosamente las tareas");

            }
        } else {
            
                        JOptionPane.showMessageDialog(this, "Debe seleccionar un proyecto");

        }
    }//GEN-LAST:event_btnMasivaActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem EliminarUsuario;
    private javax.swing.JTextArea TextArea;
    private javax.swing.JMenuItem btnConsultarUsuario;
    private javax.swing.JMenuItem btnEditarUsuario;
    private javax.swing.JButton btnMasiva;
    private javax.swing.JMenu btnSalir;
    private javax.swing.JComboBox<String> cbxEstado;
    private javax.swing.JComboBox<String> cbxProyecto;
    private javax.swing.JComboBox<String> cbxUsuarioAsignado;
    private javax.swing.JButton crearButton;
    private javax.swing.JTextField descripcionTextField;
    private javax.swing.JTextField fechaFinalTextField;
    private javax.swing.JTextField fechaInicioTextField;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton regresarButton;
    private javax.swing.JButton regresarButton1;
    private javax.swing.JTextField tituloTextField;
    // End of variables declaration//GEN-END:variables

    @Override
    public void actionPerformed(ActionEvent ae) {

    }

    @Override
    public void itemStateChanged(ItemEvent e) {
        if (e.getStateChange() == ItemEvent.SELECTED) {
            if (e.getSource() == cbxProyecto) {
                System.out.println("CAMBIÓ PROYECTO");
                llenarCbxUsuarios();
            }
        }
    }
}
