import java.util.ArrayList;
import java.util.List;

public class ClosestPair {

    public static void main(String[] args) {
        // Contoh titik
        List<Point> points = new ArrayList<>();
        points.add(new Point(2, 3));
        points.add(new Point(12, 30));
        points.add(new Point(4, 4));
        points.add(new Point(12, 10));
        points.add(new Point(3, 1));
        points.add(new Point(1, 2));

        // Cari pasangan terdekat
        Point[] closestPair = findClosestPair(points);

        // Cetak hasil
        System.out.println("Pasangan titik terdekat: (" + closestPair[0].getX() + ", " +
                closestPair[0].getY() + ") dan (" + closestPair[1].getX() + ", " +
                closestPair[1].getY() + ")");
    }

    // Method untuk mencari pasangan titik terdekat
    public static Point[] findClosestPair(List<Point> points) {
        Point[] closestPair = new Point[2];
        double minDistance = Double.MAX_VALUE;

        // Iterasi semua kemungkinan pasangan titik
        for (int i = 0; i < points.size(); i++) {
            for (int j = i + 1; j < points.size(); j++) {
                double distance = points.get(i).distance(points.get(j));
                if (distance < minDistance) {
                    minDistance = distance;
                    closestPair[0] = points.get(i);
                    closestPair[1] = points.get(j);
                }
            }
        }
        return closestPair;
    }
}

// Class Point untuk merepresentasikan titik
class Point {
    private double x;
    private double y;

    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    // Method untuk menghitung jarak antara dua titik
    public double distance(Point other) {
        return Math.sqrt(Math.pow(this.x - other.x, 2) + Math.pow(this.y - other.y, 2));
    }
}
