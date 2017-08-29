<%-- 
    Document   : update
    Created on : Aug 11, 2017, 3:48:36 PM
    Author     : Admin
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Update Page</title>
    </head>
    <body>
        <form action="update" method="POST">
            <a href="Home">Home</a> | 
            <a href="update.jsp">Update</a> | 
            <a href="deposit.jsp">Deposit</a> | 
            <a href="withdraw.jsp">Withdraw</a> | 
            <a href="Logout">Logout</a> |
            <p></p>
            <table>
                <tr>
                    <td>
                        New Password:
                    </td>   
                    <td>
                        <input type="text" name="pass" size="20">
                    </td>
                </tr>
            </table>
            <p>
                <input type="submit" value="Submit">
            </p>
        </form>
    </body>
</html>
