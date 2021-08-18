package com.juanprojects.spacetravels.models;

public class User {

    public User(){
        System.out.println("Creando un nuevo usuario");
    }

    public User(int id, String nombre, String apellidos, String usuario, String contrasenia, String email, String telefono, boolean activo) {
        this.id = id;
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.usuario = usuario;
        this.contrasenia = contrasenia;
        this.email = email;
        this.telefono = telefono;
        this.activo = activo;
    }

    public int id;
    public String nombre;
    public String apellidos;
    public String usuario;
    public String contrasenia;
    public String email;
    public String telefono;
    public boolean activo;

    public boolean crearUsuario(User usuario){
        return false;
    }

    public User buscarUsuario(String nameUser){
        return null;
    }

    public User actualizarUsuario(String usuarioToUpdate, User usuarioUpdate){
        return null;
    }

    public boolean eliminarUser(User userDelete){
        return false;
    }

    public boolean loginUser(String nameUser, String password){
        return false;
    }

    public boolean recuperarContrasenia(String correo){
        return false;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", nombre='" + nombre + '\'' +
                ", apellidos='" + apellidos + '\'' +
                ", usuario='" + usuario + '\'' +
                ", contrasenia='" + contrasenia + '\'' +
                ", email='" + email + '\'' +
                ", telefono='" + telefono + '\'' +
                ", activo=" + activo +
                '}';
    }
}
