/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bean;


import Model.yayinlananMakale;
import java.io.Serializable;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

/**
 *
 * @author RAMAZHAN
 */
@ManagedBean
@ViewScoped
public class CarouselView implements Serializable {
     
    List<yayinlananMakale> makaleListesi = new ArrayList<yayinlananMakale>();
    

 

     
   
    @PostConstruct
    public void init() {
        makaleListesi = yayincek();
    }
 
    
    
    
      public List<yayinlananMakale> yayincek() {
        List<yayinlananMakale> makaleList = new ArrayList<yayinlananMakale>();

        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection Con = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/akademikdergi", "root", "");
            Statement statement = (Statement) Con.createStatement();
            ResultSet rs = statement.executeQuery("SELECT * FROM yayindakiler");

            // burda tablolarda ID leri aynı Olan verileri görüntüleyecek...
            while (rs.next()) {
               yayinlananMakale yayinMakale = new yayinlananMakale();

                yayinMakale.setId(rs.getInt("id"));
                yayinMakale.setAdi(rs.getString("adi"));
                yayinMakale.setIcerik(rs.getString("icerik"));
                yayinMakale.setDergiAdi(rs.getString("dergiadi"));
                yayinMakale.setYazarAdi(rs.getString("yazaradi"));
                yayinMakale.setYazarMail(rs.getString("yazarmail"));
                
                makaleList.add(yayinMakale);

            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return makaleList;

    }
    
    
    public List<yayinlananMakale> getMakaleListesi() {
        return makaleListesi;
    }

    public void setMakaleListesi(List<yayinlananMakale> makaleListesi) {
        this.makaleListesi = makaleListesi;
    }
    
    
}