package ua.avada.repository;

import org.springframework.data.repository.CrudRepository;
import ua.avada.domain.Film;
import ua.avada.domain.Poster;

public interface PosterRepository extends CrudRepository<Poster, Long> {
}
