<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <title>SpaceTravelsWeApp</title>
</head>
<body>
    <h1>Welcome to Space-Travels</h1>

    <form action="login" method="post">
        <table>
            <tr>
                <td>User: </td>
                <td><input type="text" name="userName"></td>
            </tr>
            <tr>
                <td>Password: </td>
                <td><input type="text" name="password"></td>
            </tr>
            <tr>
                <td></td>
                <td><button type="submit">Login</button> </td>
            </tr>
        </table>
    </form>
    <br/>
    <a href="">Create Account  </a>
    <span> \ </span>
    <a href="">Forgot Password</a>

    <br/>

    <a href="">Login with Google Account</a>
    <br/>
    <a href="">Login with Facebook Account</a>
</body>
</html>