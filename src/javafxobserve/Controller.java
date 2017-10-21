/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javafxobserve;

import java.net.URL;
import java.util.Observable;
import java.util.Observer;
import java.util.ResourceBundle;
import javafx.collections.FXCollections;
import javafx.collections.ListChangeListener;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.ListView;

/**
 *
 * @author macprodigy
 */
public class Controller implements Initializable {
    
    @FXML
    private ListView<Stuff> list;
    
    @FXML
    private Button update;
    
    @FXML
    private Button add;
    
    private MyStuff myStuff;


    public Controller() {
        myStuff = new MyStuff();
        

        
        Stuff broom = new Stuff("Broom", 4);
        
        myStuff.addStuff(broom);
        myStuff.addStuff(new Stuff("Dog", 3));
        myStuff.addStuff(new Stuff("Spaceship", 2));
       
        
        
        

    }
    
    @FXML protected void handleUpdateAction(ActionEvent event) {
        
        System.out.println(myStuff);
        myStuff.getMyStuff().get(0).setName("Vacuum");
        
        
        
        //list.refresh();
    }
    
    @FXML protected void handleAddAction(ActionEvent event) {
        myStuff.addStuff(new Stuff("Boxing Glove", 10));
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        
        list.setItems(myStuff.getMyStuff());
        list.setCellFactory(stuffListView -> new StuffListViewCell());
        
    }   
    
    
}
