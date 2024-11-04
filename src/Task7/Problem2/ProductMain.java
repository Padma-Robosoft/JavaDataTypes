package Task7.Problem2;

import java.util.*;

public class ProductMain {

    public static void sortProduct(List<Product> products){
        Collections.sort(products, new ProductComparator());
        //System.out.println("Sorted Products: "+products);
    }
    public static void main(String[] args) {
        List<Product> products=new ArrayList<>();

        products.add(new Product("Apple", 500));
        products.add(new Product("Orange", 200));
        products.add(new Product("Grapes", 600));
        products.add(new Product("Banana", 100));
        products.add(new Product("Apple",300));
        sortProduct(products);
        for(Product product:products){
            System.out.println(product);
        }
       // System.out.println(products);


    }
}
