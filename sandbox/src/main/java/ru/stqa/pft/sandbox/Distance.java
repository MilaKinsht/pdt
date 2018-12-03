package ru.stqa.pft.sandbox;

/**
 * Created by user on 17.11.2018.
 */
public class Distance {
    public static void main (String[] args) {
        Point p1 = new Point(1.5, 3.33);
        Point p2 = new Point (0, 0.1);
        double d = distance(p1, p2);
        System.out.println("Расстояние между точками (" + p1.x + ", " + p1.y +") и (" + p2.x + ", " + p2.y + ") = " + d);
        System.out.println("Расстояние между точками (" + p1.x + ", " + p1.y +") и (" + p2.x + ", " + p2.y + ") = " + p1.distance(p2));
    }

    public static double distance (Point p1, Point p2) {
        return Math.sqrt((p2.x-p1.x)*(p2.x-p1.x) + (p2.y-p1.y)*(p2.y-p1.y));
    }
}
