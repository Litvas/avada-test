package ua.avada.repository;

import org.springframework.data.repository.CrudRepository;
import ua.avada.domain.db.Poster;

public interface PosterRepository extends CrudRepository<Poster, Long> {
}
