package pp_tp_ee_2019;

import java.io.FileInputStream;
import java.io.FileReader;
import java.io.Reader;
import rss.resources.app.Controllers.AppContract;
import rss.resources.app.Models.FeedGroupContract;
import rss.resources.app.Models.FeedItemContract;
import rss.resources.app.exceptions.ObjectmanagementException;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

/*
* Nome: Diogo Sa Tinoco Magalhaes
* Número: 8120336
* Turma: 1
 */
public class App implements AppContract  , Serializable{

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
        return (FeedGroupContract) this.groups.getObjectP(i);
    }

    
    @Override 
    public FeedGroupContract getGroupByID(int id) throws ObjectmanagementException {
       
        for (int j = 0; j < this.groups.getNumObjects(); j++) {
            FeedGroupContract object = (FeedGroupContract) this.groups.getObjectP(id);
            if(object.getID()==id){
                return object;
            }
        }
        throw new ObjectmanagementException("Nao encontrou um grupo com este id!");
    }

    
    
    @Override
    public int numberGroups() {
        return this.groups.getNumObjects();
    }

    
    ///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    ///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    ///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    ///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    ///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    
    @Override 
    public FeedItemContract[] getItemsByTag(String string) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void saveGroups() throws Exception  {
        // ESCREVER BINARI FILE DE GROUPS
        String fileName = "data.bin";
        try {
        ObjectOutputStream os = new ObjectOutputStream(new FileOutputStream(fileName));
        os.writeObject(this.groups); // write Object (groups)
        os.close();
        } catch (IOException e) {

        }
        System.out.println("Done Writing");
    }

        
        
        
        

////////////////////////////////777
    //////////////////////////////////77
    
    //////////////////////////////////////
    
    @Override
    public void loadGroups() throws Exception {
        // LER OBJECT JAVA (binario)
        String fileName = "data.bin";
        
        System.out.println("trying to Read groups !");
                
        try {
            ObjectInputStream is = new ObjectInputStream(new FileInputStream(fileName));
            this.groups = (ContainerOfObjects)is.readObject();
            System.out.println("Read groups !");
            is.close();
            System.out.println(this.groups.toString());
        } catch (IOException e) {
            e.printStackTrace();
        }
        
        
    }

    
    @Override 
    public FeedGroupContract[] getAllGroups() {
        FeedGroupContract[] myGroups = new FeedGroup[this.numberGroups()];
        
        for (int i = 0; i < this.numberGroups(); i++) {
        myGroups[i] = (FeedGroup)groups.getObjectP(i);
        }
        return myGroups;
    }

    ///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    ///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    ///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    ///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//    REVER AQUI
    ///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    
    @Override 
    public FeedItemContract[] getAllSavedItems() {
        // 1- saber total de items no groupo
            int numTotalItems = 0 ;
            FeedItemContract[] feedItems = null;
            
            
            try{        
            for (int i = 0; i < groups.getNumObjects(); i++) {
                int numFeeds =  ((FeedGroupContract)groups.getObjectP(i)).numberFeeds();
                for (int j = 0; j < numFeeds; j++) {
                    numTotalItems += ((FeedGroupContract)groups.getObjectP(i)).getFeed(j).numberItems();
                }
            }
            
            feedItems = new FeedItemContract[numTotalItems];
            
            int pos = 0;
            
            for (int i = 0; i < groups.getNumObjects(); i++) {
                int numFeeds =  ((FeedGroupContract)groups.getObjectP(i)).numberFeeds();
                for (int j = 0; j < numFeeds; j++) {
                    int numItems = ((FeedGroupContract)groups.getObjectP(i)).getFeed(j).numberItems();
                    
                    for (int k = 0; k < numItems ; k++) {
                        FeedItemContract item = ((FeedGroupContract)groups.getObjectP(i)).getFeed(j).getItem(k);
                        feedItems[pos] = item;
                        pos++;
                        
                    }
                    
                }
            }
            }catch(ObjectmanagementException e){
                System.out.println("Erro aqui"); 
            }
            return feedItems;
    
    }
    ///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    ///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    ///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    ///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    ///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    
    
    
    @Override 
    public boolean removeSavedItem(int i) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        
        
        
        
        
    }

}
