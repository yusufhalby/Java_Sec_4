import Packages.GeometricObject;

import java.sql.SQLOutput;


public class Triangle extends GeometricObject{
    private double side1, side2, side3;
    private double perimeter, s, area;

    Triangle()
    {
        this(1.0, 1.0, 1.0);
    }

    Triangle(double l1, double l2, double l3)
    {
        this.side1 = l1;
        this.side2 = l2;
        this.side3 = l3;
        this.perimeter = l1 + l2 + l3;
        this.s = perimeter / 2;
    }

    public double getSide1 ()
    {
        return side1;
    }
    public double getSide2 ()
    {
        return side2;
    }
    public double getSide3 ()
    {
        return side3;
    }
    public double getArea()
    {

        area = Math.sqrt(s*(s-side1)*(s-side2)*(s-side3));
        return area;
    }
    public double getPerimeter()
    {
        return perimeter;
    }


}
