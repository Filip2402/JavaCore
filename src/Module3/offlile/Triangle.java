package Module3.offlile;


/**
 * Created by PC on 14.11.2016.
 */
public class Triangle {
    private int x1;
    private int y1;
    private int x2;
    private int y2;
    private int x3;
    private int y3;

    double line1;
    double line2;
    double line3;

    private double square;

    public Triangle(int x1, int y1, int x2, int y2, int x3, int y3) {
        this.x1 = x1;
        this.y1 = y1;
        this.x2 = x2;
        this.y2 = y2;
        this.x3 = x3;
        this.y3 = y3;

        line1 = calculateLine(x1,y1,x2,y2);
        line2 = calculateLine(x2,y2,x3,y3);
        line3 = calculateLine(x1,y1,x3,y3);
    }

    public void print(){

        System.out.println("Square = "+caslculateSquare());
        System.out.println("Perimetr = "+calculatePerimetr(line1,line2,line3));
    }

    private  double calculateLine(int x,int y,int x1, int y1){
        return Math.sqrt(Math.pow((x-x1),2)-Math.pow((y-y1),2));
    }
    private double calculatePerimetr(double line1,double line2,double line3){

        return line1+line2+line3;
    }

    private double caslculateSquare(){

        double perimetr = calculatePerimetr(line1,line2,line3);
        double halfOfPerimetr = perimetr/2;

        square = Math.sqrt((halfOfPerimetr - line1)*(halfOfPerimetr - line2)*(halfOfPerimetr - line3));

        return square;
    }
}
