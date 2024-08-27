import java.util.Scanner;

public class modern_sw {

    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);
        String n = scn.nextLine();

        switch (n) {
            case "sunday" -> System.out.println("Sunday is fun");
            case "monday" -> System.out.println("Monday is boring");
            case "tuesday" -> System.out.println("Tuesday is charismatic");
            default -> System.out.println("Enter a correct value (sunday, monday, tuesday)");
        }

        scn.close();
    }
}
