package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class profile_005fhost_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write('\n');
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "templates/header.jsp", out, false);
      out.write("\n");
      out.write("        <div class=\"container\">\n");
      out.write("            <div class=\"row justify-content-center mt-5\">\n");
      out.write("                <div class=\"col-sm-4\" id=\"profile\">\n");
      out.write("                    <div class=\"card\">\n");
      out.write("                        <h3 class=\"card-header\">My Profile</h3>\n");
      out.write("                        <div class=\"card-block\">\n");
      out.write("                            <p>Username : iamteerawut</p>\n");
      out.write("                            <p>Name : Teerawut Kitbunjerdjarud</p>\n");
      out.write("                            <p>Email : t.kitbunjerdjarud@gmail.com</p>\n");
      out.write("                            <p>Phone Number : 094-546-4678</p>\n");
      out.write("                            <button type=\"submit\" class=\"btn btn-primary btn-block\">Edit Profile</button>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"col-sm-8\" id=\"profile\">\n");
      out.write("                    <div class=\"card\">\n");
      out.write("                        <h3 class=\"card-header\">My Homestay</h3>\n");
      out.write("                        <div class=\"card-block\">\n");
      out.write("                            <p>Homestay Name : Example A</p>\n");
      out.write("                            <p>Price : 200 Bath / Night / Person</p>\n");
      out.write("                            <p>Guest : 5 Person</p>\n");
      out.write("                            <div id=\"map\" style=\"height:200px\"></div>\n");
      out.write("                            <script>\n");
      out.write("                                function initMap() {\n");
      out.write("                                    var location = {lat: 13.730994, lng: 100.781260};\n");
      out.write("                                    var map = new google.maps.Map(document.getElementById('map'), {\n");
      out.write("                                        zoom: 17,\n");
      out.write("                                        center: location\n");
      out.write("                                    });\n");
      out.write("                                    var marker = new google.maps.Marker({\n");
      out.write("                                        position: location,\n");
      out.write("                                        map: map,\n");
      out.write("                                        title: 'IT KMITL'\n");
      out.write("                                    });\n");
      out.write("                                }\n");
      out.write("                            </script>\n");
      out.write("                            <a href=\"edit_homestay.jsp\" class=\"btn btn-primary btn-block mt-3\">Edit Homestay</a>\n");
      out.write("                            <a href=\"add_homestay.jsp\" class=\"btn btn-success btn-block mt-3\">Add Homestay</a>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
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
