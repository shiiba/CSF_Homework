public class Internet extends Reservation{
    public String website;

    public Internet(int t, int p, String n, String website){
        super(t, p, n);
        this.website = website;
    }

    public void describe() {
        System.out.println("Type: Internet - " + this.website);
        super.describe();
    }
}

