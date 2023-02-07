package Demo;
import java.util.*;
public class Counter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = 0;
        System.out.println(n);
        for(;;) {
            System.out.println("Press + to incrimrnt - to decriment");
            char a = sc.next().charAt(0);
            if(a == '+'){
                n++;
                System.out.println(n);
            }
            else{
                n--;
                System.out.println(n);
            }
        }
    }

}
