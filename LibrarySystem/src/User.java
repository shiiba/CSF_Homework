import java.util.ArrayList;

public class User {
    public boolean hasOverdueItems = false;
    public String name;


    public User(String setName) {
        this.name = setName;
        LibraryItems<String> userItems = new ArrayList<LibraryItems>();

    }

    public void collectionDetails() {
        /* Print details of all library items currently on loan to a specific user, along with their due dates

        "Loaned War and Peace to Big Bird
        Loan declined: item Scientific American is not loanable
        Loaned The Avengers to Big Bird"

        "Collection details for user Big Bird:

        Title: War and Peace
        On loan to Big Bird, due back on Wed Nov 28 09:47:46 EST 2012
        Author: Leo Tolstoy" */
    }
}