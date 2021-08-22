package com.juanprojects.spacetravels.basededatos;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class TestOracleConnection {

    @Test
    public void testConnectionStart(){
        DBConnectionOracleDB dbConnectionOracleDB = new DBConnectionOracleDB();
        Connection connection =  dbConnectionOracleDB.getConnection();
        Assertions.assertNotNull(connection);
    }

    @Test
    public  void testInsert() throws SQLException {
        DBConnectionOracleDB dbConnectionOracleDB = new DBConnectionOracleDB();
        Connection connection =  dbConnectionOracleDB.getConnection();

        String sqlInsert = "INSERT INTO JUANDCG.USUARIO\n" +
                "(NOMBRE, APELLIDOS, USUARIO, PASSWORD, EMAIL, TELEFONO)\n" +
                "VALUES('test', 'test', 'test', 'test', 'test', 'test')";

        Statement statement = connection.createStatement();
        int response =statement.executeUpdate(sqlInsert);

        Assertions.assertEquals(1, response);
    }
}
