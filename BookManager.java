import java.util.ArrayList;

public class BookManager {

    private ArrayList<Book> books;

    public BookManager() {
        books = new ArrayList<>();
    }

    public void addBook(Book book) {
        books.add(book);
    }

    public void printBooks() {
        for (Book book : books) {
            System.out.println(
                "Title: " + book.getTitle()
                + "\nAuthor: " + book.getAuthor()
                + "\nGenre: " + book.getGenre()
                + "\nAverage Rating: " + book.getAverageRating()
                + "\n"
            );
        }
    }
}
