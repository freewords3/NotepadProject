package sample;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.net.URL;
import java.util.Iterator;
import java.util.ResourceBundle;

import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.MenuButton;
import javafx.scene.control.MenuItem;
import javafx.scene.control.TextArea;
import javafx.scene.layout.AnchorPane;
import javafx.stage.FileChooser;
import javafx.stage.Stage;
import sample.fileUtils.FileHandler;

public class Controller {
    final FileChooser fileChooser = new FileChooser();

    @FXML
    private AnchorPane mainPane;

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
        Stage mainStage = (Stage) mainPane.getScene().getWindow();
        File file = fileChooser.showOpenDialog(mainStage);
        if (file != null) {
            FileHandler handler = new FileHandler();
            handler.writeFileToTextArea(file,writingField);
        }
    }

    @FXML
    // TODO: add error handling
    void saveMethodAction(ActionEvent event) throws IOException {
        Stage mainStage = (Stage) mainPane.getScene().getWindow();
        FileChooser.ExtensionFilter extFilter = new FileChooser.ExtensionFilter("TXT files (*.txt)", "*.txt");
        FileChooser.ExtensionFilter extFilterSecond = new FileChooser.ExtensionFilter("INI files (*.ini)", "*.ini");
        fileChooser.getExtensionFilters().add(extFilter);
        fileChooser.getExtensionFilters().add(extFilterSecond);
        File file = fileChooser.showSaveDialog(mainStage);

try{
                ObservableList<CharSequence> paragraph = writingField.getParagraphs();
        Iterator<CharSequence> iter = paragraph.iterator();
        try
        {
            BufferedWriter bf = new BufferedWriter(new FileWriter(file));
            while(iter.hasNext())
            {
                CharSequence seq = iter.next();
                bf.append(seq);
                bf.newLine();
            }
            bf.flush();
            bf.close();
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }
    }catch (Exception e){
    e.printStackTrace();
}
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