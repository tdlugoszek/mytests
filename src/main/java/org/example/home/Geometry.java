package org.example.home;

//Stwórz klasę, która zawiera metody do obliczeń powierzchni i obwodu różnych figur geometrycznych, takich jak:
//        * prostokąt,
//        * trójkąt,
//        * koło,
//        * innej figury zaproponowanej przez Ciebie.
//        Napisz testy, które sprawdzą poprawność obliczeń.


import org.example.school.NegativeUnitException;

public class Geometry {

    private void validateInput(double value) {
        if (value < 0) {
            throw new NegativeUnitException("Negative values are not allowed: " + value);
        }
    }

    public double AreaOfaRectangle(double a, double b) {
        validateInput(a);
        validateInput(b);
        return a*b;
    }

    public double PerimeterOfaRectangle(double a, double b) {
        validateInput(a);
        validateInput(b);
        return 2*(a+b);
    }

    public double AreaOfaTriangle(double a, double h) {
        validateInput(a);
        validateInput(h);
        return 0.5*a*h;
    }

    public double PerimeterOfaTriangle(double a, double b, double c) {
        validateInput(a);
        validateInput(b);
        validateInput(c);
        return a + b + c;
    }



    public double AreaOfaCircle(double r) {
        validateInput(r);
        return Math.PI*r*r;
    }

    public double PerimeterOfaCircle(double r) {
        validateInput(r);
        return 2*Math.PI*r;
    }

    public double AreaOfaTrapeze(double a, double b, double h) {
        validateInput(a);
        validateInput(b);
        validateInput(h);
        return 0.5*(a+b)*h;
    }

    public double PerimeterOfaTrapeze(double a, double b, double c, double d) {
        validateInput(a);
        validateInput(b);
        validateInput(c);
        validateInput(d);
        return a+b+c+d;
    }


    public double AreaOfaSquare(double a) {
        validateInput(a);
        return a*a;
    }

    public double PerimeterOfaSquare(double a) {
        validateInput(a);
        return 4*a;
    }
}
