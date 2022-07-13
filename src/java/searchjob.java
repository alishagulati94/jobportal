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
@WebServlet(urlPatterns = {"/searchjob"})
public class searchjob extends HttpServlet {

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
            out.println("<title>Servlet searchjob</title>");            
            out.println("</head>");
            out.println("<body BGCOLOR=99FFFF>");
            out.println("<h1>List of All Candidate</h1>");
            out.println("</body>");
            out.println("</html>");
            out.println("<form method=post >");
            
          //  out.print("<select name=c>");
            //out.print("<option value=-1 selected>select..</option>");

//out.print("<option value=software developer>software developer</option>");
            
           //   out.println("<input type=submit>");
              
        try
{
   
    String z;
        String x=request.getParameter("b");
        //String y=request.getParameter("b");
        
       
            Class.forName("net.ucanaccess.jdbc.UcanaccessDriver"); 
           Connection conn=DriverManager.getConnection("jdbc:ucanaccess://f:\\pp.accdb");
          //Connection conn=DriverManager.getConnection("jdbc:ucanaccess://d:\\pp.accdb");
Statement s = conn.createStatement();
        String p="select * from seeker"  ;
         //String p="select * from admin " ;
        
        
        java.sql.ResultSet r=s.executeQuery(p);
       // out.print(request.getParameter("a"));
      // out.print(request.getParameter("b"));
       
       out.println("<table border=1 width=50% height=50% bgcolor=lightblue>");
             out.println("<tr><th>Jobtitle</th><th>JobRequirement</th><th>Job Location</th><th>Job Experience</th><th>Company</th><th>Profile</th><th>Apply</th><tr>");
             while (r.next())
             {
                 String n = r.getString("jobtitle");
                 String nm = r.getString("jobreq");
                   String s1= r.getString("joblocation");
                   String s2=r.getString("jobexperience");
                    String s3=r.getString("company");
                   String s4=r.getString("profile");
                   String s5=r.getString("apply");
                   
                // int s = r.getInt("sal"); 
                 out.println("<tr><td>" + n + "</td><td>" + nm + "</td><td>" + s1 + "</td><td>" + s2 + "</td><td>" + s3 + "</td><td>" + s4 + "</td><td>" + s5 + "</td></tr>"); 
                 
                
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
        out.print("<a href=seeker.html><b>go back</b></a>");

              
            
            
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
       // processRequest(request, response);
          PrintWriter out = response.getWriter(); 
            response.setContentType("text/html;charset=UTF-8");  
            
        
        
       
            
        
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
