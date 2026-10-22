import java.util.*;
public class absoluteOfNo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number : ");
        int n = sc.nextInt();

        // if (n >= 0) {
        //     System.out.println(n);
        // } else {
        //     System.out.println(-n);
        // }

        // 2nd method w/o else
        if (n < 0) n = -n; {
            System.out.println(n);
        }
    }
}
