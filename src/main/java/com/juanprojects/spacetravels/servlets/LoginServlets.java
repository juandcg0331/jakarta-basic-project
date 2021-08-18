package com.juanprojects.spacetravels.servlets;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

@WebServlet("/login")
public class LoginServlets extends HttpServlet {

    String userLogin = "juan";
    String passwordLogin = "1234";


    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String userName = req.getParameter("userName");
        String password = req.getParameter("password");

        System.out.println("Usuario: "+ userName + "Contraseña :"+ password);

        if (userName.equals(userLogin) && password.equals(passwordLogin)){
            System.out.println("Loggin exitoso");
            String nombre = "Juan Diego Cagua Gutierrez";
            req.setAttribute("nombre", nombre);

            RequestDispatcher rd = req.getRequestDispatcher("welcome.jsp");
            rd.forward(req, resp);
        } else{
            System.out.println("Loggin incorrecto");
            resp.getWriter().append("Loggion incorrecto del usuario");
        }
    }
}
