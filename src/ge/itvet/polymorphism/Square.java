package ge.itvet.polymorphism;

public class Square extends TwoDimShape {

    public Square(int x) {
        super(new double[]{x});
    }

    @Override
    public double perimeter() {
        return sides[0] * 4;
    }

    @Override
    public double area() {
        return sides[0] * sides[0];
    }

    public double diagonal() {
        return Math.sqrt(sides[0] * sides[0] * 2);
    }

    @Override
    public String toString() {
        return "Square{ side = " + sides[0] + " }";
    }

}
