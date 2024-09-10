
// Define the New class with the main method
public class New {

    public static void main(String[] args) {
        int num1 = 4;
        int num2 = 9;

        // Create an instance of Calculator
        Calculator calc = new Calculator();
        // Call the add method and store the result
        int result = calc.add(num1, num2);
        // Print the result
        System.out.println(result);
    }
}
