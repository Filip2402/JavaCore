package module8.homework.task1;

/**
 * Created by PC on 26.12.2016.
 */
public class Circle extends Shape {
    private final int radius;

    public Circle(Point point, int radius) {
        super(point);
        this.radius = radius;
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        radius = radius;
    }

    @Override
    public double getArea() {
        return Math.PI * Math.pow(radius,2);
    }

    @Override
    public String toString() {
        return "Circle{" +
                super.toString()+
                "radius=" + radius +
                '}';
    }
}
