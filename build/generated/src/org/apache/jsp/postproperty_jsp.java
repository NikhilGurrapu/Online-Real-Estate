package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import bags.property_bag;
import bags.Signup;
import java.util.ListIterator;
import java.util.List;
import DAO.SignupDAO;
import common.MyConnection;
import bags.Signup;

public final class postproperty_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList<String>(3);
    _jspx_dependants.add("/common/cdn.jsp");
    _jspx_dependants.add("/common/header.jsp");
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
      out.write("        <title>Post Property</title>\n");
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
      out.write("<nav class=\"navbar navbar-inverse\">\n");
      out.write("  <div class=\"container-fluid\">\n");
      out.write("    <div class=\"navbar-header\">\n");
      out.write("      <button type=\"button\" class=\"navbar-toggle\" data-toggle=\"collapse\" data-target=\"#myNavbar\">\n");
      out.write("        <span class=\"icon-bar\"></span>\n");
      out.write("        <span class=\"icon-bar\"></span>\n");
      out.write("        <span class=\"icon-bar\"></span>                    \n");
      out.write("      </button>\n");
      out.write("        <a class=\"navbar-brand\" href=\"index.jsp\"><header><b style=\"color: orange\">O</b>RES</header></a>\n");
      out.write("    </div>\n");
      out.write("    <div class=\"collapse navbar-collapse\" id=\"myNavbar\">\n");
      out.write("      <ul class=\"nav navbar-nav\">\n");
      out.write("        <li class=\"active\"><a href=\"C:\\Users\\HP\\OneDrive\\Documents\\NetBeansProjects\\Project\\web\\index.jsp\">HOME</a></li>\n");
      out.write("        <li class=\"dropdown\">\n");
      out.write("          <a class=\"dropdown-toggle\" data-toggle=\"dropdown\" href=\"#\">PROPERTIES<span class=\"caret\"></span></a>\n");
      out.write("          <ul class=\"dropdown-menu\">\n");
      out.write("              \n");
      out.write("            <li><a href=\"#\">Sell</a></li>\n");
      out.write("            <li><a href=\"#\">Buy</a></li>\n");
      out.write("            <li><a href=\"#\">Rent</a></li>\n");
      out.write("          </ul>\n");
      out.write("        </li>\n");
      out.write("        \n");
      out.write("        \n");
      out.write("        <li class=\"dropdown\">\n");
      out.write("            ");

                if(session.getAttribute("Signup") !=null){
                      Signup sb=(Signup) session.getAttribute("Signup");
                
      out.write("\n");
      out.write("                <a class=\"dropdown-toggle\" data-toggle=\"dropdown\" href=\"#\"><span class=\"glyphicon glyphicon-user\"></span>&nbsp;&nbsp;\n");
      out.write("                    <b style=\"text-transform: uppercase; font-weight: normal;\">");
      out.print( sb.getName());
      out.write("</b>\n");
      out.write("                    <span class=\"caret\"></span>\n");
      out.write("                </a>\n");
      out.write("                    <ul class=\"dropdown-menu\">\n");
      out.write("            ");
 
                      if(sb.getRole().equals("admin")){
                          
      out.write("\n");
      out.write("                          <li><a class=\"dropdown-item\" href=\"#\">PROFILE</a></li>\n");
      out.write("                          <li><a class=\"dropdown-item\" href=\"../admin/dashboard.jsp\">DASHBOARD</a></li>\n");
      out.write("                          <li><a class=\"dropdown-item\" href=\"Logout_controller\">LOGOUT</a></li>\n");
      out.write("                              \n");
      out.write("                          ");

                      }
                      else if(sb.getRole().equals("user")){
                          
      out.write("\n");
      out.write("                          <li><a href=\"postproperty.jsp\"><span class=\"glyphicon glyphicon-home\"></span>&nbsp;&nbsp;&nbsp;&nbsp;POST YOUR PROPERTY</a></li>\n");
      out.write("                          <li><a class=\"dropdown-item\" href=\"#\"><span class=\"glyphicon glyphicon-user\"></span>&nbsp;&nbsp;&nbsp;&nbsp;PROFILE</a></li>\n");
      out.write("                          <li><a class=\"dropdown-item\" href=\"#\"><span class=\"glyphicon glyphicon-king\"></span>&nbsp;&nbsp;&nbsp;&nbsp;MY PROPERTIES</a></li>\n");
      out.write("                          <li><a class=\"dropdown-item\" href=\"Logout_controller\"><span class=\"glyphicon glyphicon-log-out\"></span>&nbsp;&nbsp;&nbsp;&nbsp;LOGOUT</a></li>\n");
      out.write("                    </ul>\n");
      out.write("                          ");

                      }
                  }
                  else{
                      
      out.write("\n");
      out.write("                      <li><a href=\"signup.jsp\"><span class=\"glyphicon glyphicon-user\"></span>&nbsp;SIGN UP</a></li>\n");
      out.write("                      <li><a href=\"signin.jsp\"><span class=\"glyphicon glyphicon-log-in\"></span>&nbsp;LOGIN</a></li>\n");
      out.write("                 ");

                      }
                
      out.write("\n");
      out.write("        \n");
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
      out.write("                    \n");
      out.write("                    <h5 style=\"color: green\">\n");
      out.write("                        ");

                            if(request.getParameter("status")!=null && request.getParameter("status").equals("success")){
                                out.print("Your Property has been Inserted..".toUpperCase());
                            }
                            else if(request.getParameter("status")!=null && request.getParameter("status").equals("failed")){
                                out.print("Unsuccessfully Insertion..".toUpperCase());
                            }
                        
      out.write("\n");
      out.write("                    </h5>\n");
      out.write("                    <br>\n");
      out.write("                    <form method=\"POST\" action=\"property_insert_controller\" enctype=\"multipart/form-data\">\n");
      out.write("                        <div class=\"row\">\n");
      out.write("                            <div class=\"col-sm-6\">\n");
      out.write("                                <label for=\"userid\">ID:</label>\n");
      out.write("                                    ");
 
                                         if(session.getAttribute("Signup") !=null){
                                          Signup sb=(Signup) session.getAttribute("Signup");
                                            
                                        
      out.write("\n");
      out.write("                                        <input type=\"text\" value=\"");
      out.print( sb.getId() );
      out.write("\" name=\"userid\" id=\"userid\" class=\"form-control\">\n");
      out.write("                                        \n");
      out.write("                                        \n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"col-sm-6\">\n");
      out.write("                                <label for=\"username\">Name:</label>\n");
      out.write("                                <input type=\"text\" value=\"");
      out.print( sb.getName() );
      out.write("\" name=\"username\" id=\"username\" class=\"form-control\">\n");
      out.write("                                       ");
 
                                                } 
      out.write("\n");
      out.write("                            </div>\n");
      out.write("                            \n");
      out.write("                        </div>\n");
      out.write("                        <br>\n");
      out.write("                            <div class=\"row\">\n");
      out.write("                            <div class=\"col-sm-6\">\n");
      out.write("                                <label>Property Name</label>\n");
      out.write("                                <input type=\"text\" name=\"pname\" class=\"form-control\" placeholder=\"Enter Property name...\">\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"col-sm-6\">\n");
      out.write("                                <label>Price</label>\n");
      out.write("                                <input type=\"text\" name=\"price\" class=\"form-control\" placeholder=\"Enter Price...\">\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                            \n");
      out.write("                        <br><br>\n");
      out.write("                        \n");
      out.write("                        <div class=\"row\">\n");
      out.write("                            <div class=\"col-sm-3\">\n");
      out.write("                                <label for=\"ptype\">Type</label><br>\n");
      out.write("                                <select name=\"ptype\" id=\"ptype\" class=\"ptype\">\n");
      out.write("                                    <option value=\" \">--: Select :--</option>\n");
      out.write("                                    <option value=\"Apartment\">Apartment</option>\n");
      out.write("                                    <option value=\"Independent House/Villa\">Independent House/Villa</option>\n");
      out.write("                                    <option value=\"Independent/Builder Floor\">Independent/Builder Floor</option>\n");
      out.write("                                    <option value=\"Land\">Land</option>\n");
      out.write("                                    <option value=\"Farmhouse\">Farmhouse</option>\n");
      out.write("                                </select>\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"col-sm-2\">\n");
      out.write("                                <label for=\"srproperty\">Choose</label><br>\n");
      out.write("                                <select name=\"srproperty\" id=\"srproperty\" class=\"srproperty\">\n");
      out.write("                                    <option value=\" \">--: Select :--</option>\n");
      out.write("                                    <option value=\"Sell\">Sale</option>\n");
      out.write("                                    <option value=\"Rent\">Rent</option>\n");
      out.write("                                </select>\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"col-sm-2\">\n");
      out.write("                                <label for=\"psubtype\">Sub-type</label><br>\n");
      out.write("                                <select name=\"psubtype\" id=\"psubtypetype\" class=\"psubtype\">\n");
      out.write("                                    <option value=\" \">--: Select :--</option>\n");
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
      out.write("                            <div class=\"col-sm-2\">\n");
      out.write("                                <label for=\"cityname\">City name</label><br>\n");
      out.write("                                <select name=\"cityname\" id=\"cityname\" class=\"cityname\">\n");
      out.write("                                    <option value=\" \">--: Select :--</option>\n");
      out.write("                                    <option value=\"Mumbai\">Mumbai</option>\n");
      out.write("                                    <option value=\"Pune\">Pune</option>\n");
      out.write("                                    <option value=\"Nagpur\">Nagpur</option>\n");
      out.write("                                    <option value=\"Nashik\">Nashik</option>\n");
      out.write("                                    <option value=\"Thane\">Thane</option>\n");
      out.write("                                </select>\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"col-sm-3\">\n");
      out.write("                                <label>Contact</label>\n");
      out.write("                                <input class=\"form-control\" type=\"text\" name=\"contact\" placeholder=\"Enter Contact number...\">\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                        \n");
      out.write("                        <br><br>\n");
      out.write("                        <div class=\"row\">\n");
      out.write("                            <div class=\"col-sm-3\">\n");
      out.write("                                <input class=\"form-control\" type=\"text\" name=\"area\">\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"col-sm-2\">\n");
      out.write("                                <select name=\"areasq\" id=\"areasq\" class=\"areasq\">\n");
      out.write("                                    <option value=\" \">--: Select :--</option>\n");
      out.write("                                    <option value=\"Square Feet\">Square Feet</option>\n");
      out.write("                                    <option value=\"Square Meter\">Square Meter</option>\n");
      out.write("                                    <option value=\"3\">Square Yard</option>\n");
      out.write("                                    <option value=\"4\">Acre</option>\n");
      out.write("                                    <option value=\"\">Hectare</option>\n");
      out.write("                                    <option value=\"\">Gaj</option>\n");
      out.write("                                    <option value=\"\">Kanal</option>\n");
      out.write("                                    <option value=\"\">Bigha</option>\n");
      out.write("                                    <option value=\"\">Biswa</option>\n");
      out.write("                                    <option value=\"\">Killa</option>\n");
      out.write("                                    <option value=\"\">Lessa</option>\n");
      out.write("                                    <option value=\"\">Dhur</option>\n");
      out.write("                                    <option value=\"\">Pura</option>\n");
      out.write("                                    <option value=\"\">Chatak</option>\n");
      out.write("                                    <option value=\"\">Marla</option>\n");
      out.write("                                    <option value=\"\">Katha</option>\n");
      out.write("                                    <option value=\"\">Ground</option>\n");
      out.write("                                    <option value=\"\">Cent</option>\n");
      out.write("                                    <option value=\"\">Murabba</option>\n");
      out.write("                                    <option value=\"\">Guntha</option>\n");
      out.write("                                    <option value=\"\">Karam</option>\n");
      out.write("                                    \n");
      out.write("                                </select>\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"col-sm-3\">\n");
      out.write("                                <label>Pin code</label>\n");
      out.write("                                <input type=\"text\" name=\"pincode\" class=\"form-control\" placeholder=\"Enter Pin code...\">\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"col-sm-2\">\n");
      out.write("                                <label for=\"bedroom\">Bedrooms</label><br>\n");
      out.write("                                <select name=\"bedroom\" id=\"bedroom\" class=\"bedroom\">\n");
      out.write("                                    <option value=\" \">--: Select :--</option>\n");
      out.write("                                    <option value=\"1\">1</option>\n");
      out.write("                                    <option value=\"2\">2</option>\n");
      out.write("                                    <option value=\"3\">3</option>\n");
      out.write("                                    <option value=\"4\">4</option>\n");
      out.write("                                    <option value=\"5\">5</option>\n");
      out.write("                                </select>\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"col-sm-2\">\n");
      out.write("                                <label for=\"bathroom\">Bathrooms</label><br>\n");
      out.write("                                <select name=\"bathroom\" id=\"bathroom\" class=\"bathroom\">\n");
      out.write("                                    <option value=\" \">--: Select :--</option>\n");
      out.write("                                    <option value=\"1\">1</option>\n");
      out.write("                                    <option value=\"2\">2</option>\n");
      out.write("                                    <option value=\"3\">3</option>\n");
      out.write("                                    <option value=\"4\">4</option>\n");
      out.write("                                    <option value=\"5\">5</option>\n");
      out.write("                                </select>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                        <br><br>\n");
      out.write("                        <div class=\"row\">\n");
      out.write("                            <div class=\"col-sm-3\">\n");
      out.write("                                <label for=\"img\">Select images</label>\n");
      out.write("                                <input class=\"upload-box\" type=\"file\" id=\"img\" name=\"img\" multiple=\"\">\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"col-sm-9\">\n");
      out.write("                                <br>\n");
      out.write("                                <textarea name=\"details\" class=\"form-control\" placeholder=\"Details...\"></textarea>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                            \n");
      out.write("                        <br><br>\n");
      out.write("                        \n");
      out.write("                        <div class=\"row\">\n");
      out.write("                            <div class=\"col-sm-12\">\n");
      out.write("                                <button style=\"margin-left: 40%; width: 200px; \" class=\"btn btn-success\">Upload</button>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                    </form>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
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
