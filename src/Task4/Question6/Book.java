package Task4.Question6;

 class Book {
     private String title;
     private String author;
     private double price;

     public Book(String title){
         this.title=title;
         this.author="Anamika";
         this.price=0.0;
     }

     public Book(String title, String author){
         this.title=title;
         this.author=author;
         this.price=200;
     }

     public Book(String title, String author, double price){
         this.title=title;
         this.author=author;
         this.price=price;
     }

     public void displayBookInfo(){
         System.out.println("The Title of the Book is: "+title);
         System.out.println("The Author of the Book is: "+author);
         System.out.println("The Price of the Book is: "+price);
     }
}
