package ua.avada.client.services;

import java.util.List;

public interface NewsClientServices<T> {

    List<T> getAllNews();

    T getNewsById(Long id);

}
