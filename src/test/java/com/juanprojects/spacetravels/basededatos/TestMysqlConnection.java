package com.juanprojects.spacetravels.basededatos;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class TestMysqlConnection {

    @Test
    public void testConn(){
        DBConnectionMySQL connectionMySQL = new DBConnectionMySQL();
        Connection conn =  connectionMySQL.getConnection();
        //Asegurar que no llegue null
        Assertions.assertNotNull(conn);
    }

    @Test
    public void testInsert() throws SQLException {
        DBConnectionMySQL connectionMySQL = new DBConnectionMySQL();
        Connection connection = connectionMySQL.getConnection();

        Statement statement = connection.createStatement();
        String sqlInsert = "INSERT INTO spacetravel.Usuario\n" +
                "(nombre, apellidos, usuario, password, email, telefono)\n" +
                "VALUES('Juan', 'Cagua', 'juan123', '122334', 'correo@correo.com', '3225443222')";
        int valorRespuesta = statement.executeUpdate(sqlInsert);

        Assertions.assertEquals(1, valorRespuesta);

    }
}
