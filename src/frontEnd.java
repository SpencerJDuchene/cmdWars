/**
 * Created by lostw on 10/28/2016.
 *
 * Controller for scenebuilder.
 */
/**
 * Sample Skeleton for 'ComplexApplication_css.fxml' Controller Class
 */

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;

public class frontEnd {

    @FXML // ResourceBundle that was given to the FXMLLoader
    private ResourceBundle resources;

    @FXML // URL location of the FXML file that was given to the FXMLLoader
    private URL location;

    @FXML // fx:id="x3"
    private Font x3; // Value injected by FXMLLoader

    @FXML // fx:id="x4"
    private Color x4; // Value injected by FXMLLoader

    @FXML // This method is called by the FXMLLoader when initialization is complete
    void initialize() {
        assert x3 != null : "fx:id=\"x3\" was not injected: check your FXML file 'ComplexApplication_css.fxml'.";
        assert x4 != null : "fx:id=\"x4\" was not injected: check your FXML file 'ComplexApplication_css.fxml'.";

    }
}
