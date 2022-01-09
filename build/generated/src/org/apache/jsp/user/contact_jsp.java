package org.apache.jsp.user;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.ListIterator;
import java.util.List;
import DAO.SignupDAO;
import common.MyConnection;
import bags.Signup;

public final class contact_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList<String>(3);
    _jspx_dependants.add("/user/../common/cdn.jsp");
    _jspx_dependants.add("/user/common/header.jsp");
    _jspx_dependants.add("/user/common/footer.jsp");
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
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>Contact</title>\n");
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
      out.write("        \n");
      out.write("        <div class=\"container signup\">\n");
      out.write("            <h1 style=\"text-align: center\">Contact</h1>\n");
      out.write("            <h3>Enter details</h3>\n");
      out.write("            <form>\n");
      out.write("                <div class=\"row\">\n");
      out.write("                    <div class=\"col-sm-4\">\n");
      out.write("                        <label>Name</label>\n");
      out.write("                        <input class=\"form-control\" type=\"text\" name=\"name\" placeholder=\"Enter name\">\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"col-sm-4\">\n");
      out.write("                        <label>Contact</label>\n");
      out.write("                        <input class=\"form-control\" type=\"text\" name=\"contact\" placeholder=\"Enter phone number\">\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"col-sm-4\">\n");
      out.write("                        <label>Email</label>\n");
      out.write("                        <input class=\"form-control\" type=\"email\" name=\"email\" placeholder=\"Enter Registered Email\">\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("                <br><br>\n");
      out.write("                <div class=\"row\">\n");
      out.write("                    <div class=\"col-sm-3\">\n");
      out.write("                        <label>Reason of Contact</label><br>\n");
      out.write("                        <select name=\"intention\" id=\"intention\" class=\"intention\">\n");
      out.write("                            <option value=\"Complain\">Complain</option>\n");
      out.write("                            <option value=\"Suggestion\">Suggestion</option>\n");
      out.write("                            <option value=\"Feedback\">Feedback</option>\n");
      out.write("                            <option value=\"Enquiry\">Enquiry</option>\n");
      out.write("                            <option value=\"Others\">Others</option>\n");
      out.write("                        </select>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"col-sm-9\">\n");
      out.write("                        <label>Comment</label>\n");
      out.write("                        <input class=\"form-control\" type=\"text\" name=\"comment\" placeholder=\"Enter Comment\">\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("                <br><br>\n");
      out.write("                <div class=\"row\">\n");
      out.write("                    <div class=\"col-sm-12\">\n");
      out.write("                        <a href=\"thankyou.jsp\"><input type=\"button\" value=\"SUBMIT\" class=\"contactbtn\"></a>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </form>\n");
      out.write("        </div>\n");
      out.write("        \n");
      out.write("        ");
      out.write("<div class=\"container-fluid\" id=\"footer\">\n");
      out.write("    <div class=\"row\">\n");
      out.write("        <div>\n");
      out.write("            <h3><span class=\"copyright\">Copyright &copy; ORES2021</span></h3>\n");
      out.write("          </div>\n");
      out.write("          <div>\n");
      out.write("              <img src=\"C:\\Users\\HP\\Downloads\\facebook.png\" width=\"40\" height=\"40\">\n");
      out.write("              <img src=\"C:\\Users\\HP\\Downloads\\twitter.png\" width=\"40\" height=\"40\">\n");
      out.write("              <img src=\"C:\\Users\\HP\\Downloads\\linkedin.png\" width=\"40\" height=\"40\">\n");
      out.write("          </div>\n");
      out.write("    </div>\n");
      out.write("</div>");
      out.write("\n");
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
