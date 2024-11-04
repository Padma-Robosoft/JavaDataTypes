package Task4.Question4;

 class Rectangle extends Shape{
     private double length;
     private double breadth;

     public Rectangle(double length, double breadth){
         this.length=length;
         this.breadth=breadth;
     }

     double area(){

         return length*breadth;
     }
}
