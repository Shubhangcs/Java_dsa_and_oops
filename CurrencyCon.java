import java.util.*;
public class CurrencyCon {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
       //1 $ = 82.89
        //euro = 87.40
        //indo = 0.0053
        //0.63japan
        System.out.println("######### welcome to currency converter menu #########");
        System.out.println("1.Convert inr to USD");
        System.out.println("2.Convert inr to euro");
        System.out.println("3.Convert inr to Indo");
        System.out.println("4.Convert inr to japan");
        System.out.println("<-----Enter your choice----->");
        int currency = sc.nextInt();
        double converted = converter(currency);
        System.out.println("Converted money is = "+ converted);

    }
    static double converter(int inr){
        double cvted;
        Scanner sc = new Scanner(System.in);
        switch(inr){
            case 1:
                System.out.print("Enter the money in USD: ");
                cvted = sc.nextInt();
                cvted = cvted * 82.89;
                return cvted;
            case 2:
                System.out.print("Enter the money in euro: ");
                cvted = sc.nextInt();
                cvted = cvted * 87.40;
                return cvted;
            case 3:
                System.out.print("Enter the money in indo: ");
                cvted = sc.nextInt();
                cvted = cvted * 0.0053;
                return cvted;
            case 4:
                System.out.print("Enter the money in japan: ");
                cvted = sc.nextInt();
                cvted = cvted * 0.63;
                return cvted;
            default:
                System.out.println("Invalid input");

        }
        return 0;

    }
}
