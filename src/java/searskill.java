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
@WebServlet(urlPatterns = {"/searskill"})
public class searskill extends HttpServlet {

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
            out.println("<title>Servlet searskill</title>");            
            out.println("</head>");
            out.println( "<body BGCOLOR=99FFFF>");
            out.println("<h1>The following records found</h1>");
                                ;
out.println("<form method=post>");
            out.println("</body>");
            out.println("</html>");
                 
          try
{
   
        String r3;
//int r4;        
        //int r3;
         //out.print("hello");
        
              Class.forName("net.ucanaccess.jdbc.UcanaccessDriver"); 
           Connection conn=DriverManager.getConnection("jdbc:ucanaccess://f:\\pp.accdb");
          //Connection conn=DriverManager.getConnection("jdbc:ucanaccess://d:\\pp.accdb");
Statement s = conn.createStatement();
//r4=Integer.parseInt(request.getParameter("b"));
r3= request.getParameter("a");
       String p="select * from skills where Skill='"+r3+"'" ;
        // String p="select * from skills" ;
       // String p="select * from skills where skill='"+r3+"' & Experience='"+r4+"'";
         //String p="select * from admin " ;
        java.sql.ResultSet r=s.executeQuery(p);
        out.print(request.getParameter("a"));
      // out.print(request.getParameter("b"));
       out.println("<table border=1 width=50% height=50% bgcolor=lightblue>");
             out.println("<tr><th>Designation</th><th>Skill</th><th>Experience</th><th>Location</th><th>Company</th><tr>");
             while (r.next())
             {
                 String n = r.getString("Designation");
                 String nm = r.getString("Skill");
                String kl=r.getString("Experience");
                 String sp = r.getString("Location");
                 String k = r.getString("Company"); 
                // int s = r.getInt("sal"); 
                 out.println("<tr><td>" + n + "</td><td>" + nm + "</td><td>"  + kl +   "</td><td>" + sp + "</td><td>" + k + "</td></tr>"); 
                                
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

           out.print("<a href=seeker.html><b> go back</b></a>"); 
            
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
