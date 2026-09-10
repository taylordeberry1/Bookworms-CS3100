public class Main {
    public static void main(String[] args) {

        BookManager bookManager = new BookManager();

        bookManager.addBook(new Book (
            "The School for Good and Evil",
            "Soman Chainani",
            "Fantasy",
            3.99
        ));

        bookManager.addBook (new Book (
            "Harry Potter and the Sorcerer's Stone",
            "J.K. Rowling",
            "Fantasy",
            4.5
        ));

        bookManager.printBooks();
    }
}

