package library.books;

public class FictionBook {
    private String title;
    private String author;
    private String genre;



    public void displayInfo(){
        System.out.println("Title: "+title);
        System.out.println("Author: "+author);
        System.out.println("Genre:"+genre);

    }
    public FictionBook(String title, String author, String genre) {
        this.title = title;
        this.author = author;
        this.genre = genre;
    }
}
