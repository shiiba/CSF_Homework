import java.util.ArrayList;
import java.util.Scanner;

public class Restaurant {

    public ArrayList[] hours = new ArrayList[24];

    public String restaurantName;

    public Restaurant(String name) {
        this.restaurantName = name;
        for (int i = 0; i < this.hours.length; i++) {
            ArrayList<Reservation> reservations = new ArrayList<Reservation>();
            this.hours[i] = reservations;
        }
    }

    public void addToReservationList() {
        Reservation newReservation = Reservation.prepareReservation();
        if (this.hours[newReservation.time].size() < 50) {
            this.hours[newReservation.time].add(newReservation);
        }
        else {
            System.out.println("error foo");
        }

    }

    public void listReservations(ArrayList r) {
        for (int j = 0; j < r.size(); j++) {
            Reservation presenter = (Reservation) r.get(j); // WAT. Why do we have to cast the get'd object as a Reservation when we set it as an ArrayList of reservations?
            System.out.println(j + ". " + presenter.describe());
        }
    }

    public void removeReservation() {
        System.out.println("At what hour would you like to remove a reservation? ");
        Scanner scanner = new Scanner(System.in);
        int hourResponse = scanner.nextInt();
        this.listReservations(this.hours[hourResponse]);

        System.out.println("What reservation number would you like to remove?");
        int numberResponse = scanner.nextInt();

        this.hours[hourResponse].remove(numberResponse);

    }

    public boolean restaurantPrompt() {
        System.out.println("Do you want to (a)dd a reservation, (l)ist a reservation, (r)emove a reservation, or (q)uit?");
        Scanner scanner = new Scanner(System.in);
        char answer = (scanner.next().charAt(0));

        if (answer == 'a') {
            this.addToReservationList();
        }
        else if (answer == 'l') {
            for (int i = 0; i < this.hours.length; i++) {
                this.listReservations(this.hours[i]);
            }
        }
        else if (answer == 'r'){
            this.removeReservation();
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