package com.example.lab1_javafx.controllers;

import com.example.lab1_javafx.Main;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;

import java.io.IOException;

import static com.example.lab1_javafx.figures.MyLine.setPoint;

public class DialogLineController {
    @FXML
    private TextField pX;

    @FXML
    private TextField pY;

    @FXML
    void onClick(MouseEvent event) throws IOException {
        if(!pX.getText().isEmpty() && !pY.getText().isEmpty() &&  MainController.getStage() != null) {
            setPoint(Double.parseDouble(pX.getText()), Double.parseDouble(pY.getText()));
            MainController.getStage().close();
            MainController.drawLine();
        } else {
            error();
        }
    }

    @FXML
    void pointX(ActionEvent event) {

    }

    @FXML
    void pointY(ActionEvent event) {

    }

    public static void error() throws IOException {
        Stage stage = new Stage();
        FXMLLoader fxmlLoader = new FXMLLoader(Main.class.getResource("error.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 300, 75);
        stage.setTitle("Ошибка!");
        stage.setScene(scene);
        stage.show();
    }
}