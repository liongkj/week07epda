/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import static controller.Login.JDBC_DRIVER;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author kj
 */
@WebServlet(name = "Home", urlPatterns = {"/Home"})
public class Home extends HttpServlet {

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
        
        HttpSession s = request.getSession(false);
        String name = String.valueOf(s.getAttribute("user"));
        
        try (PrintWriter out = response.getWriter()) {
            Statement stmt = null;
            Connection conn = null;
            try {
                Class.forName(JDBC_DRIVER);  // Register JDBC driver
                conn = DriverManager.getConnection(DB_URL, USER, PASS);  // Open a connection
                stmt = conn.createStatement();  // Execute SQL query              
                String sql = "SELECT * from usertable WHERE name = '" + name + "'";
                ResultSet rs = stmt.executeQuery(sql);  //store search result into rs
                rs.next();
            /* TODO output your page here. You may use following sample code. */
            request.getRequestDispatcher("user.jsp").include(request, response);
            out.println("<h1>Hello " + rs.getString("name") + "</h1>");
            out.println("Your balance is: RM " + rs.getDouble("balance") + ".");
             
        }catch(Exception e){
        
        }
            stmt.close();
            conn.close();

            } catch (SQLException se) {
                se.printStackTrace();   //Handle errors for JDBC
            } catch (Exception e) {
                e.printStackTrace();   //Handle errors for Class.forName

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
