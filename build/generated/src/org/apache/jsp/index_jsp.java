package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList<String>(3);
    _jspx_dependants.add("/header.jsp");
    _jspx_dependants.add("/gövde.jsp");
    _jspx_dependants.add("/footer.jsp");
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
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("    <title>JSP Page</title>\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("<div class=\"wrapper\" style=\"\">\n");
      out.write("  \n");
      out.write("     ");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("    <link href=\"//maxcdn.bootstrapcdn.com/bootstrap/3.3.0/css/bootstrap.min.css\" rel=\"stylesheet\" id=\"bootstrap-css\">\n");
      out.write("        <script src=\"//maxcdn.bootstrapcdn.com/bootstrap/3.3.0/js/bootstrap.min.js\"></script>\n");
      out.write("        <script src=\"//code.jquery.com/jquery-1.11.1.min.js\"></script>\n");
      out.write("        <link rel=\"stylesheet\" type=\"text/css\" href=\"css/header.css\"/>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("    <div class=\"menu\">\n");
      out.write("        <div class=\"container-fluid\">\n");
      out.write("            <div class=\"navbar-header\">\n");
      out.write("                <a href=\"index.jsp\">AKADEMİK DERGİ YÖNETİM SİSTEMİ</a>\n");
      out.write("            </div>\n");
      out.write("            <div>\n");
      out.write("                <ul class=\"nav navbar-nav navbar-right\">\n");
      out.write("                    <li style=\"font-size:20px;color: firebrick\"><a href=\"index.jsp\">ANASAYFA</a></li>\n");
      out.write("                    <li style=\"font-size:20px\"><a href=\"index.jsp\">HAKKIMIZDA</a></li>\n");
      out.write("                    <li style=\"font-size:20px\"><a href=\"kayit.jsp\">KAYIT OL</a></li>\n");
      out.write("                    <li><a href=\"login.jsp\" ><span class=\"glyphicon glyphicon-user\"></span>Giriş Yap</a></li>\n");
      out.write("\n");
      out.write("                </ul>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("    </div>\n");
      out.write("\n");
      out.write("</body>\n");
      out.write("</html>\n");
      out.write("\n");
      out.write("<div style=\"height: 500px;\">       \n");
      out.write("        ");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("      <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <meta charset=\"utf-8\">\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"http://maxcdn.bootstrapcdn.com/bootstrap/3.2.0/css/bootstrap.min.css\">\n");
      out.write("        <script src=\"https://ajax.googleapis.com/ajax/libs/jquery/1.11.1/jquery.min.js\"></script>\n");
      out.write("        <script src=\"http://maxcdn.bootstrapcdn.com/bootstrap/3.2.0/js/bootstrap.min.js\"></script>\n");
      out.write("        <link href=\"css/bootstrap.min.css\" rel=\"stylesheet\">\n");
      out.write("        <link href=\"//maxcdn.bootstrapcdn.com/bootstrap/3.3.0/css/bootstrap.min.css\" rel=\"stylesheet\" id=\"bootstrap-css\">\n");
      out.write("        <script src=\"//maxcdn.bootstrapcdn.com/bootstrap/3.3.0/js/bootstrap.min.js\"></script>\n");
      out.write("        <script src=\"//code.jquery.com/jquery-1.11.1.min.js\"></script>  \n");
      out.write("      \n");
      out.write("        <link rel=\"stylesheet\" type=\"text/css\" href=\"css/page.css\"/>\n");
      out.write("       <link rel=\"stylesheet\" type=\"text/css\" href=\"css/deneme.css\"/>\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("        <div class=\"slider\">\n");
      out.write("        <div id=\"myCarousel\" class=\"carousel slide\">\n");
      out.write("  <!-- Indicators -->\n");
      out.write("  <ol class=\"carousel-indicators\">\n");
      out.write("    <li data-target=\"#myCarousel\" data-slide-to=\"0\" class=\"active\"></li>\n");
      out.write("    <li data-target=\"#myCarousel\" data-slide-to=\"1\"></li>\n");
      out.write("    <li data-target=\"#myCarousel\" data-slide-to=\"2\"></li>\n");
      out.write("  </ol>\n");
      out.write("  <div class=\"carousel-inner\">\n");
      out.write("    <div class=\"item active\">\n");
      out.write("      <img src=\"images/banner.png\" class=\"img-responsive\">\n");
      out.write("      <div class=\"container\">\n");
      out.write("        <div class=\"carousel-caption\">\n");
      out.write("        \n");
      out.write("          <pthis is=\"\" an=\"\" example=\"\" layout=\"\" with=\"\" carousel=\"\" that=\"\" uses=\"\" the=\"\" bootstrap=\"\" 3=\"\" styles.<=\"\" small=\"\"><p></p>\n");
      out.write("          <p><a class=\"btn btn-lg btn-primary\" href=\"\">MAKALE YÜKLE</a>\n");
      out.write("        </p></pthis></div>\n");
      out.write("      </div>\n");
      out.write("    </div>\n");
      out.write("    <div class=\"item\">\n");
      out.write("      <img src=\"images/banner2.png\" class=\"img-responsive\">\n");
      out.write("      <div class=\"container\">\n");
      out.write("        <div class=\"carousel-caption\">\n");
      out.write("          <p><a class=\"btn btn-large btn-primary\" href=\"#\">MAKALE GÖRÜNTÜLE</a></p>\n");
      out.write("        </div>\n");
      out.write("      </div>\n");
      out.write("    </div>\n");
      out.write("    <div class=\"item\">\n");
      out.write("      <img src=\"images/banner7.jpg\" class=\"img-responsive\">\n");
      out.write("      <div class=\"container\">\n");
      out.write("        <div class=\"carousel-caption\">\n");
      out.write("          <p><a class=\"btn btn-large btn-primary\" href=\"#\">MAKALE DÜZENLE</a></p>\n");
      out.write("        </div>\n");
      out.write("      </div>\n");
      out.write("    </div>\n");
      out.write("  </div>\n");
      out.write("  <!-- Controls -->\n");
      out.write("  <a class=\"left carousel-control\" href=\"#myCarousel\" data-slide=\"prev\">\n");
      out.write("    <span class=\"icon-prev\"></span>\n");
      out.write("  </a>\n");
      out.write("  <a class=\"right carousel-control\" href=\"#myCarousel\" data-slide=\"next\">\n");
      out.write("    <span class=\"icon-next\"></span>\n");
      out.write("  </a>  \n");
      out.write("</div>\n");
      out.write("        </div>\n");
      out.write("  \n");
      out.write("\n");
      out.write("    \n");
      out.write("   \n");
      out.write("</body>\n");
      out.write("</html>\n");
      out.write("\n");
      out.write("    </div>\n");
      out.write("    \n");
      out.write("    <div style=\"height: 600px; background-color: #d4edf4;margin-top:-100px;\">\n");
      out.write("        <div class=\"col-md-4 col-md-offset-1 text-center mt-100 mb-100\" style=\"margin-top: 10px;\">\n");
      out.write("               <div class=\"phone\">\n");
      out.write("                    <img class=\"img-responsive img-rounded\" style=\"width:300px;height: 300px\" src=\"images/resim.jpg\">\n");
      out.write("                </div>   \n");
      out.write("        </div>\n");
      out.write("        \n");
      out.write("            <div class=\"col-md-5 col-md-offset-1\" style=\"margin-top: -90px;\">\n");
      out.write("                    <div class=\"content\">\n");
      out.write("                        <div class=\"pull-middle\">\n");
      out.write("                            <h2 class=\"h1 page-header\">AKADEMİK DERGİ YÖNETİM SİSTEMİ</h2>\n");
      out.write("                            <ul class=\"media-list\">\n");
      out.write("                              <li class=\"media\">\n");
      out.write("                                <a class=\"media-left\" href=\"#\">\n");
      out.write("                                  <span class=\"glyphicon glyphicon-cloud icon text-success\"></span>\n");
      out.write("                                </a>\n");
      out.write("                                <div class=\"media-body\">\n");
      out.write("                                  <h3 class=\"media-heading\">Makale Yükle Düzenle İncele.</h3>\n");
      out.write("                                  <p>Günümüzde Birçok Akademik Makale Yayınlamakta Bunlar Kontrol Etmek İçin Sistemler Gereklidir.</p>\n");
      out.write("                                </div>\n");
      out.write("                              </li>\n");
      out.write("                              <li class=\"media\">\n");
      out.write("                                <a class=\"media-left\" href=\"#\">\n");
      out.write("                                  <span class=\"glyphicon glyphicon-lock icon text-success\"></span>\n");
      out.write("                                </a>\n");
      out.write("                                <div class=\"media-body\">\n");
      out.write("                                  <h3 class=\"media-heading\">Makale ve Dergiler ile Kendinizi Geliştirin.</h3>\n");
      out.write("                                  <p>Makaleler yazarak Kendinizi Çevrenizi Geliştirin.</p>\n");
      out.write("                                </div>\n");
      out.write("                              </li>\n");
      out.write("                              <li class=\"media\">\n");
      out.write("                                <a class=\"media-left\" href=\"#\">\n");
      out.write("                                  <span class=\"glyphicon glyphicon-user icon text-success\"></span>\n");
      out.write("                                </a>\n");
      out.write("                                <div class=\"media-body\">\n");
      out.write("                                  <h3 class=\"media-heading\">Makale Yönetiminde Hakemler Etkilidir.</h3>\n");
      out.write("                                  <p>Sistemde Kayıtlı olan Ve Branş alanınızdaki Makaleleri Görüntülüyerek Akademik Puanınızı Artırın.</p>\n");
      out.write("                                </div>\n");
      out.write("                              </li>\n");
      out.write("                            </ul>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("        \n");
      out.write("    </div>\n");
      out.write("    \n");
      out.write("    <div style=\"height:500px;background-color:#e2f2d5 \">\n");
      out.write("      <div class=\"col-md-3 text-right\" style=\"margin-top: -180px;margin-left:-450px;\">\n");
      out.write("                    <div class=\"content\">\n");
      out.write("                        <div class=\"pull-middle\">\n");
      out.write("                            <h4><strong>Describe your product.</strong></h4>\n");
      out.write("                            <p>Proin sapien neque, consequat ac tempus aliquam, gravida in urna. Phasellus et lectus in odio imperdiet tempus. Aenean posuere, nunc a tristique imperdiet, massa dolor dictum eros, sit amet tempor turpis turpis vel tortor.</p>\n");
      out.write("                            <small>Phasellus feugiat at lorem a tincidunt. Nam hendrerit leo vitae orci pellentesque, nec euismod dolor condimentum.</small>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("        </div>\n");
      out.write("        <div class=\"col-md-4 col-md-offset-1 mt-100 mb-100\" style=\"margin-top: -30px;margin-left: -120px;\">\n");
      out.write("                    <div class=\"phone\">\n");
      out.write("                        <img class=\"img-responsive img-rounded\" style=\"width:300px;height: 300px\" src=\"images/resim.jpg\">\n");
      out.write("                    </div>\n");
      out.write("         </div>\n");
      out.write("        <div class=\"col-md-3 col-md-offset-1\" style=\"margin-top: -180px;margin-left: 10px;\">\n");
      out.write("                    <div class=\"content\">\n");
      out.write("                        <div class=\"pull-middle\">\n");
      out.write("                            <h4><strong>Makalenizi Yayınlamak İçin Beklemeyin.</strong></h4>\n");
      out.write("                            <p>Sistemimizde Makalenizi En uygun Formatta yayınlayıp düzenlemek İçin Kaydolun .</p>\n");
      out.write("                            <a class=\"btn btn-success btn-circle\" href=\"kayit.jsp\">Ücretsiz Kaydol</a>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("        </div>\n");
      out.write("        \n");
      out.write("        \n");
      out.write("        \n");
      out.write("    </div>\n");
      out.write("</div>\n");
      out.write(" \n");
      out.write("</body>\n");
      out.write("     ");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("    <link rel=\"stylesheet\" href=\"https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.css\"></link>\n");
      out.write("    <link rel=\"stylesheet\" type=\"text/css\" href=\"css/footer.css\"/>\n");
      out.write("    <title>JSP Page</title>\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("  <footer style=\"height: 10px;\">\n");
      out.write("  <div class=\"container\" style=\"height: 1px;\" >\n");
      out.write("      <div class=\"footer-box\" style=\"margin-top: -80px;\">\n");
      out.write("          <p>Copyright &copy; 2018 Ramazan Kara</p>\n");
      out.write("      </div>\n");
      out.write("      <div class=\"footer-box\">\n");
      out.write("          <i class=\"fa fa-facebook\"></i>\n");
      out.write("          <i class=\"fa fa-twitter\"></i>\n");
      out.write("          <i class=\"fa fa-instagram\"></i>\n");
      out.write("          <i class=\"fa fa-behance\"></i>\n");
      out.write("          <i class=\"fa fa-github\"></i>\n");
      out.write("      </div>\n");
      out.write("  </div>\n");
      out.write("</footer>\n");
      out.write("</body>\n");
      out.write("</html>\n");
      out.write("   \n");
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
