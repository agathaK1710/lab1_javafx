package com.example.lab1_javafx.controllers;

import com.example.lab1_javafx.Main;
import com.example.lab1_javafx.figures.Coordinates;
import com.example.lab1_javafx.figures.Figure;
import com.example.lab1_javafx.figures.MyLine;
import com.example.lab1_javafx.figures.Polygon;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.control.ColorPicker;
import javafx.scene.control.TextField;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

import java.io.IOException;

public class MainController {
    private static final Stage stage = new Stage();
    private static boolean setCenterFlag = false;
    private static Color color;
    private static Coordinates center;

    @FXML
    private TextField cX;

    @FXML
    private TextField cY;

    @FXML
    private ColorPicker myColorPicker;

    @FXML
    private Canvas canvas;

    public void createGrid(){
        Figure.setGC(canvas.getGraphicsContext2D());
    }

    @FXML
    void changeColor(ActionEvent event) {
       color = myColorPicker.getValue();
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
     void line(ActionEvent event) throws IOException {
        setCenter();
        if(setCenterFlag) {
            FXMLLoader fxmlLoader = new FXMLLoader(Main.class.getResource("lineDialog.fxml"));
            Scene scene = new Scene(fxmlLoader.load(), 300, 115);
            stage.setTitle("Выбрать параметры");
            stage.setScene(scene);
            stage.show();
        } else {
            error();
        }
    }

    public static void drawLine(){
        MyLine line = new MyLine(center, color);
        line.setPoint(DialogLineController.point);
        line.draw();
    }


    @FXML
    void pentagon(ActionEvent event) {

    }

    @FXML
    void polygon(ActionEvent event) throws  IOException{
        setCenter();
        if(setCenterFlag) {
            FXMLLoader fxmlLoader = new FXMLLoader(Main.class.getResource("polygonDialog.fxml"));
            Scene scene = new Scene(fxmlLoader.load(), 500, 143);
            stage.setTitle("Выбрать параметры");
            stage.setScene(scene);
            stage.show();
        } else {
            error();
        }
    }

    public static void drawPolygon(){
        Polygon polygon = new Polygon(center, color);
        polygon.setPoints(DialogPolygonController.polPoints);
        polygon.draw();
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

    private Coordinates setCenter() {
        if (!cX.getText().isEmpty() && !cY.getText().isEmpty()) {
            center = new Coordinates(Double.parseDouble(cX.getText()), Double.parseDouble(cY.getText()));
            setCenterFlag = true;
        } else {
            setCenterFlag = false;
        }
        return center;
    }

    public static Stage getStage(){
        return stage;
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
