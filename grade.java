import java.util.*;

public class Grade {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your marks in maths: ");
        int m = scanner.nextInt();

        System.out.println("Enter your marks in physics: ");
        int p = scanner.nextInt();

        System.out.println("Enter your marks in chemistry: ");
        int c = scanner.nextInt();

        System.out.println("Enter your marks in english: ");
        int e = scanner.nextInt();

        System.out.println("Enter your marks in biology: ");
        int b = scanner.nextInt();

        // Corrected variable and used float division
        float per = (float)(m + p + e + c + b) / 5;

        System.out.println("Your percentage is: " + per + "%");
        
        if (per >= 90) { 
            System.out.println("Your Grade is A");
        } else if (per >= 70) {
            System.out.println("Your Grade is B");
        } else if (per >= 60) {
            System.out.println("Your Grade is C");
        } else if (per >= 40) {
            System.out.println("Your Grade is D");
        } else {
            System.out.println("You have failed");
        }

        scanner.close();
    }
}
