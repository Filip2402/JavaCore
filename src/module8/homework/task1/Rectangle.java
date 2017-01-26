package module8.homework.task1;

/**
 * Created by PC on 26.12.2016.
 */
public class Rectangle extends Shape {

    private final int wight;
    private final int higth;

    public Rectangle(Point point, int wight, int higth){
        super(point);

        this.wight = wight;
        this.higth = higth;
    }

    public int getWight() {
        return wight;
    }

    public int getHigth() {
        return higth;
    }

    @Override
    public double getArea() {
        return wight * higth;
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                super.toString() +
                "wight=" + wight +
                ", higth=" + higth +
                '}';
    }
}
