import com.sun.xml.internal.ws.util.StringUtils;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;



public class Lesson02Homework {

    public static void main(String[] args) {
        classPairs();
    }

    public static void classPairs() {
        String[] classmates = {"Adrian Bautista", "Dustin Coates", "Daniel Gabrieli", "Chris Goodmacher", "Tisha Greenidge", "Archie Jiwnani", "James Kulina", "Derrick Lannaman", "Jesse Leone", "Hsi-Chang Lin", "Colin McEnearney", "Max Miller", "Kevin Shiiba", "Sharone Tobias", "Lambert Torres", "Sandip Trivedi", "Eddie Washington"};
        ArrayList<String> students = new ArrayList<String>(Arrays.asList(classmates));

        Random rand = new Random();
        int max = students.size();
        String personOne;
        String personTwo;

        System.out.println("Coding Pairs: ");

        while (max > 3) {
            int randomNum = rand.nextInt(max - 1);

            personOne = students.get(randomNum);
            students.remove(randomNum);
            max = students.size();

            int randomNum2 = rand.nextInt(max - 1);

            personTwo = students.get(randomNum2);
            students.remove(randomNum2);
            max = students.size();

            System.out.println(personOne + " & " + personTwo);
         }


        if (students.size() % 2 == 0) {
            String a = students.get(0);
            String b = students.get(1);
            System.out.println(a + " & " + b);
        }
        else {
            String a = students.get(0);
            String b = students.get(1);
            String c = students.get(2);
            System.out.println(a + " & " + b + " & " + c);
        }

    }

}
