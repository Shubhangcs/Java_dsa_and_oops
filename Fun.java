import java.util.*;

public class Fun {
    
    public static void main(String[] args) {
        int[] a=studentData();
        for(int b:a)
        {
          System.out.print(b+" ");
        }
      Marks();
   


   

       
         

    }
    static int[] studentData(){
try (Scanner sc = new Scanner(System.in)) {
    ArrayList<String> s=new ArrayList<>();
                System.out.println("Enter the student name");
                s.add(sc.nextLine());
                System.out.println(s);
                System.out.println("Enter the roll number");
                int[] roll = new int[3];
                roll[0] = sc.nextInt();
                roll[1] = sc.nextInt();
                roll[2] = sc.nextInt();
                return roll;
}   
        }
    


    static void Marks(){
        Scanner sc = new Scanner(System.in);
            System.out.println("Enter the number of subjects");
            int n = sc.nextInt();
            int[] nos = new int[n];
            int i;
            int a=0;
            int b=0;
            for( i = 0 ; i < n ; i++){
            System.out.println("Enter the marks of subject"+" "+ i);
                nos[i] = sc.nextInt();
            
            if(nos[i] >= 35){
                System.out.println("Pass");
                a++;
            }
            else{
                System.out.println("fail");
                b++;
            }
   }
            System.out.println("pass ="+a+"\nfail ="+b);
        }
}
        


