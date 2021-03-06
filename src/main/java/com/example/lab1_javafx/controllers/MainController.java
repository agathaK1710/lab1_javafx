package com.example.lab1_javafx.controllers;

import com.example.lab1_javafx.Main;
import com.example.lab1_javafx.figures.*;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.control.ColorPicker;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.ArrayList;

public class MainController {
    private static ArrayList<Figure> figures = new ArrayList<>();
    private static final Stage stage = new Stage();
    public static Canvas canva;
    private static boolean setCenterFlag = false;
    private static Color color;
    private static Coordinates center;
    public static String figure;

    @FXML
    private TextField cX;

    @FXML
    private TextField cY;

    @FXML
    private ColorPicker myColorPicker;

    @FXML
    private Canvas canvas;

    public void createGrid(){
        canva = canvas;
        Figure.setGC(canvas.getGraphicsContext2D());
        canva.setOnMouseClicked(new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent mouseEvent) {
                double xPosition = mouseEvent.getSceneX();
                double yPosition = mouseEvent.getSceneY();
                Coordinates point = new Coordinates(xPosition, yPosition);
                for(Figure figure: figures) {
                    if(figure.contains(point)){
                        figure.move(point);
                        repaint(canva);
                    }
                }
            }
        });

        canva.setOnMouseDragged(new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent mouseEvent) {
                double xPosition = mouseEvent.getSceneX();
                double yPosition = mouseEvent.getSceneY();
                Coordinates point = new Coordinates(xPosition, yPosition);
                for(Figure figure: figures) {
                    if(figure.contains(point)){
                        figure.move(point);
                        repaint(canva);
                    }
                }
            }
        });
    }

    @FXML
    void changeColor(ActionEvent event) {
       color = myColorPicker.getValue();
    }

    @FXML
    void circle(ActionEvent event) throws IOException {
        setCenter();
        if(setCenterFlag) {
            figure = "pentagon";
            FXMLLoader fxmlLoader = new FXMLLoader(Main.class.getResource("circleDialog.fxml"));
            Scene scene = new Scene(fxmlLoader.load(), 205, 145);
            stage.setTitle("?????????????? ??????????????????");
            stage.setScene(scene);
            stage.show();
        } else {
            error();
        }
    }

    public static void drawCircle(){
        Round round = new Round(center, color, DialogRoundController.radius1);
        figures.add(round);
    }

    @FXML
    void ellipse(ActionEvent event) throws IOException {
        setCenter();
        if(setCenterFlag) {
            figure = "pentagon";
            FXMLLoader fxmlLoader = new FXMLLoader(Main.class.getResource("ellipseDialog.fxml"));
            Scene scene = new Scene(fxmlLoader.load(), 188, 173);
            stage.setTitle("?????????????? ??????????????????");
            stage.setScene(scene);
            stage.show();
        } else {
            error();
        }
    }
    public static void drawEllipse(){
        Ellipse elps = new Ellipse(center, color, DialogEllipseController.radiuses.x, DialogEllipseController.radiuses.y);
        figures.add(elps);
    }

    @FXML
    void eqTriangle(ActionEvent event) throws IOException{
        setCenter();
        if(setCenterFlag) {
            figure = "eqTriangle";
            FXMLLoader fxmlLoader = new FXMLLoader(Main.class.getResource("regularPolygonDialog.fxml"));
            Scene scene = new Scene(fxmlLoader.load(), 350, 95);
            stage.setTitle("?????????????? ??????????????????");
            stage.setScene(scene);
            stage.show();
        } else {
            error();
        }
    }

    public static void drawEqTriangle(){
        EqTriangle triangle = new EqTriangle(center, color);
        triangle.setRadius(DialogRegularPolygonController.rad);
        figures.add(triangle);
    }

    @FXML
    void line(ActionEvent event) throws IOException {
        figure = "line";
        setCenter();
        if(setCenterFlag) {
            FXMLLoader fxmlLoader = new FXMLLoader(Main.class.getResource("lineDialog.fxml"));
            Scene scene = new Scene(fxmlLoader.load(), 300, 115);
            stage.setTitle("?????????????? ??????????????????");
            stage.setScene(scene);
            stage.show();
        } else {
            error();
        }
    }
    public static void drawLine(){
        Line line = new Line(center, color);
        line.setPoint(DialogLineController.point);
        figures.add(line);
    }


    @FXML
    void pentagon(ActionEvent event) throws IOException {
        setCenter();
        if(setCenterFlag) {
            figure = "pentagon";
            FXMLLoader fxmlLoader = new FXMLLoader(Main.class.getResource("regularPolygonDialog.fxml"));
            Scene scene = new Scene(fxmlLoader.load(), 350, 95);
            stage.setTitle("?????????????? ??????????????????");
            stage.setScene(scene);
            stage.show();
        } else {
            error();
        }
    }

    public static void drawPentagon(){
        Pentagon pentagon = new Pentagon(center, color);
        pentagon.setRadius(DialogRegularPolygonController.rad);
        figures.add(pentagon);
    }

    @FXML
    void polygon(ActionEvent event) throws  IOException{
        figure = "polygon";
        setCenter();
        if(setCenterFlag) {
            FXMLLoader fxmlLoader = new FXMLLoader(Main.class.getResource("polygonDialog.fxml"));
            Scene scene = new Scene(fxmlLoader.load(), 500, 143);
            stage.setTitle("?????????????? ??????????????????");
            stage.setScene(scene);
            stage.show();
        } else {
            error();
        }
    }

    public static void drawPolygon(){
        Polygon polygon = new Polygon(center, color);
        polygon.setPoints(DialogPolygonController.polPoints);
        figures.add(polygon);
    }

    @FXML
    void ray(ActionEvent event) throws IOException {
        figure = "ray";
        setCenter();
        if(setCenterFlag) {
            FXMLLoader fxmlLoader = new FXMLLoader(Main.class.getResource("lineDialog.fxml"));
            Scene scene = new Scene(fxmlLoader.load(), 300, 115);
            stage.setTitle("?????????????? ??????????????????");
            stage.setScene(scene);
            stage.show();
        } else {
            error();
        }
    }
    public static void drawRay(){
        Ray ray = new Ray(center, color);
        ray.setPoint(DialogLineController.point);
        figures.add(ray);
    }

    @FXML
    void rectangle(ActionEvent event) throws IOException {
        setCenter();
        if(setCenterFlag) {
            FXMLLoader fxmlLoader = new FXMLLoader(Main.class.getResource("rectangleDialog.fxml"));
            Scene scene = new Scene(fxmlLoader.load(), 188, 173);
            stage.setTitle("?????????????? ??????????????????");
            stage.setScene(scene);
            stage.show();
        } else {
            error();
        }
    }
    public static void drawRectangle(){
        Rectangle rect = new Rectangle(center, color, DialogRectangleController.sides.x, DialogRectangleController.sides.y);
        figures.add(rect);
    }

    @FXML
    void rhombus(ActionEvent event) throws IOException {
        setCenter();
        if(setCenterFlag) {
            FXMLLoader fxmlLoader = new FXMLLoader(Main.class.getResource("rhombusDialog.fxml"));
            Scene scene = new Scene(fxmlLoader.load(), 188, 173);
            stage.setTitle("?????????????? ??????????????????");
            stage.setScene(scene);
            stage.show();
        } else {
            error();
        }
    }

    public static void drawRhombus(){
        Rhombus rhomb = new Rhombus(center, color, DialogRhombusController.diagonals.x, DialogRhombusController.diagonals.y);
        figures.add(rhomb);
    }

    @FXML
    void segment(ActionEvent event) throws IOException {
        figure = "segment";
        setCenter();
        if(setCenterFlag) {
            FXMLLoader fxmlLoader = new FXMLLoader(Main.class.getResource("lineDialog.fxml"));
            Scene scene = new Scene(fxmlLoader.load(), 300, 115);
            stage.setTitle("?????????????? ??????????????????");
            stage.setScene(scene);
            stage.show();
        } else {
            error();
        }
    }
    public static void drawSegment(){
        Segment line = new Segment(center, color);
        line.setPoint(DialogLineController.point);
        figures.add(line);
    }

    @FXML
    void square(ActionEvent event) throws IOException {
        setCenter();
        if(setCenterFlag) {
            figure = "square";
            FXMLLoader fxmlLoader = new FXMLLoader(Main.class.getResource("regularPolygonDialog.fxml"));
            Scene scene = new Scene(fxmlLoader.load(), 350, 95);
            stage.setTitle("?????????????? ??????????????????");
            stage.setScene(scene);
            stage.show();
        } else {
            error();
        }
    }

    public static void drawSquare(){
        Square square = new Square(center, color);
        square.setRadius(DialogRegularPolygonController.rad);
        figures.add(square);
    }



    @FXML
    void triangle(ActionEvent event) throws IOException {
        figure = "triangle";
        setCenter();
        FXMLLoader fxmlLoader = new FXMLLoader(Main.class.getResource("polygonDialog.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 500, 143);
        stage.setTitle("?????????????? ??????????????????");
        stage.setScene(scene);
        stage.show();
    }

    public static void drawTriangle(){
        Triangle tr = new Triangle(center, color);
        tr.setPoints(DialogPolygonController.polPoints);
        figures.add(tr);
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
        stage.setTitle("????????????!");
        stage.setScene(scene);
        stage.show();
    }

    public static void repaint(Canvas canvas){
        Figure.getGC().clearRect(0, 0, canvas.getWidth(), canvas.getHeight());
        for(int i = 0; i < figures.size(); ++i){
            figures.get(i).draw();
        }
    }
}
