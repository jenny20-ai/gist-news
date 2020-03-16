<%-- 
    Document   : addnews
    Created on : 06-Mar-2020, 10:32:51
    Author     : Jenny
--%>


<%@page contentType="text/html" pageEncoding="UTF-8" import="com.beans.News"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Adding News</title>
        <jsp:include page="base.jsp"></jsp:include>
        
        <script>

                function readURL(input,preview) {
                    if (input.files && input.files[0]) {
                        var reader = new FileReader();

                        reader.onload = function (e) {
                            preview.src = e.target.result;
                        };

                        reader.readAsDataURL(input.files[0]);
                    }
                }
                </script>
    </head>
    <body>
    <%
        if(session.getAttribute("reporter")==null){
            response.sendRedirect("../login.jsp");
            return;
        }
        
        %>
    <jsp:useBean class="com.beans.News" id="news" scope="session"></jsp:useBean>
    <center>
        <div class="container">
            <div class="row">
                <div class="col-md-3" style="position: fixed;right:0px;">
                    <%if (request.getParameter("submit")!=null){%>
                    <jsp:setProperty name="news" property="*"></jsp:setProperty>
                    <form action="../NewsController?op=add" method="post" enctype="multipart/form-data">
                    <img scr="" style="width:200px; height: 200px;" id="preview" class="form-control"/> <br/>
                    <input type="file" name="image" onchange="readURL(this,preview);" class="form-control btn btn-success"/> <br/>
                    <input type="submit" value="Save to Data base " class="btn btn-primary" name="submit"/>
                    </form>
                    <%
                }%>
                </div>
                
                
                
                <div class="col col-md-9">
                    <form method="post" class="form">
                        <table class="table">
                            <tr><th colspan="2"><center><h2>Add News Here </h2></center></th></tr>
                            <tr>
                                <td>Enter News Title </td>
                                <td><input type="text" name="title" class="form-control" value="${news.title}"/></td>
                            </tr> 
                             <tr>
                                <td>Enter Description </td>
                                <td><textarea name="description" rows="10" cols="20" class="form-control">
                                        ${news.description}
                                    </textarea> 
                               </td>
                            </tr> 
                             
                     
                            <input type="hidden" name="reporter_id" value="${reporter.id}"/>
                            <input type="hidden" name="status" value="Pending"/>
                            <input type="hidden" name="status_text" value="Pending for Approval By Admin"/>
                        </table>
                            <input type="submit" value="save and Next" name="submit" id ="submit" class="form-control btn btn-primary"/>
                    </form>
                </div>
                
                 
            </div>
        </div>
    </center>
    </body>
</html>


