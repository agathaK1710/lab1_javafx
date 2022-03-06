package com.example.lab1_javafx.controllers;

import com.example.lab1_javafx.figures.Coordinates;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;

import java.io.IOException;

public class DialogLineController {
    public static Coordinates point;

    @FXML
    private TextField pX;

    @FXML
    private TextField pY;

    @FXML
    void onClick(MouseEvent event) throws IOException {
        if(!pX.getText().isEmpty() && !pY.getText().isEmpty() &&  MainController.getStage() != null) {
            point = new Coordinates(Double.parseDouble(pX.getText()), Double.parseDouble(pY.getText()));
            MainController.getStage().close();
            MainController.drawLine();
        } else {
            MainController.error();
        }
    }

    @FXML
    void pointX(ActionEvent event) {

    }

    @FXML
    void pointY(ActionEvent event) {

    }
}