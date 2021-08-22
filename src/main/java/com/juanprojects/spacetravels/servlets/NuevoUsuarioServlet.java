package com.juanprojects.spacetravels.servlets;

import com.juanprojects.spacetravels.basededatos.DBConnectionMySQL;
import com.juanprojects.spacetravels.basededatos.DBConnectionOracleDB;
import com.juanprojects.spacetravels.models.User;
import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

@WebServlet("/new-account")
public class NuevoUsuarioServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
            String nombre = req.getParameter("nombre");
            String apellidos = req.getParameter("apellidos");
            String usuario = req.getParameter("usuario");
            String contrasenia = req.getParameter("contrasenia");
            String email = req.getParameter("email");
            String telefono = req.getParameter("telefono");

            // Validación de campos de formulario
            if (nombre.length() > 0 && apellidos.length() > 0 && usuario.length() > 0
            && contrasenia.length() > 0 && email.length() > 0 && telefono.length() > 0) {
                System.out.println("Validación exitosa");
                User userCreated = new User( nombre, apellidos,usuario,contrasenia,email,telefono,true);
                System.out.println(userCreated.toString());

                DBConnectionMySQL connectionMySQL = new DBConnectionMySQL();
                Connection connection = connectionMySQL.getConnection();
                //DBConnectionOracleDB dbConnectionOracleDB = new DBConnectionOracleDB();
                //Connection connection = dbConnectionOracleDB.getConnection();
                Statement statement = null;
                try {
                    statement = connection.createStatement();
                    String sqlInsert = "INSERT INTO spacetravel.Usuario(nombre, apellidos, usuario, password, email, telefono)" +
                            "VALUES('"+userCreated.nombre+"','"+userCreated.apellidos+"','"+userCreated.usuario+"'," +
                            "'"+userCreated.contrasenia+"','"+userCreated.email+"','"+userCreated.telefono+"')";
                    int valorRespuesta = statement.executeUpdate(sqlInsert);
                    System.out.println("Valor respuesta: "+ valorRespuesta);
                } catch (SQLException e) {
                    e.printStackTrace();
                }

                req.setAttribute("nombre", userCreated.nombre);
                req.setAttribute("usuarioCreated", userCreated);

                RequestDispatcher rd = req.getRequestDispatcher("welcome.jsp");
                rd.forward(req, resp);
            } else{
                System.out.println("Error de creación de usuario");
                resp.getWriter().append("Error de created de usuario");
            }

    }
}
