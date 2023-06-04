package com.mycompany.login;

public class Tarea {

    private int id;
    private String titulo;
    private String descripcion;
    private String fechaInicio;
    private String fechaFinal;
    private int estados;
    private int usuarioAsignado;

    public Tarea(int id, String titulo, String descripcion, String fechaInicio, String fechaFinal, int estados, int usuarioAsignado) {

        this.id = id;
        this.titulo = titulo;
        this.descripcion = descripcion;
        this.fechaInicio = fechaInicio;
        this.fechaFinal = fechaFinal;
        this.estados = estados;
        this.usuarioAsignado = usuarioAsignado;
    }

    public Tarea() {

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getFechaInicio() {
        return fechaInicio;
    }

    public void setFechaInicio(String fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    public String getFechaFinal() {
        return fechaFinal;
    }

    public void setFechaFinal(String fechaFinal) {
        this.fechaFinal = fechaFinal;
    }

    public int getEstados() {
        return estados;
    }

    public void setEstados(int estados) {
        this.estados = estados;
    }

    public int getUsuarioAsignado() {
        return usuarioAsignado;
    }

    public void setUsuarioAsignado(int usuarioAsignado) {
        this.usuarioAsignado = usuarioAsignado;
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
