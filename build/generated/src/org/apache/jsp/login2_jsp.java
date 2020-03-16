package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class login2_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write('\n');
      out.write('\n');
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
      out.write("<style>\n");
      out.write("  \n");
      out.write("html,body{\n");
      out.write("background-image: url('assets/images/544750.jpg');\n");
      out.write("background-size: cover;\n");
      out.write("background-repeat: no-repeat;\n");
      out.write("height: 100%;\n");
      out.write("font-family: 'Numans', sans-serif;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".container{\n");
      out.write("height: 100%;\n");
      out.write("align-content: center;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".card{\n");
      out.write("height: 370px;\n");
      out.write("margin-top: auto;\n");
      out.write("margin-bottom: auto;\n");
      out.write("width: 400px;\n");
      out.write("background-color: rgba(0,0,0,0.5) !important;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".social_icon span{\n");
      out.write("font-size: 60px;\n");
      out.write("margin-left: 10px;\n");
      out.write("color: #FFC312;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".social_icon span:hover{\n");
      out.write("color: white;\n");
      out.write("cursor: pointer;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".card-header h3{\n");
      out.write("color: white;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".social_icon{\n");
      out.write("position: absolute;\n");
      out.write("right: 20px;\n");
      out.write("top: -45px;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".input-group-prepend span{\n");
      out.write("width: 50px;\n");
      out.write("background-color: #FFC312;\n");
      out.write("color: black;\n");
      out.write("border:0 !important;\n");
      out.write("}\n");
      out.write("\n");
      out.write("input:focus{\n");
      out.write("outline: 0 0 0 0  !important;\n");
      out.write("box-shadow: 0 0 0 0 !important;\n");
      out.write("\n");
      out.write("}\n");
      out.write("\n");
      out.write(".remember{\n");
      out.write("color: white;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".remember input\n");
      out.write("{\n");
      out.write("width: 20px;\n");
      out.write("height: 20px;\n");
      out.write("margin-left: 15px;\n");
      out.write("margin-right: 5px;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".login_btn{\n");
      out.write("color: black;\n");
      out.write("background-color: #FFC312;\n");
      out.write("width: 100px;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".login_btn:hover{\n");
      out.write("color: black;\n");
      out.write("background-color: white;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".links{\n");
      out.write("color: white;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".links a{\n");
      out.write("margin-left: 4px;\n");
      out.write("}\n");
      out.write(" </style>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        ");

            String userid="";
            String password= "";
            Cookie cookies[] = request.getCookies();
            for(Cookie c : cookies){
                if (c.getName().equals("userid"))
                    userid=c.getValue();
                if(c.getName().equals("password"))
                    password=c.getValue();
            }
            
      out.write("\n");
      out.write("        \n");
      out.write("        \n");
      out.write("        \n");
      out.write("       <div class=\"container\">\n");
      out.write("\t<div class=\"d-flex justify-content-center h-100\">\n");
      out.write("\t\t<div class=\"card\">\n");
      out.write("\t\t\t<div class=\"card-header\">\n");
      out.write("\t\t\t\t<h3>Sign In</h3>\n");
      out.write("                                <br/>\n");
      out.write("                                <span id=\"s1\">\n");
      out.write("                                ");
 if (request.getParameter("msg")!=null)
                                    out.println("<font color='red' size='4'>"+request.getParameter("msg")+"</font>" );
                                
      out.write("\n");
      out.write("                                </span>\n");
      out.write("\t\t\t\t<div class=\"d-flex justify-content-end social_icon\">\n");
      out.write("\t\t\t\t\t<span><i class=\"fab fa-facebook-square\"></i></span>\n");
      out.write("\t\t\t\t\t<span><i class=\"fab fa-google-plus-square\"></i></span>\n");
      out.write("\t\t\t\t\t<span><i class=\"fab fa-twitter-square\"></i></span>\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t\t<div class=\"card-body\">\n");
      out.write("                            <form action=\"UserController?op=login\" method=\"post\">\n");
      out.write("\t\t\t\t\t<div class=\"input-group form-group\">\n");
      out.write("\t\t\t\t\t\t<div class=\"input-group-prepend\">\n");
      out.write("\t\t\t\t\t\t\t<span class=\"input-group-text\"><i class=\"fas fa-user\"></i></span>\n");
      out.write("\t\t\t\t\t\t</div>\n");
      out.write("                                            <input type=\"text\" class=\"form-control\" placeholder=\"username\" name=\"userid\" required=\"required\"  onfocus=\"s1.innerHTML='';\" autocomplete=\"off\" value=\"");
      out.print(userid);
      out.write("\">\n");
      out.write("\t\t\t\t\t\t\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t<div class=\"input-group form-group\">\n");
      out.write("\t\t\t\t\t\t<div class=\"input-group-prepend\">\n");
      out.write("\t\t\t\t\t\t\t<span class=\"input-group-text\"><i class=\"fas fa-key\"></i></span>\n");
      out.write("\t\t\t\t\t\t</div>\n");
      out.write("                                            <input type=\"password\" class=\"form-control\" placeholder=\"password\" name=\"password\" required=\"required\" value=\"");
      out.print(password);
      out.write("\">\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t<div class=\"row align-items-center remember\">\n");
      out.write("                                            <input type=\"checkbox\" name=\"remember\" value=\"yes\">Remember Me\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t<div class=\"form-group\">\n");
      out.write("\t\t\t\t\t\t<input type=\"submit\" value=\"Login\" class=\"btn float-right login_btn\">\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t</form>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t\t<div class=\"card-footer\">\n");
      out.write("\t\t\t\t<div class=\"d-flex justify-content-center links\">\n");
      out.write("\t\t\t\t\tDon't have an account?<a href=\"#\">Sign Up</a>\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t\t<div class=\"d-flex justify-content-center\">\n");
      out.write("\t\t\t\t\t<a href=\"#\">Forgot your password?</a>\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t</div>\n");
      out.write("\t</div>\n");
      out.write("</div>\n");
      out.write("    </body>\n");
      out.write("</html>\n");
      out.write("\n");
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
