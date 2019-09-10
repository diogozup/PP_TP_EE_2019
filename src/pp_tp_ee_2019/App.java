package pp_tp_ee_2019;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.InputStreamReader;
import java.io.Reader;
import rss.resources.app.Controllers.AppContract;
import rss.resources.app.Models.FeedGroupContract;
import rss.resources.app.Models.FeedItemContract;
import rss.resources.app.exceptions.ObjectmanagementException;
import java.io.Writer;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;


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
        return (FeedGroupContract) this.groups.getObjectP(i);
    }

    @Override //////////////////////////////////////////////////////////////////
    public FeedGroupContract getGroupByID(int i) throws ObjectmanagementException {
   
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int numberGroups() {
        return this.groups.getNumObjects();
    }

    
    
    @Override //////////////////////////////////////////////////////////////////
    public FeedItemContract[] getItemsByTag(String string) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void saveGroups() throws Exception {
        Gson json = new GsonBuilder().create();

        try (Writer writer = new FileWriter("Output.json")) {
            json.toJson(groups, writer);
        }
    }

    
    @Override
    public void loadGroups() throws Exception {
        JSONParser parser = new JSONParser();

        try (Reader reader = new FileReader("Output.json")) {
            JSONObject jsonObject = (JSONObject) parser.parse(reader);
            System.out.println(jsonObject);

            Long size = (Long) jsonObject.get("DEFAULT_SIZE");
            System.out.println(size);
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

    @Override //////////////////////////////////////////////////////////////////
    public FeedItemContract[] getAllSavedItems() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override //////////////////////////////////////////////////////////////////
    public boolean removeSavedItem(int i) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
