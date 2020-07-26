
package Dao;

import Model.makaleler;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.faces.bean.ManagedBean;



@ManagedBean
public class Yayindakiler{
 
    
    public void ekle(makaleler nesne) throws ClassNotFoundException, SQLException{
        Connection con = null;
        PreparedStatement ps = null;
        Class.forName("com.mysql.jdbc.Driver");
        con = DriverManager.getConnection("jdbc:mysql://localhost:3306/akademikdergi", "root", "");
        String query = "INSERT INTO yayindakiler(id,adi,icerik,dergiadi,yazaradi,yazarmail) VALUES(?,?,?,?,?,?)";

        ps = con.prepareStatement(query);

        ps.setInt(1,nesne.getMakaleid());
        ps.setString(2, nesne.getMakaleadi());
        ps.setString(3, nesne.getMakalekonu());
        ps.setString(4,nesne.getDergiadi());
        ps.setString(5, nesne.getYazaradi());
        ps.setString(6, nesne.getYazarmail());
        
        

        ps.executeUpdate();
    }
    
    public void sil(int id) throws ClassNotFoundException, SQLException{
        
    PreparedStatement ps = null;
	
		Connection con = null;

			Class.forName("com.mysql.jdbc.Driver");
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/akademikdergi", "root", "");
			ps = con.prepareStatement("DELETE FROM makaleler WHERE makaleid=?");

			ps.setInt(1,id);

			ps.executeUpdate();
			
			
			

		}

	}
    
    
    
    

