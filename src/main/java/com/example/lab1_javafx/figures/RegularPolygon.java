package com.example.lab1_javafx.figures;

import javafx.scene.paint.Color;

import java.util.ArrayList;

public class RegularPolygon extends Polygon {
    private int numOfSides;
    private double radius;

    public RegularPolygon(Coordinates theCenter, Color color) {
        super(theCenter, color);
    }

    @Override
    public void draw() {
        Coordinates center = this.theCenter;
        ArrayList<Coordinates> points = new ArrayList<>();
        double angle = 2 * Math.PI / numOfSides;
        for (int i = 0; i < numOfSides; ++i) {
            Coordinates point = new Coordinates(this.theCenter.x + this.radius * Math.cos(angle * i),
                    this.theCenter.y + this.radius * Math.sin(angle * i));
            points.add(point);
        }
        this.theCenter = points.get(0);
        this.setPoints(points);
        super.draw();
        this.theCenter = center;
    }

    @Override
    public void move() {

    }

    public void setNumOfSides(int numOfSides) {
        this.numOfSides = numOfSides;
    }

    public int getNumOfSides() {
        return numOfSides;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }
}
