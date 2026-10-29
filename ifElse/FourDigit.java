import java.util.*;

public class FourDigit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("ENter the number: ");
        int n = sc.nextInt();

        if (n > 999 && n < 10000) {
            System.out.println("It is a four digit number");
        } else {
            System.out.println("It is not a four digit number");
        }
    }    
}
