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
            User userNew = new User();
            userNew.nombre = req.getParameter("nombre");
            userNew.usuario = req.getParameter("usuario");
            userNew.apellidos = req.getParameter("apellidos");
            userNew.contrasenia = req.getParameter("contrasenia");
            userNew.email = req.getParameter("email");
            userNew.telefono = req.getParameter("telefono");
            // Validación de campos de formulario
            if (userNew.nombre.length() > 0 && userNew.apellidos.length() > 0 && userNew.usuario.length() > 0
            && userNew.contrasenia.length() > 0 && userNew.email.length() > 0 && userNew.telefono.length() > 0) {
                System.out.println("Validación exitosa");

                userNew.crearUsuario();
                System.out.println("El nuevo usuario es: "+ userNew.toString());
                req.setAttribute("nombre", userNew.nombre);
                req.setAttribute("usuarioCreated:", userNew.toString());

                RequestDispatcher rd = req.getRequestDispatcher("welcome.jsp");
                rd.forward(req, resp);
            } else{
                System.out.println("Error de creación de usuario");
                resp.getWriter().append("Error de created de usuario");
            }

    }
}
