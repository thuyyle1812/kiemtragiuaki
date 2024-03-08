package bai1;

public class Rectangle extends Shape {
    private double width;
    private double length;

    public Rectangle () {
        super ( );
        this.width = 1.0;
        this.length = 1.0;
    }

    public Rectangle ( String color, double borderWidth, double width, double length ) {
        super ( color, borderWidth );
        this.width = width;
        this.length = length;
    }


    public double getWidth () {
        return width;
    }

    public void setWidth ( double width ) {
        this.width = width;
    }

    public double getLength () {
        return length;
    }

    public void setLength ( double length ) {
        this.length = length;
    }

    @Override
    public double calculateArea () {
        return width * length;
    }

    // Cài đè phương thức tính chu vi
    @Override
    public double calculatePerimeter () {
        return 2 * (width + length);
    }

    // Cài đè phương thức toString
    @Override
    public String toString () {
        return "A Rectangle with width=" + width + " and length=" + length + ", which is a subclass of " + super.toString ( );
    }
}