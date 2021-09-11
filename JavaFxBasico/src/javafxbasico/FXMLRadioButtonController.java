package javafxbasico;

import javafx.fxml.FXML;
import javafx.scene.control.RadioButton;
import javafx.scene.control.ToggleGroup;

public class FXMLRadioButtonController {

    @FXML
    private ToggleGroup grupo;

    @FXML
    void pegarSelecionado() {

        RadioButton radio = (RadioButton) grupo.getSelectedToggle();
        System.out.println("Categoria Selecionada: "+radio.getText());
    }

}

