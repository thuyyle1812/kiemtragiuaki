package bai2;

public class Cat extends Animal {
    public Cat ( String name, int age ) {
        super ( name, age );
    }

    @Override
    public void makeNoise () {
        System.out.println ( "Cat meows: Meow meow!" );
    }

    @Override
    public void move () {
        System.out.println ( "Cat ." );
    }
}