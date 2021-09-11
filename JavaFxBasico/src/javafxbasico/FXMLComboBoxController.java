/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javafxbasico;

import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.ResourceBundle;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ComboBox;
import modelo.Categoria;

/**
 * FXML Controller class
 *
 * @author pc
 */
public class FXMLComboBoxController implements Initializable {

    
    @FXML
    private ComboBox<Categoria> cmbCategoria;
    
    private List<Categoria> categorias = new ArrayList<>();
    
    private ObservableList obsCategoria;
    
    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
        carregarCategorias();
    }    
    
    public void carregarCategorias(){
        
        Categoria categoria1 = new Categoria(1, "Bebidas");
        Categoria categoria2 = new Categoria(2, "Entradas");
        Categoria categoria3 = new Categoria(3, "Prato-Principal");
        Categoria categoria4 = new Categoria(4, "Sobremesas");
        Categoria categoria5 = new Categoria(5, "Acompanhantes");
        Categoria categoria6 = new Categoria(6, "Fast-Foods");
        Categoria categoria7 = new Categoria(7, "Carnes");
        
        categorias.add(categoria7);
        categorias.add(categoria6);
        categorias.add(categoria5);
        categorias.add(categoria4);
        categorias.add(categoria3);
        categorias.add(categoria2);
        categorias.add(categoria1);
        
        obsCategoria = FXCollections.observableArrayList(categorias);
        
        cmbCategoria.setItems(obsCategoria);
        
    }
}
