/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.IOException;
import java.io.PrintWriter;
import static java.lang.System.out;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
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
@WebServlet(urlPatterns = {"/pjob"})
public class pjob extends HttpServlet {

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
            out.println("<title>POST JOB</title>");            
            out.println("</head>");
            out.println("<body>");
              out.println("<body bgcolor=99FFFF>");
            out.println("<h1>Servlet pjob at " + request.getContextPath() + "</h1>");
            
            
            
            out.println("<form method=post >");
          
       
            out.println("</body>");
            out.println("</html>");
            
            
            try
        {
            String x,y,z,m,n,o,w,w1;
 int r3,r5,r7;

            Class.forName("net.ucanaccess.jdbc.UcanaccessDriver"); 
           // Connection conn=DriverManager.getConnection("jdbc:ucanaccess://d:\\pp.accdb");
           // Connection conn=DriverManager.getConnection(
       // "jdbc:ucanaccess://d:/pp.accdb");
x=request.getParameter("a");
  y=request.getParameter("b");  
   z=request.getParameter("c");
   m=request.getParameter("d");
   n=request.getParameter("e");
   o=request.getParameter("f");
   w=request.getParameter("g");
   w1=request.getParameter("h");
   
            Connection conn=DriverManager.getConnection("jdbc:ucanaccess://f:\\pp.accdb");
Statement s = conn.createStatement();
            

int p=s.executeUpdate("insert into recruiter values('"+x+"','"+y+"','"+z+"','"+m+"','"+n+"','"+o+"','"+w+"','"+w1+"')");
            //Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
conn.commit();
            //String url = "jdbc:odbc:Doriver={Microsoft Access Driver (*.mdb, *.accdb)};DBQ=" + "d:\\pp.accdb";
if(p==1)
{
 out.print("The following values are saved");
/* out.print("<br>");
 
 
 out.print(request.getParameter("a"));
 out.print("<br>");
 out.print(request.getParameter("b"));
 out.print("<br>");
 out.print(request.getParameter("c"));
 out.print("<br>");
 out.print(request.getParameter("d"));
 out.print("<br>");
 out.print(request.getParameter("e"));
 out.print("<br>");
           
}*/



out.println("<table border=1 bgcolor=lightblue>");
    out.println("<tr><th>JobCode</th><th>JobTitle</th><th>Job Requirement</th><th>Job location</th><th>Job Post Date</th><th>Job End Date</th><th>Job Posted By</th></tr>");
      out.println("<tr><td>" + x + "</td><td>" + y + "</td><td>" + z + "</td><td>" + m + "</td><td>" + n + "</td><td>" + o + "</td><td>" + w + "</td><td>" + w1 + "</td></tr>");
            System.out.println("Connection Successful");
            //InfoBox.ShowMessageBox("Connection Successful!", "Success");
        } 

System.out.println("Connection Successful");
        }
        catch (Exception e) 
        {
            out.println("Got an exception!");
            out.println(e.getMessage());
        }
        
        out.print("<a href=rec.html> <b>go back</b></a>");   
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
        //
       // processRequest(request, response);
        PrintWriter out = response.getWriter();
        out.print("hello");
         try
        {
            String x,y,z,m,n,o,w;
 int r3,r5,r7;

            Class.forName("net.ucanaccess.jdbc.UcanaccessDriver"); 
           // Connection conn=DriverManager.getConnection("jdbc:ucanaccess://d:\\pp.accdb");
           // Connection conn=DriverManager.getConnection(
       // "jdbc:ucanaccess://d:/pp.accdb");
x=request.getParameter("a");
          y=request.getParameter("b");  
   z=request.getParameter("c");
   m=request.getParameter("d");
   n=request.getParameter("e");
   o=request.getParameter("f");
   w=request.getParameter("g");
   
            Connection conn=DriverManager.getConnection("jdbc:ucanaccess://f:\\pp.accdb");
Statement s = conn.createStatement();
            

int p=s.executeUpdate("insert into postjob(job_code,job_title,job_req,job_loc,post_d,e_d,posted_by) values('"+x+"','"+y+"','"+z+"','"+m+"','"+n+"','"+o+"','"+w+"')");
            //Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
conn.commit();
            //String url = "jdbc:odbc:Doriver={Microsoft Access Driver (*.mdb, *.accdb)};DBQ=" + "d:\\pp.accdb";
if(p==1)
{
 out.print("record inserted");
           
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
