package com.example.lab1_javafx.controllers;

import javafx.fxml.FXML;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;

import java.io.IOException;

public class DialogRoundController {
    public static double radius1;

    @FXML
    private TextField radius;

    @FXML
    void OnClick(MouseEvent event) throws IOException {
        if(!radius.getText().isEmpty() &&  MainController.getStage() != null) {
            radius1 = Double.parseDouble(radius.getText());
            MainController.getStage().close();
            MainController.drawCircle();
            MainController.repaint(MainController.canva);
        } else {
            MainController.error();
        }
    }

}
