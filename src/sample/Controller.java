package sample;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;

import java.io.IOException;

public class Controller {

    public void click(MouseEvent mouseEvent) throws IOException {
        Parent root= FXMLLoader.load(getClass().getResource("InterP.fxml"));
        Scene aaa=new Scene(root,500,500);
        Stage b=(Stage) ( (Node) mouseEvent.getSource() ).getScene().getWindow();
        b.setScene(aaa);
        b.show();

    }
}
