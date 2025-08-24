package basic.scanner;
import java.util.*;

public class keyboard {
    
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        // int a,b,c;
        // System.out.println("Enter 2 nos");
        // a=s.nextInt();
        // b=s.nextInt();
        // c=a+b;
        // System.out.println("sum is" + c);

        String name;
        System.out.println("May I know Your name");
        name = s.nextLine();
        System.out.println("welcome miss" + name);


    }
}
