import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Welcome to line comparison program");

        Main m = new Main();

        Line l1 = new Line(m.getPoint(),m.getPoint());
        l1.calculateLength();

    }
    public Point getPoint(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter x cordinate");
        double x = sc.nextDouble();
        System.out.println("Enter y cordinate");
        double y = sc.nextDouble();
        return new Point(x,y);
    }
}