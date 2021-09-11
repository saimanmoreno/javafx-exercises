/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javafxbasico;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.CheckBox;

/**
 * FXML Controller class
 *
 * @author pc
 */
public class FXMLCheckBoxController {

    @FXML
    private CheckBox checkJava;

    @FXML
    private CheckBox checkPhp;

    @FXML
    void pegarValores(ActionEvent event) {

        System.out.println(checkJava.selectedProperty().getValue());
        System.out.println(checkPhp.selectedProperty().getValue());
    }

}
