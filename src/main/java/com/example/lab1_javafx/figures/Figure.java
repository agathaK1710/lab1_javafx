package com.example.lab1_javafx.figures;

import javafx.scene.canvas.GraphicsContext;

public abstract class Figure {
    protected Coordinates theCenter;
    private static GraphicsContext gc;

    public Figure(Coordinates theCenter) {
        this.theCenter = theCenter;
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


