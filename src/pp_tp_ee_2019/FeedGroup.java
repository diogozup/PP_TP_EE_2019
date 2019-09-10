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
    final private ContainerOfObjects feed;

    // iniciar grupo vazio
    public FeedGroup() {
        this.feed = new ContainerOfObjects();
    }

    // iniciar grupo ja com titulo e descricao pelo menos
    public FeedGroup(String title, String description) {
        this.title = title;
        this.description = description;
        this.feed = new ContainerOfObjects();
    
    }

    
    
    

    @Override
    public int getID() {
        return feed.findObject(feed);
//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String getTitle() {
        return title;
    }

    @Override
    public void setTitle(String title) {
        this.title = title;
    }

    @Override
    public String getDescription() {
        return description;
    }

    @Override
    public void setDescription(String description) {
        this.description = description;
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
        return this.feed.getNumObjects();
    }

    @Override
    public void getData() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    



}
