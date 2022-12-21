package appusotextoboton;

import componente_madridDaniel.CampoTextoBoton;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;

/**
 * FXML Controller class
 *
 * @author Daniel Madrid
 */
public class AppusotextobotonController implements Initializable {

    @FXML
    private Label textoLabel;
    @FXML
    private CampoTextoBoton grabarNombre;
    @FXML
    private CampoTextoBoton grabarApellido;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
        textoLabel.setText("Pulsa botón y muestra texto en esta etiqueta");
        grabarNombre.setOnAction(new EventHandler<ActionEvent>(){
            @Override
            public void handle(ActionEvent event) {
                textoLabel.setText("Se ha grabado: " + grabarNombre.getText());
            }
        });
        
        grabarApellido.setOnAction(new EventHandler<ActionEvent>(){
            @Override
            public void handle(ActionEvent event) {
                textoLabel.setText("Se ha grabado: " + grabarApellido.getText());
            }
        });
    }
}