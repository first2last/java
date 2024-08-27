import java.util.*;

class Calculator {

    int a;

    public int add(int n1, int n2) {
        System.out.println("The sum is: ");
        int sum = n1 + n2;
        return sum;
    }
}

public class Object_tut {
    public static void main(String a[]) {

        int num1 = 56;
        int num2 = 54;

        Calculator calc = new Calculator();

        int res = calc.add(num1, num2);

        System.out.println(res);
    }
}
