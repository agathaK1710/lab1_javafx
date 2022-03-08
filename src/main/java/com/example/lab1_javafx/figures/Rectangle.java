package com.example.lab1_javafx.figures;

import javafx.scene.paint.Color;

import java.util.ArrayList;

public class Rectangle extends Polygon{
    public double side1, side2;

    public Rectangle(Coordinates theCenter, Color color, double side11, double side22) {
        super(theCenter, color);
        side1 = side11;
        side2 = side22;
        ArrayList<Coordinates> p = new ArrayList<>();
        p.add(new Coordinates(theCenter.x-side1/2, theCenter.y-side2/2));
        p.add(new Coordinates(theCenter.x+side1/2, theCenter.y-side2/2));
        p.add(new Coordinates(theCenter.x+side1/2, theCenter.y+side2/2));
        p.add(new Coordinates(theCenter.x-side1/2, theCenter.y+side2/2));
        p.add(new Coordinates(theCenter.x-side1/2, theCenter.y-side2/2));

        setPoints(p);
    }
}
