<%-- 
    Document   : login
    Created on : Aug 2, 2017, 11:50:16 AM
    Author     : tp034196
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Login Page</title>
    </head>
    <body>
        <a href="register.jsp" value="">New User Registration</a>
        <form action="loginServlet" method="POST">
            <table>
                <tr>
                    <td>
                        User Name:
                    </td> 
                    <td>
                        <input type="text" name="userName" size="20">
                    </td>
                </tr>
                <tr>
                    <td>
                        Password
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
