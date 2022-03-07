package com.example.lab1_javafx.controllers;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TextField;

import java.io.IOException;

public class DialogRegularPolygonController {

    @FXML
    private TextField radius;
    public static double rad;

    @FXML
    void onClick(ActionEvent event) throws IOException {
        if (!radius.getText().isEmpty()){
            rad = Double.parseDouble(radius.getText());
            MainController.getStage().close();
            switch (MainController.figure) {
                case "eqTriangle" -> {
                    MainController.drawEqTriangle();
                }
                case "square" -> {
                    MainController.drawSquare();
                }
                case "pentagon" -> {
                    MainController.drawPentagon();
                }
            }
        }
        else {
            MainController.error();
        }
    }

}
