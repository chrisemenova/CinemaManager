public class Manager {


    private String[] movies = new String[0];              // созд. пустой массив фильмов
    private int limit;

    public Manager() {                                    //2 конструктора по усл.
        limit = 10;
    }

    public Manager(int limit) {
        this.limit = limit;

    }

    public void add(String movie) {                    //метод доб. нового фильма (войд т.к. ниче не выводим)

        String[] tmp = new String[movies.length + 1];   //способ: имитация доабвления ячейки
        for (int i = 0; i < movies.length; i++) {
            tmp[i] = movies[i];
        }
        tmp[tmp.length - 1] = movie;
        movies = tmp;
    }

    public String[] findAll() {                       //вывод всех фильмов в порядке добавления
        return movies;
    }

    public String[] findLast() {                  //Вывод последних добавленных фильмов как в жизни(стопкой- в обр.порядке)

        if (limit < movies.length) {                  //если лимит меньше кол-ва фильмов, то остается лимит
            this.limit = limit;
        } else {
            limit = movies.length;                   //если лимит больше кол-ва фильмов, то лимит= кол-ву фильмов
        }

        String[] all = new String[limit];

        for (int i = 0; i < all.length; i++) {
            all[i] = movies[movies.length - 1 - i];
        }
        return all;
    }

}

