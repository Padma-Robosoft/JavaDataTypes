package AccessModifier1;

public class Vehicle {


    void brand(){
        System.out.println("The Brand is Lamborghini");
    }

    public void model(){

        System.out.println("The Model is urus");

    }
     protected void price(){
         System.out.println("The Price is Rs. 20 lakhs");
     }

     private void carHistory(){
         System.out.println("I am a Private Method");
     }


    }

    class Bike{
    Vehicle v=new Vehicle();
  //  v.carHistory(); private
    }

