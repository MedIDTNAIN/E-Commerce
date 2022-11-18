package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class login_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\n");
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
      out.write("        <div class=\"main\" >\n");
      out.write("\n");
      out.write("            <!-- Sing in  Form -->\n");
      out.write("            <section class=\"sign-in\" >\n");
      out.write("                <div class=\"container\">\n");
      out.write("                    <div class=\"signin-content\">\n");
      out.write("                        <div class=\"signin-image\">\n");
      out.write("                            <figure>\n");
      out.write("                                <img src=\"images/signin-image.jpg\" alt=\"sing up image\">\n");
      out.write("                            </figure>\n");
      out.write("                            <a href=\"registration.jsp\" class=\"signup-image-link\">Create an account</a>\n");
      out.write("                        </div>\n");
      out.write("\n");
      out.write("                        <div class=\"signin-form\">\n");
      out.write("                            <h2 class=\"form-title\">Sign in</h2>\n");
      out.write("                            <form method=\"post\" action=\"LoginServlet\"  class=\"register-form\" id=\"login-form\">\n");
      out.write("                                <div class=\"form-group\">\n");
      out.write("                                    <label for=\"email\"><i class=\"zmdi zmdi-account material-icons-name\"></i></label> <input type=\"text\" name=\"email\" id=\"username\"\n");
      out.write("                                        placeholder=\"Your Email\" />\n");
      out.write("                                </div>\n");
      out.write("                                <div class=\"form-group\">\n");
      out.write("                                    <label for=\"password\"><i class=\"zmdi zmdi-lock\"></i></label> <input\n");
      out.write("                                        type=\"password\" name=\"password\" id=\"password\"\n");
      out.write("                                        placeholder=\"Password\" />\n");
      out.write("                                </div>\n");
      out.write("                                <div class=\"form-group\">\n");
      out.write("                                    <input type=\"checkbox\" name=\"remember-me\" id=\"remember-me\"\n");
      out.write("                                           class=\"agree-term\" /> <label for=\"remember-me\"\n");
      out.write("                                           class=\"label-agree-term\"><span><span></span></span>Remember me</label>\n");
      out.write("                                </div>\n");
      out.write("                                <div class=\"form-group form-button\"><input type=\"submit\" name=\"signin\" id=\"signin\" class=\"form-submit\" value=\"Log in\" />\n");
      out.write("                                </div>\n");
      out.write("                            </form>\n");
      out.write("                            <div class=\"social-login\">\n");
      out.write("                                <span class=\"social-label\">Or login with</span>\n");
      out.write("                                <ul class=\"socials\">\n");
      out.write("                                    <li><a href=\"#\"><i\n");
      out.write("                                                class=\"display-flex-center zmdi zmdi-facebook\"></i></a></li>\n");
      out.write("                                    <li><a href=\"#\"><i\n");
      out.write("                                                class=\"display-flex-center zmdi zmdi-twitter\"></i></a></li>\n");
      out.write("                                    <li><a href=\"#\"><i\n");
      out.write("                                                class=\"display-flex-center zmdi zmdi-google\"></i></a></li>\n");
      out.write("                                </ul>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </section>\n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("        <!-- JS -->\n");
      out.write("        <script src=\"vendor/jquery/jquery.min.js\"></script>\n");
      out.write("        <script src=\"js/main.js\"></script>\n");
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
