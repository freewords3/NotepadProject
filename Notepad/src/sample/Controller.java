package sample;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.MenuButton;
import javafx.scene.control.MenuItem;
import javafx.scene.control.TextArea;

public class Controller {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private TextArea writingField;

    @FXML
    private MenuButton fileMenu;

    @FXML
    private MenuItem openMethod;

    @FXML
    private MenuItem saveMethod;

    @FXML
    private MenuItem searchMethod;

    @FXML
    private MenuButton editMenu;

    @FXML
    private MenuItem cutMethod;

    @FXML
    private MenuItem copyMethod;

    @FXML
    private MenuItem pasteMethod;

    @FXML
    private MenuItem cancelMethod;

    @FXML
    private MenuItem clearMethod;

    @FXML
    void openMethodAction(ActionEvent event) {

    }

    @FXML
    void saveMethodAction(ActionEvent event) {

    }

    @FXML
    void searchMethodAction(ActionEvent event) {

    }

    @FXML
    void cutMethodAction(ActionEvent event) {

    }

    @FXML
    void copyMethodAction(ActionEvent event) {

    }

    @FXML
    void pasteMethodAction(ActionEvent event) {

    }
    
    @FXML
    void cancelMethodAction(ActionEvent event) {

    }

    @FXML
    void clearMethodAction(ActionEvent event) {
        writingField.setText("");
    }

    @FXML
    void initialize() {

    }
}

//writingField.setText("");