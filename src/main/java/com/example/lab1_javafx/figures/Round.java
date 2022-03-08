package com.example.lab1_javafx.figures;

import javafx.scene.paint.Color;

public class Round extends Ellipse {
    public Round(Coordinates theCenter, Color color, double R) {
        super(theCenter, color, R, R);
    }

    @Override
    public void draw() {
        super.draw();
    }

    @Override
    public void move(Coordinates point) {
        super.move(point);
    }

    @Override
    public boolean contains(Coordinates point) {
       return super.contains(point);
    }
}
