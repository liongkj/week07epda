<%-- 
    Document   : update
    Created on : Aug 2, 2017, 12:26:29 PM
    Author     : tp034196
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Update</title>
    </head>
    <body>
        <form action="updateServlet" method="POST">
            <table>
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
