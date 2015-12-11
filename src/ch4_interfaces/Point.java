package ch4_interfaces;

/**
 * Created by rilin on 12/10/2015.
 */
public class Point implements Comparable<Point> {

    private static final Point ORIGIN = new Point();

    private int x, y;

    public double distance(Point p) {
        int xdiff = x - p.x;
        int ydiff = y - p.y;

        return Math.sqrt(xdiff * xdiff + ydiff * ydiff);
    }

    public int compareTo(Point p) {
        double pDist = p.distance(ORIGIN);
        double dist = this.distance(ORIGIN);
        if (dist > pDist) {
            return 1;
        } else if (dist == pDist) {
            return 0;
        }
        else {
            return -1;
        }
    }

}
