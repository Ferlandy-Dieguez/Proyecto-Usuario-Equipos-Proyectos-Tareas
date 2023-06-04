package com.mycompany.login;

import java.util.ArrayList;

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
       // masivo();
        log.setVisible(true);

    }

    public static void masivo() {
        //id, Nombre, Apellido, Correo,Usuario,Password,Rol, Equipo asignado
        Login.usuarios.add(new Usuario(1, "Ferlandy", "Dieguez", "a", "a", "a", 2, 1));
        Login.usuarios.add(new Usuario(2, "c", "c", "c", "c", "c", 1, -1)); // el -1 es para no asignar equipo
        Login.usuarios.add(new Usuario(3, "d", "d", "d", "d", "d", 2, 2));
        Login.usuarios.add(new Usuario(4, "e", "e", "e", "e", "e", 1, -1));
        Login.usuarios.add(new Usuario(5, "f", "f", "f", "f", "f", 2, 3));
        Login.usuarios.add(new Usuario(6, "g", "g", "g", "g", "g", 2, -1));
        Login.incrementalUsuario = 6;

        //id, Nombre, Lider
        Login.equipos.add(new Equipos(1, "Equipo 1 ", 1, new ArrayList<Integer>()));
        Login.equipos.add(new Equipos(2, "Equipo 2", 3, new ArrayList<Integer>()));
        Login.equipos.add(new Equipos(3, "Equipo 3", 5, new ArrayList<Integer>()));
        Login.incrementalEquipo = 3;
        
    }
}
