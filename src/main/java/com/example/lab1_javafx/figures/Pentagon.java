package com.example.lab1_javafx.figures;

import javafx.scene.paint.Color;

public class Pentagon extends RegularPolygon{
    public Pentagon(Coordinates theCenter, Color color) {
        super(theCenter, color);
        this.setNumOfSides(5);
    }

    @Override
    public void draw() {
        super.draw();
    }

    @Override
    public void move() {
        super.move();
    }
}
