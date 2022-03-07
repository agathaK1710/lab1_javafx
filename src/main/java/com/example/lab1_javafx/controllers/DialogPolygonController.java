package com.example.lab1_javafx.controllers;

import com.example.lab1_javafx.figures.Coordinates;
import com.example.lab1_javafx.figures.Polygon;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TextField;

import java.io.IOException;
import java.lang.reflect.Array;
import java.util.ArrayList;

public class DialogPolygonController {

    @FXML
    private TextField points;
    public static ArrayList<Coordinates> polPoints;

    @FXML
    void onClick(ActionEvent event) throws IOException {
        if (!points.getText().isEmpty()) {
            ArrayList<Coordinates> polygonPoints = new ArrayList<>();
            String[] array = points.getText().split(" ");
            for (int i = 0; i + 1 < array.length; i += 2) {
                double x = Double.parseDouble(array[i].trim());
                double y = Double.parseDouble(array[i + 1].trim());
                polygonPoints.add(new Coordinates(x, y));
            }
            polPoints = polygonPoints;
            MainController.getStage().close();
            MainController.drawPolygon();
        } else {
            MainController.error();
        }
    }

}
