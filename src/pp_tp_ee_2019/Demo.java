package pp_tp_ee_2019;

import com.google.gson.Gson;
import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import rss.resources.app.Views.ExecutionMode;
import rss.resources.app.Views.MainFrame;
import rss.resources.app.exceptions.ObjectmanagementException;

/**
 *
 * @author zup
 */


public class Demo {

    /**
     * @param args the command line arguments
     * @throws java.io.FileNotFoundException
     */


    
    
    
    
    
    public static void main(String[] args) throws ObjectmanagementException, Exception {

        // _Iniciar app
    App app = new App();
     
    app.addGroup("Titulo1", "description1111");
     app.addGroup("Titulo1", "description1111");
     app.addGroup("Titulo1", "description1111");

     System.out.println("Num grupos: " + app.numberGroups());
     app.removeGroup(1);
     System.out.println("Num grupos: " + app.numberGroups());


     app.saveGroups();
     app.loadGroups();

     


     MainFrame gui = new MainFrame(app, ExecutionMode.DEVELOPMENT);
    




        
        
        
        
        
        
        
    }




        
}//EODemo
