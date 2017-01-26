package module8.homework.task1;

import java.util.List;

/**
 * Created by PC on 26.12.2016.
 */
public class Main {

    private static int startX = 7;
    private static int startY = 8;
    private static int weight = 12;
    private static int hight = 12;

    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle(new Point(startX,startY),weight,hight);
        Rectangle rectangle1 = new Rectangle(new Point(3,5),32,20);

        Circle circle = new Circle(new Point(5,6),8);

        Group group = new Group();
        group.add(rectangle);
        group.add(rectangle1);
        group.add(circle);


        List<Shape> all = group.getShapeList();

        for (Shape shape: all){
            System.out.println(shape);
        }

        System.out.println("All Area = " + group.getAllArea());
    }


}
