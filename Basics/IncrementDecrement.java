import java.util.*;

public class IncrementDecrement {
    public static void main(String[] args) {
        // int ram = 10;
        // System.out.println(ram);
        // ram = ram + 1; 
        // System.out.println(ram);
        // ram++;  
        // System.out.println(ram);
        // ++ram;
        // System.out.println(ram++);
        // // System.out.println(ram);
        // //Use the value first and then decrease it
        // --ram;
        // // ram--;
        // System.out.println(ram);
        // //Decreases the value first and then uses the value 
        // System.out.println(ram);
        // // ram *= 4;
        // // System.out.println(ram);
        // // ram -= 10;
        // // System.out.println(ram);

        // int x = 10;
        // int y = x++;
        // System.out.println(x + " " + y);

        // int a = 10;
        // int b = ++a;
        // System.out.println(a + " " + b);

        int k = 1;
        System.out.println(k); // 1
        // System.out.println(k++); // first uses k then increments so on nextline
        // System.out.println(k); // 2
        System.out.println(++k); // directly increments k

        int l = 2;
        System.out.println("l = " + l); // 2
        // System.out.println(l--); // first uses l then decrements so on nextline
        // System.out.println(l); // 1
        System.out.println(--l); // directly decrements l
    }    
}