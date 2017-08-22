<%-- 
    Document   : deposit
    Created on : Aug 5, 2017, 11:25:21 AM
    Author     : kj
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Update</title>
    </head>
    <body>
        <form action="depositServlet" method="POST">
            <table>
                <tr>
                    <td>
                        Enter the amount you want to deposit:
                    </td> 
                </tr>
                <tr>
                    <td>
                        <input type="text" name="depositAmount" size="20">
                    </td>
                </tr>
            </table>
                <p>
                <input type="submit" value="Submit">
            </p>
        </form>
    </body>
</html>
