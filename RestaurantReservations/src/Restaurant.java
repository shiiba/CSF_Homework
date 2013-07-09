import java.util.ArrayList;

public class Restaurant {
    public ArrayList<Reservation> restaurants = new ArrayList<Reservation>();

    public String restaurantName;

    public Restaurant(String name) {
       this.restaurantName = name;
    }

    public void addToReservationList() {
        Reservation newReservation = Reservation.prepareReservation();
        this.restaurants.add(newReservation);

    }

    public void listReservations() {
         int reservationListSize = this.restaurants.size();

        for (int i = 0; i < reservationListSize; i++) {
            this.restaurants.get(i).describe();
        }
    }
}