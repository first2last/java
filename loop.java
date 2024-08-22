import java.util.Scanner  ; 

public class loop{

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in) ;

        System.out.println("Enter the number you want to print table of : ");
        int n = scanner.nextInt() ;


        for(int i = 1 ; i<=10 ; i++){
            System.out.println(n +" x " + i + " = " + n*i) ; 
        }



        scanner.close();

    }
}