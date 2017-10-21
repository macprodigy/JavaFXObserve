/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javafxobserve;

import java.util.Observable;
import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

/**
 *
 * @author macprodigy
 */
public class Stuff {
    private StringProperty Name;
    private SimpleIntegerProperty count;
    
    public Stuff(String name, int howMany) {
        Name = new SimpleStringProperty();
        Name.set(name);
        count = new SimpleIntegerProperty();
        count.set(howMany);
    }
    
    @Override
    public String toString() {
        String stuffString = this.getName().get() + " " + this.getCount().get();
        return stuffString;
    }
    

    /**
     * @param Name the Name to set
     */
    public void setName(String name) {
        this.getName().set(name);
    }


    /**
     * @param count the count to set
     */
    public void setCount(int count) {
        this.getCount().set(count);
    }

    /**
     * @return the Name
     */
    public StringProperty getName() {
        return Name;
    }

    /**
     * @return the count
     */
    public SimpleIntegerProperty getCount() {
        return count;
    }
        
}




