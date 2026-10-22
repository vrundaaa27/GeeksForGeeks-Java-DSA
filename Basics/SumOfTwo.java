import java.util.*;

public class SumOfTwo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first digit: ");
        int digit1 = sc.nextInt();
        System.out.print("Enter second digit: ");
        int digit2 = sc.nextInt();

        int sum = digit1 + digit2;
        System.out.println("Sum of digits is " + sum );
    }
}
