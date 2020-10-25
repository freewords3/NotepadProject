package sample.fileUtils;

import java.awt.*;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import javafx.scene.control.TextArea;


public class FileHandler {
    private Desktop desktop = Desktop.getDesktop();
    public void writeFileToTextArea(File file, TextArea textArea){
        try {
            Scanner s = new Scanner(file).useDelimiter("\\s+");
            while (s.hasNext()) {
                if (s.hasNextInt()) { // check if next token is an int
                    textArea.appendText(s.nextInt() + " "); // display the found integer
                } else {
                    textArea.appendText(s.next() + " "); // else read the next token
                }
            }
        } catch (FileNotFoundException ex) {
            System.err.println(ex);
        }
        }



}
