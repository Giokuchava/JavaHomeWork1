package ge.ibsu.demo.controllers;

import ge.ibsu.demo.entities.Film;
import ge.ibsu.demo.services.FilmService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/films")
public class FilmController {
    @Autowired
    private FilmService filmService;

    @GetMapping("/search")
    public Page<Film> searchFilms(@RequestParam(required = false) String title,
                                  @RequestParam(required = false) String description,
                                  @RequestParam(required = false) Integer releaseYear,
                                  @RequestParam(required = false) String language,
                                  Pageable pageable) {
        return filmService.searchFilms(title, description, releaseYear, language, pageable);
    }
}
