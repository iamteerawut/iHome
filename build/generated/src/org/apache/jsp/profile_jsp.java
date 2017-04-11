package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class profile_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      response.setContentType("text/html; charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write('\r');
      out.write('\n');
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "templates/header.jsp", out, false);
      out.write("\r\n");
      out.write("        <div class=\"container mt-5\">\r\n");
      out.write("            <div class=\"row justify-content-center\">\r\n");
      out.write("                <div class=\"col-sm-8\">\r\n");
      out.write("                    <div class=\"card\">\r\n");
      out.write("                        <h3 class=\"card-header\">Edit Homestay</h3>\r\n");
      out.write("                        <div class=\"card-block\">\r\n");
      out.write("                            <div class=\"row\">\r\n");
      out.write("                                <div class=\"col-sm-5\">\r\n");
      out.write("                                    <img src=\"data:image/svg+xml;charset=UTF-8,%3Csvg%20width%3D%22200%22%20height%3D%22200%22%20xmlns%3D%22http%3A%2F%2Fwww.w3.org%2F2000%2Fsvg%22%20viewBox%3D%220%200%20200%20200%22%20preserveAspectRatio%3D%22none%22%3E%3Cdefs%3E%3Cstyle%20type%3D%22text%2Fcss%22%3E%23holder_15b150638a9%20text%20%7B%20fill%3Argba(255%2C255%2C255%2C.75)%3Bfont-weight%3Anormal%3Bfont-family%3AHelvetica%2C%20monospace%3Bfont-size%3A10pt%20%7D%20%3C%2Fstyle%3E%3C%2Fdefs%3E%3Cg%20id%3D%22holder_15b150638a9%22%3E%3Crect%20width%3D%22200%22%20height%3D%22200%22%20fill%3D%22%23777%22%3E%3C%2Frect%3E%3Cg%3E%3Ctext%20x%3D%2275.5%22%20y%3D%22104.5%22%3E200x200%3C%2Ftext%3E%3C%2Fg%3E%3C%2Fg%3E%3C%2Fsvg%3E\" alt=\"...\" class=\"rounded img-thumbnail mx-auto d-block\">\r\n");
      out.write("                                    <br>\r\n");
      out.write("                                    <label class=\"custom-file mx-auto d-block\">\r\n");
      out.write("                                        <input type=\"file\" id=\"file\" class=\"custom-file-input form-control-sm\">\r\n");
      out.write("                                        <span class=\"custom-file-control\"></span>\r\n");
      out.write("                                    </label>\r\n");
      out.write("                                    <br>\r\n");
      out.write("                                </div>\r\n");
      out.write("                                <div class=\"col\">\r\n");
      out.write("                                    <table class=\"table\">\r\n");
      out.write("                                        <tbody>\r\n");
      out.write("                                            <tr>\r\n");
      out.write("                                                <td class=\"align-middle\">Name:</td>\r\n");
      out.write("                                                <td>\r\n");
      out.write("                                                    <input type=\"text\" class=\"form-control mb-2 mr-sm-2 mb-sm-0\" id=\"inlineFormInput\" placeholder=\"\" value=\"Example 1\">\r\n");
      out.write("                                                </td>\r\n");
      out.write("                                            </tr>\r\n");
      out.write("                                            <tr>\r\n");
      out.write("                                                <td class=\"align-middle\">Province:</td>\r\n");
      out.write("                                                <td>\r\n");
      out.write("                                                    <input type=\"text\" class=\"form-control mb-2 mr-sm-2 mb-sm-0\" id=\"inlineFormInput\" placeholder=\"\" value=\"Bangkok\">\r\n");
      out.write("                                                </td>\r\n");
      out.write("                                            </tr>\r\n");
      out.write("                                            <tr>\r\n");
      out.write("                                                <td class=\"align-middle\">Amount of Guest</td>\r\n");
      out.write("                                                <td>\r\n");
      out.write("                                                    <input type=\"text\" class=\"form-control mb-2 mr-sm-2 mb-sm-0\" id=\"inlineFormInput\" placeholder=\"\" value=\"10\">\r\n");
      out.write("                                                </td>\r\n");
      out.write("                                            </tr>\r\n");
      out.write("                                            <tr>\r\n");
      out.write("                                                <td class=\"align-middle\">Latitude</td>\r\n");
      out.write("                                                <td>\r\n");
      out.write("                                                    <input type=\"text\" class=\"form-control mb-2 mr-sm-2 mb-sm-0\" id=\"inlineFormInput\" placeholder=\"\" value=\"10.22132145\">\r\n");
      out.write("                                                </td>\r\n");
      out.write("                                            </tr>\r\n");
      out.write("                                            <tr>\r\n");
      out.write("                                                <td class=\"align-middle\">Longtitude</td>\r\n");
      out.write("                                                <td><input type=\"text\" class=\"form-control mb-2 mr-sm-2 mb-sm-0\" id=\"inlineFormInput\" placeholder=\"\" value=\"102.1754\"></td>\r\n");
      out.write("                                            </tr>\r\n");
      out.write("                                            <tr>\r\n");
      out.write("                                                <td class=\"align-middle\">Email</td>\r\n");
      out.write("                                                <td><input type=\"text\" class=\"form-control mb-2 mr-sm-2 mb-sm-0\" id=\"inlineFormInput\" placeholder=\"Email address\" value=\"example@example.com\"></td>\r\n");
      out.write("                                            </tr>\r\n");
      out.write("                                            <tr>\r\n");
      out.write("                                                <td class=\"align-middle\">Phone Number</td>\r\n");
      out.write("                                                <td>\r\n");
      out.write("                                                    <input type=\"text\" class=\"form-control mb-2 mr-sm-2 mb-sm-0\" id=\"inlineFormInput\" placeholder=\"Phone number\" value=\"0892344567\">\r\n");
      out.write("                                                </td>\r\n");
      out.write("                                            </tr>\r\n");
      out.write("                                        </tbody>\r\n");
      out.write("                                    </table>\r\n");
      out.write("                                    <div class=\"row\">\r\n");
      out.write("                                        <div class=\"col\">\r\n");
      out.write("                                            <a href=\"#\" class=\"btn btn-primary\">Update Homestay</a>\r\n");
      out.write("                                            <a href=\"#\" class=\"btn btn-secondary\">Cancel</a>\r\n");
      out.write("                                        </div>\r\n");
      out.write("                                    </div>\r\n");
      out.write("                                </div>\r\n");
      out.write("                            </div>\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "templates/footer.jsp", out, false);
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