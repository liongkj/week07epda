/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import model.SE2;

/**
 *
 * @author tp034196
 */
@WebServlet(name = "loginServlet", urlPatterns = {"/loginServlet"})
public class loginServlet extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");

        String name = request.getParameter("userName");
        String password = request.getParameter("password");
        ServletContext sc = getServletContext();
        List source = (List) sc.getAttribute("data");
//        
//        HttpSession s = request.getSession();
//        s.setAttribute("name", name);
//        s.setAttribute("password", password);

        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */

            SE2 s = null;
            for (int i = 0; i < source.size(); i++) {
                if (name.equals(((SE2) (source.get(i))).getName())) {
                    s = (SE2) (source.get(i));
                    break;
                }
            }
            if (s != null) {
                if (s.getPassword() == Integer.parseInt(password)) {
                    request.getRequestDispatcher("user.jsp").include(request, response);
                    out.println("<br><br>");
                    if (s.getGender() == 'm' || s.getGender() == 'M') {
                        out.println("Welcome Mr. " + s.getName() + " !");
                    } else {
                        out.println("Welcome Ms. " + s.getName() + " !");
                    }
                    HttpSession session = request.getSession();
                    session.setAttribute("logged", s);
                } else {
                    out.println("Sorry, wrong password!<br><br>");
                    request.getRequestDispatcher("login.jsp").include(request, response);
                }
            } else {

                out.print("Sorry, wrong user name! <br><br>");
                request.getRequestDispatcher("login.jsp").include(request, response);

            }
        
    
//            request.getRequestDispatcher("user.jsp").include(request,response);
//            out.println("<h1>Welcome " + name + ".</h1>");
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
