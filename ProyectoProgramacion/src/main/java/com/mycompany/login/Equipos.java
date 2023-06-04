package com.mycompany.login;

import java.util.ArrayList;

public class Equipos {

    private int id;
    private String nombre;
    private int lider;
    private ArrayList<Integer> miembros;


    public Equipos(int id, String nombre, int lider, ArrayList miembros) {
        this.miembros = miembros;
     
        this.id = id;
        this.nombre = nombre;
        this.lider = lider;

    }

    public Equipos() {
        this.miembros = new ArrayList<>();
        
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getLider() {
        return lider;
    }

    public void setLider(int lider) {
        this.lider = lider;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public ArrayList<Integer> getMiembros() {
        return miembros;
    }

    public void setMiembros(ArrayList<Integer> miembros) {
        this.miembros = miembros;
    }

   
}
