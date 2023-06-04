package com.mycompany.login;

import java.util.ArrayList;

public class Busqueda {

    public static Equipos GetEquipoById(int id) {
        Equipos team = new Equipos();

        for (Equipos e : Login.equipos) {
            if (e.getId() == id) {
                team = e;
            }
        }

        return team;

    }

    public static Equipos GetEquipoByLider(int idLider) {
        Equipos team = new Equipos();
        for (Equipos e : Login.equipos) {
            if (e.getLider() == idLider) {
                team = e;
            }
        }

        return team;
    }

    public static int GetPosicionEquipoById(int id) {
        int posicion = 0;
        for (Equipos e : Login.equipos) {
            if (e.getId() == id) {

            } else {
                posicion++;
            }

        }
        return posicion;
    }

    public static Equipos GetEquipoByName(String name) {
        Equipos team = new Equipos();
        for (Equipos e : Login.equipos) {
            if (name.equals(e.getNombre())) {
                team = e;
            }

        }
        return team;
    }

    public static int GetIDEquipoByName(String nombre) {
        int idEquipo = 0;

        for (Equipos e : Login.equipos) {
            if (nombre.equals(e.getNombre())) {
                idEquipo = e.getId();
            }

        }

        if ("Asignar despues".equals(nombre)) {
            idEquipo = -1;
        }

        return idEquipo;

    }

    public static Usuario GetUsuarioById(int id) {
        Usuario user = new Usuario();
        for (Usuario u : Login.usuarios) {

            if (u.getId() == id) {
                user = u;
            }
        }
        return user;
    }

    public static Usuario GetUsuarioByCorreo(String correo) {
        Usuario user = new Usuario();
        for (Usuario u : Login.usuarios) {

            if (u.getCorreo().equals(correo)) {
                user = u;
            }
        }
        return user;
    }

    public static String GetCorreoUsuarioByID(int id) {
        String correo = "";
        Usuario user = new Usuario();
        for (Usuario u : Login.usuarios) {

            if (u.getId() == id) {
                correo = u.getCorreo();
            }
        }
        return correo;
    }

    public static int GetIdUsuarioByNombreApellido(String nombre) {
        int idUser = 0;
        int contador = 0;

        for (Usuario u : Login.usuarios) {
            String nombreConcatenado = u.getNombre() + " " + u.getApellido();

            if (nombreConcatenado.equals(nombre)) {
                idUser = u.getId();
            }
            contador++;
        }
        return idUser;
    }

    public static String GetNombreUsuarioById(int id) {
        String nombre = "";
        for (Usuario u : Login.usuarios) {

            if (u.getId() == id) {
                nombre = u.getNombre();
            }

        }
        return nombre;

    }

    public static ArrayList<Integer> ArregloIDs() {

        ArrayList<Integer> arreglo = null;
        for (Usuario u : Login.usuarios) {

            arreglo.add(u.getId());

        }

        return arreglo;
    }

    public static Proyecto GetProyectoById(int id) {
        Proyecto pro = new Proyecto();

        for (Proyecto e : Login.proyectos) {
            if (e.getId() == id) {
                pro = e;
            }
        }

        return pro;

    }

    public static int GetPosicionProyectoById(int id) {
        int posicion = 0;
        for (Proyecto e : Login.proyectos) {
            if (e.getId() == id) {

            } else {
                posicion++;
            }

        }
        return posicion;
    }

    public static Proyecto GetProyectoByName(String name) {
        Proyecto pro = new Proyecto();
        for (Proyecto e : Login.proyectos) {
            if (name.equals(e.getNombre())) {
                pro = e;
            }

        }
        return pro;
    }

    public static int GetIDProyectoByName(String nombre) {
        int idProyecto = 0;

        for (Proyecto e : Login.proyectos) {
            if (nombre.equals(e.getNombre())) {
                idProyecto = e.getId();
            }

        }

        return idProyecto;

    }

    public static Tarea GetTareaById(int id) {
        Tarea tareas = new Tarea();

        for (Tarea e : Login.tareas) {
            if (e.getId() == id) {
                tareas = e;
            }
        }

        return tareas;

    }

    public static int GetPosicionTareaById(int id) {
        int posicion = 0;
        for (Tarea e : Login.tareas) {
            if (e.getId() == id) {

            } else {
                posicion++;
            }

        }
        return posicion;
    }

    public static Tarea GetTareaByName(String name) {
        Tarea tareas = new Tarea();
        for (Tarea e : Login.tareas) {
            if (name.equals(e.getTitulo())) {
                tareas = e;
            }

        }
        return tareas;
    }

    public static int GetIDTareaByName(String titulo) {
        int idTarea = 0;

        for (Tarea e : Login.tareas) {
            if (titulo.equals(e.getTitulo())) {
                idTarea = e.getId();
            }

        }

        return idTarea;

    }

}
