import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TestManager {

    ConstructorFilm film1 = new ConstructorFilm(1, "Lezvie", "Action");
    ConstructorFilm film2 = new ConstructorFilm(2, "Gek and Finn", "Adventure");
    ConstructorFilm film3 = new ConstructorFilm(3, "VEGAS \"XD\"", "Comedy");

    ConstructorFilm film4 = new ConstructorFilm(4, "Cars", "Cartoon");

    ConstructorFilm film5 = new ConstructorFilm(5, "Jhon Wick", "Action");

    ConstructorFilm film6 = new ConstructorFilm(6, "Alone", "Horror");

    ConstructorFilm film7 = new ConstructorFilm(7, "Trolls", "Cartoon");

    ConstructorFilm film8 = new ConstructorFilm(8, "Number One", "Comedy");

    ConstructorFilm film9 = new ConstructorFilm(9, "Tron: Legacy", "Action");

    ConstructorFilm film10 = new ConstructorFilm(10, "Spider Man", "Action");

    ConstructorFilm film11 = new ConstructorFilm(11, "Iron Man 3", "Action");


    @Test
    public void additionTest() {
        Manager manage = new Manager();
        manage.add(film1);

        ConstructorFilm[] expected = {film1};
        ConstructorFilm[] actual = manage.findAll();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void outputTest() {
        Manager manage = new Manager();
        manage.add(film1);
        manage.add(film2);
        manage.add(film3);

        ConstructorFilm[] expected = {film1, film2, film3};
        ConstructorFilm[] actual = manage.findAll();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void findLastTest() {
        Manager manage = new Manager(3);
        manage.add(film1);
        manage.add(film2);
        manage.add(film3);
        manage.add(film4);
        manage.add(film5);
        manage.add(film6);
        manage.add(film7);
        manage.add(film8);
        manage.add(film9);
        manage.add(film10);

        ConstructorFilm[] expected = {film10, film9, film8};
        ConstructorFilm[] actual = manage.findLast();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void findLastDefaultTest() {
        Manager manage = new Manager();
        manage.add(film1);
        manage.add(film2);
        manage.add(film3);
        manage.add(film4);
        manage.add(film5);
        manage.add(film6);
        manage.add(film7);
        manage.add(film8);
        manage.add(film9);
        manage.add(film10);
        manage.add(film11);

        ConstructorFilm[] expected = {film11, film10, film9, film8, film7, film6, film5, film4, film3, film2};
        ConstructorFilm[] actual = manage.findLast();

        Assertions.assertArrayEquals(expected, actual);
    }
}