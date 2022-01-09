package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import bags.Signup;
import bags.property_bag;
import java.util.Iterator;
import java.util.List;
import DAO.Property_DAO;
import common.MyConnection;
import bags.Signup;

public final class MyProperties_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList<String>(2);
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
      out.write("        <title>My Properties</title>\n");
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
      out.write("        <li><a href=\"index.jsp\">HOME</a></li>\n");
      out.write("        <li class=\"dropdown\">\n");
      out.write("          <a class=\"dropdown-toggle\" data-toggle=\"dropdown\" href=\"#\">PROPERTIES<span class=\"caret\"></span></a>\n");
      out.write("          <ul class=\"dropdown-menu\">\n");
      out.write("            <li><a href=\"Aparment.jsp\">Apartment</a></li>\n");
      out.write("            <li><a href=\"Villa.jsp\">Independent House/Villa</a></li>\n");
      out.write("            <li><a href=\"Floor.jsp\">Independent/Builder Floor</a></li>\n");
      out.write("            <li><a href=\"Land.jsp\">Land</a></li>\n");
      out.write("            <li><a href=\"Farmhouse.jsp\">Farmhouse</a></li>\n");
      out.write("          </ul>\n");
      out.write("        </li>\n");
      out.write("        <li class=\"dropdown\">\n");
      out.write("            ");

                if(session.getAttribute("Signup") !=null){
                      Signup sb=(Signup) session.getAttribute("Signup");
                
      out.write("\n");
      out.write("                <a class=\"dropdown-toggle\" data-toggle=\"dropdown\" href=\"#\">\n");
      out.write("                    <span class=\"glyphicon glyphicon-user\"></span>&nbsp;&nbsp;\n");
      out.write("                    <b style=\"text-transform: uppercase; font-weight: normal;\">\n");
      out.write("                        ");
      out.print( sb.getName());
      out.write("</b>\n");
      out.write("                    <span class=\"caret\"></span>\n");
      out.write("                </a>\n");
      out.write("                    <ul class=\"dropdown-menu\">\n");
      out.write("            ");
 
                      if(sb.getRole().equals("admin")){
                          
      out.write("\n");
      out.write("                          <li><a class=\"dropdown-item\" href=\"../profile.jsp\"><span class=\"glyphicon glyphicon-user\"></span>&nbsp;&nbsp;&nbsp;&nbsp;PROFILE</a></li>\n");
      out.write("                          <li><a class=\"dropdown-item\" href=\"../admin/dashboard.jsp\"><span class=\"glyphicon glyphicon-th-list\"></span>&nbsp;&nbsp;&nbsp;&nbsp;DASHBOARD</a></li>\n");
      out.write("                          <li><a class=\"dropdown-item\" href=\"Logout_controller\"><span class=\"glyphicon glyphicon-log-out\"></span>&nbsp;&nbsp;&nbsp;&nbsp;LOGOUT</a></li>\n");
      out.write("                              \n");
      out.write("                          ");

                      }
                      else if(sb.getRole().equals("user")){
                          
      out.write("\n");
      out.write("                          <li><a class=\"dropdown-item\" href=\"postproperty.jsp\"><span class=\"glyphicon glyphicon-upload\" style=\"font-size: 20px;\"></span>&nbsp;&nbsp;&nbsp;&nbsp;POST YOUR PROPERTY</a></li>\n");
      out.write("                          <li><a class=\"dropdown-item\" href=\"profile.jsp\"><span class=\"glyphicon glyphicon-user\" style=\"font-size: 20px;\"></span>&nbsp;&nbsp;&nbsp;&nbsp;PROFILE</a></li>\n");
      out.write("                          <li><a class=\"dropdown-item\" href=\"#\"><span class=\"glyphicon glyphicon-king\" style=\"font-size: 20px;\"></span>&nbsp;&nbsp;&nbsp;&nbsp;MY PROPERTIES</a></li>\n");
      out.write("                          <li><a class=\"dropdown-item\" href=\"Logout_controller\"><span class=\"glyphicon glyphicon-log-out\" style=\"font-size: 20px;\"></span>&nbsp;&nbsp;&nbsp;&nbsp;LOGOUT</a></li>\n");
      out.write("                    </ul>\n");
      out.write("                    <li><a href=\"user/contact.jsp\">CONTACT</a>\n");
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
      out.write("            <section class=\"property-section\">\n");
      out.write("                <h1 style=\"text-align: center\">Latest Properties</h1>\n");
      out.write("                <div class=\"row\">\n");
      out.write("                    ");

                        Property_DAO pd=new Property_DAO(MyConnection.connectTo());
                        if(session.getAttribute("Signup")!=null){
                            Signup sb=(Signup) session.getAttribute("Signup");
                        
                        List lia=pd.getMyProperty(sb);
                        Iterator iter1=lia.iterator();
                        while(iter1.hasNext()){
                            property_bag pb=(property_bag)iter1.next();
                            
                    
      out.write("\n");
      out.write("                    <div class=\"col-sm-3\">\n");
      out.write("                        <div class=\"property_wrapper\">\n");
      out.write("                            <img src=\"C:\\Users\\HP\\OneDrive\\Documents\\NetBeansProjects\\Project\\web\\img\\house.jpg\" class=\"pimg\">\n");
      out.write("                            <div class=\"property_pname\">Property Name: ");
      out.print( pb.getPname() );
      out.write("</div>\n");
      out.write("                            <div class=\"property_price\">Price: ");
      out.print( pb.getPrice() );
      out.write(" Rs</div>\n");
      out.write("                            <div class=\"property_cityname\">City name: ");
      out.print( pb.getCityname() );
      out.write("</div>\n");
      out.write("                            <div class=\"property_srproperty\">To: ");
      out.print( pb.getSrproperty() );
      out.write("</div>\n");
      out.write("                            <div class=\"property_ptype\">Type: ");
      out.print( pb.getPtype() );
      out.write("</div>\n");
      out.write("                            <div class=\"property_psubtype\">Sub-Type: ");
      out.print( pb.getPsubtype() );
      out.write("</div><br>\n");
      out.write("                            <input type=\"button\" class=\"userbutton\" value=\"EDIT\">\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                    ");

                        }}
                    
      out.write("\n");
      out.write("                </div>\n");
      out.write("            </section>\n");
      out.write("        </div>\n");
      out.write("                ");
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
