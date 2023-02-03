public class ConstructorFilm {
    private int id;
    private String filmName;
    private String genre;

    public FilmConstructor(int id, String filmName, String genre) {
        this.id = id;
        this.filmName = filmName;
        this.genre = genre;
    }

    public String toString() {
        return id + " " + filmName + " " + genre;
    }
}
}
