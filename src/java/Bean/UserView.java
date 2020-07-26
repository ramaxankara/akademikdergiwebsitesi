/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bean;

import Dao.kayitekle;
import java.sql.SQLException;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.context.FacesContext;
import org.primefaces.model.UploadedFile;

@ManagedBean
public class UserView {

    private String makaleadi;
    private String makalekonu;
    private String yazaradi;
    private String mail;
    private String dergi;
    private UploadedFile file;

    public UploadedFile getFile() {
        return file;
    }

    public void setFile(UploadedFile file) {
        this.file = file;
    }

    public String getDergi() {
        return dergi;
    }

    public void setDergi(String dergi) {
        this.dergi = dergi;
    }

    public String getYazaradi() {
        return yazaradi;
    }

    public void setYazaradi(String yazaradi) {
        this.yazaradi = yazaradi;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public String getMakaleadi() {
        return makaleadi;
    }

    public void setMakaleadi(String makaleadi) {
        this.makaleadi = makaleadi;
    }

    public String getMakalekonu() {
        return makalekonu;
    }

    public void setMakalekonu(String makalekonu) {
        this.makalekonu = makalekonu;
    }
     
    public void upload() throws SQLException, ClassNotFoundException {
        if(file != null) {
            kayitekle kekle = new kayitekle();
            kekle.Makaleekle(makaleadi,makalekonu,yazaradi,mail,dergi,file.getFileName());
           FacesContext.getCurrentInstance().addMessage(null,
            new FacesMessage("Kayit Basarılı"));  
        }else{
            FacesMessage message = new FacesMessage("Bir "+ "Hata Oluştu.");
            FacesContext.getCurrentInstance().addMessage(null, message);
        }
    }
    
    

}
