<<<<<<< HEAD
import java.util.ArrayList;

public class Application {
    public static void main(String[] args) {

        Reservation reservation1 = new Reservation(20, 6, "Adrian");
        // reservation1.describe();

        Restaurant.addReservations();
    }


}
=======
public class Application {

    /**
     * @param args
     */
    public static void main(String[] args) {
        Dog fido = new Chihuahua("Fido");
        Dog rover = new Pitbull("Rover");
        DogWalker walker = new DogWalker();
        walker.walkDog(fido);
        walker.walkDog(rover);
    }
}
>>>>>>> master
