package sample;

import javafx.application.Platform;
import javafx.stage.Stage;

import java.awt.*;

public class Controller {

    Button button;

    public void closeWindow(){
        Platform.exit();
    }
}
