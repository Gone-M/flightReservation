

// Civan Metin - 101441732
// Maggie Hall - 101447078
// Tomer Edelman - 101400506


package com.example.groupassign2;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;
import java.io.IOException;
import java.net.URL;

public class MaggieHall2 extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(MaggieHall2.class.getResource("/com/example/groupassign2/flight-view.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 800, 600);

        URL stylesheetUrl = getClass().getResource("/com/example/groupassign2/main.css");
        if (stylesheetUrl != null) {
            scene.getStylesheets().add(stylesheetUrl.toExternalForm());
        }

        stage.setTitle("Flight Agency");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}

