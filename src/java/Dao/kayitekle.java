package Dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;


public class kayitekle {
    
    public void üyeekle(String adsoyad,String eposta,String phone,String görev) throws ClassNotFoundException, SQLException {

        Connection con = null;
        PreparedStatement ps = null;
        Class.forName("com.mysql.jdbc.Driver");
        con = DriverManager.getConnection("jdbc:mysql://localhost:3306/akademikdergi", "root", "");
        String query = "INSERT INTO kayit(adsoyad,email,tel,görev) VALUES(?,?,?,?)";

        ps = con.prepareStatement(query);

        ps.setString(1, adsoyad);
        ps.setString(2, eposta);
        ps.setString(3, phone);
        ps.setString(4, görev);

        ps.executeUpdate();

    }
    
    public void Makaleekle(String makaleAdi, String makaleKonu, String makaleYazar, String email, String dergiAdi,String dosya) throws SQLException, ClassNotFoundException {
        Connection con = null;
        PreparedStatement ps = null;
        Class.forName("com.mysql.jdbc.Driver");
        con = DriverManager.getConnection("jdbc:mysql://localhost:3306/akademikdergi", "root", "");
        String query = "INSERT INTO makaleler(Madi,Mkonu,yazarAdi,yazarMail,dergiAdi,dosya) VALUES(?,?,?,?,?,?)";

        ps = con.prepareStatement(query);

        ps.setString(1, makaleAdi);
        ps.setString(2, makaleKonu);
        ps.setString(3, makaleYazar);
        ps.setString(4,email);
        ps.setString(5,dergiAdi);
        ps.setString(6,dosya);

        ps.executeUpdate();

    }
    
    
    
    
}
