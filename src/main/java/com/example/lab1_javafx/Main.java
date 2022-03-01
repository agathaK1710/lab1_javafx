package com.example.lab1_javafx;

import com.example.lab1_javafx.controllers.MainController;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;
import java.io.IOException;

public class Main extends Application {
    public static final int height = 800;
    public static final int width = 600;
    public static Scene scene;
    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(Main.class.getResource("menu.fxml"));
        scene = new Scene(fxmlLoader.load(), height, width);
        stage.setTitle("lab1");
        stage.setScene(scene);
        stage.show();

        MainController controller = fxmlLoader.getController();
        controller.createGrid();
    }

    public static void main(String[] args) {
        launch();
    }
}