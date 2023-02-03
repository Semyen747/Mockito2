public class Manager {
    private int defaultLength = 10;
    private int currentLength = defaultLength;
    private ConstructorFilm[] films = new ConstructorFilm[0];

    public Manager(int currentLength) {
        this.currentLength = currentLength;
    }

    public Manager() {
    }

    public void add(ConstructorFilm film) {
        ConstructorFilm[] tmp = new ConstructorFilm[films.length + 1];
        for (int i = 0; i < films.length; i++) {
            tmp[i] = films[i];
        }
        tmp[tmp.length - 1] = film;
        films = tmp;
    }

    public ConstructorFilm[] findLast() {
        ConstructorFilm[] main = findAll();
        if (findAll().length < currentLength) {
            ConstructorFilm[] last = new ConstructorFilm[findAll().length];
            for (int i = 0; i < findAll().length; i++) {
                last[i] = main[main.length - 1 - i];
            }
            return last;
        } else {
            ConstructorFilm[] last = new ConstructorFilm[currentLength];
            for (int i = 0; i < last.length; i++) {
                last[i] = main[main.length - 1 - i];
            }
            return last;
        }
    }

    public ConstructorFilm[] findAll() {
        return films;
    }
}

