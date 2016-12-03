package Module3.offlile;

/**
 * Created by PC on 14.11.2016.
 */
public class Convert {
    private double coefficient;
    public Convert(double coefficient){
        this.coefficient = coefficient;
    }

    public double convert(int hrivna) {
        return hrivna/coefficient;
    }
}
