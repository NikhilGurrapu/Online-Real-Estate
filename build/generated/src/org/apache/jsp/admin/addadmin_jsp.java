package org.apache.jsp.admin;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import bags.Signup;
import java.util.ListIterator;
import java.util.List;
import DAO.SignupDAO;
import common.MyConnection;
import bags.Signup;
import java.util.ListIterator;
import java.util.List;
import DAO.SignupDAO;
import common.MyConnection;

public final class addadmin_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList<String>(3);
    _jspx_dependants.add("/admin/../common/cdn.jsp");
    _jspx_dependants.add("/admin/common/header.jsp");
    _jspx_dependants.add("/admin/common/sidebar.jsp");
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
      out.write("            <li><a href=\"#\">Sell</a></li>\n");
      out.write("            <li><a href=\"#\">Buy</a></li>\n");
      out.write("            <li><a href=\"#\">Rent</a></li>\n");
      out.write("          </ul>\n");
      out.write("        </li>\n");
      out.write("        <li><a href=\"dashboard.jsp\">Dashboard</a></li>\n");
      out.write("      \n");
      out.write("       ");

         List list =new SignupDAO(MyConnection.connectTo()).getAlladmin();
         ListIterator literator=list.listIterator();
         while(literator.hasNext()){
             Signup sb=(Signup)literator.next();
         
      
      out.write("\n");
      out.write("      <li class=\"dropdown\">\n");
      out.write("         <a class=\"dropdown-toggle\" data-toggle=\"dropdown\" href=\"#\">");
      out.print( sb.getEmail() );
      out.write("<span class=\"caret\"></span></a>\n");
      out.write("      <ul class=\"dropdown-menu\">\n");
      out.write("          <li><a href=\"#\">Profile</a></li>\n");
      out.write("          <li><a href=\"dashboard.jsp\">Dashboard</a></li>\n");
      out.write("          <li><a href=\"../mainindex.jsp\">Logout</a></li>\n");
      out.write("          ");

                   }
          
      out.write("\n");
      out.write("      </ul>\n");
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
      out.write("    <a href=\"dashboard.jsp\">Users</a>\n");
      out.write("    <a href=\"SideAllAdmin.jsp\">Admins</a>\n");
      out.write("</div>");
      out.write("\n");
      out.write("                </div>\n");
      out.write("                <div class=\"col-sm-9 main-col\">\n");
      out.write("                    <h3>Add Admin</h3>\n");
      out.write("                    <form method=\"post\" action=\"adminUpdate\">\n");
      out.write("                        <div class=\"row\">\n");
      out.write("                            <div class=\"col-sm-3\">\n");
      out.write("                                <label>Username</label>\n");
      out.write("                                <input class=\"form-control\" type=\"text\" name=\"username\">\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"col-sm-3\">\n");
      out.write("                                <label>Password</label>\n");
      out.write("                                <input class=\"form-control\" type=\"password\" name=\"password\">\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"col-sm-3\">\n");
      out.write("                                <button type=\"submit\" class=\"btn btn-success\">ADD</button>\n");
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