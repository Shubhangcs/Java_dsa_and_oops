package Basic;
import java.util.Random;

import javax.sound.sampled.SourceDataLine;

import java.util.*;
class Square extends Thread{
    int x;
    Square(int n){
        x = n;
    }
    public void run(){
        int sqr = x*x;
        System.out.println("Square = "+sqr);
    }

}
class Cube extends Thread{
    int x;
    Cube(int n){
        x = n;
    }
    public void run(){
        int cub = x*x*x;
        System.out.println("Cube = "+cub);
    }
}
class Rnumber extends Thread{
    Random random = new Random();{
    for(int i = 0 ; i < 5 ; i++){
    int RandomInteger = random.nextInt(10);
    System.out.println("Random integer generated = "+RandomInteger);
        Square s = new Square(RandomInteger);
        s.start();
        Cube c = new Cube(RandomInteger);
        c.start();
    
        try{
            Thread.sleep(1000);
        }
        catch(InterruptedException ex){
            System.out.println(ex);
        }
    }
}
}



public class ThreadM {
    public static void main(String[] args) {
        Rnumber num = new Rnumber();
        num.start();
        
    }
}

