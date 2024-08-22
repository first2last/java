import java.util.*; 

public class Prime {

    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);
        
        System.out.println("Please Enter your name: ");
        String name = scn.nextLine();
        System.out.println("Welcome, " + name);

        System.out.println("Enter the number you want to check if it's Prime: ");
        int n = scn.nextInt();

        boolean isPrime = true;

        if (n <= 1) {
            isPrime = false; // 1 and less are not prime numbers
        } else {
            for (int i = 2; i <= Math.sqrt(n); ++i) { // only go up to sqrt(n)
                if (n % i == 0) {
                    isPrime = false;
                    break;
                }
            }
        }

        if (isPrime) {
            System.out.println(n + " is a Prime Number.");
        } else {
            System.out.println(n + " is Not a Prime Number.");
        }

        scn.close();
    }
}
