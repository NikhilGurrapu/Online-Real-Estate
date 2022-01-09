package org.apache.jsp.user;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import bags.property_bag;
import bags.Signup;
import java.util.ListIterator;
import java.util.List;
import DAO.SignupDAO;
import common.MyConnection;
import java.util.ListIterator;
import java.util.List;
import DAO.SignupDAO;
import common.MyConnection;
import bags.Signup;

public final class property_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList<String>(3);
    _jspx_dependants.add("/user/../common/cdn.jsp");
    _jspx_dependants.add("/user/common/header.jsp");
    _jspx_dependants.add("/user/common/usersidebar.jsp");
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
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>Dashboard</title>\n");
      out.write("        ");
      out.write("<meta charset=\"utf-8\">\n");
      out.write("  <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\n");
      out.write("  <link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css\">\n");
      out.write("  <script src=\"https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js\"></script>\n");
      out.write("  <script src=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js\"></script>\n");
      out.write("  ");
      out.write("\n");
      out.write("        <link rel=\"stylesheet\" href=\"css/common.css\">\n");
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
      out.write("      <a class=\"navbar-brand\" href=\"index.jsp\">ORES</a>\n");
      out.write("    </div>\n");
      out.write("    <div class=\"collapse navbar-collapse\" id=\"myNavbar\">\n");
      out.write("      <ul class=\"nav navbar-nav\">\n");
      out.write("        <li class=\"active\"><a href=\"index.jsp\">Home</a></li>\n");
      out.write("        <li class=\"dropdown\">\n");
      out.write("          <a class=\"dropdown-toggle\" data-toggle=\"dropdown\" href=\"#\">Properties<span class=\"caret\"></span></a>\n");
      out.write("          <ul class=\"dropdown-menu\">\n");
      out.write("            <li><a href=\"property.jsp\">Sell</a></li>\n");
      out.write("            <li><a href=\"#\">Buy</a></li>\n");
      out.write("            <li><a href=\"#\">Buy</a></li>\n");
      out.write("          </ul>\n");
      out.write("        </li>\n");
      out.write("        <li><a href=\"#\">Contact</a></li>\n");
      out.write("        <li><a href=\"property.jsp\">Post your Property</a></li>\n");
      out.write("        \n");
      out.write("      ");

         List list =new SignupDAO(MyConnection.connectTo()).getDBName();
         ListIterator literator=list.listIterator();
         while(literator.hasNext()){
             Signup sb=(Signup)literator.next();
         
      
      out.write("\n");
      out.write("      <li class=\"dropdown\">\n");
      out.write("          <a class=\"dropdown-toggle\" data-toggle=\"dropdown\" href=\"#\">");
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
      out.write("    </div>\n");
      out.write("  </div>\n");
      out.write("</nav>\n");
      out.write("  \n");
      out.write("\n");
      out.write("        <div class=\"container-fluid\">\n");
      out.write("            <div class=\"row\">\n");
      out.write("                <div class=\"col-sm-3 sidebar-col\">\n");
      out.write("                    ");
      out.write("<div>\n");
      out.write("    <a href=\"property.jsp\">Property</a>\n");
      out.write("</div>");
      out.write("\n");
      out.write("                </div>\n");
      out.write("                <div class=\"col-sm-9 main-col\">\n");
      out.write("                    <h3>Post Property</h3>\n");
      out.write("                    <h5>\n");
      out.write("                        ");

                            if(request.getParameter("status")!=null && request.getParameter("status").equals("success")){
                                out.print("Your Property has been Inserted..".toUpperCase());
                            }else if(request.getParameter("status")!=null && request.getParameter("status").equals("failed")){
                                out.print("Unsuccessfully Insertion..".toUpperCase());
                            }
                        
      out.write("\n");
      out.write("                    </h5>\n");
      out.write("                    <form method=\"POST\" action=\"../property_insert_controller\" enctype=\"multipart/form-data\">\n");
      out.write("                        <div class=\"row\">\n");
      out.write("                            <div class=\"col-sm-12\">\n");
      out.write("                                    <label>ID:</label>\n");
      out.write("                                    ");
 
                                         List l=new SignupDAO(MyConnection.connectTo()).getpropertyID();
                                         ListIterator liter=l.listIterator();
                                         while(liter.hasNext()){
                                             Signup sb=(Signup)liter.next();
                                        
      out.write("\n");
      out.write("                                        <label>");
      out.print( sb.getId());
      out.write("</label>\n");
      out.write("                                        \n");
      out.write("                                        ");
 
                                                } 
      out.write("\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"row\">\n");
      out.write("                            <div class=\"col-sm-6\">\n");
      out.write("                                <label>Property Name</label>\n");
      out.write("                                <input type=\"text\" name=\"pname\" class=\"form-control\" placeholder=\"Enter Property name...\">\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"col-sm-6\">\n");
      out.write("                                <label>Price</label>\n");
      out.write("                                <input type=\"text\" name=\"price\" class=\"form-control\" placeholder=\"Enter Price...\">\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                        <br><br>\n");
      out.write("                        <div class=\"row\">\n");
      out.write("                            <div class=\"col-sm-3\">\n");
      out.write("                                <label for=\"ptype\">Type</label>\n");
      out.write("                                <select name=\"ptype\" id=\"ptype\">\n");
      out.write("                                    <option value=\"Apartment\">Apartment</option>\n");
      out.write("                                    <option value=\"Independent House/Villa\">Independent House/Villa</option>\n");
      out.write("                                    <option value=\"Independent/Builder Floor\">Independent/Builder Floor</option>\n");
      out.write("                                    <option value=\"Land\">Land</option>\n");
      out.write("                                    <option value=\"Farmhouse\">Farmhouse</option>\n");
      out.write("                                </select>\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"col-sm-3\">\n");
      out.write("                                <label for=\"srproperty\">Choose</label>\n");
      out.write("                                <select name=\"srproperty\" id=\"srproperty\">\n");
      out.write("                                    <option value=\"Sell\">Sell</option>\n");
      out.write("                                    <option value=\"Rent\">Rent</option>\n");
      out.write("                                </select>\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"col-sm-6\">\n");
      out.write("                                <label for=\"psubtype\">Sub-type</label>\n");
      out.write("                                <select name=\"psubtype\" id=\"psubtypetype\">\n");
      out.write("                                    <option value=\"1RK\">1RK</option>\n");
      out.write("                                    <option value=\"2RK\">2RK</option>\n");
      out.write("                                    <option value=\"3RK\">3RK</option>\n");
      out.write("                                    <option value=\"4RK\">4RK</option>\n");
      out.write("                                    <option value=\"1BHK\">1BHK</option>\n");
      out.write("                                    <option value=\"2BHK\">2BHK</option>\n");
      out.write("                                    <option value=\"3BHK\">3BHK</option>\n");
      out.write("                                    <option value=\"4BHK\">4BHK</option>\n");
      out.write("                                </select>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                        <br><br>\n");
      out.write("                        <div class=\"row\">\n");
      out.write("                            <div class=\"col-sm-6\">\n");
      out.write("                                <label for=\"cityname\">City name</label>\n");
      out.write("                                <select name=\"cityname\" id=\"cityname\">\n");
      out.write("                                    <option value=\"Mumbai\">Mumbai</option>\n");
      out.write("                                    <option value=\"Pune\">Pune</option>\n");
      out.write("                                    <option value=\"Nagpur\">Nagpur</option>\n");
      out.write("                                    <option value=\"Nashik\">Nashik</option>\n");
      out.write("                                    <option value=\"Thane\">Thane</option>\n");
      out.write("                                </select>\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"col-sm-6\">\n");
      out.write("                                <label>Contact</label>\n");
      out.write("                                <input class=\"form-control\" type=\"text\" name=\"contact\" placeholder=\"Enter Contact number...\">\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                        <br>\n");
      out.write("                        <div class=\"row\">\n");
      out.write("                            <div class=\"col-sm-12\">\n");
      out.write("                                <br>\n");
      out.write("                                <textarea name=\"details\" class=\"form-control\" placeholder=\"Details...\"></textarea>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                        <br>\n");
      out.write("                        <div class=\"row\">\n");
      out.write("                            <div class=\"col-sm-6\">\n");
      out.write("                                <input type=\"file\" name=\"img\" class=\"form-control\">\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"col-sm-6\">\n");
      out.write("                                <button style=\"margin-left: 45%; width: 150px; \" class=\"btn btn-success\">Save</button>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                    </form>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("    </body>\n");
      out.write("    <script src=\"https://cdn.ckeditor.com/4.13.1/standard/ckeditor.js\"></script>\n");
      out.write("    <script>\n");
      out.write("        CKEDITOR.replace('details');\n");
      out.write("    </script>\n");
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
