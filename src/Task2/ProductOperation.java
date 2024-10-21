package Task2;

public class ProductOperation {
    public static void main(String[] args) {

        int[] id={1,2,3};
        String[] name={"Laptop", "Smartphone", "Tablet"};
        double[] price={999.90, 499.99, 299.99};
        boolean[] inStock={true, false, true};

        double totalStockValue=calculateTotalStockValue(price,inStock);
        System.out.println("The value of total price inStock is :"+totalStockValue);

        String expensiveProduct=mostExpensiveProduct(name,price);
        System.out.printf(expensiveProduct);

        int productAbove400=productCountAbove400(price);
        System.out.printf("\nThe count of products above $400 is: %d%n",productAbove400);

    }
    public static double calculateTotalStockValue(double[] price, boolean[] inStock){
        double totalValue=0.0;
        for(int i=0;i<price.length;i++){
            if(inStock[i]){
                totalValue+=price[i];
            }
        }return totalValue;
    }

    public static String mostExpensiveProduct(String[] name, double[] price){
        double maxPrice=0.0;
        int index=0;
        int i=0;
        while(i<price.length){
            if(price[i]>maxPrice){
                maxPrice=price[i];
                index=i;
            }
            i++;
        }
        return "The most expensive product is: " + name[index] + ", Price: $" + maxPrice;
    }

    public static int productCountAbove400(double[] price){
        int count=0;
        int i=0;
        do{
            if(price[i]>400){
                count++;
            } i++;

        } while(i< price.length);
          return count;
    }
}
