/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javafxobserve;

import java.io.IOException;
import java.util.Observable;
import java.util.Observer;
import javafx.beans.property.ObjectProperty;
import javafx.scene.control.ListCell;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.control.Label;
import javafx.scene.layout.GridPane;

/**
 *
 * @author macprodigy
 */
public class StuffListViewCell extends ListCell<Stuff> {
    @FXML
    private Label label1;

    @FXML
    private Label label2;

    @FXML
    private GridPane gridPane;

    private FXMLLoader loader;
    
    
    @Override
    protected void updateItem(Stuff stuff, boolean empty) {
        super.updateItem(stuff, empty);

        if(empty || stuff == null) {

            setText(null);
            setGraphic(null);

        } else {
            
            
            if (loader == null) {
                loader = new FXMLLoader(getClass().getResource("ListCell.fxml"));
                loader.setController(this);

                try {
                    loader.load();
                } catch (IOException e) {
                    e.printStackTrace();
                }

            }
            label1.textProperty().bind(stuff.getCount().asString());
            label2.textProperty().bind(stuff.getName());
//            label1.setText(String.valueOf(stuff.getCount()));
//            label2.setText(stuff.getName());   

            setText(null);
            setGraphic(gridPane);
        }

    }
    
}
