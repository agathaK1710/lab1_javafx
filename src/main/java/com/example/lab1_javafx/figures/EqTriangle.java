package com.example.lab1_javafx.figures;

import javafx.scene.paint.Color;

public class EqTriangle extends RegularPolygon{

    public EqTriangle(Coordinates theCenter, Color color) {
        super(theCenter, color);
        this.setNumOfSides(3);
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
