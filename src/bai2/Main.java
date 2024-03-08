package bai2;

public class Main {
    public static void main ( String[] args ) {
        Dog dog = new Dog ( "Superman", 3 );
        Cat cat = new Cat ( "Batman", 2 );
        Bird bird = new Bird ( "Robin", 1 );

        dog.makeNoise ( );
        dog.move ( );

        cat.makeNoise ( );
        cat.move ( );

        bird.makeNoise ( );
        bird.move ( );


    }
}
