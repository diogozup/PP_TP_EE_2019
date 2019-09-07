package pp_tp_ee_2019;

import rss.resources.app.Controllers.AppContract;
import rss.resources.app.Models.FeedGroupContract;
import rss.resources.app.Models.FeedItemContract;
import rss.resources.app.exceptions.ObjectmanagementException;

/*
* Nome: Diogo Sa Tinoco Magalhaes
* Número: 8120336
* Turma: 1
 */
public class App implements AppContract {

    ContainerOfObjects groups;

    public App() {
        this.groups = new ContainerOfObjects();
    }

    @Override //aqui falta add ifs para garantir tam nao excede array
    public boolean addGroup(String title, String description) {
        FeedGroup group = new FeedGroup(title, description);
        return this.groups.addObject(group);
    }

    @Override
    public boolean removeGroup(int i) throws ObjectmanagementException {
        return this.groups.removeObject(i);
    }

    @Override
    public FeedGroupContract getGroup(int i) throws ObjectmanagementException {
        
        
        
        return null;
    }

    @Override
    public FeedGroupContract getGroupByID(int i) throws ObjectmanagementException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int numberGroups() {
        return this.groups.getNumObjects();
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public FeedItemContract[] getItemsByTag(String string) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void saveGroups() throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void loadGroups() throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public FeedGroupContract[] getAllGroups() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public FeedItemContract[] getAllSavedItems() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean removeSavedItem(int i) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
