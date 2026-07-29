package OOP;

public class Book {
    String title;
    String author;

    public Book(String title, String author){
        this.title = title;
        this.author = author;
        
    }

    public void showInformation(){
        System.out.println("The book is" + " " + title + " and the author is " + " " + author);
    }
    
}
