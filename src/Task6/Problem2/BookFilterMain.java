package Task6.Problem2;

import java.util.ArrayList;
import java.util.List;

public class BookFilterMain {
    public static void filterBooksByAuthorsAge(ArrayList<Book> booksArray, int age) {
        List<Book> newBooksList = booksArray.stream().filter(b -> b.getAuthor().getAge() > age).toList();
        for(Book b: newBooksList) {
            System.out.println(b.getId());
            System.out.println(b.getTitle());
            System.out.println(b.getAuthor().getName());
            System.out.println(b.getAuthor().getAge());
        }
    }
    public static void countBooksAgeRange(ArrayList<Book> booksArray) {
        int count = 0;
        for(Book b: booksArray) {
            if(b.getAuthor().getAge() >=30 && b.getAuthor().getAge() <= 45)
                count++;
        }
        System.out.println("Number of books in the range of 30-45 is: " +count);    }


    public static void main(String[] args) {
        ArrayList<Book> arr = new ArrayList<>();
        Book b1 = new Book(1,"Java Programming","Alice Smith",34);
        Book b2 = new Book(2,"Python Basics","Bob Jones",45);
        arr.add(b1);
        arr.add(b2);
        filterBooksByAuthorsAge(arr,40);
        countBooksAgeRange(arr);


    }
}
