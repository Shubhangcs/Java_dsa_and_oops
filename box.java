
import java.util.*;
class box {
    public static void main(String args[] ) throws Exception {
        Scanner sc = new Scanner(System.in);
        int typ = sc.nextInt();
        int n1=0,n2=1;
        for(int j = 0 ; j < typ ; j++){
        int[] col = new int[typ];
        
        int a = 0 ;
        int b = 0 ;

            col[0] = sc.nextInt();
            col[1] = sc.nextInt();
    
        int nop = sc.nextInt();
        int[] tes = new int[nop];
        int[] tes2 = new int[nop];
        
            for(int i = 0 ; i < nop ; i++){
            tes[i] = sc.nextInt();
            tes2[i] = sc.nextInt();
            
        
        if( tes[i] == 1 ){
            a++;
            
        }
        if(tes2[i] == 1){
            b++;
        }

            }
            if(col[0] < col[1])
            {
                n1=1;
                n2=0;
            }

       int sum = ( a * col[n1] ) +( b * col[n2] );
       System.out.println(sum);
        }
}
}

