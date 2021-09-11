package javafxbasico;

import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;

public class FXMLAlertsController {

    @FXML
    private Button btnAbrirAlert;

    @FXML
    void abrirAlert() {

        Alert alert = new Alert(Alert.AlertType.ERROR);
        //alert.setTitle("Erro");
        //alert.setHeaderText("Atençãao");
        alert.setContentText("Nu sa moda Kruuuuuuuuxa");
        alert.show();
    }

}
