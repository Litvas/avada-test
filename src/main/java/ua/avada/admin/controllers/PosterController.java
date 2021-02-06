package ua.avada.admin.controllers;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ua.avada.client.services.PosterClientService;
import ua.avada.domain.db.Poster;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/posters")
public class PosterController {

    private final PosterClientService<Poster> posterClientService;

    @GetMapping
    public List<Poster> getAllPosters() {
        return posterClientService.getAllPosters();
    }


}
