import java.util.*;

public class Magnitude {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number n = ");
        int n = sc.nextInt();

        //Change -ve no. to positive i.e. taking magnitude of n 
        if (n < 0) n = -n;
        if (n < 69) {
            System.out.println("Magnitude of n is smaller than 69");
        }else{
            System.out.println("Magnitude of n is not smaller than 69");
        }
    }    
}
