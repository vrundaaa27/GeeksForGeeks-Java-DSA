import java.util.*;

public class tsaOfCuboid {
    public static void main(String[] args) {
        double l = 10;
        double b = 20;
        double h = 5;

        double tsa = (l*b)+(b*h)+(h*l);
        System.out.println(2*tsa);
    }    
}
