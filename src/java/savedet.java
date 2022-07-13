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
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.*;
/**
 *
 * @author user
 */
public class savedet extends HttpServlet {

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
            out.println("<title>CANDIDATE  DETAILS</title>");            
            out.println("</head>");
            out.println("<body bgcolor=99FFFF>");
            out.println("<h1>Servlet savedet at " + request.getContextPath() + "</h1>");
            out.println("</body>");
            out.println("</html>");
            out.println("<form method=post >");
             
              
               try
        {
            String x,y,z,m,n,o,w,q,r,r1,r2,r4,r6,r8;
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
   q=request.getParameter("h");
   r=request.getParameter("i");
   r1=request.getParameter("j");
   r2=request.getParameter("k");
   r3= Integer.parseInt(request.getParameter("hp"));
   r4=request.getParameter("hs");
   r5=Integer.parseInt(request.getParameter("ip"));
   r6=request.getParameter("ic");
   r7=Integer.parseInt(request.getParameter("gp"));
   r8=request.getParameter("gu");
   
            Connection conn=DriverManager.getConnection("jdbc:ucanaccess://f:\\pp.accdb");
Statement s = conn.createStatement();
            

int p=s.executeUpdate("insert into cnew(name,f_name,padd,cadd,sex,city,state,pincode,emailid,dob,mobileno,hscpercent,hscboard,ip,iboard,gp,gboard) values('"+x+"','"+y+"','"+z+"','"+m+"','"+n+"','"+o+"','"+w+"','"+q+"','"+r+"','"+r1+"','"+r2+"','"+r3+"','"+r4+"','"+r5+"','"+r6+"','"+r7+"','"+r8+"')");
            //Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
conn.commit();
            //String url = "jdbc:odbc:Driver={Microsoft Access Driver (*.mdb, *.accdb)};DBQ=" + "d:\\pp.accdb";
if(p==1)
{
 out.print("record inserted");
 out.print("<br>");
 out.print("The following records were saved");
 out.println("<table border=1 bgcolor=lightblue>");
    out.println("<tr><th>Name</th><th>Father name</th><th>Postal address</th><th>Corresponding address</th><th>Sex</th><th>City</th><th>State</th><th>PinCode</th><th>Email Id</th><th>Dateofbirth</th><th>Contactno</th><th>hscpercent</th><th>hscboard</th><th>Intermediatepercent</th><th>intermediateboard</th><th>graduationpercentage</th><th>University</th><tr>");
      out.println("<tr><td>" + x + "</td><td>" + y + "</td><td>" + z + "</td><td>" + m + "</td><td>" + n + "</td><td>" + o + "</td><td>"  +  w + "</td><td>" + q +  "</td><td>" + r + "</td><td>" + r1 + "</td><td>" + r2 + "</td><td>" + r3 + "</td><td>" + r4 + "</td><td>" + r5 + "</td><td>" + r6 + "</td><td>" + r7 + "</td><td>" + r8 + "</td></tr>"); 
                       
 //out.println("name"+x);
 //out.print("<br>");
 //out.println("Father Name"+y);
 //out.print("<br>");
 //out.println("padd"+z);
// out.print("<br>");
 //out.println("cadd"+m);
 //out.print("<br>");
 //out.println("sex"+n);
 
// out.print("<br>");
// out.println("city"+o);
// out.print("<br>");
// out.println("state"+w);

// out.println("Father Name"+y);
 
           
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
       //processRequest(request, response);
        
         response.setContentType("text/html");  
PrintWriter out = response.getWriter();  

//out.print("hello");

 //String[] n;7
         try
        {
            String x,y,z,m,n,o,w,q,r,r1,r2,r4,r6,r8;
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
   q=request.getParameter("h");
   r=request.getParameter("i");
   r1=request.getParameter("j");
   r2=request.getParameter("k");
   r3= Integer.parseInt(request.getParameter("hp"));
   r4=request.getParameter("hs");
   r5=Integer.parseInt(request.getParameter("ip"));
   r6=request.getParameter("ic");
   r7=Integer.parseInt(request.getParameter("gp"));
   r8=request.getParameter("gu");
   
            Connection conn=DriverManager.getConnection("jdbc:ucanaccess://f:\\pp.accdb");
Statement s = conn.createStatement();
            

int p=s.executeUpdate("insert into cnew(name,f_name,padd,cadd,sex,city,state,pincode,emailid,dob,mobileno,hscpercent,hscboard,ip,iboard,gp,gboard) values('"+x+"','"+y+"','"+z+"','"+m+"','"+n+"','"+o+"','"+w+"','"+q+"','"+r+"','"+r1+"','"+r2+"','"+r3+"','"+r4+"','"+r5+"','"+r6+"','"+r7+"','"+r8+"')");
            //Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
conn.commit();
            //String url = "jdbc:odbc:Driver={Microsoft Access Driver (*.mdb, *.accdb)};DBQ=" + "d:\\pp.accdb";
if(p==1)
{
 out.print("record inserted");
 out.print("<br>");
 out.print("The following records were saved");
 out.println("<table border=1 bgcolor=green>");
    out.println("<tr><th>Name</th><th>Father name</th><th>Postal address</th><th>Corresponding address</th><th>Sex</th><th>City</th><th>State</th><th>PinCode</th><th>Email Id</th><th>Dateofbirth</th><th>Contactno</th><th>hscpercent</th><th>hscboard</th><th>Intermediatepercent</th><th>intermediateboard</th><th>graduationpercentage</th><th>University</th><tr>");
      out.println("<tr><td>" + x + "</td><td>" + y + "</td><td>" + z + "</td><td>" + m + "</td><td>" + n + "</td><td>" + o + "</td><td>"  +  w + "</td><td>" + q +  "</td><td>" + r + "</td><td>" + r1 + "</td><td>" + r2 + "</td><td>" + r3 + "</td><td>" + r4 + "</td><td>" + r5 + "</td><td>" + r6 + "</td><td>" + r7 + "</td></tr>"); 
                       
                       
 //out.println("name"+x);
 //out.print("<br>");
 //out.println("Father Name"+y);
 //out.print("<br>");
 //out.println("padd"+z);
// out.print("<br>");
 //out.println("cadd"+m);
 //out.print("<br>");
 //out.println("sex"+n);
 
// out.print("<br>");
// out.println("city"+o);
// out.print("<br>");
// out.println("state"+w);

// out.println("Father Name"+y);
 
           
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
