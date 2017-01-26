package module8.homework.task1;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by PC on 26.12.2016.
 */
public class Group {

    List<Shape> shapeList = new ArrayList<>();

    public List<Shape> getShapeList() {
        return shapeList;
    }

    public void setShapeList(List<Shape> shapeList) {
        this.shapeList = shapeList;
    }

    public void add(Shape shape) {
        shapeList.add(shape);
    }

    public void  addAll(Group groupToAdd){
        shapeList.addAll(groupToAdd.getShapeList());
    }

    public  int getAllArea(){
        int sum = 0;
        for (Shape shapeLists: shapeList){
            sum += shapeLists.getArea();
        }
        return sum;
    }
}
