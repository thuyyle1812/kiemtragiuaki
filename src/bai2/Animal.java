package bai2;

public class Animal {
    private String name;
    private int age;


    public Animal ( String name, int age ) {
        this.name = name;
        this.age = age;
    }


    public void makeNoise () {
        System.out.println ( "Animal makes a sound." );
    }


    public void move () {
        System.out.println ( "Animal moves." );
    }


    public String getName () {
        return name;
    }


    public int getAge () {
        return age;
    }
}