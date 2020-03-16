package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class page2_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("        ");

            String n1 = request.getParameter("n1")!=null ?request.getParameter("n1") : "";
            String n2 = request.getParameter("n2")!=null ?request.getParameter("n2") : "";
            String n3 = request.getParameter("n3")!=null ?request.getParameter("n3") : "";
            String n4 = request.getParameter("n4")!=null ?request.getParameter("n4") : "";
            
      out.write("\n");
      out.write("          <form action=\"result.jsp\" method=\"post\">\n");
      out.write("              <input type=\"hidden\" name=\"n1\" value=\"");
      out.print(n1);
      out.write("\"/>\n");
      out.write("              <input type=\"hidden\" name=\"n2\" value=\"");
      out.print(n2);
      out.write("\"/>\n");
      out.write("            <input type=\"text\" name=\"n3\" placeholder=\"No3\"  value=\"");
      out.print(n3);
      out.write("\"/><br/><br/>\n");
      out.write("            <input type=\"text\" name=\"n4\" placeholder=\"No4\" value=\"");
      out.print(n4);
      out.write("\"/><br/><br/>\n");
      out.write("            <a href=\"page1.jsp?n1=");
      out.print(n1);
      out.write("&n2=");
      out.print(n2);
      out.write("\">Back </a>\n");
      out.write("            <input type=\"submit\" value=\"Next\"/>\n");
      out.write("        </form>\n");
      out.write("    </body>\n");
      out.write("</html>\n");
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
