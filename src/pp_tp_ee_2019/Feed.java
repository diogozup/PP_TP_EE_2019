
package pp_tp_ee_2019;

import java.util.Calendar;
import java.util.Date;
import rss.resources.app.Models.FeedContract;
import rss.resources.app.Models.FeedItemContract;
import rss.resources.app.exceptions.FeedException;
import rss.resources.app.exceptions.ObjectmanagementException;

/**
* Nome: Diogo Sa Tinoco Magalhaes
* Número: 8120336
* Turma: 1
*/


public class Feed implements FeedContract{

    String title;
    String url;
    String description;
    Calendar publicationDate;
    String language;
    String categories ;
    String author;
    

    public Feed(String url) {
        this.url = url;
    }
    
    
    @Override
    public String getTitle() {
        return title;
    }

    @Override
    public void setTitle(String string) {
       this.title = string;
    }

    @Override
    public String getDescription() {
        return description;
    }

    @Override
    public void setDescription(String string) {
        this.description = string;
    }

    @Override
    public String getLanguage() {
        return language;
    }

    @Override
    public void setLanguage(String string) {
        this.language = string;
    }
    
    
    @Override 
    public Calendar getBuildDate() {
        return publicationDate;
    }

    @Override
    public void setBuildDate(Calendar clndr) {
        this.publicationDate = clndr;    
    }

    @Override
    public boolean addItem(String string, String string1, String string2, Calendar clndr, String string3, String string4) {
        
        this.title = string;
        this.url = string1;
        this.description = string2;
        this.publicationDate = clndr;
        this.categories = string3;
        this.author = string4;
        
        
        return true;
    }

    @Override
    public FeedItemContract getItem(int i) throws ObjectmanagementException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean addCategory(String string) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String getCategory(int i) throws ObjectmanagementException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int numberCategories() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int numberItems() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int getID() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String getURL() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void setURL(String string) throws FeedException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }



}
