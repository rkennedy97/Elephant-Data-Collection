package project.JavaFx;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;


import java.io.IOException;

public class mainController{

    @FXML
    private Button welfare_button;
    @FXML
    private Button activity_button;
    @FXML
    private Button social_button;
    @FXML
    private Button schedule_button;




    @FXML
    public void welfareButton (ActionEvent actionEvent) throws IOException {

        try {

            FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("healthData.fxml"));
            Parent root1 = (Parent) fxmlLoader.load();
            Stage stage = new Stage();
            stage.setTitle("Gorchaw Gwah");
            stage.setScene(new Scene(root1));
            stage.show();
        } catch (Exception e) {
            System.out.println("Can't load new window" + e);
        }
    }

    @FXML
    public void activityButton (ActionEvent actionEvent) throws IOException {

        try {

            FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("activityData.fxml"));
            Parent root1 = (Parent) fxmlLoader.load();
            Stage stage = new Stage();
            stage.setTitle("Gorchaw Gwah");
            stage.setScene(new Scene(root1));
            stage.show();
        } catch (Exception e) {
            System.out.println("Can't load new window");
        }
    }

    @FXML
    public void socialButton (ActionEvent actionEvent) throws IOException {

        try {

            FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("socialData.fxml"));
            Parent root1 = (Parent) fxmlLoader.load();
            Stage stage = new Stage();
            stage.setTitle("Gorchaw Gwah");
            stage.setScene(new Scene(root1));
            stage.show();
        } catch (Exception e) {
            System.out.println("Can't load new window" + e);
        }
    }

    @FXML
    public void scheduleButton (ActionEvent actionEvent) throws IOException {

        try {

            FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("scheduleData.fxml"));
            Parent root1 = (Parent) fxmlLoader.load();
            Stage stage = new Stage();
            stage.setTitle("Gorchaw Gwah");
            stage.setScene(new Scene(root1));
            stage.show();
        } catch (Exception e) {
            System.out.println("Can't load new window");
        }
    }
}



