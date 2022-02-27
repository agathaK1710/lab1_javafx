package com.example.lab1_javafx.figures;

import javafx.scene.paint.Color;

public abstract class Figure {
    private static Color color;
    private static Coordinates theCenter;

    public Figure(Coordinates theCenter) {
        Figure.theCenter = theCenter;
    }

    public abstract void draw();

    public abstract void move();

    public Coordinates location() {
        return theCenter;
    }

    public static Coordinates getTheCenter() {
        return theCenter;
    }

    public static void setTheCenter(Coordinates theCenter) {
       Figure.theCenter = theCenter;
    }

    public static Color getColor() {
        return color;
    }

    public static void setColor(Color color) {
        Figure.color = color;
    }
}


