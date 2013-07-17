<<<<<<< HEAD
public class Dog implements Movable{
    private int numberOfLegs;

    public String getName() {
        return name;
    }

    private String name;

    public Dog() {
        this.name = "Rover";
        this.numberOfLegs = 4;
=======

public abstract class Dog implements Moveable {
    private String name;

    private Dog() {
        super();
    }

    public Dog(String name) {
        this();
        this.name = name;
    }

    public final int numberOfLegs() {
        return 4;
>>>>>>> master
    }

    public String bark() {
        return "Woof!";
    }

<<<<<<< HEAD
    public int getnumberOfLegs() {
        return this.numberOfLegs;
    }

    public int numberOfLegs;

    public void move() {
        // ToDo
    }
=======
    public String getName() {
        return this.name;
    }

    public String move() {
        return "Walked 4 steps!";
    }

    public abstract String getBreed();
>>>>>>> master
}
