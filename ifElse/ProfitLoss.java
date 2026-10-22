import java.util.*;

public class ProfitLoss {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Cost Price: ");
        double cp = sc.nextDouble();
        System.out.print("Enter Selling Price: ");
        double sp = sc.nextDouble();

        if (cp < sp) {
            System.out.println("PROFIT was made");
            System.out.println(sp - cp +"Rs. is the Profit made");
        }else{
            System.out.println("LOSS was incurred");
            System.out.println(cp - sp + "Rs. is the loss incurred");
        }
        if (cp == sp) {
            System.out.println("No Profit No Loss");
        } 
    }    
}
