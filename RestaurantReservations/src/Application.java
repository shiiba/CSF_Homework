import java.util.ArrayList;
import java.util.Scanner;

public class Application {
    public static void main(String[] args) {

        System.out.println("Enter the name of the restaurant you want to visit: ");
        Scanner scanner = new Scanner(System.in);
        String nameRestaurant = scanner.next();
        Restaurant mainRestaurant = new Restaurant(nameRestaurant);
        boolean flag = true;

        while (flag == true) {
            flag = mainRestaurant.restaurantPrompt();
        }


    }





}