package com.mycompany.login;

import java.util.ArrayList;

public class Proyecto {

    private int id;
    private String nombre;
    private String fechaInicio;
    private String fechaFinal;
    private int equipoAsignado;
    private int estados;

    public Proyecto(int id, String nombre, String fechaInicio, String fechaFinal, int equipoAsignado, int estados) {

        this.id = id;
        this.nombre = nombre;
        this.fechaInicio = fechaInicio;
        this.fechaFinal = fechaFinal;
        this.equipoAsignado = equipoAsignado;
        this.estados = estados;
    }

    public Proyecto() {

    }

    public String getFechaInicio() {
        return fechaInicio;
    }

    public void setFechaInicio(String fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getFechaFinal() {
        return fechaFinal;
    }

    public void setFechaFinal(String fechaFinal) {
        this.fechaFinal = fechaFinal;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getEquipoAsignado() {
        return equipoAsignado;
    }

    public void setEquipoAsignado(int equipoAsignado) {
        this.equipoAsignado = equipoAsignado;
    }

    public int getEstados() {
        return estados;
    }

    public void setEstados(int estados) {
        this.estados = estados;
    }

    public String TipoEstados() {
        String tipoEstados = "";

        switch (this.estados) {
            case 0:
                tipoEstados = "";
                break;
            case 1:
                tipoEstados = "Solicitado";
                break;
            case 2:
                tipoEstados = "En Proceso";
                break;
            case 3:
                tipoEstados = "Finalizado";
                break;

            default:
                tipoEstados = "";
        }

        return tipoEstados;

    }

}
