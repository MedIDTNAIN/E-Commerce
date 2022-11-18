package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class registration_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      response.setContentType("text/html");
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
      out.write("<!DOCTYPE html>\n");
      out.write("<html lang=\"en\">\n");
      out.write("    <head>\n");
      out.write("        <meta charset=\"UTF-8\">\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n");
      out.write("        <meta http-equiv=\"X-UA-Compatible\" content=\"ie=edge\">\n");
      out.write("        <title>Sign Up Form by Colorlib</title>\n");
      out.write("\n");
      out.write("        <!-- Font Icon -->\n");
      out.write("        <link rel=\"stylesheet\" href=\"fonts/material-icon/css/material-design-iconic-font.min.css\">\n");
      out.write("\n");
      out.write("        <!-- Main css -->\n");
      out.write("        <link rel=\"stylesheet\" href=\"css/style.css\">\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("\n");
      out.write("        <div class=\"main\">\n");
      out.write("\n");
      out.write("            <!-- Sign up form -->\n");
      out.write("            <section class=\"signup\">\n");
      out.write("                <div class=\"container\">\n");
      out.write("                    <div class=\"signup-content\">\n");
      out.write("                        <div class=\"signup-form\">\n");
      out.write("                            <h2 class=\"form-title\">Sign up</h2>\n");
      out.write("\n");
      out.write("                            <form method=\"post\" action=\"RegistServlet\" class=\"register-form\"\n");
      out.write("                                  id=\"register-form\">\n");
      out.write("                                <div class=\"form-group\">\n");
      out.write("                                    <label for=\"name\"><i class=\"zmdi zmdi-account material-icons-name\"></i></label> <input type=\"text\" name=\"fname\" id=\"fname\" placeholder=\"First Name\" required=\"\"/>\n");
      out.write("                                </div>\n");
      out.write("                                          <div class=\"form-group\">\n");
      out.write("                                    <label for=\"name\">\n");
      out.write("                                        <i class=\"zmdi zmdi-account material-icons-name\"></i></label> <input type=\"text\" name=\"lname\" id=\"lname\" placeholder=\"Last Name\" required=\"\"/>\n");
      out.write("                                </div>\n");
      out.write("                                <div class=\"form-group\">\n");
      out.write("                                    <label for=\"email\"><i class=\"zmdi zmdi-email\"></i></label> <input type=\"email\" name=\"email\" id=\"email\" placeholder=\"Your Email\" required=\"\"/>\n");
      out.write("                                </div>\n");
      out.write("                                <div class=\"form-group\">\n");
      out.write("                                    <label for=\"pass\"><i class=\"zmdi zmdi-lock\"></i></label> <input type=\"password\" name=\"pass\" id=\"pass\" placeholder=\"Password\" required=\"\"/>\n");
      out.write("                                </div>\n");
      out.write("                                 <div class=\"form-group\">\n");
      out.write("                                    <label for=\"contact\"><i class=\"zmdi zmdi-phone \"></i></label><input type=\"text\" name=\"tele\" id=\"contact\" placeholder=\"Telephone\" required=\"\"/>\n");
      out.write("                                </div>\n");
      out.write("                                <div class=\"form-group\">\n");
      out.write("                                    <label for=\"adresse\"><i class=\"zmdi zmdi-lock-outline\"></i></label><input type=\"text\" name=\"adresse\" id=\"adresse\" placeholder=\"Adresse\" required=\"\"/>\n");
      out.write("                                </div>\n");
      out.write("                                 <div class=\"form-group\">\n");
      out.write("                                   <input type=\"checkbox\" name=\"agree-term\" id=\"agree-term\" class=\"agree-term\" /> <label for=\"agree-term\" class=\"label-agree-term\"><span><span></span></span>I\n");
      out.write("                                        agree all statements in <a href=\"#\" class=\"term-service\">Terms of service</a></label>\n");
      out.write("                                </div>\n");
      out.write("                                <div class=\"form-group form-button\">\n");
      out.write("                                    <input type=\"submit\" name=\"signup\" id=\"signup\"\n");
      out.write("                                           class=\"form-submit\" value=\"Register\" />\n");
      out.write("                                </div>\n");
      out.write("                            </form>\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"signup-image\">\n");
      out.write("                            <figure>\n");
      out.write("                                <img src=\"images/signup-image.jpg\" alt=\"sing up image\">\n");
      out.write("                            </figure>\n");
      out.write("                            <a href=\"login.jsp\" class=\"signup-image-link\">I am already member</a>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </section>\n");
      out.write("\n");
      out.write("\n");
      out.write("        </div>\n");
      out.write("        <!-- JS -->\n");
      out.write("        <script src=\"vendor/jquery/jquery.min.js\"></script>\n");
      out.write("        <script src=\"js/main.js\"></script>\n");
      out.write("\n");
      out.write("\n");
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
