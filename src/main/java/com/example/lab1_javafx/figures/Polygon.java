package com.example.lab1_javafx.figures;

import javafx.scene.paint.Color;

import java.util.ArrayList;

public class Polygon extends Figure{
    private ArrayList<Coordinates> points;

    public Polygon(Coordinates theCenter, Color color) {
        super(theCenter, color);
    }

    @Override
    public void draw() {
        getGC().beginPath();
        getGC().moveTo(this.theCenter.x, this.theCenter.y);
        for(int i = 0; i < points.size(); ++i){
            getGC().lineTo(this.points.get(i).x, this.points.get(i).y);
        }
        getGC().setFill(color);
        getGC().fill();
    }

    @Override
    public boolean contains(Coordinates point) {
        return false;
    }


    public void setPoints(ArrayList<Coordinates> points) {
        this.points = points;
    }

    public ArrayList<Coordinates> getPoints() {
        return points;
    }
}
