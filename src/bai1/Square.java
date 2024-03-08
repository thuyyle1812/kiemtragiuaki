package bai1;

public class Square extends Rectangle {
    public Square () {
        super ( );
    }
    public Square ( String color, double borderWidth, double side ) {
        super ( color, borderWidth, side, side );
    }
    @Override
    public String toString () {
        return "A Square with side=" + getWidth ( ) + ", which is a subclass of " + super.toString ( );
    }

}