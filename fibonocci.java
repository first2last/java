import java.util.Scanner;

public class Fibonacci {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        System.out.println("Enter your name: ");
        String name = scn.nextLine();

        System.out.println("Welcome, " + name);

        System.out.println("Enter the number up to which you want Fibonacci numbers: ");
        int n = scn.nextInt();

        int a = 0, b = 1;

        System.out.println("Fibonacci numbers up to " + n + " are:");

        // Print Fibonacci numbers up to n
        // Print the initial number
        while (a <= n) {
            System.out.print(a + " "); // Print the current Fibonacci number
            int next = a + b;
            a = b;
            b = next;
        }

        scn.close();
    }
}
