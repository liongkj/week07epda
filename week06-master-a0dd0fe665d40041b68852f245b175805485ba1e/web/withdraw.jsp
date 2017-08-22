<%-- 
    Document   : withdraw
    Created on : Aug 5, 2017, 11:47:07 AM
    Author     : kj
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Withdraw</title>
    </head>
    <body>
        <form action="withdrawServlet" method="POST">
            <table>
                <tr>
                    <td>
                        Enter the amount you want to withdraw<br><br>
                    </td> 
                    <td>
                        <input type="text" name="withdrawAmount" size="20">
                    </td>
                </tr>
            </table>
                <p>
                <input type="submit" value="Submit">
            </p>
        </form>
    </body>
</html>
