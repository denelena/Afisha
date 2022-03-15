package ru.netology.manager;

import ru.netology.domain.MovieEntry;

public class AfishaManager {
    private int lentaSize = 10;
    private MovieEntry[] movies = new MovieEntry[0];

    public AfishaManager() {
    }

    public AfishaManager(int lentaSize) {
        this.lentaSize = lentaSize;
    }

    public void add(MovieEntry newMovie) {
        //Будем хранить фильмы в массиве movies в уже инвертированном порядке!
        //т.е. ранее добавленные - сдвинем на 1 позицию вперед, а новый фильм запишем по индексу 0.
        // Это заметно упростит код getLenta()
        int newLength = movies.length + 1;
        MovieEntry[] modified = new MovieEntry[newLength];
        //сдвигаем уже имеющиеся
        System.arraycopy(movies, 0, modified, 1, movies.length);
        //новейший довабляем в нулевой индекс
        modified[0] = newMovie;
        movies = modified;
    }

    public MovieEntry[] getLenta() {
        int lentaLength = (movies.length > lentaSize) ? lentaSize : movies.length;
        MovieEntry[] lenta = new MovieEntry[lentaLength];
        System.arraycopy(movies, 0, lenta, 0, lentaLength);//фильмы в массиве movies уже инвертированы!
        return lenta;
    }

}
