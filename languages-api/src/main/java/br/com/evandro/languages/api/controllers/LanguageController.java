package br.com.evandro.languages.api.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import br.com.evandro.languages.api.Languages;
import br.com.evandro.languages.api.Repository.LanguagesRepository;

@RestController
public class LanguageController {
    @Autowired
    private LanguagesRepository repository;

    @GetMapping(value = "/languages")
    public List<Languages> GetLanguages() {
         List<Languages> languages = repository.findAll(); 
        return languages;
    }
    @PostMapping(value = "/languages")
    public Languages createLanguage(@RequestBody Languages languages) {
        Languages savedLanguage = repository.save(languages);
        return savedLanguage;
    }
}
