<<<<<<< HEAD

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
=======
public class Dog implements Movable{
    private int numberOfLegs;

    public String getName() {
        return name;
    }

    private String name;

    public Dog() {
        this.name = "Rover";
        this.numberOfLegs = 4;
>>>>>>> 0a0b612d688e76e42b1735c40ee87acee384e48e
    }

    public String bark() {
        return "Woof!";
    }

<<<<<<< HEAD
    public String getName() {
        return this.name;
    }

    public String move() {
        return "Walked 4 steps!";
    }

    public abstract String getBreed();
=======
    public int getnumberOfLegs() {
        return this.numberOfLegs;
    }

    public int numberOfLegs;

    public void move() {
        // ToDo
    }
>>>>>>> 0a0b612d688e76e42b1735c40ee87acee384e48e
}
