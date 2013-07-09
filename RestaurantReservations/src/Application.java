import java.util.ArrayList;
import java.util.Scanner;

public class Application {
    public static void main(String[] args) {

        System.out.println("Enter the name of the restaurant you want to visit: ");
        Scanner scanner = new Scanner(System.in);
        String nameRestaurant = scanner.next();
        Restaurant mainRestaurant = new Restaurant(nameRestaurant);

        while (true) {
             restaurantPrompt(mainRestaurant);
        }


    }




        //Reservation reservation1 = new Reservation(20, 6, "Adrian");
        // reservation1.describe();


    public static boolean restaurantPrompt(Restaurant r) {
        System.out.println("Do you want to (a)dd a reservation, (l)ist a reservation, or (q)uit?");
        Scanner scanner = new Scanner(System.in);
        char answer = (scanner.next().charAt(0));

        if (answer == 'a') {
            r.addToReservationList();
        }
        else if (answer == 'l') {
            r.listReservations();
        }
        else if (answer == 'q') {
            return false;
        }
        else {
           System.out.println("Does not compute.");
        }
        return true;
    }


}