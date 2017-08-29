<%-- 
    Document   : register
    Created on : Aug 9, 2017, 11:05:36 AM
    Author     : Admin
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Register Page</title>
    </head>
    <body>
        <form action="register" method="POST">
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
                        Gender:
                    </td> 
                    <td>
                        <input type="text" name="gender" size="20">
                    </td>
                </tr>
                <tr>
                    <td>
                        Balance:
                    </td> 
                    <td>
                        <input type="text" name="balance" size="20">
                    </td>
                </tr>
                <tr>
                <tr>
                    <td>
                        Password:
                    </td> 
                    <td>
                        <input type="text" name="password" size="20">
                    </td>
                </tr>
                <tr>
            </table>
            <p>
                <input type="submit" value="Submit">
            </p>
        </form>
    </body>
</html>
