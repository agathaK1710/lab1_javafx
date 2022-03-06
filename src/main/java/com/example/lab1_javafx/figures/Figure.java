package com.example.lab1_javafx.figures;

import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;

public abstract class Figure {
    protected Coordinates theCenter;
    protected Color color;
    private static GraphicsContext gc;

    public Figure(Coordinates theCenter, Color color) {
        this.theCenter = theCenter;
        this.color = color;
        gc.setLineWidth(3);
    }

    public abstract void draw();

    public abstract void move();

    public Coordinates location() {
        return theCenter;
    }


    public static GraphicsContext getGC(){
        return Figure.gc;
    }

    public static void setGC(GraphicsContext gc){
        Figure.gc = gc;
    }


}


