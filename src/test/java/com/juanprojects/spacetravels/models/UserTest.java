package com.juanprojects.spacetravels.models;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.fail;

public class UserTest {

    @Test
    public void testCreateUser(){
        System.out.println("Inicia prueba unitaria");
        User usuarioUno = new User();
        usuarioUno.id = 1;
        usuarioUno.nombre = "Juan";
        usuarioUno.apellidos = "Cagua Gutierrez";
        usuarioUno.usuario = "juancagua123";
        usuarioUno.email = "jcagua@spacetravel.org";
        usuarioUno.telefono = "12233";
        usuarioUno.activo = true;

        System.out.println("Usuario a crear: " + usuarioUno);

        User usuarioDos = new User(2, "Pedro", "Perez Jimenez", "pedro2233","1223",
                "pedro@spacetravel.org", "23344", true);
        System.out.println("Usuario dos : "+ usuarioDos);

        System.out.println("Termina prueba unitaria");
    }
}
