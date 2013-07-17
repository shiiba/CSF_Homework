<<<<<<< HEAD
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
=======
import java.util.ArrayList;

public class Application {
    public static void main(String[] args) {

        Reservation reservation1 = new Reservation(20, 6, "Adrian");
        // reservation1.describe();

        Restaurant.addReservations();
    }


}
>>>>>>> 0a0b612d688e76e42b1735c40ee87acee384e48e
