/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Andrew T
 */
@WebServlet(urlPatterns = {"/Authenticate"})
public class Authenticate extends HttpServlet {

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
        
            String uname = request.getParameter("uname");
            String pass = request.getParameter("pass");
            
            switch (uname) {
                case "andrew":
                    if(pass.equals("password")){
                        request.getSession().setAttribute("uname", uname);
                        request.getRequestDispatcher("/welcome.jsp").forward(request, response);
                    }
                    else
                    {
                        request.getRequestDispatcher("/badLogin.jsp").forward(request, response);   
                    }
                    break;
                case "elfre":
                    if(pass.equals("pass1234")){
                        request.getSession().setAttribute("uname", uname);
                        request.getRequestDispatcher("/welcome.jsp").forward(request, response);
                    }
                    else{
                        request.getRequestDispatcher("/badLogin.jsp").forward(request, response);
                    }
                    break;
                default:
                    request.getRequestDispatcher("/badLogin.jsp").forward(request, response);
                    break;
                    
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
