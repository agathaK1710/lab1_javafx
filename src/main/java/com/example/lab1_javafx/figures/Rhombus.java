package com.example.lab1_javafx.figures;

import javafx.scene.paint.Color;

import java.util.ArrayList;

public class Rhombus extends Polygon{
    protected double diagonal1, diagonal2;
    public Rhombus(Coordinates theCenter, Color color, double d1, double d2) {
        super(theCenter, color);
        diagonal1 = d1;
        diagonal2 = d2;
        ArrayList<Coordinates> points = new ArrayList<>();
        points.add(new Coordinates(theCenter.x, theCenter.y - d1/2));
        points.add(new Coordinates(theCenter.x + d2/2, theCenter.y));
        points.add(new Coordinates(theCenter.x, theCenter.y + d1/2));
        points.add(new Coordinates(theCenter.x - d2/2, theCenter.y));
        points.add(new Coordinates(theCenter.x, theCenter.y-d1/2));
        setPoints(points);
    }
}
