package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class sidebar_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      response.setContentType("text/html");
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
      out.write("<div class=\"sidebar-sticky\">\n");
      out.write("            <ul class=\"nav flex-column\">\n");
      out.write("              <li class=\"nav-item\">\n");
      out.write("                    <a class=\"nav-link active\" href=\"#\">\n");
      out.write("                        <span style=\"text-align: center\">\n");
      out.write("                      <img src=\"../");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${reporter.image}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\" style=\"border-radius: 50%; width:64px; height: 64px; border-style: double;border-color:blue;\"/><br/>\n");
      out.write("                    </span>\n");
      out.write("                  \n");
      out.write("                </a>\n");
      out.write("           <li class=\"nav-item\">\n");
      out.write("             \n");
      out.write("                <a class=\"nav-link active\" href=\"#\">\n");
      out.write("                  <span data-feather=\"home\"></span>\n");
      out.write("                  Dashboard <span class=\"sr-only\">(current)</span>\n");
      out.write("                </a>\n");
      out.write("              </li>\n");
      out.write("              <li class=\"nav-item\">\n");
      out.write("                  <a class=\"nav-link\" href=\"addNews.jsp\">\n");
      out.write("                  <span data-feather=\"file\"></span>\n");
      out.write("                  Add News\n");
      out.write("                </a>\n");
      out.write("              </li>\n");
      out.write("              <li class=\"nav-item\">\n");
      out.write("                <a class=\"nav-link\" href=\"#\">\n");
      out.write("                  <span data-feather=\"shopping-cart\"></span>\n");
      out.write("                   Update News\n");
      out.write("                </a>\n");
      out.write("              </li>\n");
      out.write("              \n");
      out.write("              \n");
      out.write("              <li class=\"nav-item\">\n");
      out.write("                <a class=\"nav-link\" href=\"#\">\n");
      out.write("                  <span data-feather=\"layers\"></span>\n");
      out.write("                  Update Profile\n");
      out.write("                </a>\n");
      out.write("              </li> <li class=\"nav-item\">\n");
      out.write("                <a class=\"nav-link\" href=\"#\">\n");
      out.write("                  <span data-feather=\"layers\"></span>\n");
      out.write("                  Change Password\n");
      out.write("                </a>\n");
      out.write("              </li>\n");
      out.write("              \n");
      out.write("            </ul>\n");
      out.write("\n");
      out.write("            <h6 class=\"sidebar-heading d-flex justify-content-between align-items-center px-3 mt-4 mb-1 text-muted\">\n");
      out.write("              <span>report section</span>\n");
      out.write("              <a class=\"d-flex align-items-center text-muted\" href=\"#\">\n");
      out.write("                <span data-feather=\"plus-circle\"></span>\n");
      out.write("              </a>\n");
      out.write("            </h6>\n");
      out.write("            <ul class=\"nav flex-column mb-2\">\n");
      out.write("              <li class=\"nav-item\">\n");
      out.write("                <a class=\"nav-link\" href=\"#\">\n");
      out.write("                  <span data-feather=\"file-text\"></span>\n");
      out.write("                  Pending News\n");
      out.write("                </a>\n");
      out.write("              </li>\n");
      out.write("              <li class=\"nav-item\">\n");
      out.write("                <a class=\"nav-link\" href=\"#\">\n");
      out.write("                  <span data-feather=\"file-text\"></span>\n");
      out.write("                  Rejected News\n");
      out.write("                </a>\n");
      out.write("              </li>\n");
      out.write("              <li class=\"nav-item\">\n");
      out.write("                <a class=\"nav-link\" href=\"#\">\n");
      out.write("                  <span data-feather=\"file-text\"></span>\n");
      out.write("                  Approved New\n");
      out.write("                </a>\n");
      out.write("              </li>\n");
      out.write("              <li class=\"nav-item\">\n");
      out.write("                <a class=\"nav-link\" href=\"#\">\n");
      out.write("                  <span data-feather=\"file-text\"></span>\n");
      out.write("                  Report Chart\n");
      out.write("                </a>\n");
      out.write("              </li>\n");
      out.write("            </ul>\n");
      out.write("          </div>");
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
