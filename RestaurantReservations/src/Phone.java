public class Phone extends Reservation {

    public String phoneNumber;

    public Phone(int t, int p, String n, String phoneNumber){
        super(t, p, n);
        this.phoneNumber = phoneNumber;
    }

    public String describe() {
        String amendedString = super.describe() + " Type: Phone - " + this.phoneNumber;
        return amendedString;
    }

}
