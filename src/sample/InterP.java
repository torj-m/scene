package sample;

import javafx.application.Platform;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

import java.io.IOException;

public class InterP {
    @FXML
    private BorderPane bp;
    private AnchorPane ap;
    public Label x;
    public void Pclick(MouseEvent mouseEvent) throws IOException {
        Parent login = FXMLLoader.load(getClass().getResource("sample.fxml"));
        Scene Slogin=new Scene(login);
        Stage log=(Stage) ( (Node) mouseEvent.getSource() ).getScene().getWindow();
        log.setScene(Slogin);
        log.show();
    }

    private void loadPage(String p) throws IOException {
        Parent root=null;
        root=FXMLLoader.load(getClass().getResource(p+".fxml"));
        bp.setCenter(root);
    }

    public void Bprofil(MouseEvent mouseEvent) throws IOException {
        loadPage("Profil");
    }

    public void Bdepo(MouseEvent mouseEvent) {
    }

    public void Bnot(MouseEvent mouseEvent) {
    }
    public void bouttIn(MouseEvent event){
        x.setOpacity(0.3);
    }
    public void bouttOut(MouseEvent event){
        x.setOpacity(1);
    }
    public void bouttonExt(MouseEvent event){
        Platform.exit();
    }
}
