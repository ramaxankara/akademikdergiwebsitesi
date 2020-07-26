<%-- 
    Document   : signin
    Created on : 13.Ara.2018, 15:42:37
    Author     : RAMAZHAN
--%>

<%@page import="Model.kayitlar"%>
<%@page import="Dao.kayitcek"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>JSP Page</title>
</head>
<body>
    <%
        String email = request.getParameter("email");
        kayitcek kcek = new kayitcek();
        kayitlar kayit = kcek.login(email);
        
            if(kayit == null){%> 
            <h1>Böyle Bir Kullanıcı Bulunamadı</h1>
            <a href="index.jsp">Ana Sayfaya Dönmek İçin Tıkla</a>
            <% }else if(kayit.getGörev().equalsIgnoreCase("Yazar")){
                  response.sendRedirect("yazar.xhtml");
               }else if(kayit.getGörev().equalsIgnoreCase("Hakem")){
                  response.sendRedirect("hakem.xhtml");
               }
    %>
    
</body>
</html>
