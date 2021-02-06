package ua.avada.client.services.impl;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import ua.avada.client.services.PosterClientService;
import ua.avada.domain.db.Poster;
import ua.avada.repository.PosterRepository;

import java.util.List;

@Service
@RequiredArgsConstructor
public class PosterClientServiceImpl implements PosterClientService<Poster> {

    private final PosterRepository posterRepository;

    @Override
    public List<Poster> getAllPosters() {
        return (List<Poster>) posterRepository.findAll();
    }
}
