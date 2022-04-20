package pl.softwareforge;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class LuxBluxSoftApp
        extends Application {
    @Override
    public void start(Stage stage) throws Exception {

        var fxmlLoader = new FXMLLoader(getClass().getResource("/View/AppView.fxml"));

        Parent target = fxmlLoader.load();
        var scene = new Scene(target);

        stage.setScene(scene);
        stage.setTitle("LuxBluxSoftApp");

        stage.show();

    }

    public void run(String[] args) { launch(args); }
}
