import java.util.Scanner;

public class Lesson07 {

    public static void main(String[] args) {
        IntLinkedList list = new IntLinkedList();
        Scanner scanner = new Scanner(System.in);
        // Ask to add an number to the Linked list
        System.out.println("Please type in your first number to add to the list: ");
        int number = scanner.nextInt();
        list.insert(number);
        list.print();

        /* while (true) {
            System.out.println("Please type in your next number: ");
            int next = scanner.nextInt();
            list.insert(next);
            list.print();
        } */
    }

}
