package com.mycompany.login;

import static com.mycompany.login.Login.proyectos;
import java.io.File;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.ArrayList;
import javax.swing.JFileChooser;
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

public class ConsultarProyecto extends javax.swing.JFrame {

    public ConsultarProyecto() {
        initComponents();
        this.setTitle("Consulta de proyectos"); /// Nombre
        this.setLocationRelativeTo(null);  /// Centrar la ventana
        llenarTabla();

    }

    private void llenarTabla() {
        DefaultTableModel tabla = new DefaultTableModel(new String[]{"Id", "Nombre del proyecto", "Fecha inicio", "Fecha final", "Equipo Asignado", "Estado"}, Login.proyectos.size());
        Table.setModel(tabla);

        TableModel llenarTabla = Table.getModel();

        for (int i = 0; i < Login.proyectos.size(); i++) {
            Proyecto Pro = Login.proyectos.get(i);

            llenarTabla.setValueAt(Pro.getId(), i, 0);
            llenarTabla.setValueAt(Pro.getNombre(), i, 1);
            llenarTabla.setValueAt(Pro.getFechaInicio(), i, 2);
            llenarTabla.setValueAt(Pro.getFechaFinal(), i, 3);
            llenarTabla.setValueAt(Pro.TipoEstados(), i, 5);
            String equipoA = "";
            if (Pro.getEquipoAsignado() > 0) {
                equipoA = Busqueda.GetEquipoById(Pro.getEquipoAsignado()).getNombre();
            }
            llenarTabla.setValueAt(equipoA, i, 4);
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        Table = new javax.swing.JTable();
        btnInicio = new javax.swing.JButton();
        btnAtras = new javax.swing.JButton();
        btnGuardar = new javax.swing.JButton();
        btnCargar = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        btnCrearUsuario = new javax.swing.JMenuItem();
        btnEditarUsuario = new javax.swing.JMenuItem();
        EliminarUsuario = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        Table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "ID", "Nombre del proyecto", "Fecha inicio", "Fecha final", "Equipo Asignado", "Estado"
            }
        ));
        jScrollPane1.setViewportView(Table);

        btnInicio.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnInicio.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pagina-de-inicio.png"))); // NOI18N
        btnInicio.setText("Inicio");
        btnInicio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInicioActionPerformed(evt);
            }
        });

        btnAtras.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnAtras.setIcon(new javax.swing.ImageIcon(getClass().getResource("/regresar.png"))); // NOI18N
        btnAtras.setText("Regresar");
        btnAtras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAtrasActionPerformed(evt);
            }
        });

        btnGuardar.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnGuardar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/guardar.png"))); // NOI18N
        btnGuardar.setText("Guardar");
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });

        btnCargar.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnCargar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cargar.png"))); // NOI18N
        btnCargar.setText("Cargar XML");
        btnCargar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCargarActionPerformed(evt);
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
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 1025, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btnAtras, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(91, 91, 91)
                        .addComponent(btnInicio, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(83, 83, 83)
                        .addComponent(btnGuardar)
                        .addGap(18, 18, 18)
                        .addComponent(btnCargar)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 258, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(btnAtras, javax.swing.GroupLayout.DEFAULT_SIZE, 49, Short.MAX_VALUE)
                        .addComponent(btnInicio, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btnGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnCargar, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(12, 12, 12))
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

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed

        JFileChooser fileChooser = new JFileChooser();
        FileNameExtensionFilter filtro = new FileNameExtensionFilter("Archivos XML", "xml");

        fileChooser.setFileFilter(filtro);

        int seleccion = fileChooser.showOpenDialog(this);

        if (seleccion == JFileChooser.APPROVE_OPTION) {
            File archivo = fileChooser.getSelectedFile();
            escribirXml(archivo);
        }
    }

    private void escribirXml(File archivo) {
        FileWriter fichero = null;
        PrintWriter pw = null;

        try {

            fichero = new FileWriter(archivo);
            pw = new PrintWriter(fichero);

            pw.println("<proyectos>");

            for (Proyecto p : proyectos) {

                pw.println("<proyecto id=\"" + p.getId() + "\">");

                pw.println("<nombre>" + p.getNombre() + "</nombre>");

                pw.println("<fechaInicio>" + p.getFechaInicio() + "</fechaInicio>");

                pw.println("<fechaFinal>" + p.getFechaFinal() + "</fechaFinal>");

                pw.println("<equipoAsignado>" + p.getEquipoAsignado() + "</equipoAsignado>");
                pw.println("<estados>" + p.getEstados() + "</estados>");

                pw.println("</proyecto>");

            }

            pw.println("</proyectos>");

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                if (fichero != null) {
                    fichero.close();
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

    }//GEN-LAST:event_btnGuardarActionPerformed

    private void btnCargarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCargarActionPerformed

        proyectos = new ArrayList<>();

        JFileChooser fileChooser = new JFileChooser();
        FileNameExtensionFilter filtro = new FileNameExtensionFilter("Archivos XML", "xml");

        fileChooser.setFileFilter(filtro);

        int seleccion = fileChooser.showOpenDialog(this);

        if (seleccion == JFileChooser.APPROVE_OPTION) {
            File archivo = fileChooser.getSelectedFile();
            leerXml(archivo);
        }
    }//GEN-LAST:event_btnCargarActionPerformed
    private void leerXml(File archivo) {
        try {
            DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
            DocumentBuilder dbBuilder = dbFactory.newDocumentBuilder();
            Document doc = dbBuilder.parse(archivo);

            doc.getDocumentElement().normalize();

            NodeList nList = doc.getElementsByTagName("proyecto");

            for (int i = 0; i < nList.getLength(); i++) {

                Node nNode = nList.item(i);

                if (nNode.getNodeType() == Node.ELEMENT_NODE) {

                    Element e = (Element) nNode;

                    Proyecto pro = new Proyecto();
                    pro.setId(Integer.parseInt(e.getAttributeNode("id").getTextContent()));
                    pro.setNombre(e.getElementsByTagName("nombre").item(0).getTextContent());
                    pro.setFechaInicio(e.getElementsByTagName("fechaInicio").item(0).getTextContent());
                    pro.setFechaFinal(e.getElementsByTagName("fechaFinal").item(0).getTextContent());
                    pro.setEquipoAsignado(Integer.parseInt(e.getElementsByTagName("equipoAsignado").item(0).getTextContent()));
                    pro.setEstados(Integer.parseInt(e.getElementsByTagName("estados").item(0).getTextContent()));

                    Login.incrementalProyecto++;
                    proyectos.add(pro);

                }

            }

            llenarTabla();

        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem EliminarUsuario;
    private javax.swing.JTable Table;
    private javax.swing.JButton btnAtras;
    private javax.swing.JButton btnCargar;
    private javax.swing.JMenuItem btnCrearUsuario;
    private javax.swing.JMenuItem btnEditarUsuario;
    private javax.swing.JButton btnGuardar;
    private javax.swing.JButton btnInicio;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
