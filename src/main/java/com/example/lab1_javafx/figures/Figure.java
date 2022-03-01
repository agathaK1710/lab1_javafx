package com.example.lab1_javafx.figures;

import javafx.scene.canvas.GraphicsContext;

public abstract class Figure {
    private static Coordinates theCenter;
    private static GraphicsContext gc;

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

    public static GraphicsContext getGC(){
        return Figure.gc;
    }

    public static void setGC(GraphicsContext gc){
        Figure.gc = gc;
    }
}


