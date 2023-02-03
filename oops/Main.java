package oops;
import java.util.*;
public class Main {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        Car c = new Car();
        System.out.print("Enter the car model = ");
        c.setModel(sc.next());
        System.out.print("Enter the price = ");
        c.setPrice(sc.nextLong());
        System.out.print("Enter the colour = ");
        c.setColor(sc.next());
        System.out.println("##### OVERALL CAR SPECS ARE #####");
        System.out.println("Model = "+ c.getModel());
        System.out.println("Price = "+ c.getPrice());
        System.out.println("Colour = "+ c.getColor());
        System.out.println("Ranging = "+ c.setFeatures());


    }
}
