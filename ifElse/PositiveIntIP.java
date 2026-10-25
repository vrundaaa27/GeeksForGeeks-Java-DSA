import java.util.*;

public class PositiveIntIP {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        //&& is used to check if both conditions are true then o/p is true
        if (n % 5 == 0 && n % 3 == 0) {
            System.out.println("Divisible by 5 and 3 both");
        } else if (n % 5 == 0) {
            System.out.println("Divisible by 5");
        } else if (n % 3 == 0) {
            System.out.println("Divisible by 3");
        } else {
            System.out.println("Not divisible by 5 and 3 both");
        }

        sc.close();
    }
}