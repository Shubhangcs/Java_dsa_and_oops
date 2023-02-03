package oops;
import java.util.*;
public class Car {
    private String model;
    private long price;
    private String color;
    private String features;

    public void setModel(String mod){
        this.model = mod;
    }
    public String getModel(){
        return this.model;
    }
    public void setPrice(long p) {
        this.price = p;
    }
    public long getPrice(){
        return this.price;
    }
    public void setColor(String col){
        this.color = col;
    }
    public String getColor(){
        return this.color;
    }
    public String setFeatures(){
        long vali = getPrice();
        if(vali >= 1000000){
            this.features = "Luxury";
            return features;
        }
        else{
            this.features = "Common";
            return features;
        }


    }


}


