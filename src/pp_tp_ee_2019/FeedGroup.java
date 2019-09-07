package pp_tp_ee_2019;

import rss.resources.app.Models.FeedContract;
import rss.resources.app.Models.FeedGroupContract;
import rss.resources.app.exceptions.GroupException;
import rss.resources.app.exceptions.ObjectmanagementException;

/**
 *
 * @author zup
 */

public class FeedGroup implements FeedGroupContract{
    
    
    private int id;
    private String title;
    private String description;
    private ContainerOfObjects feed;

    
    public FeedGroup() {
        this.feed = new ContainerOfObjects();
    }

    public FeedGroup(String title, String description) {
        this.title = title;
        this.description = description;
        this.feed = new ContainerOfObjects();
    
    }

    
    
    

    @Override
    public int getID() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String getTitle() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void setTitle(String string) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String getDescription() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void setDescription(String string) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean addFeed(String string) throws GroupException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean addFeed(FeedContract fc) throws GroupException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean removeFeed(FeedContract fc) throws ObjectmanagementException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public FeedContract getFeed(int i) throws ObjectmanagementException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public FeedContract getFeedByID(int i) throws ObjectmanagementException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int numberFeeds() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void getData() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    



}
