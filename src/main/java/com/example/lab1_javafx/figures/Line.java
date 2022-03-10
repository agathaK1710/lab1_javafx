package com.example.lab1_javafx.figures;

import javafx.scene.paint.Color;

public class Line extends Segment{

    public Line(Coordinates theCenter, Color color) {
        super(theCenter, color);
    }

    @Override
    public void draw() {
        getGC().setStroke(color);
        double x1;
        double y2 = 5000;
        double y1 = 0;
        double x2;
        if (point.y != this.theCenter.y) {
            x2 = (this.theCenter.x * point.y - point.x * this.theCenter.y + (point.x - this.theCenter.x) * 1000) / (point.y - this.theCenter.y);
            x1 = (this.theCenter.x * point.y - point.x * this.theCenter.y) / (point.y - this.theCenter.y);
        } else {
            x1 = 0;
            x2 = 2000;
        }
        getGC().strokeLine(x1, y1, x2, y2);
    }

    @Override
    public void move(Coordinates point) {
        super.move(point);
    }
}
