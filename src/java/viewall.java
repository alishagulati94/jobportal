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
@WebServlet(urlPatterns = {"/viewall"})
public class viewall extends HttpServlet {

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
            out.println("<title>Servlet viewall</title>");            
            out.println("</head>");
 out.println( "<body BGCOLOR=99FFFF>");
            out.println("<h1>Servlet viewall at " + request.getContextPath() + "</h1>");
            out.println("<form method=post >");
            out.println("</body>");
                  try
{
   
    String z;
        
        //String y=request.getParameter("b");
        
       
            Class.forName("net.ucanaccess.jdbc.UcanaccessDriver"); 
           Connection conn=DriverManager.getConnection("jdbc:ucanaccess://f:\\pp.accdb");
          //Connection conn=DriverManager.getConnection("jdbc:ucanaccess://d:\\pp.accdb");
Statement s = conn.createStatement();
        String p="select * from postjob "  ;
         //String p="select * from admin " ;
        
        
        java.sql.ResultSet r=s.executeQuery(p);
       // out.print(request.getParameter("a"));
      // out.print(request.getParameter("b"));
       
       out.println("<table border=1 width=50% height=50% bgcolor=lightblue>");
             out.println("<tr><th>Jobcode</th><th>job requirement</th><th>Job title</th><th>Job Location</th><th>Posted dat</th><th>Company</th><tr>");
             while (r.next())
             {
                 String n = r.getString("job_code");
                 String nm = r.getString("job_req");
                   String s1= r.getString("job_title");
                   String s2=r.getString("job_loc");
                    String s3=r.getString("post_d");
                   String s4=r.getString("posted_by");
                   
                // int s = r.getInt("sal"); 
                 out.println("<tr><td>" + n + "</td><td>" + nm + "</td><td>" + s1 + "</td><td>" + s2 + "</td><td>" + s3 + "</td><td>" + s4 + "</td></tr>"); 
                 
                
             }
             
              
             out.println("</table>");
             out.println("</html></body>");
             conn.close();

        }

        catch(Exception e)
        {
            
            out.println("Got an exception!");
             //System.err.println("Got an exception!");
            //System.err.println(e.getMessage());
            out.println(e.getMessage());
        }
       
   out.print("<a href=rec.html><b> go back</b></a>"); 
            
            
            
            out.println("</html>");
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
