package sample;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.Button;
import javafx.event.ActionEvent;

import java.io.*;

public class Controller {

    private String firstButton = Singleton.getInstance().filePathFirst;
    private String secondButton = Singleton.getInstance().filePathSecond;
    private String thirdButton = Singleton.getInstance().filePathThird;

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

    public Controller() throws IOException {
    }


    @FXML
    private void getText(Button button){
       if (button == button1)
           label1.setText(firstButton);
       if (button == button2)
           label2.setText(secondButton);
       if (button == button3)
           label3.setText(thirdButton);

    }

    @FXML
    private void actionEvent(ActionEvent actionEvent) {
        Button button = (Button) actionEvent.getSource();
        getText(button);
    }
}


