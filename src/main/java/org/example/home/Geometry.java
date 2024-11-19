package org.example.home;

//Stwórz klasę, która zawiera metody do obliczeń powierzchni i obwodu różnych figur geometrycznych, takich jak:
//        * prostokąt,
//        * trójkąt,
//        * koło,
//        * innej figury zaproponowanej przez Ciebie.
//        Napisz testy, które sprawdzą poprawność obliczeń.


import org.example.school.NegativeUnitException;

public class Geometry {

    public double areaOfaRectangle(double a, double b) {
        if (a <= 0 || b <= 0) {
            throw new IllegalArgumentException("Side of the figure must be positive: " + a + ", " + b);
        }
        return a*b;
    }

    public double perimeterOfaRectangle(double a, double b) {
        if (a <= 0 || b <= 0) {
            throw new IllegalArgumentException("Side of the figure must be positive: " + a + ", " + b);
        }
        return 2*(a+b);
    }

    public double areaOfaTriangle(double a, double h) {
        if (a <= 0 || h <= 0) {
            throw new IllegalArgumentException("Side of the figure must be positive: " + a + ",  " + h);
        }
        return 0.5*a*h;
    }

    public double perimeterOfaTriangle(double a, double b, double c) {
        if (a <= 0 || b <= 0 || c <= 0) {
            throw new IllegalArgumentException("Side of the figure must be positive: " + a + ", " + b + ", " + c);
        }
        return a + b + c;
    }


    public double areaOfaCircle(double r) {
        if (r <= 0) {
            throw new IllegalArgumentException("Side of the figure must be positive: " + r);
        }
        return Math.PI*r*r;
    }

    public double perimeterOfaCircle(double r) {
        if (r <= 0) {
            throw new IllegalArgumentException("Radius must be positive: " + r);
        }
        return 2*Math.PI*r;
    }

    public double areaOfaTrapeze(double a, double b, double h) {
        if (a <= 0 || b <= 0 || h <= 0) {
            throw new IllegalArgumentException("Side of the figure must be positive: " + a + ", " + b + ", " + h);
        }
        return 0.5*(a+b)*h;
    }

    public double perimeterOfaTrapeze(double a, double b, double c, double d) {
        if (a <= 0 || b <= 0 || c <= 0 || d <= 0) {
            throw new IllegalArgumentException("Side of the figure must be positive: " + a + ", " + b + ", " + c + ", " + d);
        }
        return a+b+c+d;
    }


    public double areaOfaSquare(double a) {
        if (a <= 0) {
            throw new IllegalArgumentException("Side of the figure must be positive: " + a);
        }
        return a*a;
    }

    public double perimeterOfaSquare(double a) {
        if (a <= 0) {
            throw new IllegalArgumentException("Side of the figure must be positive: " + a);
        }
        return 4*a;
    }
}
