package Triangle;

public class Triangle {
    public static void main(String[] args){
        Point p1 = new Point(2, 2);
        Point p2 = new Point(1, 4);
        Point p3 = new Point(2, 4);
        Point p4 = new Point(3, 4);
        Point p5 = new Point(4, 4);
        Point p6 = new Point(5, 4);

        Segment AB = new Segment(p1, p2);
        Segment BC= new Segment(p3, p4);
        Segment CA = new Segment(p5, p6);

        System.out.print("The perimeter is: ");
        System.out.println(AB.perimeter()+BC.perimeter()+CA.perimeter());
    }
}
