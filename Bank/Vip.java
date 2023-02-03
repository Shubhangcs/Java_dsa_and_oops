package Bank;

public class Vip {
    private String name;
    private String email;
    private double creditLimit;

    public Vip(String name , String email , double creditLimit){
        this.name = name;
        this.email = email;
        this.creditLimit = creditLimit;

    }
    public Vip(String name , double creditLimit){
        this( name , "default@gmail.com" , creditLimit );
    }
    public Vip(){
        this("Default name" , "Default email" , 2903);

    }

    public String getEmail(){

        return this.email;
    }
    public String getName(){
        return this.name;
    }
    public double getCreditLimit(){
        return this.creditLimit;
    }
}
