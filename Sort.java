package Demo;
import java.util.*;
public class Sort {
    public static void main(String [] args){
        ArrayList<Integer> operation = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the Array");
        int n = sc.nextInt();
        System.out.println("Enter the array element");
        for(int i = 0 ; i < n ; i++){
             operation.add(i, sc.nextInt());
        }
        System.out.println("The unsorted array is");

            System.out.println(operation);

        System.out.println("Sorted array is");
        Collections.sort(operation);
        System.out.println(operation);
    }
}
