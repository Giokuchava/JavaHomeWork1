package ge.ibsu.demo.services;

import ge.ibsu.demo.entities.Language;
import ge.ibsu.demo.repositories.LanguageRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class LanguageService {
    @Autowired
    private LanguageRepository languageRepository;

    public List<Language> getAllLanguages() {
        return languageRepository.findAll();
    }

    public Language getLanguageById(Long id) {
        return languageRepository.findById(id).orElse(null);
    }

    public Language saveLanguage(Language language) {
        return languageRepository.save(language);
    }

    public void deleteLanguage(Long id) {
        languageRepository.deleteById(id);
    }
}
