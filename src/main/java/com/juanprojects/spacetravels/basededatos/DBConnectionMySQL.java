package com.juanprojects.spacetravels.basededatos;

import java.sql.Connection;
import java.sql.DriverManager;

public class DBConnectionMySQL {

    static String db = "spacetravel";
    static String user = "root";
    static String password = "root";
    static String host = "localhost";
    static String port  = "33306";
    static String url = "jdbc:mysql://"+ host + ":" + port + "/" + db;

    Connection connection = null;


    public DBConnectionMySQL() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            connection = DriverManager.getConnection(url,user,password);

            if (connection == null){
                System.out.println("Fallo la conexion a la base de datos");
            }else {
                System.out.println("Conexion Exitosa a la base de datos");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public Connection getConnection(){
        return  connection;
    }

    public void desconectar(){
        connection = null;
    }
}
