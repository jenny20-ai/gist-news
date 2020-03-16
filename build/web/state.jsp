<%-- 
    Document   : state.jsp
    Created on : 25-Feb-2020, 23:43:09
    Author     : Jenny
--%>
<%-- 
    Document   : state
    Created on : 23 Feb, 2020, 9:27:17 PM
    Author     : shobh
--%>

<%@page contentType="text/html" pageEncoding="UTF-8" import="java.sql.*"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
       
        <script>
            function check(x,y)
            {
                y.innerHTML="";
                xyz=new XMLHttpRequest();
                xyz.open("GET","City?op=check&state_id="+x,true);
                xyz.send();
                
                xyz.onreadystatechange=function()
                {
                    if(this.readyState==4 & this.status==200)
                    {
                        y.innerHTML=this.responseText;
                    }
                };
            }
        </script>
    </head>
    <body>
        <h1>Hello World!</h1>
        <form action="City"  class="form">
            <center>
                <table class="table bg-light">
                    <tr>
                        <td>Select State</td>
                        <td><select class="form-control" onchange="check(this.value,city)"></br>
                                <option value="-1">Select State</option>
                            <%
                                PreparedStatement smt;
                                Connection con=null;
                                try{
                                    Class.forName("com.mysql.jdbc.Driver");
                                    con=DriverManager.getConnection("jdbc:mysql://localhost:3306/store","root","jenny");
                                    String sql="select * from states";
                                    smt=con.prepareStatement(sql);
                                    ResultSet rs=smt.executeQuery();
                                    while(rs.next())
                                    {
                                        //out.println(rs);
                                        %>
                                        <option value="<%= rs.getString("id") %>"> <%=rs.getString("name")%></option>
                                        <%}
                                     con.close();
                                      smt.close();
                                }catch(Exception e)
                                {
                                    System.out.println("Error"+e.getMessage());
                                }
                                %>
                            </select>
                            <br/>
                            <select id="city" class="dropdown-header bg-light">
                                <option value="-1"> select city</option> 
                            </select>
                                </td>
                    </tr>
                </table>
            </center>
        </form>
    </body>
</html>


