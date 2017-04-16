package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import model.Homestay;

public final class detail_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write('\n');
      out.write('\n');
 if (session.getAttribute("customer") != null) {  
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "templates/headerauth.jsp", out, false);
 } else { 
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "templates/header.jsp", out, false);
 }
      out.write('\n');
      out.write('\n');
 Homestay homestay = (Homestay) request.getAttribute("homestay");
      out.write("\n");
      out.write("        <div class=\"container mt-5\">\n");
      out.write("            <div class=\"card\">\n");
      out.write("                <h3 class=\"card-header\">");
      out.print(homestay.getHs_name());
      out.write("</h3>\n");
      out.write("                <div class=\"card-block\">\n");
      out.write("                    <div class=\"row justify-content-center\">\n");
      out.write("                        <div class=\"col-sm-6\">\n");
      out.write("                            <div id=\"carouselExampleControls\" class=\"carousel slide\" data-ride=\"carousel\">\n");
      out.write("                                <div class=\"carousel-inner\" role=\"listbox\">\n");
      out.write("                                    <div class=\"carousel-item active\">\n");
      out.write("                                        <img class=\"d-block\" src=\"https://www.ownerdirect.com/images/blind-bay-home-rental-kw-1112293-full.jpg\" alt=\"First slide\">\n");
      out.write("                                    </div>\n");
      out.write("                                    <div class=\"carousel-item\">\n");
      out.write("                                        <img class=\"d-block\" src=\"https://www.ownerdirect.com/images/blind-bay-home-rental-kw-983992-full.jpg\" alt=\"Second slide\">\n");
      out.write("                                    </div>\n");
      out.write("                                    <div class=\"carousel-item\">\n");
      out.write("                                        <img class=\"d-block\" src=\"https://www.ownerdirect.com/images/blind-bay-home-rental-kw-983990-full.jpg\" alt=\"Third slide\">\n");
      out.write("                                    </div>\n");
      out.write("                                </div>\n");
      out.write("                                <a class=\"carousel-control-prev\" href=\"#carouselExampleControls\" role=\"button\" data-slide=\"prev\">\n");
      out.write("                                    <span class=\"carousel-control-prev-icon\" aria-hidden=\"true\"></span>\n");
      out.write("                                    <span class=\"sr-only\">Previous</span>\n");
      out.write("                                </a>\n");
      out.write("                                <a class=\"carousel-control-next\" href=\"#carouselExampleControls\" role=\"button\" data-slide=\"next\">\n");
      out.write("                                    <span class=\"carousel-control-next-icon\" aria-hidden=\"true\"></span>\n");
      out.write("                                    <span class=\"sr-only\">Next</span>\n");
      out.write("                                </a>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"col-sm-6\">\n");
      out.write("                            <div class=\"card\">\n");
      out.write("                                <div class=\"card-block\">\n");
      out.write("                                    <h4 class=\"card-title\">Homestay Detail</h4>\n");
      out.write("                                    <p class=\"card-text\">");
      out.print(homestay.getHs_desc());
      out.write("</p>\n");
      out.write("                                    <h4 class=\"card-title\">Price</h4>\n");
      out.write("                                    <p class=\"card-text\">");
      out.print(homestay.getHs_price());
      out.write(" / Night</p>\n");
      out.write("                                    <a href=\"booking.jsp\" class=\"btn btn-primary btn-lg\">Booking</a>\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"row mt-4 mb-4\">\n");
      out.write("                        <div class=\"col-sm-12\">\n");
      out.write("                            <div id=\"accordion\" role=\"tablist\" aria-multiselectable=\"true\">\n");
      out.write("                                <div class=\"card\">\n");
      out.write("                                    <div class=\"card-header\" role=\"tab\" id=\"heading1\">\n");
      out.write("                                        <h5 class=\"mb-0\">\n");
      out.write("                                            <a class=\"collapsed\" data-toggle=\"collapse\" data-parent=\"#accordion\" href=\"#collapse1\" aria-expanded=\"false\" aria-controls=\"collapse1\">\n");
      out.write("                                                Parking\n");
      out.write("                                            </a>\n");
      out.write("                                        </h5>\n");
      out.write("                                    </div>\n");
      out.write("                                    <div id=\"collapse1\" class=\"collapse\" role=\"tabpanel\" aria-labelledby=\"heading1\">\n");
      out.write("                                        <div class=\"card-block\">\n");
      out.write("                                            <ul>\n");
      out.write("                                                <li>4 Outdoor/Open parking stalls with unlimited clearance</li>\n");
      out.write("                                            </ul>\n");
      out.write("                                        </div>\n");
      out.write("                                    </div>\n");
      out.write("                                </div>\n");
      out.write("                                <div class=\"card\">\n");
      out.write("                                    <div class=\"card-header\" role=\"tab\" id=\"heading2\">\n");
      out.write("                                        <h5 class=\"mb-0\">\n");
      out.write("                                            <a class=\"collapsed\" data-toggle=\"collapse\" data-parent=\"#accordion\" href=\"#collapse2\" aria-expanded=\"false\" aria-controls=\"collapse2\">\n");
      out.write("                                                Heating & Air Conditioning\n");
      out.write("                                            </a>\n");
      out.write("                                        </h5>\n");
      out.write("                                    </div>\n");
      out.write("                                    <div id=\"collapse2\" class=\"collapse\" role=\"tabpanel\" aria-labelledby=\"heading2\">\n");
      out.write("                                        <div class=\"card-block\">\n");
      out.write("                                            <ul>\n");
      out.write("                                                <li>Central Air Heating</li>\n");
      out.write("                                                <li>Air Conditioning: 1 Portable Unit</li>\n");
      out.write("                                            </ul>\n");
      out.write("                                        </div>\n");
      out.write("                                    </div>\n");
      out.write("                                </div>\n");
      out.write("                                <div class=\"card\">\n");
      out.write("                                    <div class=\"card-header\" role=\"tab\" id=\"heading3\">\n");
      out.write("                                        <h5 class=\"mb-0\">\n");
      out.write("                                            <a class=\"collapsed\" data-toggle=\"collapse\" data-parent=\"#accordion\" href=\"#collapse3\" aria-expanded=\"false\" aria-controls=\"collapse3\">\n");
      out.write("                                                Bedroom\n");
      out.write("                                            </a>\n");
      out.write("                                        </h5>\n");
      out.write("                                    </div>\n");
      out.write("                                    <div id=\"collapse3\" class=\"collapse\" role=\"tabpanel\" aria-labelledby=\"heading3\">\n");
      out.write("                                        <div class=\"card-block\">\n");
      out.write("                                            <ul>\n");
      out.write("                                                <li>Queen Bed</li>\n");
      out.write("                                                <li>Closet</li>\n");
      out.write("                                                <li>Alarm Clock</li>\n");
      out.write("                                                <li>Vanity</li>\n");
      out.write("                                                <li>Ceiling Fan</li>\n");
      out.write("                                                <li>Table Lamp</li>\n");
      out.write("                                            </ul>\n");
      out.write("                                        </div>\n");
      out.write("                                    </div>\n");
      out.write("                                </div>\n");
      out.write("                                <div class=\"card\">\n");
      out.write("                                    <div class=\"card-header\" role=\"tab\" id=\"heading4\">\n");
      out.write("                                        <h5 class=\"mb-0\">\n");
      out.write("                                            <a class=\"collapsed\" data-toggle=\"collapse\" data-parent=\"#accordion\" href=\"#collapse4\" aria-expanded=\"false\" aria-controls=\"collapse4\">\n");
      out.write("                                                Bathroom\n");
      out.write("                                            </a>\n");
      out.write("                                        </h5>\n");
      out.write("                                    </div>\n");
      out.write("                                    <div id=\"collapse4\" class=\"collapse\" role=\"tabpanel\" aria-labelledby=\"heading4\">\n");
      out.write("                                        <div class=\"card-block\">\n");
      out.write("                                            <ul>\n");
      out.write("                                                <li>Bathtub</li>\n");
      out.write("                                                <li>Regular Stall Shower</li>\n");
      out.write("                                                <li>Sink</li>\n");
      out.write("                                                <li>Toilet</li>\n");
      out.write("                                                <li>owels (matching)</li>\n");
      out.write("                                            </ul>\n");
      out.write("                                        </div>\n");
      out.write("                                    </div>\n");
      out.write("                                </div>\n");
      out.write("                                <div class=\"card\">\n");
      out.write("                                    <div class=\"card-header\" role=\"tab\" id=\"heading5\">\n");
      out.write("                                        <h5 class=\"mb-0\">\n");
      out.write("                                            <a class=\"collapsed\" data-toggle=\"collapse\" data-parent=\"#accordion\" href=\"#collapse5\" aria-expanded=\"false\" aria-controls=\"collapse5\">\n");
      out.write("                                                Kitchen\n");
      out.write("                                            </a>\n");
      out.write("                                        </h5>\n");
      out.write("                                    </div>\n");
      out.write("                                    <div id=\"collapse5\" class=\"collapse\" role=\"tabpanel\" aria-labelledby=\"heading5\">\n");
      out.write("                                        <div class=\"card-block\">\n");
      out.write("                                            <ul>\n");
      out.write("                                                <li>Large Fridge with Freezer (including ice maker)</li>\n");
      out.write("                                                <li>Coffee Maker</li>\n");
      out.write("                                                <li>Dishwasher</li>\n");
      out.write("                                                <li>Kettle</li>\n");
      out.write("                                                <li>Microwave</li>\n");
      out.write("                                                <li>Range Oven</li>\n");
      out.write("                                                <li>Toaster</li>\n");
      out.write("                                            </ul>\n");
      out.write("                                        </div>\n");
      out.write("                                    </div>\n");
      out.write("                                </div>\n");
      out.write("                                <div class=\"card\">\n");
      out.write("                                    <div class=\"card-header\" role=\"tab\" id=\"heading6\">\n");
      out.write("                                        <h5 class=\"mb-0\">\n");
      out.write("                                            <a class=\"collapsed\" data-toggle=\"collapse\" data-parent=\"#accordion\" href=\"#collapse6\" aria-expanded=\"false\" aria-controls=\"collapse6\">\n");
      out.write("                                                Outdoor\n");
      out.write("                                            </a>\n");
      out.write("                                        </h5>\n");
      out.write("                                    </div>\n");
      out.write("                                    <div id=\"collapse6\" class=\"collapse\" role=\"tabpanel\" aria-labelledby=\"heading6\">\n");
      out.write("                                        <div class=\"card-block\">\n");
      out.write("                                            <ul>\n");
      out.write("                                                <li>Propane BBQ private to this property.</li>\n");
      out.write("                                                <li>Patio Table</li>\n");
      out.write("                                                <li>2 Chaise Lounges</li>\n");
      out.write("                                                <li>Wrap Around Deck</li>\n");
      out.write("                                                <li>Dock</li>\n");
      out.write("                                                <li>Grass/Lawn</li>\n");
      out.write("                                                <li>Picnic Table</li>\n");
      out.write("                                                <li>Sun Umbrella</li>\n");
      out.write("                                                <li>Swing Set</li>\n");
      out.write("                                            </ul>\n");
      out.write("                                        </div>\n");
      out.write("                                    </div>\n");
      out.write("                                </div>\n");
      out.write("                                <div class=\"card\">\n");
      out.write("                                    <div class=\"card-header\" role=\"tab\" id=\"heading7\">\n");
      out.write("                                        <h5 class=\"mb-0\">\n");
      out.write("                                            <a class=\"collapsed\" data-toggle=\"collapse\" data-parent=\"#accordion\" href=\"#collapse7\" aria-expanded=\"false\" aria-controls=\"collapse7\">\n");
      out.write("                                                Other\n");
      out.write("                                            </a>\n");
      out.write("                                        </h5>\n");
      out.write("                                    </div>\n");
      out.write("                                    <div id=\"collapse7\" class=\"collapse\" role=\"tabpanel\" aria-labelledby=\"heading7\">\n");
      out.write("                                        <div class=\"card-block\">\n");
      out.write("                                            <ul>\n");
      out.write("                                                <li>The internet connection is provided.</li>\n");
      out.write("                                            </ul>\n");
      out.write("                                        </div>\n");
      out.write("                                    </div>\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"card mt-3 mb-3\">\n");
      out.write("                <h3 class=\"card-header\">Comment</h3>\n");
      out.write("                <div class=\"card-block\">\n");
      out.write("                    <ul class=\"list-unstyled\">\n");
      out.write("                        <li class=\"media\">\n");
      out.write("                            <div class=\"media-body\">\n");
      out.write("                                <h5 class=\"mt-0 mb-1\">Teerawut Kitbunjerdjarud</h5>\n");
      out.write("                                <p>ที่พักนี้ดีมากๆครับ</p>\n");
      out.write("                            </div>\n");
      out.write("                        </li>\n");
      out.write("                        <hr>\n");
      out.write("                        <li class=\"media my-4\">\n");
      out.write("                            <div class=\"media-body\">\n");
      out.write("                                <h5 class=\"mt-0 mb-1\">Parima Pirin</h5>\n");
      out.write("                                <p>โฮสหล่อมากค่ะ</p>\n");
      out.write("                            </div>\n");
      out.write("                        </li>\n");
      out.write("                        <hr>\n");
      out.write("                        <li class=\"media\">\n");
      out.write("                            <div class=\"media-body\">\n");
      out.write("                                <form action=\"Comment\" method=\"POST\">\n");
      out.write("                                    <textarea name=\"comment\" rows=\"3\" style=\"width: 100%; margin-top: 10px; margin-bottom: 10px;\"></textarea>\n");
      out.write("                                    <button type=\"submit\" class=\"btn btn-success btn-lg\">Comment</button>\n");
      out.write("                                </form>\n");
      out.write("                            </div>\n");
      out.write("                        </li>\n");
      out.write("                    </ul>\n");
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