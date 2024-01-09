import library.books.FictionBook;
import library.utils.BookUtils;

public class libraryManagementSystem {
    public static void main(String[] args) {
        FictionBook fictionBook = new FictionBook("Pet Sematary", "Steve Jobs", "Horror");

        BookUtils.printBookDetails(fictionBook);
    }
}
