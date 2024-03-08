package bai1;

public class Circle extends Shape {
    private double radius;

    public Circle () {
        super ( );
        this.radius = 1.0;
    }

    public Circle ( String color, double borderWidth, double radius ) {
        super ( color, borderWidth );
        this.radius = radius;
    }

    public double getRadius () {
        return radius;
    }

    public void setRadius ( double radius ) {
        this.radius = radius;
    }


    @Override
    public double calculateArea () {
        return Math.PI * radius * radius;
    }

    @Override
    public double calculatePerimeter () {
        return 2 * Math.PI * radius;
    }


    @Override
    public String toString () {
        return "A Circle with radius=" + radius + ", which is a subclass of " + super.toString ( );
    }
}