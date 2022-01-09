package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import bags.Signup;

public final class signin_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList<String>(3);
    _jspx_dependants.add("/common/cdn.jsp");
    _jspx_dependants.add("/common/header.jsp");
    _jspx_dependants.add("/common/footer.jsp");
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
      out.write("        <title>Sign in</title>\n");
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
      out.write("        <span class=\"icon-bar\">d</span>\n");
      out.write("        <span class=\"icon-bar\">h</span>\n");
      out.write("        <span class=\"icon-bar\">a</span>                        \n");
      out.write("      </button>\n");
      out.write("        <a class=\"navbar-brand\" href=\"index.jsp\"><header><b style=\"color: orange\">O</b>RES</header></a>\n");
      out.write("    </div>\n");
      out.write("    <div class=\"collapse navbar-collapse\" id=\"myNavbar\">\n");
      out.write("      <ul class=\"nav navbar-nav\">\n");
      out.write("        <li class=\"active\"><a href=\"C:\\Users\\HP\\OneDrive\\Documents\\NetBeansProjects\\Project\\web\\index.jsp\">HOME</a></li>\n");
      out.write("        <li class=\"dropdown\">\n");
      out.write("          <a class=\"dropdown-toggle\" data-toggle=\"dropdown\" href=\"#\">PROPERTIES<span class=\"caret\"></span></a>\n");
      out.write("          <ul class=\"dropdown-menu\">\n");
      out.write("            <li><a href=\"#\">Sell</a></li>\n");
      out.write("            <li><a href=\"#\">Buy</a></li>\n");
      out.write("            <li><a href=\"#\">Rent</a></li>\n");
      out.write("          </ul>\n");
      out.write("        </li>\n");
      out.write("        <li><a href=\"postproperty.jsp\">POST YOUR PROPERTY</a></li>\n");
      out.write("       \n");
      out.write("        <li class=\"dropdown\">\n");
      out.write("            ");

                if(session.getAttribute("Signup") !=null){
                      Signup sb=(Signup) session.getAttribute("Signup");
                
      out.write("\n");
      out.write("                <a class=\"dropdown-toggle\" data-toggle=\"dropdown\" href=\"#\"><span class=\"glyphicon glyphicon-user\"></span>&nbsp;&nbsp;\n");
      out.write("                    ");
      out.print( sb.getName());
      out.write("\n");
      out.write("                    <span class=\"caret\"></span>\n");
      out.write("                </a>\n");
      out.write("                    <ul class=\"dropdown-menu\">\n");
      out.write("            ");
 
                      if(sb.getRole().equals("admin")){
                          
      out.write("\n");
      out.write("                          <li><a class=\"dropdown-item\" href=\"#\">Profile</a></li>\n");
      out.write("                          <li><a class=\"dropdown-item\" href=\"admin/dashboard.jsp\">Dashboard</a></li>\n");
      out.write("                          <li><a class=\"dropdown-item\" href=\"Logout_controller\">Logout</a></li>\n");
      out.write("                              \n");
      out.write("                          ");

                      }
                      else if(sb.getRole().equals("user")){
                          
      out.write("\n");
      out.write("                          <li><a class=\"dropdown-item\" href=\"#\">Profile</a></li>\n");
      out.write("                          <li><a class=\"dropdown-item\" href=\"#\">My Properties</a></li>\n");
      out.write("                          <li><a class=\"dropdown-item\" href=\"Logout_controller\">Logout</a></li>\n");
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
      out.write("        \n");
      out.write("      </ul>\n");
      out.write("    </div>\n");
      out.write("  </div>\n");
      out.write("</nav>\n");
      out.write("  \n");
      out.write("\n");
      out.write("        \n");
      out.write("        <div class=\"container signup\">\n");
      out.write("            <h1>SIGN IN</h1>\n");
      out.write("            ");

                if(request.getParameter("info")!=null){
                    out.print("<h4><b style='color: red'>Email</b> is invalid</h4>");
                }
            
      out.write("\n");
      out.write("            <form method=\"post\" action=\"Signin\">\n");
      out.write("                <div class=\"row\">\n");
      out.write("                    <div class=\"col-sm-6\">\n");
      out.write("                        <label>Email</label>\n");
      out.write("                        <input class=\"form-control\" type=\"email\" name=\"email\">\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"col-sm-6\">\n");
      out.write("                        <label>Password</label>\n");
      out.write("                        <input class=\"form-control\" type=\"password\" name=\"password\">\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"row\">\n");
      out.write("                    <div class=\"col-sm-12\">\n");
      out.write("                        <button type=\"submit\" class=\"btn btn-success\">Login</button>\n");
      out.write("                        <b>Click on Sign up if not registered?</b>\n");
      out.write("                        <a href=\"signup.jsp\">Sign up</a>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </form>\n");
      out.write("        </div>\n");
      out.write("        \n");
      out.write("        ");
      out.write("<div class=\"container-fluid\" id=\"footer\">\r\n");
      out.write("    <div class=\"row\">\r\n");
      out.write("        <div>\r\n");
      out.write("            <h3><span class=\"copyright\">Copyright &copy; ORES2021</span></h3>\r\n");
      out.write("          </div>\r\n");
      out.write("          <div>\r\n");
      out.write("              <img src=\"C:\\Users\\HP\\Downloads\\facebook.png\" width=\"40\" height=\"40\">\r\n");
      out.write("              <img src=\"C:\\Users\\HP\\Downloads\\twitter.png\" width=\"40\" height=\"40\">\r\n");
      out.write("              <img src=\"C:\\Users\\HP\\Downloads\\linkedin.png\" width=\"40\" height=\"40\">\r\n");
      out.write("          </div>\r\n");
      out.write("    </div>\r\n");
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
