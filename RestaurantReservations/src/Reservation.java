import java.util.Scanner;

public class Reservation {
    // Variable names
    public int time;
    public int numberOfPeople;
    public String name;

    public Reservation(int t, int p, String n) {
        this.time = t;
        this.numberOfPeople = p;
        this.name = n;
    }

    public String describe() {
        String spit = this.name + " has a reservation for " + this.numberOfPeople + " at " + this.time + " hour.";
        return spit;
    }

    public static Reservation prepareReservation() {
        System.out.println("Name on the Reservation: ");
        Scanner scanner = new Scanner(System.in);
        String name = scanner.next();

        System.out.println("Number of people: ");
        int people = scanner.nextInt();

        System.out.println("Time of reservation (in hours, 0 - 23): ");
        int hour = scanner.nextInt();

        System.out.println("I(n) person, (p)hone, or (i)nternet reservation?");
        char type = (scanner.next().charAt(0));

        if (type == 'n') {
            Reservation inPerson = new Reservation(hour, people, name);
            return inPerson;
        }
        else if (type == 'p') {
            System.out.println("What is your phone number? ");
            String phone = scanner.next();
            Reservation phoneRes = new Phone(hour, people, name, phone);
            return phoneRes;
        }
        else if (type == 'i') {
            System.out.println("What website was this reservation made through? ");
            String site = scanner.next();
            Reservation webRes = new Internet(hour, people, name, site);
            return webRes;
        }
        else {
            System.out.println("ERROR!!!");
            Reservation error = new Reservation(hour, people, name);
            return error;
        }


    }

}
