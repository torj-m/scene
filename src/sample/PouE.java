package sample;

import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;

import java.io.IOException;

public class PouE {

    public void Pclick(MouseEvent mouseEvent) throws IOException {
        Parent login = FXMLLoader.load(getClass().getResource("sample.fxml"));
        Scene Slogin=new Scene(login,500,500);
        Stage log=(Stage) ( (Node) mouseEvent.getSource() ).getScene().getWindow();
        log.setScene(Slogin);
        log.show();
    }
}
