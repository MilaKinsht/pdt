package ru.stqa.pft.sandbox;

/**
 * Created by user on 17.11.2018.
 */
public class Point {
    double x;
    double y;

    public Point (double x, double y){
        this.x = x;
        this.y = y;
    }

    public double distance (Point p){
        return Math.sqrt((this.x-p.x)*(this.x-p.x) + (this.y-p.y)*(this.y-p.y));
    }
}