import static java.lang.Math.PI;

public class AreaCalculator {

        private static final double INVALID_VALUE = -1.0;

        public static double area(double radius){

            if (radius < 0) {
                return INVALID_VALUE;
            } else
                return radius * radius * PI;
        }

        public static double area(double x, double y){

            if( x < 0 || y < 0){
                return INVALID_VALUE;
            } else
                return x * y;
        }


}
