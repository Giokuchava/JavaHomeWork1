package ge.ibsu.demo.controllers;

import ge.ibsu.demo.entities.Language;
import ge.ibsu.demo.services.LanguageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

public class LanguageController {
    @Autowired
    private LanguageService languageService;

    @GetMapping
    public List<Language> getAllLanguages() {
        return languageService.getAllLanguages();
    }

    @GetMapping("/{id}")
    public Language getLanguageById(@PathVariable Long id) {
        return languageService.getLanguageById(id);
    }

    @PostMapping
    public Language createLanguage(@RequestBody Language language) {
        return languageService.saveLanguage(language);
    }

    @DeleteMapping("/{id}")
    public void deleteLanguage(@PathVariable Long id) {
        languageService.deleteLanguage(id);
    }
}
