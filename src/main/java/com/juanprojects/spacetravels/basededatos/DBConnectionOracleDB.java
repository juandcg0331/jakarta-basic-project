package com.juanprojects.spacetravels.basededatos;

import java.sql.Connection;
import java.sql.DriverManager;

public class DBConnectionOracleDB {

    static String dataBaseServiceName = "ORCLCDB.localdomain";
    static String port = "1521";
    static String user = "juandcg";
    static String password = "1234";
    static String url = "jdbc:oracle:thin:"+user+ "/" + password + "@//localhost:"+port+"/"+ dataBaseServiceName;

    Connection connection = null;

    public DBConnectionOracleDB(){
        try{
            Class.forName("oracle.jdbc.driver.OracleDriver");
            connection = DriverManager.getConnection(url);

            if (connection == null){
                System.out.println("Conexion a Oracle fallo");
            }{
                System.out.println("La coneccion a Oracle es exitosa");
            }
        }catch (Exception e){
            e.printStackTrace();
        }
    }

    public Connection  getConnection(){
        return connection;
    }

    public void desconectar(){
        connection = null;
    }
}
