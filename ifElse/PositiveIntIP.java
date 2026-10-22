import java.util.*;

public class PositiveIntIP {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        n = -n;

        if (n % 5 == 0) {
            System.out.println("Vrunda");
        } if (n % 3 == 0) {
            System.out.println("Yashwant");
        } if (n % 5 == 0 || n % 3 == 0) {
            System.out.println("Kirti");
        } if (n % 5 != 0 || n % 3 != 0) {
            System.out.println("Apurva");
        }
    }    
}
