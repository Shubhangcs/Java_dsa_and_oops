import java.util.Scanner;
public class prob7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i;
        System.out.println("Enter the size of the array");
        int n = sc.nextInt();
        int a[] = new int[1000000];
        System.out.println("Enter the array elements");
        for(i = 1 ; i <= n ; i++){
            a[i] = sc.nextInt();
        }
        for(i = 1 ; i <= n ; i++){
            a[i] = a[i%10];
        }
            if(a[i] == 0){
                System.out.println("No");
            }
            else{
                System.out.println("Yes");
            }
        
    }
}
