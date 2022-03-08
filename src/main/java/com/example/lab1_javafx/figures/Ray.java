package com.example.lab1_javafx.figures;

import javafx.scene.paint.Color;

public class Ray extends Segment{

    public Ray(Coordinates theCenter, Color color) {
        super(theCenter, color);
    }
    public void draw() {
        getGC().setStroke(color);
        double x1 = point.x;
        double y1 = point.y;

        double y2 = 5000;
        double x2;
        if(point.y != this.theCenter.y){
            x2 = (this.theCenter.x* point.y- point.x* this.theCenter.y + (point.x-this.theCenter.x)*1000)/(point.y - this.theCenter.y);
        }
        else {
            x1 = 0;
            x2 = 2000;
        }
        getGC().strokeLine(x1,y1,x2,y2);
    }
}
