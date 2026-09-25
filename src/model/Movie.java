package model;

public class Movie {
    private Long id;
    private String title;
    private String director;
    private String genre;
    private Integer durationMinutes; // Representa duration_minutes

    public Movie() {
    }

    public Movie(Long id, String title, String director, String genre, Integer durationMinutes) {
        this.id = id;
        this.title = title;
        this.director = director;
        this.genre = genre;
        this.durationMinutes = durationMinutes;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public Integer getDurationMinutes() {
        return durationMinutes;
    }

    public void setDurationMinutes(Integer durationMinutes) {
        this.durationMinutes = durationMinutes;
    }

    @Override
    public String toString() {
        return "Movie{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", director='" + director + '\'' +
                ", genre='" + genre + '\'' +
                ", durationMinutes=" + durationMinutes +
                '}';
    }
}
