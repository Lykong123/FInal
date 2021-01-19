package Triangle;

public class Point {
    float x, y;

    public Point(float x, float y) {
        this.x = x;
        this.y = y;
    }

    public float distance(Point p2){
        return (float) Math.sqrt(Math.pow(p2.y-y, 2)+ Math.pow(p2.x-x, 2));
    }
}
