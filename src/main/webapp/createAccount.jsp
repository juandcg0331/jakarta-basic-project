
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Create Account</title>
</head>
<body>
    <h1>Create New Account</h1>

    <form action="new-account" method="post">
        <table>
            <tr>
                <td>Nombre: </td>
                <td><input type="text" placeholder="Nombre" name="nombre"></td>
            </tr>
            <tr>
                <td>Apellidos: </td>
                <td><input type="text" placeholder="Apellidos" name="apellidos"></td>
            </tr>
            <tr>
                <td>Usuario: </td>
                <td><input type="text" placeholder="Usuario" name="usuario"></td>
            </tr>
            <tr>
                <td>Contraseña: </td>
                <td><input type="password" placeholder="Contraseña" name="contrasenia"></td>
            </tr>
            <tr>
                <td>Email: </td>
                <td><input type="email" placeholder="Email" name="email"></td>
            </tr>
            <tr>
                <td>Telefono: </td>
                <td><input type="number" placeholder="Telefono" name="telefono"></td>
            </tr>
            <tr>
                <td><button type="submit">Crear</button></td>
            </tr>
        </table>

    </form>

</body>
</html>
