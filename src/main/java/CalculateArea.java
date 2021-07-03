import java.math.*;

    enum ShapeType{RECTANGLE, SQUARE, CIRCLE;}

public class CalculateArea {



    public static double calculateArea(ShapeType shape, double... var) throws RuntimeException{
        double area = 0;
        switch(shape){
            case CIRCLE:
                area = var[0]*var[0]*Math.PI;
                break;
            case RECTANGLE:
                area = var[0]*var[1];
                break;
            case SQUARE:
                area = var[0]*var[0];
            break;
        }
        return area;
    }

}
