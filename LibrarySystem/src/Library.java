import java.util.ArrayList;

public class Library {
    String branch;

    public Library(String setBranch) {
        this.branch = setBranch;
        ArrayList<LibraryItems> branchItems = new ArrayList<LibraryItems>();
    }

    public void listItems() {

    }

    public void loanItems(String setLoaner) {
        /* A loan us only successful if the user has no overdue items, the item is loanable (magazine cannot be
        checked out), and the item is  not currently checked out to another user */
    }

    public void returnItems(String setReturner) {

    }
}