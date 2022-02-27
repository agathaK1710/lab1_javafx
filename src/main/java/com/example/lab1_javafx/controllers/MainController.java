package com.example.lab1_javafx.controllers;

import com.example.lab1_javafx.Main;
import com.example.lab1_javafx.figures.Coordinates;
import com.example.lab1_javafx.figures.Figure;
import com.example.lab1_javafx.figures.MyLine;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.ColorPicker;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

import java.io.IOException;

public class MainController {
    private static Stage stage = new Stage();
    @FXML
    private TextField cX;

    @FXML
    private TextField cY;

    @FXML
    private VBox root;

    @FXML
    private ColorPicker myColorPicker;

    @FXML
    void changeColor(ActionEvent event) {
        Figure.setColor(myColorPicker.getValue());
    }

    @FXML
    void circle(ActionEvent event) {
    }

    @FXML
    void ellipse(ActionEvent event) {

    }

    @FXML
    void eqTriangle(ActionEvent event) {

    }

    @FXML
    public void line(ActionEvent event) throws IOException {
        if(setCenter(new ActionEvent())) {
            FXMLLoader fxmlLoader = new FXMLLoader(Main.class.getResource("lineDialog.fxml"));
            Scene scene = new Scene(fxmlLoader.load(), 300, 115);
            stage.setTitle("Выбрать параметры");
            stage.setScene(scene);
            stage.show();
        } else {
            DialogLineController.error();
            MyLine line = new MyLine(Figure.getTheCenter(), new Coordinates(100, 100));
            line.draw();
            root.getChildren().add(line.line);
        }
    }

    @FXML
    void pentagon(ActionEvent event) {

    }

    @FXML
    void polygon(ActionEvent event) {

    }

    @FXML
    void ray(ActionEvent event) {

    }

    @FXML
    void rectangle(ActionEvent event) {

    }

    @FXML
    void rhombus(ActionEvent event) {

    }

    @FXML
    void segment(ActionEvent event) {

    }

    @FXML
    void square(ActionEvent event) {

    }

    @FXML
    void triangle(ActionEvent event) {

    }

    @FXML
    boolean setCenter(ActionEvent event) throws IOException {
        if (!cX.getText().isEmpty() && !cY.getText().isEmpty()){
            Figure.setTheCenter(new Coordinates(Double.parseDouble(cX.getText()), Double.parseDouble(cY.getText())));
            return true;
        } else {
            return false;
        }
    }

    public static Stage getStage(){
        return stage;
    }

}
