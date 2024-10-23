package Task4.Question4;

public class ShapeMain {
    public static void main(String[] args) {
        Shape circle=new Circle(5);
        Shape rectangle=new Rectangle(3,2);

        System.out.println("The Area of Circle is: "+circle.area());
        System.out.println("THe Area of Rectangle is: "+rectangle.area());
    }
}
