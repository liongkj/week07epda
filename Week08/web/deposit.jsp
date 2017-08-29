<%-- 
    Document   : deposit
    Created on : Aug 11, 2017, 3:48:13 PM
    Author     : Admin
--%>


<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Deposit Page</title>
    </head>
    <body>
        <form action="deposit" method="POST">
            <a href="Home">Home</a> | 
            <a href="update.jsp">Update</a> | 
            <a href="deposit.jsp">Deposit</a> | 
            <a href="withdraw.jsp">Withdraw</a> | 
            <a href="Logout">Logout</a> |
            <p></p>
            <table>
                <tr>
                    <td>
                        Deposit amount:
                    </td>
                    <td>
                        <input type="text" name="deposit" size="20">
                    </td>
                </tr>
            </table>
            <p>
                <input type="submit" value="Submit">
            </p>
        </form>   
    </body>
</html>
