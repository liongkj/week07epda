/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.HashSet;
import java.util.Set;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author Admin
 */
@WebServlet(name = "Login", urlPatterns = {"/Login"})
public class Login extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    static final String JDBC_DRIVER = "org.apache.derby.jdbc.ClientDriver";
    static final String DB_URL = "jdbc:derby://localhost:1527/sample";
    static final String USER = "app";
    static final String PASS = "app";

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");

        String name = request.getParameter("name");
        int password = Integer.parseInt(request.getParameter("password"));

        try (PrintWriter out = response.getWriter()) {
            Statement stmt = null;
            Connection conn = null;
            try {
                Class.forName(JDBC_DRIVER);  // Register JDBC driver
                conn = DriverManager.getConnection(DB_URL, USER, PASS);  // Open a connection
                stmt = conn.createStatement();  // Execute SQL query              
                String sql = "SELECT * from usertable WHERE name = '" + name + "'";
                ResultSet rs = stmt.executeQuery(sql);  //store search result into rs

                if (rs.next()) {
                    if (rs.getInt("password") == password) {  //retrieve password saved in rs to match with input.
                        if (rs.getString("gender").equalsIgnoreCase("M")) {
                            request.getRequestDispatcher("user.jsp").include(request, response);
                            out.println("<br></br><h1>Welcome Mr. " + rs.getString("name") + " !</h1>");
                        } else if (rs.getString("gender").equalsIgnoreCase("F")) {
                            request.getRequestDispatcher("user.jsp").include(request, response);
                            out.println("<br></br><h1>Welcome Ms. " + rs.getString("name") + " !</h1>");
                        }
                        HttpSession s = request.getSession();
                        s.setAttribute("user",name);
                        

                    } else {
                        out.println("Wrong Password!<br></br>");
                        request.getRequestDispatcher("login2.jsp").include(request, response);
                    }

                } else {
                    out.println("Wrong Username!<br></br>");
                    request.getRequestDispatcher("login2.jsp").include(request, response);
                }

                stmt.close();
                conn.close();

            } catch (SQLException se) {
                se.printStackTrace();   //Handle errors for JDBC
            } catch (Exception e) {
                e.printStackTrace();   //Handle errors for Class.forName

            }
        }
    }

// <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
