package com.juanprojects.spacetravels.models;

import com.juanprojects.spacetravels.basededatos.DBConnectionMySQL;
import com.juanprojects.spacetravels.mail.MailSpaceTravels;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class User {

    public User(){
        System.out.println("Creando un nuevo usuario");
    }

    public User( String nombre, String apellidos, String usuario, String contrasenia, String email, String telefono, boolean activo) {
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

    public boolean crearUsuario(){
        boolean returnValue = false;
        DBConnectionMySQL connectionMySQL = new DBConnectionMySQL();
        Connection connection = connectionMySQL.getConnection();
        //DBConnectionOracleDB dbConnectionOracleDB = new DBConnectionOracleDB();
        //Connection connection = dbConnectionOracleDB.getConnection();
        Statement statement = null;
        try {
            statement = connection.createStatement();
            String sqlInsert = "INSERT INTO spacetravel.Usuario(nombre, apellidos, usuario, password, email, telefono)" +
                    "VALUES('"+nombre+"','"+apellidos+"','"+usuario+"'," +
                    "'"+contrasenia+"','"+email+"','"+telefono+"')";
            int valorRespuesta = statement.executeUpdate(sqlInsert);
            if (valorRespuesta > 0){
                returnValue = true;
            }else{
                returnValue = false;
            }

            System.out.println("Valor respuesta: "+ valorRespuesta);
            MailSpaceTravels mailSpaceTravels = new MailSpaceTravels();
            mailSpaceTravels.sendMail(email);
        } catch (Exception e) {
            returnValue = false;
            e.printStackTrace();

        }
        return returnValue;
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
