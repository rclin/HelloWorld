package ch1_tour.Point;

/**
 * Created by rilin on 12/7/2015.
 */
public class PointMain {
    public static void run() {

        // lowerLeft, upperRight and middlePoint are object references
        // The type of these references are reference types
        Point lowerLeft = new Point();
        Point upperRight = new Point();
        Point middlePoint = new Point();

        lowerLeft.x = 0.0;
        lowerLeft.y = 0.0;

        upperRight.x = 1280.0;
        upperRight.y = 1024.0;

        middlePoint.x = 640.0;
        middlePoint.y = 512.0;

        double d = lowerLeft.distance(upperRight);

        Point point = new Pixel();
        point.clear(); // uses Pixel's clear()

    }
}
