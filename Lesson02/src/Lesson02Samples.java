import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Lesson02Samples {

    public static void main(String[] args) {
        // Call various other methods from here to run them
        //weirdLoop();
        //sort();
        //allAs();
        //reverseNumbers();
        //reverseArray();
        //isGeneticSequence();
        //inputAndSearch();
        //calculator();
    }


    public static void sort() {
        int[] unsortedArray = {4,2,9,8,1,3,6,5};
        IntArraySorter sorter = new IntArraySorter();
        System.out.println("Unsorted: " + Arrays.toString(unsortedArray));
        System.out.println("Sorted: " + Arrays.toString(sorter.sortArray(unsortedArray)));
    }

    public static void weirdLoop() {
        for (int i = -8123; i < 3243*31; i += (2351%923)) {
            System.out.println("i: " + i);
        }
    }

    public static void allAs() {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Enter a string: ");
            String s = scanner.next();
            System.out.println("The string only contains the letter 'a': " + stringIsAllAs(s));
        }
    }

    // There's a bug in this, find it
    public static boolean stringIsAllAs(String s) {
        int i = 0;
        while (i < s.length()) {
            char character = s.charAt(i);
            if (character == 'a' || character == 'A') {

            }
            else {
                return false;
            }
            i++;
        }
        return true;
    }

    // Methods to fill in
    public static void reverseNumbers() {

        // 1) Ask the user for how many numbers they want to enter
        ArrayList<Integer> numbers = new ArrayList<Integer>();

        Scanner scanner = new Scanner(System.in);
        System.out.println("How many numbers do you want to enter? ");
        int response = scanner.nextInt();

        // 2) Let them enter that many numbers
        int x = 0;
        while (x < response) {
            System.out.println("Enter a number: ");
            int n = scanner.nextInt();
            numbers.add(n);
            x++;
        }

        // 3) Print them out in reverse
        for (int i = numbers.size()-1; i >=0; i--) {
            System.out.println(numbers.get(i));
        }

    }

    public static void reverseArray() {
        int[] array = {12, 320, 231, 214, 12312, 41024, 124, 12, 4123, 123, 1234, 634, 85, 685, 68};
        // 1) Reverse the above array above without creating a new array, then print it out
        int n = array.length - 1;
        for (int i = 0; i < (array.length / 2); i++) {
            int temp = array[i];
            array[i] = array[n-i];
            array[n-i] = temp;
        }
        System.out.println(Arrays.toString(array));
    }

    public static void isGeneticSequence() {
        // 1) Ask the user for a string
        // 2) If the string contains only the characters 'G', 'A', 'T', or 'C' (case-sensitive) print true
        // 3) Otherwise, print false
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter in a string of letters: ");
        String response = scanner.next();
        int i = 0;
        String print = "";
        while (i < response.length()) {
            char character = response.charAt(i);
            if (character == 'G' || character == 'A' || character == 'T' || character == 'C') {
                print = "true";
            }
            else {
                print = "false";
            }
            i++;
        }
        System.out.println(print);
    }

    public static void inputAndSearch() {
        // 1) Ask the user to input 10 words
        // 2) Then ask the user to input a search word
        // 3) If the word exists in the first 10 words, print true, otherwise print false
        // 4) Return to step 2
        ArrayList<String> entries = new ArrayList<String>();

        Scanner scanner = new Scanner(System.in);
        System.out.println("Input 10 words: ");

        int x = 0;
        while (x < 10) {
            System.out.println("Enter word " + (x+1));
            String response = scanner.next();
            entries.add(response);
            x++;
        }

        while (true) {
            System.out.println("Input a word to search for: ");
            String search = scanner.next();
            if (entries.contains(search)) {
                System.out.println("true");
            }
            else {
                System.out.println("false");
            }
        }



    }

    public static void calculator() {
        // Below is a very simple calculator
        // 1) Modify it to support both addition, subtraction and multiplication operations
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.print("Enter your first number: ");
            Integer leftOperand = scanner.nextInt();
            System.out.print("Enter your operator (+, - or *): ");
            String operator = scanner.next();
            System.out.print("Enter your second number: ");
            Integer rightOperand = scanner.nextInt();
            if (operator.equals("+")) {
                System.out.println("Resulting value is: " + (leftOperand.intValue() + rightOperand.intValue()));
            }
            else if (operator.equals("-")) {
                System.out.println("Resulting value is: " + (leftOperand.intValue() - rightOperand.intValue()));
            }
            else if (operator.equals("*")) {
                System.out.println("Resulting value is: " + (leftOperand.intValue() * rightOperand.intValue()));
            }
        }
    }
}