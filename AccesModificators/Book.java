package AccesModificators;

public class Book {
    private String title;

    public Book(String title){
        this.title = title;
    }

    public String getTitle() {
        System.out.println(title);
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}
