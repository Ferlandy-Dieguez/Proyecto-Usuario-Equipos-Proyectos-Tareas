package com.mycompany.login;

public class Tarea {

    private int id;
    private String titulo;
    private String descripcion;
    private String fechaInicio;
    private String fechaFin;
    private String estado;
    private String usuarioAsignado;
    
    private int proyecto;

    public Tarea(int id, String titulo, String descripcion, String fechaInicio, String fechaFin, String estado, String usuarioAsignado, int proyecto) {

        this.id = id;
        this.titulo = titulo;
        this.descripcion = descripcion;
        this.fechaInicio = fechaInicio;
        this.fechaFin = fechaFin;
        this.estado = estado;
        this.usuarioAsignado = usuarioAsignado;
        this.proyecto = proyecto;
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

    public String getFechaFin() {
        return fechaFin;
    }

    public void setFechaFinal(String fechaFinal) {
        this.fechaFin = fechaFinal;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

  

    public String getUsuarioAsignado() {
        return usuarioAsignado;
    }

    public void setUsuarioAsignado(String usuarioAsignado) {
        this.usuarioAsignado = usuarioAsignado;
    }

    public int getProyecto() {
        return proyecto;
    }

    public void setProyecto(int proyecto) {
        this.proyecto = proyecto;
    }

   
}
