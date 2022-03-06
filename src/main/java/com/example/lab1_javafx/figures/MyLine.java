package com.example.lab1_javafx.figures;

import javafx.scene.paint.Color;

public class MyLine extends Figure {
    public Color color;
    public static Coordinates point = new Coordinates(0, 0);

    public MyLine(Coordinates theCenter, Coordinates point, Color color) {
        super(theCenter);
        MyLine.point = point;
        this.color = color;
    }

    @Override
    public void draw() {
        Figure.getGC().setStroke(color);
        Figure.getGC().strokeLine(this.theCenter.x, this.theCenter.y, point.x, point.y);
    }

    @Override
    public void move() {

    }

    public static void setPoint(double x, double y){
        point.x = x;
        point.y = y;
    }

    public static Coordinates getPoint(){
        return new Coordinates(point.x, point.y);
    }
}
