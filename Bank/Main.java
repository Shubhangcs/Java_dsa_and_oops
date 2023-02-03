package Bank;
import java.util.*;
public class Main {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

        for(;;){
            System.out.println("Karnataka bank");
            System.out.println("1.Create account");
            System.out.println("2.Check balance");
            System.out.println("3.Deposit");
            int c = sc.nextInt();
            switch(c){
                case 1:
                    createAcc();
                    break;
            }
        }
    }
    public static void createAcc(){
        Scanner sc = new Scanner(System.in);
        Account customer = new Account();
        System.out.println("Enter customer name");
        customer.setCuname(sc.next());
        System.out.println("Enter the phone number");
        customer.setNumber(sc.nextLong());
        System.out.println("Enter customer email");
        customer.setEmail(sc.next());
        System.out.println(customer.getCuname());
        System.out.println(customer.getEmail());
        System.out.println(customer.getNumber());
        System.out.println("Account number generated "+customer.getAcnumber());

    }
}
