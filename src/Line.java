public class Line {
    Point p1;
    Point p2;
    double length = -1;

    public Line(Point p1, Point p2) {
        this.p1 = p1;
        this.p2 = p2;
    }

    public void calculateLength()
    {
        this.length = (Math.sqrt(Math.pow((p2.x-p1.x),2)+Math.pow((p2.y-p1.y),2)));
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


}
