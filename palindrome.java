import java.util.*;
public class palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int r , res = 0;
        System.out.println("Enter any number");
        int n = 5;
        int temp = n;
        do{
            r = n%10;
            res = (res * 10)+r;
            r = r/10;
        }while(n>0);
        if(temp == res)
            System.out.println("Palindrome");
        else
            System.out.println("Not palindrome");
    }
}
