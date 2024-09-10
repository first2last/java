public class method_ov {

    // Method to add two integers
    public int add(int a, int b) {
        return a + b;
    }

    // Overloaded method to add three integers
    public int add(int a, int b, int c) {
        return a + b + c;
    }

    // Overloaded method to add two doubles
    public double add(double a, double b) {
        return a + b;
    }

    public static void main(String[] args) {
        method_ov calc = new method_ov();

        // Call the method with two integers
        System.out.println("Sum of 2 and 3: " + calc.add(2, 3));

        // Call the method with three integers
        System.out.println("Sum of 2, 3, and 4: " + calc.add(2, 3, 4));

        // Call the method with two doubles
        System.out.println("Sum of 2.5 and 3.5: " + calc.add(2.5, 3.5));
    }
}
