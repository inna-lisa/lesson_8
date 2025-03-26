package shapes;

import static java.lang.Math.sqrt;

public class Utils {

    public static double pointDistance(double one, double two){
        double result;
        result = one - two;
        if (result < 0 ){
            result *= -1;
        }
        return result;
    }

    public static double hypotenuse(double a, double b){
        return sqrt(a * a + b * b);
    }
}
