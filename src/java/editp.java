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
@WebServlet(urlPatterns = {"/editp"})
public class editp extends HttpServlet {

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
        try (PrintWriter out = response.getWriter()) 
        {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet editp</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet editp at " + request.getContextPath() + "</h1>");
            out.println("<form method=post >");
              out.println("<input type=submit>");
            out.println("</body>");
            out.println("</html>");
            
             try
{
   
        String z;
              Class.forName("net.ucanaccess.jdbc.UcanaccessDriver"); 
           Connection conn=DriverManager.getConnection("jdbc:ucanaccess://f:\\pp.accdb");
          //Connection conn=DriverManager.getConnection("jdbc:ucanaccess://d:\\pp.accdb");
Statement s = conn.createStatement();
int r3;
 r3= Integer.parseInt(request.getParameter("a"));
        String p="select * from CNEW where id="+r3+" " ;
         //String p="select * from admin " ;
        java.sql.ResultSet r=s.executeQuery(p);
       // out.print(request.getParameter("a"));
      // out.print(request.getParameter("b"));
       
             while (r.next())
             {
                 String n = r.getString("name");
                 String nm = r.getString("f_name");
                // int s = r.getInt("sal"); 
                 out.print("Name");
                out.print("<input type='text' id='name' name='name' value='"+n+"'>");
                out.print("<br>");
                   out.print("Father Name");
                 out.println("<input type='text' id='fname' name='fname' value='"+nm+"'>");
                out.print("<br>");

                
             }
             
             
             conn.close();

}
        catch(Exception e)
        {
            
            //out.println("Got an exception!");
             //System.err.println("Got an exception!");
            //System.err.println(e.getMessage());
            //out.println(e.getMessage());
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
        //processRequest(request, response);
        response.setContentType("text/html");  
PrintWriter out = response.getWriter();
        out.print("hello");
        String p=request.getParameter("name");
        out.print(p);
        
        
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
