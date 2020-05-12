package sample;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.Button;
import javafx.event.ActionEvent;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;

public class Controller {

    String firstButton = Singleton.getInstance().filePathFirst;
    String secondButton = Singleton.getInstance().filePathSecond;
    String thirdButton = Singleton.getInstance().filePathThird;

    @FXML
    private Button button1;
    @FXML
    private Button button2;
    @FXML
    private Button button3;


    @FXML
    private Label label1;
    @FXML
    private Label label2;
    @FXML
    private Label label3;

    public Controller(){
    }


    @FXML
    public void getText(Button button){
       if (button == button1)
           label1.setText(readFirstFile(""));
       if (button == button2)
           label2.setText(readSecondFile(""));
       if (button == button3)
           label3.setText(readThirdFile(""));

    }

    @FXML
    public void actionEvent(ActionEvent actionEvent){
        Button button = (Button)actionEvent.getSource();
        getText(button);
    }

    public static String readFirstFile(String firstButton) {
        String text = "";
        try {
            text = new String(Files.readAllBytes(Paths.get("FilePathFirst.txt")));
        } catch (IOException e)
        { e.printStackTrace();
        } return text;
    }

    public static String readSecondFile(String secondButton) {
        String text = "";
        try {
            text = new String(Files.readAllBytes(Paths.get("FilePathSecond.txt")));
        } catch (IOException e)
        { e.printStackTrace();
        } return text;
    }

    public static String readThirdFile(String thirdButton) {
        String text = "";
        try {
            text = new String(Files.readAllBytes(Paths.get("FilePathThird.txt")));
        } catch (IOException e)
        { e.printStackTrace();
        } return text;
    }
}


