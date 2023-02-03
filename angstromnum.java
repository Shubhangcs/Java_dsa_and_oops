import java.util.*;
public class angstromnum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int r;
        int res = 0;
        System.out.println("Enter any number :");
        int n = sc.nextInt();
        int temp = n;
        while(n > 0){
             r = n % 10;
             res = res + (r * r * r);
             n=n/10;

        }
        if(temp == res)
            System.out.println("Angstrom");
         else
            System.out.println("Not Angstrom");


    }

}
