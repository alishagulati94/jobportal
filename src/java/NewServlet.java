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
import java.sql.*;
/**
 *
 * @author user
 */
@WebServlet(urlPatterns = {"/NewServlet"})
public class NewServlet extends HttpServlet {

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
            
             out.print("hello");
               out.println("<form method=post ");
         
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>LOGIN FORM</title>");            
            out.println("</head>");
            out.println("<body BGCOLOR=99FFFF>");
            out.println("<h1>Servlet NewServlet at " + request.getContextPath() + "</h1>");
            out.println("</body>");
            out.println("</html>");
           // PrintWriter out = response.getWriter();  
int i=0;

            
try
{
   
        String z;
        String x=request.getParameter("a");
        String y=request.getParameter("b");
            Class.forName("net.ucanaccess.jdbc.UcanaccessDriver"); 
           Connection conn=DriverManager.getConnection("jdbc:ucanaccess://f:\\pp.accdb");
          //Connection conn=DriverManager.getConnection("jdbc:ucanaccess://d:\\pp.accdb");
Statement s = conn.createStatement();
        String p="select * from admin where usern='"+x+"' and passw='"+y+"'" ;
         //String p="select * from admin " ;
        java.sql.ResultSet r=s.executeQuery(p);
       // out.print(request.getParameter("a"));
      // out.print(request.getParameter("b"));
       
        while(r.next())
        {
                       
            i++;
        }
        out.print(i);
        if(i==1)
        {
           
          out.print("<h1>userid and password matched</h1>" ) ; 
        out.println("<a href=loginform.html> next </a>");
         
          
          //response.sendRedirect("NewServlet1");
           //response.sendRedirect("http://localhost:28051/WebApplication1/index.html");
           
        }
        else
        {
          out.print("record not found") ;            
        }
        
       

       System.err.println(i);
        }
        catch(Exception e)
        {
            
            out.println("Got an exception!");
             //System.err.println("Got an exception!");
            //System.err.println(e.getMessage());
            out.println(e.getMessage());
        }

        
           // out.println("enter value <input type=text name=a >");
            // out.println("enter second value <input type=text name=b >");
         //   out.println("<input type=submit>");
           
            
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
        
          response.setContentType("text/html");  
PrintWriter out = response.getWriter();  
int i=0;

            
try
{
   
        String z;
        String x=request.getParameter("a");
        String y=request.getParameter("b");
            Class.forName("net.ucanaccess.jdbc.UcanaccessDriver"); 
           Connection conn=DriverManager.getConnection("jdbc:ucanaccess://f:\\pp.accdb");
          //Connection conn=DriverManager.getConnection("jdbc:ucanaccess://d:\\pp.accdb");
Statement s = conn.createStatement();
        String p="select * from admin where usern='"+x+"' and passw='"+y+"'" ;
         //String p="select * from admin " ;
        java.sql.ResultSet r=s.executeQuery(p);
       // out.print(request.getParameter("a"));
      // out.print(request.getParameter("b"));
       
        while(r.next())
        {
                       
            i++;
        }
        out.print(i);
        if(i==1)
        {
           
          out.print("userid and password matched" ) ; 
            out.println("<a href=jobseek.html> next </a>");
         
          
          //response.sendRedirect("http://localhost:28051/WebApplication1/NewServlet1");
           //response.sendRedirect("http://localhost:28051/WebApplication1/index.html");
           
        }
        else
        {
          out.print("record not found") ;            
        }
        
       

       System.err.println(i);
        }
        catch(Exception e)
        {
            
            out.println("Got an exception!");
             //System.err.println("Got an exception!");
            //System.err.println(e.getMessage());
            out.println(e.getMessage());
        }

        
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
