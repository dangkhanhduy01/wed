/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package controller;

import dao.HoaDAO;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author ADMIN
 */
@WebServlet(name = "Manageproduct", urlPatterns = {"/Manageproduct"})
public class Manageproduct extends HttpServlet {

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
       HoaDAO hoaDAO = new HoaDAO();
       String action = "LIST"; 
       if (request.getParameter("action")!=null)
       {
           action = request.getParameter("action");
       }
       switch (action) {
           case "LIST":
               request.setAttribute("dsHoa", hoaDAO.getAll());
               request.getRequestDispatcher("admin/add_product.jsp").forward(request, response);
                   break;
                   case "ADD":
              
               request.getRequestDispatcher("admin/add_product.jsp").forward(request, response);
                   break;
                   case "EDIT":
              System.out.println("EDIT");
              
                   break;
                   case "DELETE":
               System.out.println("DELETE");
              
                   break;
       }
               }
}
           

