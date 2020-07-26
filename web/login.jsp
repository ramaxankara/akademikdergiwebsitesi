<%-- 
    Document   : login
    Created on : 13.Ara.2018, 15:01:26
    Author     : RAMAZHAN
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<!DOCTYPE html>
<head>
<title>Learning Bootstrap</title>
  <meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
 <link href="//maxcdn.bootstrapcdn.com/bootstrap/3.3.0/css/bootstrap.min.css" rel="stylesheet" id="bootstrap-css">
 <script src="//maxcdn.bootstrapcdn.com/bootstrap/3.3.0/js/bootstrap.min.js"></script>
 <script src="//code.jquery.com/jquery-1.11.1.min.js"></script>
 <link rel="stylesheet" type="text/css" href="css/login.css"/>
  <link href="css/bootstrap.min.css" rel="stylesheet">


    <style type="text/css">
        body { background: url(assets/bglight.png); }
        .hero-unit { background-color: #fff; }
        .center { display: block; margin: 0 auto; }
    </style>
</head>
<%@include file="header.jsp" %>
<body>
    <header class="header" style="height: 550px;">
        <div class="container">
          <div class="row" style="margin-top: -120px;">
            <div class="col-md-5 col-md-offset-1">
                <div class="content">
                  <div class="pull-middle">
                    <h1 class="page-header">Lütfen Mail Adresinizi Girerek Giriş Yapın!!</h1>
                    <p class="lead">Akademik Dergi Yönetim Sistemi.</p>
                    <div class="panel panel-default">
                        <div class="panel-body">
                            <form method="POST" action="signin.jsp">
                                <div class="input-group">
                                    <input type="email" name="email" id="email" class="form-control" placeholder="somebody@example.com">
                                    <span class="input-group-btn">
                                      <button class="btn btn-success btn-circle" type="submit">Giriş Yapmak İçin Tıklayın</button>
                                    </span>                        
                                </div>
                            </form>
                        </div>
                    </div>
                  </div>              
                </div>
            </div>
            <div class="col-md-4 col-md-offset-1 text-center mt-100 mb-100">
                <div class="phone">
                    <img class="img-responsive img-rounded" src="images/resim.jpg">
                </div>
            </div>
          </div>
        </div>
    </header>   
    
</div>

</body>
 <%@include file="footer.jsp" %>



<script src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.2/jquery.min.js"></script>
    <script src="../../dist/js/bootstrap.min.js"></script>
    <!-- Just to make our placeholder images work. Don't actually copy the next line! -->
    <script src="../../assets/js/vendor/holder.js"></script>
    <!-- IE10 viewport hack for Surface/desktop Windows 8 bug -->
    <script src="../../assets/js/ie10-viewport-bug-workaround.js"></script>



</html>
