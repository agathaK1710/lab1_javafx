package com.example.lab1_javafx.figures;

import javafx.scene.paint.Color;
import javafx.scene.shape.Line;

public class MyLine extends Figure {
    public Line line;
    public static Coordinates point;

    public MyLine(Coordinates theCenter, Coordinates point) {
        super(theCenter);
        MyLine.point = point;
    }

    @Override
    public void draw() {
        if (getTheCenter().y == point.y) {
            line = new Line(0, getTheCenter().y, 1000, point.y);
            return;
        }
        double x1 = (point.x * getTheCenter().y - getTheCenter().x * point.y) / (getTheCenter().y - point.y);
        double x2 = (point.x * getTheCenter().y - getTheCenter().x * point.y + (getTheCenter().x - point.x) * 1000)
                / (getTheCenter().y - point.y);
        line = new Line(x1, 0, x2, 1000);
        line.setStrokeWidth(3);
        line.setStroke(Color.RED);
    }

    @Override
    public void move() {

    }
}
