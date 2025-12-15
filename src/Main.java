import java.util.Scanner;   // Used to take input from the user

public class Main {

    // Main method: program execution starts from here
    public static void main(String[] args) {

        // Display welcome message
        System.out.println("Welcome to line comparison program");

        // Creating object of Main class to call non-static methods
        Main m = new Main();

        // Creating first line using two points entered by the user
        Line l1 = new Line(m.getPoint(), m.getPoint());

        // Creating second line using two points entered by the user
        Line l2 = new Line(m.getPoint(), m.getPoint());

        // Comparing both lines using equals() method
        if (l1.equals(l2)) {
            System.out.println("Both lines are equal");
        } else {
            System.out.println("Both lines are not equal");
        }

        // Comparing lengths of both lines using compare() method
        System.out.println(l1.compare(l2));
    }

    // Method to take x and y coordinates from the user
    public Point getPoint() {

        // Scanner object to read input
        Scanner sc = new Scanner(System.in);

        // Taking x coordinate input
        System.out.println("Enter x coordinate");
        double x = sc.nextDouble();

        // Taking y coordinate input
        System.out.println("Enter y coordinate");
        double y = sc.nextDouble();

        // Returning a Point object with given coordinates
        return new Point(x, y);
    }
}
