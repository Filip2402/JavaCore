package module8.homework.task1;

/**
 * Created by PC on 26.12.2016.
 */
public abstract class Shape {
    private final Point point;

    public Shape(Point point) {
        this.point = point;
    }

    public abstract double getArea();

    @Override
    public String toString() {
        return "startPoint" + point;
    }
}
