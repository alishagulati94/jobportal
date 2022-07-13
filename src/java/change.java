/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author user
 */
@WebServlet(urlPatterns = {"/change"})
public class change extends HttpServlet {

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
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet change</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet change at " + request.getContextPath() + "</h1>");
            out.println("</body>");
            out.println("</html>");
             
              try
        {
            String p=request.getParameter("a");
                         String q=request.getParameter("b");
              String r=request.getParameter("c");
            

            Class.forName("net.ucanaccess.jdbc.UcanaccessDriver"); 
           // Connection conn=DriverManager.getConnection("jdbc:ucanaccess://d:\\pp.accdb");
           // Connection conn=DriverManager.getConnection(
       // "jdbc:ucanaccess://d:/pp.accdb");
   
            Connection conn=DriverManager.getConnection("jdbc:ucanaccess://f:\\pp.accdb");
Statement s = conn.createStatement();
            

int p1=s.executeUpdate("update admin set passw='"+r+"'  where passw= '"+q+"'" );
            //Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
conn.commit();
            //String url = "jdbc:odbc:Doriver={Microsoft Access Driver (*.mdb, *.accdb)};DBQ=" + "d:\\pp.accdb";
if(p1==1)
{
 out.print("password changed");
 
 
 
           
}
            System.out.println("Connection Successful");
            //InfoBox.ShowMessageBox("Connection Successful!", "Success");
        } 

        catch (Exception e) 
        {
            out.println("Got an exception!");
            out.println(e.getMessage());

            //InfoBox.ShowMessageBox("Got an Exception!", "Error");
            //InfoBox.ShowMessageBox(e.getMessage(), "Error");
        }
       
 out.print("<a href=index.html> go back</a>");           
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
