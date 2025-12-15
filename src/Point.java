public class Point {

    // Variable to store x coordinate
    private double x;

    // Variable to store y coordinate
    private double y;

    // Constructor to initialize x and y values
    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    // Getter method to return x coordinate
    public double getX() {
        return x;
    }

    // Getter method to return y coordinate
    public double getY() {
        return y;
    }

    // Overriding toString() method to display point details
    @Override
    public String toString() {
        return "Point{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }
}
