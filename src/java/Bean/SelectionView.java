/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bean;

import Dao.Yayindakiler;
import Model.makaleler;
import com.mysql.jdbc.Statement;
import java.io.IOException;
import java.io.Serializable;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.PostConstruct;
import javax.faces.application.FacesMessage;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import javax.faces.context.FacesContext;

@ManagedBean(name = "dtSelectionView")
@ViewScoped
public class SelectionView implements Serializable {

    List<makaleler> makaleListesi = new ArrayList<makaleler>();
    makaleler dialog = new makaleler();

  
    @PostConstruct
    public void init() {
        makaleListesi = makalecek();

    }

    public List<makaleler> getMakaleListesi() {
        return makaleListesi;
    }

    public void setMakaleListesi(List<makaleler> makaleListesi) {
        this.makaleListesi = makaleListesi;
    }

    public List<makaleler> makalecek() {
        List<makaleler> makaleList = new ArrayList<makaleler>();

        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection Con = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/akademikdergi", "root", "");
            Statement statement = (Statement) Con.createStatement();
            ResultSet rs = statement.executeQuery("SELECT * FROM makaleler");

            // burda tablolarda ID leri aynı Olan verileri görüntüleyecek...
            while (rs.next()) {
                makaleler nesne = new makaleler();

                nesne.setMakaleid(rs.getInt("makaleid"));
                nesne.setMakaleadi(rs.getString("Madi"));
                nesne.setMakalekonu(rs.getString("Mkonu"));
                nesne.setYazaradi(rs.getString("yazarAdi"));
                nesne.setYazarmail(rs.getString("yazarMail"));
                nesne.setDergiadi(rs.getString("dergiAdi"));
                nesne.setDosyayolu(rs.getString("dosya"));
                makaleList.add(nesne);

            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return makaleList;

    }
    
    
    public void yayinla() throws ClassNotFoundException, SQLException{
        Yayindakiler y = new Yayindakiler();
        try {
            y.ekle(dialog);
            FacesContext.getCurrentInstance().addMessage(null,
            new FacesMessage("Kayit Basarılı"));  
        
        } catch (Exception e) {
            FacesContext.getCurrentInstance().addMessage(null,
            new FacesMessage("Bu Makale Daha Önce Onaylanmıs"));  
            
        }
       
    }
    public void reddet(){
        FacesContext.getCurrentInstance().addMessage(null,
        new FacesMessage("Makale Reddedildi")); 
    }
    
    public void cıkıs() throws IOException{
        FacesContext context = FacesContext.getCurrentInstance();

        FacesContext.getCurrentInstance().getExternalContext().redirect("index.jsp");
    }
    
    
    
      public makaleler getDialog() {
        return dialog;
    }

    public void setDialog(makaleler dialog) {
        this.dialog = dialog;
    }
    

}
