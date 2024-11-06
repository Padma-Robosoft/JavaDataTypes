package Task8.Problem2;

public class ExceptionThrow {
    public static void divideByZero(int x, int y){
        try{
           int c=x/y;
            System.out.println(c);
        }
        catch (ArithmeticException e){
            System.out.println("Error: occurs by dividing the integer by zero");
            throw  new ArithmeticException("Additional Context: ");
        }

    }
    public static void main(String[] args) {
        try{

        divideByZero(5,0);
    }
        catch(ArithmeticException e){
            System.out.println("Error "+e.getMessage());
        }

        }
}
