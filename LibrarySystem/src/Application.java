import java.util.Scanner;

public class Application {
     public static void main(String[] args) {

        Library mainLibrary = new Library("GA Public Library");
        System.out.println("Welcome to the " + mainLibrary + "! \nWhat's your name?")
        Scanner scanner = new scanner(System.in);
        String name = scanner.next();
        User currentUser = new User(name);
        boolean flag = true;

        while(flag == true) {

        }
    }

}
