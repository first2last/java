
public class if_else {

    public static void main(String[] args) {
        int a = 23;
        int b = 90;
        int c = 64;

        if (a > b || a > c) {
            System.out.println(a + " is greater than " + b + " and " + c);
        } else if (b > a || b > c) {
            System.out.println(b + " is greater than " + c + " and " + a);
        } else {
            System.out.println(c + " is greater than " + a + " and " + b);
        }

    }

}
