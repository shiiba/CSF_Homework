public class Internet extends Reservation{
    public String website;

    public Internet(int t, int p, String n, String website){
        super(t, p, n);
        this.website = website;
    }

    public String describe() {
        String amendedString = super.describe() + " Type: Internet - " + this.website;
        return amendedString;
    }
}

