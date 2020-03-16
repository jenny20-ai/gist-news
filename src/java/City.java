/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.sql.*;
/**
 *
 * @author shobh
 */
public class City extends HttpServlet {

    
   

  
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        PrintWriter out=response.getWriter();
        response.setContentType("text/html");
        String op=request.getParameter("op");
       if(op!=null && op.equalsIgnoreCase("check"))
       {
           int state_id=Integer.parseInt(request.getParameter("state_id"));
           Connection con=null;
           PreparedStatement smt=null;
           try{
               Class.forName("com.mysql.jdbc.Driver");
               con=DriverManager.getConnection("jdbc:mysql://localhost:3306/store","root","jenny");
               String sql="select * from city where states_id=?";
               smt=con.prepareStatement(sql);
               smt.setInt(1, state_id);
               ResultSet rs=smt.executeQuery();
               out.print("<option value=-1>Select City</option>");
               while(rs.next())
               {
                  
                   out.print("<option value="+rs.getString("name")+">"+rs.getString("name")+"</option>");
               }
               con.close();
               smt.close();
           }catch(Exception e)
           {
               System.out.println("Error"+e.getMessage());
           }
       }
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
