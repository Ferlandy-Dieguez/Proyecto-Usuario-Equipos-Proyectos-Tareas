package com.mycompany.login;

import java.util.ArrayList;
import java.util.Arrays;

public class Login {

    public static Usuario usuarioLogueado;

    public static ArrayList<Usuario> usuarios;
    public static ArrayList<Proyecto> proyectos;
    public static ArrayList<Equipos> equipos;
    public static ArrayList<Tarea> tareas;

    static int incrementalUsuario = 0;
    static int incrementalProyecto = 0;
    static int incrementalEquipo = 0;
    static int incrementalTarea = 0;

    public static void main(String[] args) {

        usuarios = new ArrayList<>();
        proyectos = new ArrayList<>();
        equipos = new ArrayList<>();
        tareas = new ArrayList<>();
        usuarioLogueado = new Usuario();
        usuarioLogueado.setRol(-1);

        int incrementalUsuario = 0;
        int incrementalProyecto = 0;
        int incrementalEquipo = 0;
        int incrementalTarea = 0;

        InicioLogin log = new InicioLogin();
        masivo();
        log.setVisible(true);

    }

    public static void masivo() {
        //id, Nombre, Apellido, Correo,Usuario,Password,Rol, Equipo asignado
        Login.usuarios.add(new Usuario(1, "Usuario", "Uno", "a", "a", "a", 2, 1));
        Login.usuarios.add(new Usuario(2, "Usuario", "Dos", "c", "c", "c", 1, 1)); // el -1 es para no asignar equipo
        Login.usuarios.add(new Usuario(3, "Usuario", "Tres", "d", "d", "d", 2, 2));
        Login.usuarios.add(new Usuario(4, "Usuario", "Cuatro", "e", "e", "e", 1, 2));
        Login.usuarios.add(new Usuario(5, "Usuario", "Cinco", "f", "f", "f", 2, 3));
        Login.usuarios.add(new Usuario(6, "Usuario", "Seis", "g", "g", "g", 1, 3));
        Login.incrementalUsuario = 6;

        //id, Nombre, Lider
        Login.equipos.add(new Equipos(1, "Equipo 1", 1, new ArrayList<Integer>(Arrays.asList(2))));
        Login.equipos.add(new Equipos(2, "Equipo 2", 3, new ArrayList<Integer>(Arrays.asList(4))));
        Login.equipos.add(new Equipos(3, "Equipo 3", 5, new ArrayList<Integer>(Arrays.asList(6))));
        Login.incrementalEquipo = 3;

        Login.proyectos.add(new Proyecto(1, "Final 1", "1", "2", 1, 1));
        Login.proyectos.add(new Proyecto(2, "Final 2", "1", "2", 2, 1));
        Login.proyectos.add(new Proyecto(3, "Final 3", "1", "2", 3, 1));
        Login.proyectos.add(new Proyecto(4, "Final 4", "1", "2", 1, 1));

        Login.tareas.add(new Tarea(1, "Tarea 1", " ", "1", "2", "Solicitado", "c", 1));
        Login.tareas.add(new Tarea(2, "Tarea 2", " ", "1", "2", "Solicitado", "e", 2));
        Login.tareas.add(new Tarea(3, "Tarea 3", " ", "1", "2", "Solicitado", "g", 3));
        Login.tareas.add(new Tarea(4, "Tarea 4", " ", "1", "2", "Solicitado", "c", 1));
        Login.tareas.add(new Tarea(5, "Tarea 5", " ", "1", "2", "Solicitado", "e", 2));
        Login.tareas.add(new Tarea(6, "Tarea 6", " ", "1", "2", "Solicitado", "g", 3));

        Login.tareas.add(new Tarea(7, "Tarea 7", " ", "1", "2", "Socilitado", "c", 4));

        Login.incrementalUsuario = Login.usuarios.size();
        Login.incrementalEquipo = Login.equipos.size();
        Login.incrementalProyecto = Login.proyectos.size();
        Login.incrementalTarea = Login.tareas.size();
    }
}
