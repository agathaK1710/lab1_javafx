package com.example.lab1_javafx.figures;

import javafx.scene.paint.Color;

public class Square extends RegularPolygon{
    public Square(Coordinates theCenter, Color color) {
        super(theCenter, color);
        this.setNumOfSides(4);
    }

    @Override
    public void draw() {
        super.draw();
    }

    @Override
    public void move(Coordinates point) {
        super.move(point);
    }
}
