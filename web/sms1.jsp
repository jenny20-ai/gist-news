<%-- 
    Document   : sms1
    Created on : 04-Mar-2020, 07:44:29
    Author     : Jenny
--%>
<%-- 
    Document   : sms1
    Created on : 04-Mar-2020, 07:41:37
    Author     : Dell
--%>

<%@page import="com.utilities.SmsSender"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <jsp:include page="base.jsp"></jsp:include>
    </head>
    <body><center>
        <div class="container">
            <div class="row">
                <div class="col col-md-6" style="text-align: left">
                    <form method="post">
                        <input type="number" name="mobile" placeholder="Enter Mobile No." class="form-control"/>
                        <br/>
                        Enter Message :<br/>
                        <textarea name="message" rows="10" cols="20" class="form-control">
                            
                        </textarea>
                        <br/>
                        <input type="submit" value="Send" name="submit" class="btn btn-primary form-control"/>
                        
                    </form>
                   
              </div>  
            </div>
        </div></center>
    
    <% if (request.getParameter("submit")!=null) {
        String message = request.getParameter("message");
        String mobile = request.getParameter("mobile");
        String output = SmsSender.sendCampaign("9DEGSAXLFI92K9TSM2G0EO1PGI34XAZU", "APAWAN5PIVRB0Z1P", "stage", mobile, message, "harshita");
        if(output.contains("200"))
        out.println("<script>alert('Message Sent');</script>");
        else
            out.println("<script>alert('Message could not be sent !');</script>");
    }        
        
    %>
    </body>
</html>


