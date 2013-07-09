public class Dog implements Movable{
    private int numberOfLegs;

    public String getName() {
        return name;
    }

    private String name;

    public Dog() {
        this.name = "Rover";
        this.numberOfLegs = 4;
    }

    public String bark() {
        return "Woof!";
    }

    public int getnumberOfLegs() {
        return this.numberOfLegs;
    }

    public int numberOfLegs;

    public void move() {
        // ToDo
    }
}
