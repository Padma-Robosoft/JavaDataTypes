package Task4.Question4;

 class Circle extends Shape{
     private double radius;

     public Circle(double radius){
         this.radius=radius;
     }

     double area(){
         return Math.PI*radius*radius;
     }
}