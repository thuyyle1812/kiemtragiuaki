package bai2;

public class Dog extends Animal {
    public Dog ( String name, int age ) {
        super ( name, age );
    }

    @Override
    public void makeNoise () {
        System.out.println ( "Dog hoang!" );
    }

    @Override
    public void move () {
        System.out.println ( "Dog runs." );
    }
}