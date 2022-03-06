package com.example.lab1_javafx.figures;

import javafx.scene.paint.Color;

public class MyLine extends Figure {
    private Coordinates point;

    public MyLine(Coordinates theCenter, Color color) {
        super(theCenter, color);
    }

    @Override
    public void draw() {
        getGC().setStroke(color);
        getGC().strokeLine(this.theCenter.x, this.theCenter.y, point.x, point.y);
    }

    @Override
    public void move() {

    }

    public void setPoint(Coordinates point) {
        this.point = point;
    }

    public  Coordinates getPoint(){
        return new Coordinates(this.point.x, this.point.y);
    }
}
