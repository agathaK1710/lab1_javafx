package com.example.lab1_javafx.controllers;

import com.example.lab1_javafx.figures.Coordinates;
import javafx.fxml.FXML;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;

import java.io.IOException;

public class DialogRhombusController {

    public static Coordinates diagonals;

    @FXML
    private TextField r1;

    @FXML
    private TextField r2;

    @FXML
    void onClick(MouseEvent event) throws IOException {
        if(!r1.getText().isEmpty() && !r2.getText().isEmpty() &&  MainController.getStage() != null) {
            diagonals = new Coordinates(Double.parseDouble(r1.getText()), Double.parseDouble(r2.getText()));
            MainController.getStage().close();
            MainController.drawRhombus();
            MainController.repaint(MainController.canva);
        } else {
            MainController.error();
        }
    }

}
