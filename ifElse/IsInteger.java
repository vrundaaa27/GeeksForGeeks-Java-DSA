import java.util.Scanner;
import java.util.*;

public class IsInteger {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number :");
        double x = sc.nextDouble();

        int n = (int)x;    

        // if (x - n > 0) {
        //     System.out.println("Is NOT an Integer");
        // }else{
        //     System.out.println("Is an Integer");
        // }

        if (x - n == 0) {
            System.out.println("Is an Integer");
        }else{
            System.out.println("Is NOT an Integer");
        }
    }
}
