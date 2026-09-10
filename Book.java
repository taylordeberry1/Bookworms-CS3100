public class Book {
    private String title;
    private String author;
    private String genre;
    private double averageRating;

    public Book(String title, String author, String genre, double averageRating){
        this.title = title;
        this.author = author;
        this.genre = genre;
        this.averageRating = averageRating;
    }
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
    }
