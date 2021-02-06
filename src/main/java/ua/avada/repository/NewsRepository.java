package ua.avada.repository;

import org.springframework.data.repository.CrudRepository;
import ua.avada.domain.db.News;

public interface NewsRepository extends CrudRepository<News, Long> {
}
