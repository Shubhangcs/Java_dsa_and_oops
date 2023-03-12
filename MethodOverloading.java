package Basic;

public class MethodOverloading {
    static int sub(int a , int b , int c){
        return a-b-c;
    }
    static int sub(int a , int b , int c,int d , int e){
        return a-b-c-d-e;
    }
    public static void main(String[] args) {
       int x = 10;
       int y = 20;
       int z = 30;
       System.out.println(MethodOverloading.sub(x, y,z));
      System.out.println( MethodOverloading.sub(x, y, z,21,34));

    }
}
