//Taylor DeBerry and Xandra Quevedo
//Book object class containing constructors,

public class Book {
    //Basic book attributes
    private String title;
    private String author;
    private String genre;
    private double averageRating;

    //Parameterized constructor
    public Book(String title, String author, String genre, double averageRating){
        this.title = title;
        this.author = author;
        this.genre = genre;
        this.averageRating = averageRating; 
        /*
        A note for future implementation stuff:
        This is the initial book constructor, so this will be used
        in tandem with the file that has all the books, I think.
        That'll be a method in Main most likely (pulling all
        the books from the file, creating them, and adding them
        to a list). -XQ
        */
    }

    //Getters
    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public String getGenre() {
        return genre;
    }

    public double getAverageRating() {
        return averageRating;
    }

    //Setters
    //Might not actually use these but good to have anyway -XQ
    public void setTitle(String title) {
        this.title = title
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public void setAverageRating(double averageRating) {
        this.averageRating = averageRating;
    }

    //toString method override for testing purposes
    @Override
    public String toString() {
        return "BOOK - Title: " + title + ", Author: " + author + ", Genre: " + genre +
            ", Avg. Rating: " + rating;
    }
}
