import java.util.Scanner;

public class jaggedArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Declare a jagged array with 3 rows
        int[][] jaggedArr = new int[3][];

        // Define the size of each row (subarray)
        jaggedArr[0] = new int[3]; // 1st row has 3 elements
        jaggedArr[1] = new int[2]; // 2nd row has 2 elements
        jaggedArr[2] = new int[4]; // 3rd row has 4 elements

        // Input elements for each row
        System.out.println("Enter the elements of the jagged array:");
        for (int i = 0; i < jaggedArr.length; i++) {
            for (int j = 0; j < jaggedArr[i].length; j++) {
                System.out.print("Enter element at [" + i + "][" + j + "]: ");
                jaggedArr[i][j] = sc.nextInt();
            }
        }

        // Output the elements of the jagged array
        System.out.println("The jagged array is:");
        for (int i = 0; i < jaggedArr.length; i++) {
            for (int j = 0; j < jaggedArr[i].length; j++) {
                System.out.print(jaggedArr[i][j] + " ");
            }
            System.out.println(); // Move to the next row
        }

        sc.close();
    }
}
