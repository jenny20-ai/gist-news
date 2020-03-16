package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class json2_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("        <script> \n");
      out.write("            function showNews(x,y){\n");
      out.write("                ajax =new XMLHttpRequest();\n");
      out.write("                ajax.open(\"GET\", \"http://newsapi.org/v2/everything?q=\"+ x +\"&from=2020-02-14&sortBy=publishedAt&apiKey=951eb8ae5c074f42a7b053d6067525ef\")\n");
      out.write("                ajax.send();\n");
      out.write("                \n");
      out.write("                ajax.onreadystatechange = function(){\n");
      out.write("                    if(this.readyState==4 && this.status==200){\n");
      out.write("                        //y.innerHTML = this.responseText;\n");
      out.write("                        newsObject = JSON.parse(this.responseText);\n");
      out.write("                        articles = newsObject['articles'];\n");
      out.write("                        for (i in articles){\n");
      out.write("                            artical = articles[i];\n");
      out.write("                            y.innerHTML +=\" <h4>News - \" + (i) + \"</h4> <br/>\" + artical.title +\"<br/>\" + artical.description +\"<br/> <img src='\"+ artical.urlToImage+\"'width=100 height=100/>\"; \n");
      out.write("                            \n");
      out.write("                        }\n");
      out.write("                    }\n");
      out.write("                    \n");
      out.write("                };\n");
      out.write("    }\n");
      out.write("            </script>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        Enter Keyword to Search : <input type=\"text\" id=\"keyword\"/> \n");
      out.write("        <input type=\"button\" value=\"Search\" onclick=\"showNews(keyword.value,p1)\"/>\n");
      out.write("        <p id=\"p1\">\n");
      out.write("            \n");
      out.write("        </p>\n");
      out.write("    </body>\n");
      out.write("</html>\n");
      out.write("\n");
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
