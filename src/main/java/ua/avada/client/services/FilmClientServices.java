package ua.avada.client.services;

import java.util.List;

public interface FilmClientServices<T> {

    List<T> getAllFilms();

    T getFilmById(Long id);

}
