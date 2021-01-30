package ua.avada.client.services.impl;

import lombok.RequiredArgsConstructor;
import ua.avada.client.services.PosterClientService;
import ua.avada.domain.Poster;
import ua.avada.repository.PosterRepository;

import java.util.List;

@RequiredArgsConstructor
public class PosterClientServiceImpl implements PosterClientService<Poster> {

    private final PosterRepository posterRepository;

    @Override
    public List<Poster> getAllPosters() {
        return (List<Poster>) posterRepository.findAll();
    }
}
