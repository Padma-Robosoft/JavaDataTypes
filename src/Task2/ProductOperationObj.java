package Task2;
class Product {
    int id;
    String name;
    double price;
    boolean inStock;

    public Product(int id, String name, double price, boolean inStock) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.inStock = inStock;
    }
}

public class ProductOperationObj {
    public static void main(String[] args) {
        Product[] products = {
                new Product(1, "laptop", 999.99, true),
                new Product(2, "SmartPhone", 499.99, false),
                new Product(3, "Tablet", 299.99, true)
        };

        double totalValue = 0;
        for (Product product : products) {
            if (product.inStock) {
                totalValue += product.price;
            }
        }
        System.out.println("Total Value of the Stock is: " + totalValue);

        Product mostExpensive1 = products[0];
        for (int i = 1; i < products.length; i++) {
            if (products[i].price > mostExpensive1.price) {
                mostExpensive1 = products[i];
            }
        }
        System.out.println("Most expensive product: " +mostExpensive1.name+ ", Price: $" +mostExpensive1.price);

        int countAbove400 = 0;
        int index = 0;
        while (index < products.length) {
            if (products[index].price > 400) {
                countAbove400++;
            }
            index++;
        }
        System.out.println("The number of Products Price Above 400 is: " + countAbove400);
    }
}




