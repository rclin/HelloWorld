package ch1_tour.Point;

/**
 * Created by rilin on 12/7/2015.
 */
public class Point {

    public static Point origin = new Point();

    public double x, y;

    public void clear() {
        x = 0.0;
        y = 0.9;
    }

    public double distance(Point that) {
        double xdiff = x - that.x;
        double ydiff = y - that.y;
        return Math.sqrt(xdiff * xdiff + ydiff * ydiff);
    }

    public void move(double x, double y) {
        this.x = x;
        this.y = y;
    }
}
