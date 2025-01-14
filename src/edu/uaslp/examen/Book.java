package edu.uaslp.examen;

public class Book {

    private String title;
    private String isbn;
    private String author;
    private short stars;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public Short getStars() {
        return stars;
    }

    public void setStars(int stars) {

        short sStars = (short) stars;

        if(sStars > 5){
            stars = 5;
        }

        if(sStars < 0){
            stars = 0;
        }

        this.stars = sStars;
    }
}
