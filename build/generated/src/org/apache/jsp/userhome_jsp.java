package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class userhome_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("    <center>\n");
      out.write("        <h1> User Registration System Using Session ...</h1>\n");
      out.write("         <hr/>\n");
      out.write("        <table width=\"100%\">\n");
      out.write("            <tr>\n");
      out.write("                <td><a href=\"reg.jsp\" target=\"f1\">Register</td>\n");
      out.write("                <td><a href=\"login2.jsp\" target=\"f1\">login</a></td>\n");
      out.write("                <td><a href=\"show1.jsp\" target=\"f1\">Show Basic details</a></td>\n");
      out.write("                <td><a href=\"show2.jsp\" target=\"f1\">Show Contact details</a></td>\n");
      out.write("                <td><a href=\"removeSession.jsp\" target=\"f1\">Remove Profile and Logout</a></td>\n");
      out.write("                <td><a href=\"logout.jsp\" target=\"f1\">Logout</a></td>\n");
      out.write("            </tr>\n");
      out.write("        </table>\n");
      out.write("        <hr/>\n");
      out.write("        <iframe width=\"100%\" height=\"500\" name=\"f1\" style=\"border-style: none; border-width: 0px; border-collapse: collapse\"></iframe>\n");
      out.write("        \n");
      out.write("    </center>\n");
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
