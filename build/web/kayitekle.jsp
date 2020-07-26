<%-- 
    Document   : kayitekle
    Created on : 13.Ara.2018, 14:29:39
    Author     : RAMAZHAN
--%>

<%@page import="Dao.kayitekle"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <meta http-equiv="refresh" content="2;URL=http://localhost:8084/tasarim/index.jsp">
    <title>JSP Page</title>
</head>
<body>
<%
    String adsoyad = request.getParameter("validate-text");
    String mail = request.getParameter("validate-email");
    String phone = request.getParameter("validate-phone");
    String görev = request.getParameter("validate-select");
  
    kayitekle kekle= new kayitekle();
   
    try{
       kekle.üyeekle(adsoyad,mail,phone,görev);
    %>
    <h1>Kayit Başarılı</h1>
    <h2>Ana Sayfaya Yönlendiriliyorsunuz</h2>
    <%
        
    }catch(Exception e){
        %><h1>Kayıt Oluşturulurken Hata Oluştu</h1><%
           
            
    }
   
    
    %>
</body>
</html>
