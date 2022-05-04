package ge.itvet.polymorphism;

public abstract class TwoDimShape {

    protected double[] sides;


    private TwoDimShape(int x) {
    }

    public TwoDimShape(double[] sides) {
        this.sides = sides;
    }

    public abstract double perimeter();

    public abstract double area();

    public double[] getSides() {
        return sides;
    }


}
