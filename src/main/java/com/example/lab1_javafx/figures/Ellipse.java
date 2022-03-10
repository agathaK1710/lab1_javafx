package com.example.lab1_javafx.figures;

import javafx.scene.paint.Color;

public class Ellipse extends Figure {
    public double r1, r2;

    public Ellipse(Coordinates theCenter, Color color, double R1, double R2) {
        super(theCenter, color);
        this.r1 = R1;
        this.r2 = R2;
    }


    @Override
    public void draw() {
        Figure.getGC().setStroke(color);
        Figure.getGC().setFill(color);
        Coordinates point = new Coordinates(this.theCenter.x - r1, this.theCenter.y - r2);
        Figure.getGC().strokeOval(point.x, point.y, r1 * 2, r2 * 2);
        Figure.getGC().fillOval(point.x, point.y, r1 * 2, r2 * 2);
    }

    @Override
    public void move(Coordinates point) {
        super.move(point);
    }

    @Override
    public boolean contains(Coordinates point) {
        return (point.x >= this.theCenter.x - this.r1 && point.x <= this.theCenter.x + this.r1
                && point.y >= this.theCenter.y - this.r2 && point.y <= this.theCenter.y + this.r2);
    }
}
