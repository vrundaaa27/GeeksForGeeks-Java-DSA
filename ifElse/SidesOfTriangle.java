import java.util.*;

public class SidesOfTriangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter side a: ");
        double a = sc.nextInt();
        System.out.print("Enter side b: ");
        double b = sc.nextInt();
        System.out.print("Enter side c: ");
        double c = sc.nextInt();

        // if (a + b > c) {
        //     System.out.println("All sides are vaild");
        // } else if (a + c > b) {
        //     System.out.println("All sides are vaild");
        // } else if (b + c > a) {
        //     System.out.println("All sides are vaild");
        // }else{
        //     System.out.println("These sides cannot form a triangle");
        // }

        if ((a + b > c) && (b + c > a) && (a + c >b)) {
            System.out.println("Valid Triangle");
        }else{
            System.out.println("Invalid Triangle");
        }
    }
}
