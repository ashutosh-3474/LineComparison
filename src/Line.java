public class Line {

    // First point of the line
    private Point p1;

    // Second point of the line
    private Point p2;

    // Variable to store length of the line
    // Initially set to -1 to indicate length is not calculated
    private double length = -1;

    // Constructor to initialize the two points of the line
    public Line(Point p1, Point p2) {
        this.p1 = p1;
        this.p2 = p2;
    }

    // Method to calculate the length of the line using distance formula
    public void calculateLength() {
        this.length = Math.sqrt(
                Math.pow((p2.getX() - p1.getX()), 2) +
                        Math.pow((p2.getY() - p1.getY()), 2)
        );

        // Printing the calculated length
        System.out.println("Length = " + this.length);
    }

    // Overriding equals() method to compare two lines based on length
    @Override
    public boolean equals(Object obj) {

        // Check if the passed object is a Line
        if (!(obj instanceof Line)) return false;

        // Type casting object to Line
        Line l1 = (Line) obj;

        // Calculate length if not already calculated
        if (this.length == -1)
            this.calculateLength();

        if (l1.length == -1)
            l1.calculateLength();

        // Compare lengths of both lines
        return this.length == l1.length;
    }

    // Method to compare two lines and return result as a message
    public String compare(Object obj) {

        // Check if the passed object is a Line
        if (!(obj instanceof Line))
            return "Lines are not valid";

        // Type casting object to Line
        Line l1 = (Line) obj;

        // Calculate length if not already calculated
        if (this.length == -1)
            this.calculateLength();

        if (l1.length == -1)
            l1.calculateLength();

        // Compare lengths and return appropriate message
        if (this.length == l1.length)
            return "Both line are equal";
        else if (this.length > l1.length)
            return "Line is greater than other line";
        else
            return "Line is smaller than other line";
    }
}
