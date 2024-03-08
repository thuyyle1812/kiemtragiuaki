package bai2;

public class Bird extends Animal {
    public Bird ( String name, int age ) {
        super ( name, age );
    }

    @Override
    public void makeNoise () {
        System.out.println ( "Bird chirps: Tweet tweet!" );
    }

    @Override
    public void move () {
        System.out.println ( "Bird flies." );
    }
}