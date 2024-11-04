package Task7.Problem2;

import java.util.Comparator;

public class ProductComparator implements Comparator<Product> {
    public int compare(Product p1, Product p2){
        int nameComparision=p1.getName().compareTo(p2.getName());

        if(nameComparision==0){
            return Double.compare(p2.getPrice(), p1.getPrice());
        }
        return nameComparision;
    }
}
