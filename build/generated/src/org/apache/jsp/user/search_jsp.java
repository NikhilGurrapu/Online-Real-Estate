package org.apache.jsp.user;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import bags.property_bag;
import java.util.Iterator;
import DAO.Property_DAO;
import java.util.ListIterator;
import java.util.List;
import DAO.SignupDAO;
import common.MyConnection;
import bags.Signup;

public final class search_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList<String>(2);
    _jspx_dependants.add("/user/../common/cdn.jsp");
    _jspx_dependants.add("/user/common/header.jsp");
  }

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
      out.write("        <title>User Home Page</title>\n");
      out.write("        ");
      out.write("<meta charset=\"utf-8\">\n");
      out.write("  <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\n");
      out.write("  <link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css\">\n");
      out.write("  <script src=\"https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js\"></script>\n");
      out.write("  <script src=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js\"></script>\n");
      out.write("  ");
      out.write("\n");
      out.write("        <link rel=\"stylesheet\" href=\"css/common.css\">\n");
      out.write("        \n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        ");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<nav class=\"navbar navbar-inverse\">\n");
      out.write("  <div class=\"container-fluid\">\n");
      out.write("    <div class=\"navbar-header\">\n");
      out.write("      <button type=\"button\" class=\"navbar-toggle\" data-toggle=\"collapse\" data-target=\"#myNavbar\">\n");
      out.write("        <span class=\"icon-bar\"></span>\n");
      out.write("        <span class=\"icon-bar\"></span>\n");
      out.write("        <span class=\"icon-bar\"></span>                        \n");
      out.write("      </button>\n");
      out.write("        <a class=\"navbar-brand\" href=\"index.jsp\"><b class=\"o\">O</b>RES</a>\n");
      out.write("    </div>\n");
      out.write("    <div class=\"collapse navbar-collapse\" id=\"myNavbar\">\n");
      out.write("      <ul class=\"nav navbar-nav\">\n");
      out.write("        <li class=\"active\"><a href=\"../index.jsp\">Home</a></li>\n");
      out.write("        <li class=\"dropdown\">\n");
      out.write("          <a class=\"dropdown-toggle\" data-toggle=\"dropdown\" href=\"#\">Properties<span class=\"caret\"></span></a>\n");
      out.write("          <ul class=\"dropdown-menu\">\n");
      out.write("            <li><a href=\"property.jsp\">Sell</a></li>\n");
      out.write("            <li><a href=\"search.jsp\">Buy</a></li>\n");
      out.write("            <li><a href=\"#\">Rent</a></li>\n");
      out.write("          </ul>\n");
      out.write("        </li>\n");
      out.write("        <li><a href=\"C:\\Users\\HP\\OneDrive\\Documents\\NetBeansProjects\\Project\\web\\user\\property.jsp\">Post your Property</a></li>\n");
      out.write("        \n");
      out.write("        \n");
      out.write("        \n");
      out.write("      ");

         List list =new SignupDAO(MyConnection.connectTo()).getDBName();
         ListIterator literator=list.listIterator();
         while(literator.hasNext()){
             Signup sb=(Signup)literator.next();
         
      
      out.write("\n");
      out.write("      <li class=\"dropdown\">\n");
      out.write("          <a class=\"dropdown-toggle\" data-toggle=\"dropdown\" href=\"#\"><span class=\"glyphicon glyphicon-user\"></span>&nbsp;&nbsp;");
      out.print( sb.getName() );
      out.write("<span class=\"caret\"></span></a>\n");
      out.write("          <ul class=\"dropdown-menu\">\n");
      out.write("            <li><a href=\"#\">Profile</a></li>\n");
      out.write("            <li><a href=\"#\">My Properties</a></li>\n");
      out.write("            <li><a href=\"../mainindex.jsp\">Logout</a></li>\n");
      out.write("            ");

              }
              
      out.write("\n");
      out.write("          </ul>\n");
      out.write("      </li>\n");
      out.write("      </ul>\n");
      out.write("          <ul class=\"nav navbar-nav navbar-right\">\n");
      out.write("      <li><a href=\"search.jsp\"><span class=\"glyphicon glyphicon-search\"></span>&nbsp;&nbsp;Search</a></li>\n");
      out.write("        <li><a href=\"contact.jsp\">Contact</a></li>\n");
      out.write("      </ul>\n");
      out.write("    </div>\n");
      out.write("  </div>\n");
      out.write("</nav>\n");
      out.write("  \n");
      out.write("\n");
      out.write("        <div class=\"container\">\n");
      out.write("            <form method=\"post\" action=\"search\">\n");
      out.write("                <div class=\"row\">\n");
      out.write("                    <div class=\"col-sm-3\">\n");
      out.write("                        <label for=\"ptype\">Type</label><br>\n");
      out.write("                        <select name=\"ptype\" id=\"ptype\" class=\"ptype\">\n");
      out.write("                                    <option value=\" \">Select</option>\n");
      out.write("                                    <option value=\"Apartment\">Apartment</option>\n");
      out.write("                                    <option value=\"Independent House/Villa\">Independent House/Villa</option>\n");
      out.write("                                    <option value=\"Independent/Builder Floor\">Independent/Builder Floor</option>\n");
      out.write("                                    <option value=\"Land\">Land</option>\n");
      out.write("                                    <option value=\"Farmhouse\">Farmhouse</option>\n");
      out.write("                        </select>\n");
      out.write("                    </div>\n");
      out.write("                    \n");
      out.write("                    <div class=\"col-sm-4\">\n");
      out.write("                        <label for=\"minprice\">Min - Price</label><br>\n");
      out.write("                        <input type=\"text\" name=\"minprice\" class=\"form-control\" placeholder=\"Minimum\">\n");
      out.write("                    </div>\n");
      out.write("                    \n");
      out.write("                    <div class=\"col-sm-4\">\n");
      out.write("                        <label for=\"maxprice\">Max - Price</label><br>\n");
      out.write("                        <input type=\"text\" name=\"maxprice\" class=\"form-control\" placeholder=\"Maximum\">\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"col-sm-4\">\n");
      out.write("                        <label for=\"price-min\">Price:</label>\n");
      out.write("                        <input type=\"range\" name=\"price-min\" id=\"price-min\" value=\"200\" min=\"0\" max=\"1000\">\n");
      out.write("                        <label for=\"price-max\">Price:</label>\n");
      out.write("                        <input type=\"range\" name=\"price-max\" id=\"price-max\" value=\"800\" min=\"0\" max=\"1000\">\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("                <br>\n");
      out.write("                <div class=\"row\">\n");
      out.write("                    <div class=\"col-sm-3\">\n");
      out.write("                        <label for=\"srproperty\">Choose</label><br>\n");
      out.write("                        <select name=\"srproperty\" id=\"srproperty\" class=\"srproperty\">\n");
      out.write("                                    <option value=\" \">Select</option>\n");
      out.write("                                    <option value=\"Sell\">Sell</option>\n");
      out.write("                                    <option value=\"Rent\">Rent</option>\n");
      out.write("                        </select>\n");
      out.write("                    </div>\n");
      out.write("                    \n");
      out.write("                    <div class=\"col-sm-3\">\n");
      out.write("                        <label for=\"psubtype\">Sub - type</label><br>\n");
      out.write("                        <select name=\"psubtype\" id=\"psubtypetype\" class=\"psubtype\">\n");
      out.write("                                    <option value=\" \">Select</option>\n");
      out.write("                                    <option value=\"1RK\">1RK</option>\n");
      out.write("                                    <option value=\"2RK\">2RK</option>\n");
      out.write("                                    <option value=\"3RK\">3RK</option>\n");
      out.write("                                    <option value=\"4RK\">4RK</option>\n");
      out.write("                                    <option value=\"1BHK\">1BHK</option>\n");
      out.write("                                    <option value=\"2BHK\">2BHK</option>\n");
      out.write("                                    <option value=\"3BHK\">3BHK</option>\n");
      out.write("                                    <option value=\"4BHK\">4BHK</option>\n");
      out.write("                        </select>\n");
      out.write("                    </div>\n");
      out.write("                    \n");
      out.write("                    <div class=\"col-sm-3\">\n");
      out.write("                        <label for=\"cityname\">City name</label><br>\n");
      out.write("                        <select name=\"cityname\" id=\"cityname\" class=\"cityname\">\n");
      out.write("                                    <option value=\" \">Select</option>\n");
      out.write("                                    <option value=\"Mumbai\">Mumbai</option>\n");
      out.write("                                    <option value=\"Pune\">Pune</option>\n");
      out.write("                                    <option value=\"Nagpur\">Nagpur</option>\n");
      out.write("                                    <option value=\"Nashik\">Nashik</option>\n");
      out.write("                                    <option value=\"Thane\">Thane</option>\n");
      out.write("                        </select>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"col-sm-3\">\n");
      out.write("                        <br>\n");
      out.write("                        <input type=\"button\" value=\"Search\" class=\"search\">\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </form>\n");
      out.write("        </div>\n");
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
