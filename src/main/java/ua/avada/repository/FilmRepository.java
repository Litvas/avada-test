package ua.avada.repository;

import org.springframework.data.repository.CrudRepository;
import ua.avada.domain.db.Film;

public interface FilmRepository extends CrudRepository<Film, Long> {
}
