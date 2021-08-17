package com.juanprojects.spacetravels.servlets;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.time.LocalDateTime;

@WebServlet("/holamundo")
public class HolaMundoServlets extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("Se recibe peticion GET");
        resp.getWriter()
                .append("Hola Mundo con Servlets\n")
                .append(LocalDateTime.now().toString());
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String userName = req.getParameter("username");
        String password = req.getParameter("password");

        System.out.println("Usuario: "+ userName);
        System.out.println("Password: "+ password);

        resp.getWriter().append("Logeo exitoso con usuario ").append(userName);
    }
}
