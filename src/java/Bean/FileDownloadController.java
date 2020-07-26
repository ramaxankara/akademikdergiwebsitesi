/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bean;

import java.io.InputStream;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

import org.primefaces.model.DefaultStreamedContent;
import org.primefaces.model.StreamedContent;


@ManagedBean(name = "fileBean")
@RequestScoped
public class FileDownloadController {

    public StreamedContent getFile() {
        InputStream stream = this.getClass().getResourceAsStream("‪C:\\Users\\RAMAZHAN\\Desktop\\dergi\\Ekran Görüntüsü (4).png"); 
        return new DefaultStreamedContent(stream, "image/png", "downloaded_file.txt");    }
    
}
