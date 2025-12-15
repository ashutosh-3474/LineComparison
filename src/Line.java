public class Line {
    private Point p1;
    private Point p2;
    private double length = -1;

    public Line(Point p1, Point p2) {
        this.p1 = p1;
        this.p2 = p2;
    }

    public void calculateLength()
    {
        this.length = (Math.sqrt(Math.pow((p2.getX()- p1.getX()),2)+Math.pow((p2.getY()-p1.getY()),2)));
        System.out.println("Length = "+ this.length);
    }

    @Override
    public boolean equals(Object obj) {
        if (!(obj instanceof Line)) return false;
        Line l1 = (Line) obj;

        if (this.length == -1) this.calculateLength();
        if (l1.length == -1) l1.calculateLength();

        return this.length == l1.length;
    }

    public String compare(Object obj)
    {
        if (!(obj instanceof  Line)) return "Lines are not valid";
        Line l1 = (Line) obj;

        if (this.length == -1) this.calculateLength();
        if (l1.length == -1) l1.calculateLength();

        if (this.length == l1.length) return "Both line are equal";
        else if (this.length > l1.length) return "Line is greater than other line";
        else return "Line is smaller than other line";
    }


}
