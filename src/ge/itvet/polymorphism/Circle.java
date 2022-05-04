package ge.itvet.polymorphism;

public class Circle extends TwoDimShape {

    public Circle(int x) {
        super(new double[]{x});
    }


    @Override
    public double perimeter() {
        return sides[0] * 2 * Math.PI;
    }

    @Override
    public double area() {
        return sides[0] * sides[0] * Math.PI;
    }

    @Override
    public String toString() {
        return "Circle{ radius = " + sides[0] + " }";
    }

}
