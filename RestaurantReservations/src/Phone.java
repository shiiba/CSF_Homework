public class Phone extends Reservation {

    public String phoneNumber;

    public Phone(int t, int p, String n, String phoneNumber){
        super(t, p, n);
        this.phoneNumber = phoneNumber;
    }

    public void describe() {
        System.out.println("Type: Phone - " + this.phoneNumber);
        super.describe();
    }

}
