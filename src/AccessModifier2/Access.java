package AccessModifier2;

import AccessModifier1.Vehicle;

 class Car extends Vehicle{
     void run(){
         System.out.println("Run...");
         price();
     }
 }

public class Access {
    public static void main(String[] args) {
        Vehicle v=new Vehicle();
      //  v.brand(); default cannot be accessed
        v.model(); // public class model is accessable
     //   v.price(); //protected cnnpot be accessed through other packege
        Car c=new Car();
        c.run();
     //   c.price(); protected can be only called in child class




    }
}
