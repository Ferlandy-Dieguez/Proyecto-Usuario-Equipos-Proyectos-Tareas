package com.mycompany.login;

public class Usuario {

    private int id;
    private String nombre;
    private String apellido;
    private String correo;

    private String usuario;
    private String password;
    private int rol;
    private int equipoAsignado;

    public Usuario(int id, String nombre, String apellido, String correo, String usuario, String password, int rol,int equipoAsignado) {
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
        this.correo = correo;
        this.usuario = usuario;
        this.password = password;
        this.rol = rol;
        this.equipoAsignado=equipoAsignado;
    }

    public Usuario() {
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

 
    public int getRol() {
        return rol;
    }

    public void setRol(int rol) {
        this.rol = rol;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String TipoRol() {
        String tipoRol = "";

        switch (this.rol) {
            case 0:
                tipoRol = "Administrador";
                break;
            case 1:
                tipoRol = "Miembro";
                break;
            case 2:
                tipoRol = "Gerente";
                break;
          
            default:
                tipoRol = "";
        }

        return tipoRol;

    }

    public int getEquipoAsignado() {
        return equipoAsignado;
    }

    public void setEquipoAsignado(int equipoAsignado) {
        this.equipoAsignado = equipoAsignado;
    }
    
    }
