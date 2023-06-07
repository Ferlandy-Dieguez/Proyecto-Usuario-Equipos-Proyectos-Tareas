package com.mycompany.login;

import static com.mycompany.login.Login.usuarios;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import javax.swing.JFileChooser;
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;

public class ConsultarUsuarios extends javax.swing.JFrame {

    public ConsultarUsuarios() {
        initComponents();
        this.setTitle("Consultar usuarios"); /// Nombre
        this.setLocationRelativeTo(null);  /// Centrar la ventana
        llenarTabla();

    }

    private void llenarTabla() {
        DefaultTableModel tabla = new DefaultTableModel(new String[]{"Id", "Nombre", "Apellido", "Correo", "Usuario", "Password", "Rol", "Equipo"}, Login.usuarios.size());
        Table.setModel(tabla);

        TableModel llenarTabla = Table.getModel();

        for (int i = 0; i < Login.usuarios.size(); i++) {
            Usuario UO = Login.usuarios.get(i); // UO es UsuariO
            llenarTabla.setValueAt(UO.getId(), i, 0);
            llenarTabla.setValueAt(UO.getNombre(), i, 1);
            llenarTabla.setValueAt(UO.getApellido(), i, 2);
            llenarTabla.setValueAt(UO.getCorreo(), i, 3);
            llenarTabla.setValueAt(UO.getUsuario(), i, 4);
            llenarTabla.setValueAt(UO.getPassword(), i, 5);
            llenarTabla.setValueAt(UO.TipoRol(), i, 6);
            String equipo = "";
            if (UO.getEquipoAsignado() > 0) {
                equipo = Busqueda.GetEquipoById(UO.getEquipoAsignado()).getNombre();
            }

            llenarTabla.setValueAt(equipo, i, 7);

        }

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        Table = new javax.swing.JTable();
        btnAtras = new javax.swing.JButton();
        btnInicio = new javax.swing.JButton();
        btnCargarUsuarios = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        MostrarDatos = new javax.swing.JTextArea();
        btnGuardar = new javax.swing.JButton();
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
                "ID", "Nombre", "Apellido", "Correo", "Usuario", "Contraseña", "Rol", "Equipo"
            }
        ));
        jScrollPane1.setViewportView(Table);

        btnAtras.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnAtras.setIcon(new javax.swing.ImageIcon(getClass().getResource("/regresar.png"))); // NOI18N
        btnAtras.setText("Regresar");
        btnAtras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAtrasActionPerformed(evt);
            }
        });

        btnInicio.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnInicio.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pagina-de-inicio.png"))); // NOI18N
        btnInicio.setText("Inicio");
        btnInicio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInicioActionPerformed(evt);
            }
        });

        btnCargarUsuarios.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnCargarUsuarios.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cargar.png"))); // NOI18N
        btnCargarUsuarios.setText("Cargar Usuarios");
        btnCargarUsuarios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCargarUsuariosActionPerformed(evt);
            }
        });

        jScrollPane2.setEnabled(false);

        MostrarDatos.setEditable(false);
        MostrarDatos.setColumns(20);
        MostrarDatos.setFont(new java.awt.Font("Segoe UI", 0, 10)); // NOI18N
        MostrarDatos.setRows(5);
        jScrollPane2.setViewportView(MostrarDatos);

        btnGuardar.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnGuardar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/guardar.png"))); // NOI18N
        btnGuardar.setText("Guardar");
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });

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
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 1044, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(324, 324, 324)
                        .addComponent(btnAtras, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(89, 89, 89)
                        .addComponent(btnInicio, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnGuardar)
                        .addGap(18, 18, 18)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnCargarUsuarios, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 268, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnGuardar)
                    .addComponent(btnCargarUsuarios))
                .addGap(12, 12, 12))
            .addGroup(layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 258, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnInicio, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnAtras, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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

    private void btnAtrasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAtrasActionPerformed
        PantallaHacerUsuarios hacer = new PantallaHacerUsuarios();
        hacer.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnAtrasActionPerformed

    private void btnInicioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInicioActionPerformed

        InicioLogin login = new InicioLogin();
        login.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnInicioActionPerformed

    private void btnCargarUsuariosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCargarUsuariosActionPerformed

        JFileChooser jfc = new JFileChooser();
        FileNameExtensionFilter fne = new FileNameExtensionFilter("Archivo CSV separado por pipe", "csv");
        jfc.setFileFilter(fne);

        int aceptar = jfc.showOpenDialog(this);
        if (aceptar == JFileChooser.APPROVE_OPTION) {
            File f = jfc.getSelectedFile();
            String contenido = leerArchivoTexto(f.getPath());
            MostrarDatos.setText(contenido);

            DefaultTableModel data = new DefaultTableModel(new String[]{"Id", "Nombre", "Apellido", "Correo", "Usuario", "Contraseña", "Rol", "Equipo"}, Login.usuarios.size());
            Table.setModel(data);

            int i = 0;
            for (Usuario c : Login.usuarios) {
                Table.setValueAt(c.getId(), i, 0);
                Table.setValueAt(c.getNombre(), i, 1);
                Table.setValueAt(c.getApellido(), i, 2);
                Table.setValueAt(c.getCorreo(), i, 3);
                Table.setValueAt(c.getUsuario(), i, 4);
                Table.setValueAt(c.getPassword(), i, 5);
                Table.setValueAt(c.TipoRol(), i, 6);
                Login.incrementalUsuario++;
                i++;

            }
        }
    }

    public String leerArchivoTexto(String ruta) {
        String contenido = "";

        File f = new File(ruta);
        try (
                 FileReader fr = new FileReader(f);  BufferedReader br = new BufferedReader(fr);) {

            String linea;
            while ((linea = br.readLine()) != null) {
                contenido += linea + "\n";
                Usuario usuarioNuevo = new Usuario();

                String[] datos = linea.split("\\|");
                usuarioNuevo.setId(Integer.parseInt(datos[0]));
                usuarioNuevo.setNombre(datos[1]);
                usuarioNuevo.setApellido(datos[2]);
                usuarioNuevo.setCorreo(datos[3]);
                usuarioNuevo.setUsuario(datos[4]);
                usuarioNuevo.setPassword(datos[5]);
                usuarioNuevo.setRol(Integer.parseInt(datos[6]));
                usuarioNuevo.setEquipoAsignado(Integer.parseInt(datos[7]));

                Login.usuarios.add(usuarioNuevo);
            }
            br.close();
            fr.close();

        } catch (IOException e) {
            System.out.println("Error al leer el archivo");
        }

        return contenido;

    }//GEN-LAST:event_btnCargarUsuariosActionPerformed

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed

        JFileChooser seleccionarArchivo = new JFileChooser();
        FileNameExtensionFilter filtro = new FileNameExtensionFilter("Archivos csv","csv");

        seleccionarArchivo.setFileFilter(filtro);

        int seleccionar = seleccionarArchivo.showOpenDialog(this);

        if (seleccionar == JFileChooser.APPROVE_OPTION) {
            File archivo = seleccionarArchivo.getSelectedFile();
            guardarArchivo(archivo);

        }
    }//GEN-LAST:event_btnGuardarActionPerformed

    public void guardarArchivo(File archivo) {
        FileWriter fichero = null;
        PrintWriter pw = null;

        try {
            fichero = new FileWriter(archivo);
            pw = new PrintWriter(fichero);

            for (Usuario u : usuarios) {
                String linea = u.getId() + "|" + u.getNombre() + "|" + u.getApellido() + "|" + u.getCorreo() + "|" + u.getUsuario() + "|" + u.getPassword() + "|" + u.getRol() + "|" + u.getEquipoAsignado();
                pw.println(linea);
            }

        } catch (Exception ex) {
            ex.printStackTrace();
        } finally {
            try {
                if(fichero!=null){
                    fichero.close();
                }
            } catch (Exception e) {
                e.printStackTrace();

            }
        }
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem EliminarUsuario;
    private javax.swing.JTextArea MostrarDatos;
    private javax.swing.JTable Table;
    private javax.swing.JButton btnAtras;
    private javax.swing.JButton btnCargarUsuarios;
    private javax.swing.JMenuItem btnCrearUsuario;
    private javax.swing.JMenuItem btnEditarUsuario;
    private javax.swing.JButton btnGuardar;
    private javax.swing.JButton btnInicio;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    // End of variables declaration//GEN-END:variables
}
