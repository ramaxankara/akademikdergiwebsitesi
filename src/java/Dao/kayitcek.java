
package Dao;

import Model.kayitlar;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;


public class kayitcek {
    public kayitlar login(String email) {
        PreparedStatement ps = null;
        Connection con = null;
        kayitlar kisi = null;

        try {
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/akademikdergi", "root", "");
            ps = con.prepareStatement("SELECT * FROM kayit WHERE email=? ");

            ps.setString(1, email);

            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                kisi = new kayitlar();
                kisi.setId(rs.getInt("kayit_id"));
                kisi.setAdsoyad(rs.getString("adsoyad"));
                kisi.setEposta(rs.getString("email"));
                kisi.setTel(rs.getString("tel"));
                kisi.setGörev(rs.getString("görev"));
            }

        } catch (Exception e) {
            e.printStackTrace();
            FacesContext.getCurrentInstance().addMessage(null,
                    new FacesMessage(FacesMessage.SEVERITY_ERROR, "Error", e.getMessage()));
        } finally {
            try {
                con.close();
                ps.close();

            } catch (Exception e) {
                System.out.println(e);
            }
        }
        return kisi;

    }
}
