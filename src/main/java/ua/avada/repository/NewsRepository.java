package ua.avada.repository;

import org.springframework.data.repository.CrudRepository;
import ua.avada.domain.Film;
import ua.avada.domain.News;

public interface NewsRepository extends CrudRepository<News, Long> {
}
