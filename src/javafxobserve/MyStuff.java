/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javafxobserve;

import java.util.Observable;
import java.util.Observer;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

/**
 *
 * @author Brandon Glass, blg34@psu.edu
 */
public class MyStuff {
    private ObservableList<Stuff> myStuff;
    private Observer o;
    
    public MyStuff() {
        myStuff = FXCollections.observableArrayList();
        
    }
    
    public void addStuff(Stuff stuff) {
        getMyStuff().add(stuff);
        
    }
    
    public void removeStuff(Stuff stuff) {
        getMyStuff().remove(stuff);
    }

    /**
     * @return the myStuff
     */
    public ObservableList<Stuff> getMyStuff() {
        return myStuff;
    }
}
