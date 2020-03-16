package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import javax.smartcardio.Card;
import java.util.ArrayList;
import com.beans.*;

public final class showcart_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("        ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "base.jsp", out, false);
      out.write("\n");
      out.write("        </head>\n");
      out.write("        <body>\n");
      out.write("            You have selected product id ");
      out.print(request.getParameter("id"));
      out.write("\n");
      out.write("\n");
      out.write("        ");

           ArrayList<cart> mycart = (ArrayList) session.getAttribute("mycart") ;
            if(mycart==null)
                mycart = new ArrayList();
            
            int id =request.getParameter("id")!=null?Integer.parseInt(request.getParameter("id")):-1;
            int quantity = request.getParameter("quantity")!=null? Integer.parseInt(request.getParameter("quantity")):0;
            ArrayList<Product> products = (ArrayList) session.getAttribute("products");
            Product myproduct = null;
            
           
            for (Product product : products) {
                if (product.getId() == id) {
                    myproduct = product;
                }
            }
          
           if(myproduct!=null) {   
            boolean exist =false;
            cart c =null; 
            
            for(int i=0; i<mycart.size(); i++) {
                cart cc= mycart.get(i);
                if (cc.getProduct().getId() == myproduct.getId()) 
                {
                   exist=true; 
                   cc.setQty(cc.getQty()+quantity);
                   mycart.set(i, cc);
                   break;
                }
            }
              
                   
            
            if(!exist) {
            c = new cart();
            c.setProduct(myproduct);
            c.setQty(quantity);
            mycart.add(c);
            }
           
       }     
            session.setAttribute("mycart", mycart);
            
        
      out.write("\n");
      out.write("\n");
      out.write("        <div class=\"container\">\n");
      out.write("            <center>\n");
      out.write("                <div class=\"row\">\n");
      out.write("                    <div class=\"col col-md-6\">\n");
      out.write("                        <table class=\"table\">\n");
      out.write("                            <tr>\n");
      out.write("                                <th>Product id</th>\n");
      out.write("                                <th>Name </th>\n");
      out.write("                                <th>Image</th>\n");
      out.write("                                <th>Price </th>\n");
      out.write("                                <th>Quantity</th>\n");
      out.write("                                <th>Amout</th>\n");
      out.write("                                <th>Action</th>\n");
      out.write("                            </tr>\n");
      out.write("                            ");
int index=0;  for (cart cart : mycart){
      out.write("\n");
      out.write("                            <tr>\n");
      out.write("                                <td>");
      out.print(cart.getProduct().getId());
      out.write("</td>\n");
      out.write("                                <td>");
      out.print(cart.getProduct().getName());
      out.write("</td>\n");
      out.write("                                <td><img src=\"");
      out.print(cart.getProduct().getImage());
      out.write("\" style=\"width:64px; height: 64px\"/></td>\n");
      out.write("                                <td>");
      out.print(cart.getProduct().getPrice());
      out.write("</td>\n");
      out.write("                                <td><a href=\"#\"><i class=\"fa fa-minus\"></i></a> ");
      out.print(cart.getQty());
      out.write("  <a href=\"#\"><i class=\"fa fa-plus\"></i></a></td>\n");
      out.write("                                <td>");
      out.print(cart.getQty() * cart.getProduct().getPrice());
      out.write("</td>\n");
      out.write("                                <td><a href=\"showcart.jsp?op=remove&index=");
      out.print(index++);
      out.write("\"><i class=\"fa fa-trash\"></i></a></td>\n");
      out.write("                            </tr>\n");
      out.write("                            ");
}
      out.write("\n");
      out.write("                        </table>\n");
      out.write("                        <br/>\n");
      out.write("                        <a href=\"products.jsp\">Shop More</a>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </center>\n");
      out.write("        </div> \n");
      out.write("                        \n");
      out.write("                        \n");
      out.write("                        ");
 
                        String op = request.getParameter("op");
                        if (op!=null && op.equalsIgnoreCase("remove")){
                            mycart.remove(Integer.parseInt(request.getParameter("index")));
                            session.setAttribute("mycart", mycart);
                            response.sendRedirect("showcart.jsp");
                        }
                        
                        
      out.write("\n");
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
