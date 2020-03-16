package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import com.daos.UserDao;
import com.beans.User;
import java.sql.*;

public final class edit_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("        ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "base.jsp", out, false);
      out.write("\n");
      out.write("        \n");
      out.write("        <script>\n");
      out.write("        function readURL(input) {\n");
      out.write("            if (input.files && input.files[0]) {\n");
      out.write("                var reader = new FileReader();\n");
      out.write("\n");
      out.write("                reader.onload = function (e) {\n");
      out.write("                    img1.src= e.target.result;\n");
      out.write("                };\n");
      out.write("\n");
      out.write("                reader.readAsDataURL(input.files[0]);\n");
      out.write("            }\n");
      out.write("        }\n");
      out.write("         \n");
      out.write("        \n");
      out.write("           \n");
      out.write("   </script>\n");
      out.write("            <style>\n");
      out.write("                img{\n");
      out.write("  max-width:180px;\n");
      out.write("}\n");
      out.write("input[type=file]{\n");
      out.write("padding:10px;\n");
      out.write("background:#2d2d2d;}\n");
      out.write("            </style>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("    ");
      com.beans.User user = null;
      synchronized (session) {
        user = (com.beans.User) _jspx_page_context.getAttribute("user", PageContext.SESSION_SCOPE);
        if (user == null){
          user = new com.beans.User();
          _jspx_page_context.setAttribute("user", user, PageContext.SESSION_SCOPE);
        }
      }
      out.write("\n");
      out.write("        <div class=\"container\">\n");
      out.write("             <div class=\"row\">\n");
      out.write("                 <div style=\"position: fixed; bottom: 0px\">\n");
      out.write("                     ");
 if (request.getParameter("submit")!=null){
      out.write("\n");
      out.write("                     ");
      org.apache.jasper.runtime.JspRuntimeLibrary.introspect(_jspx_page_context.findAttribute("user"), request);
      out.write("\n");
      out.write("                     ");

                         String hobbies[] = request.getParameterValues("hobbies");
                         String hbs="";
                         for (String s : hobbies)
                            hbs += s +",";
                         
                         user.setHobbies(hbs);
                         
                         
      out.write("\n");
      out.write("                     \n");
      out.write("                     \n");
      out.write("                     <form action=\"UserController?op=update&id=");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${user.id}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\" method=\"post\" enctype=\"multipart/form-data\">\n");
      out.write("                     <img src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${user.photo}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\" id=\"img1\" class=\"img img-thumbnail\" style=\"width:200px; height: 200px\"/> <br/>\n");
      out.write("                     Change Profile Image<input type=\"file\" name=\"photo\" id=\"photo\" onchange=\"readURL(this);\" />\n");
      out.write("                     <br/>\n");
      out.write("                     <input type=\"submit\" value=\" Update in Record\"/>\n");
      out.write("                     </form>\n");
      out.write("                     ");
}
      out.write("\n");
      out.write("                 </div>             \n");
      out.write("             </div>\n");
      out.write("            \n");
      out.write("            \n");
      out.write("            \n");
      out.write("            <div class=\"row\">\n");
      out.write("                <div class=\"col\">\n");
      out.write("                     ");

         int id =request.getParameter("id")!=null?Integer.parseInt(request.getParameter("id")):-1;
         UserDao ud = new UserDao();
         if(user!=null && user.getId()!=id){
         user  = ud.getById(id);
         session.setAttribute("user", user);
         }
        
      out.write(" \n");
      out.write("         \n");
      out.write("    \n");
      out.write("   <form method=\"post\" class=\"form\"> \n");
      out.write("    <center>\n");
      out.write("        <h2> Update User's Data </h2>\n");
      out.write("        <table class=\"table bg-info\"> \n");
      out.write("            <tr>\n");
      out.write("                <td>Name </td>\n");
      out.write("                <td><input type=\"text\" name=\"name\" required=\"required\" autocomplete=\"off\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${user.name}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\"/> </td>\n");
      out.write("               \n");
      out.write("            </tr> <tr>\n");
      out.write("                <td>Father's Name </td>\n");
      out.write("                <td><input type=\"text\" name=\"fname\" required=\"required\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${user.fname}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\"/> </td>\n");
      out.write("            </tr>\n");
      out.write("             <tr>\n");
      out.write("                <td>your DOB  </td>\n");
      out.write("                <td><input type=\"date\" name=\"dob\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${user.dob}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\" /> </td>\n");
      out.write("            </tr>\n");
      out.write("             <tr>\n");
      out.write("                <td>Your Gender </td>\n");
      out.write("                <td> <input type=\"radio\" name=\"gender\"  value=\"Male\"  ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${user.gender eq \"Male\"?  \" checked\":\"\"}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/> Male<br/>\n");
      out.write("                    <input type=\"radio\" name=\"gender\" value=\"Female\" ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${user.gender eq \"Female\"?  \" checked\":\"\"}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write(" />Female<br/>\n");
      out.write("                </td>\n");
      out.write("            </tr> \n");
      out.write("                <td>Selected Hobbies : </td>\n");
      out.write("                <td>\n");
      out.write("                    <input type=\"checkbox\" name=\"hobbies\" value=\"Dancing\"  ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${user.hobbies.contains(\"Dancing\")? \" checked\" :\"\"}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write(" />Dancing\n");
      out.write("                     <input type=\"checkbox\" name=\"hobbies\" value=\"Singing\" ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${user.hobbies.contains(\"Singing\")? \" checked\" :\"\"}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/>Singing <br/>\n");
      out.write("                    <input type=\"checkbox\" name=\"hobbies\" value=\"Cooking\" ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${user.hobbies.contains(\"Cooking\")? \" checked\" :\"\"}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/>Cooking\n");
      out.write("                    <input type=\"checkbox\" name=\"hobbies\" value=\"Drawing\" ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${user.hobbies.contains(\"Drawing\")? \" checked\" :\"\"}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("  />Drawing\n");
      out.write("                 </td>\n");
      out.write("            </tr>\n");
      out.write("            \n");
      out.write("            <tr>\n");
      out.write("                 \n");
      out.write("                <th colspan=\"2\">\n");
      out.write("                    <input type=\"reset\" value=\"Clear\" />\n");
      out.write("                    <input type=\"submit\" name=\"submit\" value=\"Save and Next \"/> \n");
      out.write("                </th>\n");
      out.write("            </tr>\n");
      out.write("            \n");
      out.write("         </table>\n");
      out.write("    </center>\n");
      out.write("        </form>\n");
      out.write("    \n");
      out.write("    </div>\n");
      out.write("            </div>\n");
      out.write("                 \n");
      out.write("                \n");
      out.write("                 \n");
      out.write("        </div>\n");
      out.write("       \n");
      out.write("    </body>\n");
      out.write("</html>\n");
      out.write(" \n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
