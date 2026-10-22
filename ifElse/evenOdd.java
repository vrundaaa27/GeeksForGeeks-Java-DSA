import java.util.*;

public class evenOdd{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter n : ");
        int n = sc.nextInt();

        // if (n%2 == 0) {
        //     System.out.println("No. is even");
        // } else{
        //     System.out.println("No. is odd");
        // }

        if (n%5 == 0) {
            System.out.println("Yes divisible by 5");
        } else {
            System.out.println("No not divisible by 5");
        }
    }
}