<%-- 
    Document   : index
    Created on : 25.Kas.2018, 20:54:17
    Author     : RAMAZHAN
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>JSP Page</title>
</head>
<body>
<div class="wrapper" style="">
  
     <%@include file="header.jsp" %>
<div style="height: 500px;">       
        <%@include file="gövde.jsp" %>
    </div>
    
    <div style="height: 600px; background-color: #d4edf4;margin-top:-100px;">
        <div class="col-md-4 col-md-offset-1 text-center mt-100 mb-100" style="margin-top: 10px;">
               <div class="phone">
                    <img class="img-responsive img-rounded" style="width:300px;height: 300px" src="images/resim.jpg">
                </div>   
        </div>
        
            <div class="col-md-5 col-md-offset-1" style="margin-top: -90px;">
                    <div class="content">
                        <div class="pull-middle">
                            <h2 class="h1 page-header">AKADEMİK DERGİ YÖNETİM SİSTEMİ</h2>
                            <ul class="media-list">
                              <li class="media">
                                <a class="media-left" href="#">
                                  <span class="glyphicon glyphicon-cloud icon text-success"></span>
                                </a>
                                <div class="media-body">
                                  <h3 class="media-heading">Makale Yükle Düzenle İncele.</h3>
                                  <p>Günümüzde Birçok Akademik Makale Yayınlamakta Bunlar Kontrol Etmek İçin Sistemler Gereklidir.</p>
                                </div>
                              </li>
                              <li class="media">
                                <a class="media-left" href="#">
                                  <span class="glyphicon glyphicon-lock icon text-success"></span>
                                </a>
                                <div class="media-body">
                                  <h3 class="media-heading">Makale ve Dergiler ile Kendinizi Geliştirin.</h3>
                                  <p>Makaleler yazarak Kendinizi Çevrenizi Geliştirin.</p>
                                </div>
                              </li>
                              <li class="media">
                                <a class="media-left" href="#">
                                  <span class="glyphicon glyphicon-user icon text-success"></span>
                                </a>
                                <div class="media-body">
                                  <h3 class="media-heading">Makale Yönetiminde Hakemler Etkilidir.</h3>
                                  <p>Sistemde Kayıtlı olan Ve Branş alanınızdaki Makaleleri Görüntülüyerek Akademik Puanınızı Artırın.</p>
                                </div>
                              </li>
                            </ul>
                        </div>
                    </div>
                </div>
        
    </div>
    
    <div style="height:500px;background-color:#e2f2d5 ">
      <div class="col-md-3 text-right" style="margin-top: -180px;margin-left:-450px;">
                    <div class="content">
                        <div class="pull-middle">
                            <h4><strong>Describe your product.</strong></h4>
                            <p>Proin sapien neque, consequat ac tempus aliquam, gravida in urna. Phasellus et lectus in odio imperdiet tempus. Aenean posuere, nunc a tristique imperdiet, massa dolor dictum eros, sit amet tempor turpis turpis vel tortor.</p>
                            <small>Phasellus feugiat at lorem a tincidunt. Nam hendrerit leo vitae orci pellentesque, nec euismod dolor condimentum.</small>
                        </div>
                    </div>
        </div>
        <div class="col-md-4 col-md-offset-1 mt-100 mb-100" style="margin-top: -30px;margin-left: -120px;">
                    <div class="phone">
                        <img class="img-responsive img-rounded" style="width:300px;height: 300px" src="images/resim.jpg">
                    </div>
         </div>
        <div class="col-md-3 col-md-offset-1" style="margin-top: -180px;margin-left: 10px;">
                    <div class="content">
                        <div class="pull-middle">
                            <h4><strong>Makalenizi Yayınlamak İçin Beklemeyin.</strong></h4>
                            <p>Sistemimizde Makalenizi En uygun Formatta yayınlayıp düzenlemek İçin Kaydolun .</p>
                            <a class="btn btn-success btn-circle" href="kayit.jsp">Ücretsiz Kaydol</a>
                        </div>
                    </div>
        </div>
        
        
        
    </div>
</div>
 
</body>
     <%@include file="footer.jsp" %>   
</html>
