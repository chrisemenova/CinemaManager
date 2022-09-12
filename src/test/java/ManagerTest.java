import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class ManagerTest {
    String[] movies = {                               //созд. поля
            "1.Номер один",
            "2.Вперед",
            "3.Отель Белград",
            "4.Джентльмены",
            "5.Бладшот"
    };

//    @BeforeEach
//    public void setup() {
//        manager.add(movies[0]);
//        manager.add(movies[1]);
//        manager.add(movies[2]);
//        manager.add(movies[3]);
//        manager.add(movies[4]);
//    };

    @Test
    public void shouldAddNewMovie() {
        Manager manager = new Manager();
        manager.add(movies[0]);
        manager.add(movies[1]);
        manager.add(movies[2]);
        manager.add(movies[3]);
        manager.add(movies[4]);

        String newMovie = "Интерстеллар";
        manager.add(newMovie);

        String[] expected = {
                "1.Номер один",
                "2.Вперед",
                "3.Отель Белград",
                "4.Джентльмены",
                "5.Бладшот",
                "Интерстеллар"
        };
        String[] actual = manager.findAll();

        Assertions.assertArrayEquals(expected, actual);

    }

    @Test
    public void shouldFindLastReversed() {
        Manager manager = new Manager(5);
        manager.add(movies[0]);
        manager.add(movies[1]);
        manager.add(movies[2]);
        manager.add(movies[3]);
        manager.add(movies[4]);

        String[] expected = {
                "5.Бладшот",
                "4.Джентльмены",
                "3.Отель Белград",
                "2.Вперед",
                "1.Номер один"
        };

        String[] actual = manager.findLast();

        Assertions.assertArrayEquals(expected, actual);

    }

    @Test
    public void shouldFindLastNoLimit() {
        Manager manager = new Manager();
        manager.add(movies[0]);
        manager.add(movies[1]);
        manager.add(movies[2]);
        manager.add(movies[3]);
        manager.add(movies[4]);
        String[] expected = {

                "5.Бладшот",
                "4.Джентльмены",
                "3.Отель Белград",
                "2.Вперед",
                "1.Номер один"
        };

        String[] actual = manager.findLast();

        Assertions.assertArrayEquals(expected, actual);

    }

    @Test
    public void shouldFindLastSmallLimit() {
        Manager manager = new Manager(3);
        manager.add(movies[0]);
        manager.add(movies[1]);
        manager.add(movies[2]);
        manager.add(movies[3]);
        manager.add(movies[4]);
        String[] expected = {

                "5.Бладшот",
                "4.Джентльмены",
                "3.Отель Белград"

        };

        String[] actual = manager.findLast();

        Assertions.assertArrayEquals(expected, actual);

    }
}


