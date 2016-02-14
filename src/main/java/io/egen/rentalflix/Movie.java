package io.egen.rentalflix;

/**
 * Entity representing a movie.
 * Fields: id, title, year, language
 */
public class Movie {
        private int id;
        private int year;
        private String title;
        private String language;

    public Movie(int id, int year, String title, String language) {
        this.id = id;
        this.year = year;
        this.title = title;
        this.language = language;
    }

    public Movie() {
    }
        
 
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getLanguage() {
        return language;
    }

    @Override
    public String toString() {
        return "Movie{" + "id=" + id + ", year=" + year + ", title=" + title + ", language=" + language + '}';
    }

    public void setLanguage(String language) {
        this.language = language;
    }
        
        
        
        
        
        
}
