package org.apache.jsp.user;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.Random;
import bags.property_bag;
import java.util.Iterator;
import DAO.Property_DAO;
import java.util.ListIterator;
import java.util.List;
import DAO.SignupDAO;
import common.MyConnection;
import bags.Signup;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("            <li><a href=\"#\">Rent</a></li>\n");
      out.write("          </ul>\n");
      out.write("        </li>\n");
      out.write("        <li><a href=\"contact.jsp\">Contact</a></li>\n");
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
      out.write("            <!---------banner section---------->\n");
      out.write("            <section class=\"banner-section\">\n");
      out.write("            <div class=\"row\">\n");
      out.write("                <div class=\"col-sm-12\">\n");
      out.write("                    <img src=\"C:\\Users\\HP\\OneDrive\\Documents\\NetBeansProjects\\Project\\web\\img\\propertybanner1.jpg\">\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("            </section>\n");
      out.write("            \n");
      out.write("             <!---------banner section---------->\n");
      out.write("            \n");
      out.write("             ");
 
                    Random rn=new Random();
                    int ans=rn.nextInt(10)+1;
             
      out.write("\n");
      out.write("             <!-----------property section------------>\n");
      out.write("             <section class=\"property-section\">\n");
      out.write("                 <h1 style=\"text-align: center\">Latest Properties</h1>\n");
      out.write("            <div class=\"row\">\n");
      out.write("                ");

                    Property_DAO pd=new Property_DAO(MyConnection.connectTo());
                    List lia=pd.getAlldata();
                    Iterator iter1=lia.iterator();
                    while(iter1.hasNext()){
                        property_bag pb=(property_bag)iter1.next();
                        
      out.write("\n");
      out.write("                        <div class=\"col-sm-3\">\n");
      out.write("                            <div class=\"property_wrapper\">\n");
      out.write("                                ");

                                    if(ans==1){
                                        System.err.println("ans: "+ans);
                                    
      out.write("\n");
      out.write("                                    <img src=\"C:\\Users\\HP\\OneDrive\\Documents\\NetBeansProjects\\Project\\web\\img\\house.jpg\" class=\"pimg\">");
 
                                    }
                                    
      out.write("\n");
      out.write("                                <div class=\"property_pname\">Property Name: ");
      out.print( pb.getPname() );
      out.write("</div>\n");
      out.write("                                <div class=\"property_price\">Price: ");
      out.print( pb.getPrice() );
      out.write("</div>\n");
      out.write("                                <div class=\"property_cityname\">City name: ");
      out.print( pb.getCityname() );
      out.write("</div>\n");
      out.write("                                <div class=\"property_srproperty\">To: ");
      out.print( pb.getSrproperty() );
      out.write("</div>\n");
      out.write("                                <div class=\"property_ptype\">Type: ");
      out.print( pb.getPtype() );
      out.write("</div>\n");
      out.write("                                <div class=\"property_psubtype\">Sub-Type: ");
      out.print( pb.getPsubtype() );
      out.write("</div><br>\n");
      out.write("                                <input type=\"button\" class=\"userbutton\" value=\"CHECK OUT\">\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                ");

                    }
                    
      out.write("\n");
      out.write("            </div>\n");
      out.write("             </section>\n");
      out.write("            <!---------property section----------->\n");
      out.write("            \n");
      out.write("            <!---------banner section---------->\n");
      out.write("            <section class=\"banner-section\">\n");
      out.write("            <div class=\"row\">\n");
      out.write("                <div class=\"col-sm-12\">\n");
      out.write("                    <img src=\"C:\\Users\\HP\\OneDrive\\Documents\\NetBeansProjects\\Project\\web\\img\\propertybanner21.jpg\">\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("            </section>\n");
      out.write("            \n");
      out.write("             <!---------banner section---------->\n");
      out.write("             \n");
      out.write("             <!-----------property section------------>\n");
      out.write("             <section class=\"property-section\">\n");
      out.write("                 <h1 style=\"text-align: center\">Properties for Rent</h1>\n");
      out.write("            <div class=\"row\">\n");
      out.write("                ");

                    
                    List lrent=pd.getAlldataRent();
                    Iterator irent=lrent.iterator();
                    while(irent.hasNext()){
                        property_bag pb=(property_bag) irent.next();
                        
      out.write("\n");
      out.write("                        <div class=\"col-sm-3\">\n");
      out.write("                            <div class=\"property_wrapper\">\n");
      out.write("                                <img src=\"C:\\Users\\HP\\OneDrive\\Documents\\NetBeansProjects\\Project\\web\\img\\house.jpg\" class=\"pimg\">\n");
      out.write("                                <div class=\"property_pname\">Property Name: ");
      out.print( pb.getPname() );
      out.write("</div>\n");
      out.write("                                <div class=\"property_price\">Price: ");
      out.print( pb.getPrice() );
      out.write("</div>\n");
      out.write("                                <div class=\"property_cityname\">City name: ");
      out.print( pb.getCityname() );
      out.write("</div>\n");
      out.write("                                <div class=\"property_srproperty\">To: ");
      out.print( pb.getSrproperty() );
      out.write("</div>\n");
      out.write("                                <div class=\"property_ptype\">Type: ");
      out.print( pb.getPtype() );
      out.write("</div>\n");
      out.write("                                <div class=\"property_psubtype\">Sub-Type: ");
      out.print( pb.getPsubtype() );
      out.write("</div><br>\n");
      out.write("                                <input type=\"button\" class=\"userbutton\" value=\"CHECK OUT\">\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                ");

                    }
                    
      out.write("\n");
      out.write("            </div>\n");
      out.write("             </section>\n");
      out.write("            <!---------property section----------->\n");
      out.write("            \n");
      out.write("            <!---------banner section---------->\n");
      out.write("            <section class=\"banner-section\">\n");
      out.write("            <div class=\"row\">\n");
      out.write("                <div class=\"col-sm-12\">\n");
      out.write("                    <img src=\"C:\\Users\\HP\\OneDrive\\Documents\\NetBeansProjects\\Project\\web\\img\\villa2.jpg\">\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("            </section>\n");
      out.write("            \n");
      out.write("             <!---------banner section---------->\n");
      out.write("             \n");
      out.write("        </div>\n");
      out.write("        ");
      out.write("<div class=\"container-fluid\" id=\"footer\">\n");
      out.write("    <div class=\"row\">\n");
      out.write("        <div class=\"col-sm-4\">About</div>\n");
      out.write("        <div class=\"col-sm-4\">Contact</div>\n");
      out.write("        <div class=\"col-sm-4\">ETC</div>\n");
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
