<%-- 
    Document   : login
    Created on : Aug 2, 2017, 11:50:21 AM
    Author     : Admin
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Login Page</title>
    </head>
    <body>
        
        <form action="login"method="POST">
            <a href="register.jsp">Register New User</a>
            <table>
                <tr>
                    <td>
                        Name:
                    </td> 
                    <td>
                        <input type="text" name="name" size="20">
                    </td>
                </tr>
                <tr>
                    <td>
                        Password:
                    </td> 
                    <td>
                        <input type="text" name="password" size="20">
                    </td>
                </tr>
            </table>
            <p>
                <input type="submit" value="Submit">
            </p>
        </form>
        
    </body>
</html>
