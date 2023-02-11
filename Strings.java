import java.util.*;
public class Strings {
   public static void main(String[] args) {
    //String functions
    
    //Concatination
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter First name");
    String name = sc.nextLine();
    System.out.println("Entre the last name");
    String lname = sc.nextLine();
    String fname = name + " " + lname;
    System.out.println(fname);
    
    //String length
    System.out.println("String length is " + fname.length());
    
    //particular character of string
    
    for(int i = 0 ; i < fname.length() ; i++){
        System.out.println(fname.charAt(i));
    }

    //String compare
    //if string1 > string2 returns some positive value
    //if string1 == string2 returns 0
    //if string2 < string2 returns -ve value


    if(name.compareTo(lname) == 0){
        System.out.println("Strings are equal");
    }
    else{
        System.out.println("Strings are not equal");
    }
    //particular part of the string

    System.out.println(fname.substring(0, name.length()));
   } 
}
