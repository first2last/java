import java.util.*;

public class mutli_array {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number of Rows: ");
        int n = scanner.nextInt();

        System.out.println("Enter the number of columns: ");
        int m = scanner.nextInt();

        // Corrected array declaration
        int[][] arr = new int[n][m];

        // Input elements
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                // Corrected the print statement to display the correct row
                System.out.println("Enter element " + j + " of row " + (i + 1) + ":");
                arr[i][j] = scanner.nextInt();
            }
        }

        // Output the array
        System.out.println("The input array is:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println(); // To move to the next line after each row
        }

        scanner.close();
    }
}
