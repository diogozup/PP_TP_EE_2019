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
    final private ContainerOfObjects feeds;
    

    // iniciar grupo vazio
    public FeedGroup() {
        this.feeds = new ContainerOfObjects();
    }

    // iniciar grupo ja com titulo e descricao pelo menos
    public FeedGroup(String title, String description) {
        this.title = title;
        this.description = description;
        this.feeds = new ContainerOfObjects();
    
    }

    

    @Override
    public int getID() {
        return id;
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
    public boolean addFeed(String url) throws GroupException {
    Feed f = new Feed(url);
    return feeds.addObject(f);
    }
    
    @Override
    public boolean addFeed(FeedContract fc) throws GroupException {
        return feeds.addObject(fc);
    }

    
    @Override
    public boolean removeFeed(FeedContract fc) throws ObjectmanagementException {
        int index = feeds.findObject(fc);
       
        if(index >=0){
        feeds.removeObject(index);
            return true;
        }else{
            return false;
        }
    }

    
    @Override
    public FeedContract getFeed(int i) throws ObjectmanagementException {
        if (i>=0 && i< feeds.getNumObjects()){
            return (FeedContract)feeds.getObjectP(i);
        }else{
            throw new  ObjectmanagementException("Nao existe feed nesta posicao");
        }
    }

    
    
    
    @Override
    public FeedContract getFeedByID(int id) throws ObjectmanagementException {
        for (int j = 0; j < feeds.getNumObjects(); j++) {
           FeedContract object = (FeedContract) feeds.getObjectP(j);
           if(object.getID() == id){
               return object;
           }
        } 
        throw new ObjectmanagementException("Nao encontrou feed com este ID");
    }

    @Override
    public int numberFeeds() {
        return this.feeds.getNumObjects();
    }

    
    // !----------------------------- VOID => FeedContract ? ---------
    @Override
    public void getData() {
//        return FeedContract;
    }
    




}

//** COMO SE GRAVA PARA FICHEIRO