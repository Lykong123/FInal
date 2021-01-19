package Triangle;

public class Segment {
    Point p1, p2;

    public Segment(Point p1, Point p2){
        this.p1 = new Point(p1.x, p1.y);
        this.p2 = new Point(p2.x, p2.y);
    }

    public float perimeter(){
        //return p2.distance(p1) + p2.distance(p1)+ p2.distance(p1);
        return p2.distance(p1);
    }
}
